# [프로그래머스][코딩테스트 연습][해시] 완주하지 못한 선수

## 문제 링크
-    https://programmers.co.kr/learn/courses/30/lessons/42576

## 효율성 체크
기존에 풀었던 방식에서 어떻게 풀어야 더 코드가 간결하고 효율성이 증대될지 테스트해본다. 

### 첫번째 방식
```java
package programmers.courses30.lesson42576;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> participantMap = new HashMap<>();
        for (String player : participant) {
            Integer playerCount = participantMap.getOrDefault(player, 0);
            if (playerCount != 0) {
                participantMap.replace(player, playerCount + 1);
            } else {
                participantMap.put(player, 1);
            }
        }

        for (String player : completion) {
            Integer playerCount = participantMap.getOrDefault(player, 0);
            if (playerCount > 1) {
                participantMap.replace(player, playerCount - 1);
            } else {
                participantMap.remove(player);
            }
        }
        return participantMap.keySet().iterator().next();
    }
}
```
```
정확성  테스트
테스트 1 〉	통과 (0.08ms, 52.9MB)
테스트 2 〉	통과 (0.08ms, 51.5MB)
테스트 3 〉	통과 (1.02ms, 53.2MB)
테스트 4 〉	통과 (1.78ms, 53.5MB)
테스트 5 〉	통과 (1.86ms, 54MB)
효율성  테스트
테스트 1 〉	통과 (53.55ms, 83.7MB)
테스트 2 〉	통과 (84.23ms, 89MB)
테스트 3 〉	통과 (111.95ms, 95.4MB)
테스트 4 〉	통과 (83.04ms, 96.3MB)
테스트 5 〉	통과 (93.22ms, 95.7MB)
```

문제 풀이를 map으로 풀어서 성능적으로 문제가 될 만큼 비효율적이지 않다.
그러나 코드의 중복된 부분이 보인다. 이 부분을 간략화할 수 있을까?
이 문제를 풀 당시에는 put메서드를 잘못 생각하고 있었던 것으로 보인다. put할 때 이미 값이 있다면 덮어쓰는데 이 부분을 고려하지 않고 분기를 태워 값이 있으면 replace를 수행하도록 로직을 태웠다. 우선 이 부분을 수정해보자.

### 두번째 방식

```java
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> participantMap = new HashMap<>();
        for (String player : participant) {
            participantMap.put(player, participantMap.getOrDefault(player, 0) + 1);
        }

        for (String player : completion) {
            participantMap.put(player, participantMap.get(player) - 1);
        }

        for (String key : participantMap.keySet()) {
            if (participantMap.get(key) == 1) return key;
        }

        return "invalid";
    }
}
```

```
정확성  테스트
테스트 1 〉	통과 (0.08ms, 52.9MB)
테스트 2 〉	통과 (0.08ms, 51.5MB)
테스트 3 〉	통과 (1.02ms, 53.2MB)
테스트 4 〉	통과 (1.78ms, 53.5MB)
테스트 5 〉	통과 (1.86ms, 54MB)
효율성  테스트
테스트 1 〉	통과 (53.55ms, 83.7MB)
테스트 2 〉	통과 (84.23ms, 89MB)
테스트 3 〉	통과 (111.95ms, 95.4MB)
테스트 4 〉	통과 (83.04ms, 96.3MB)
테스트 5 〉	통과 (93.22ms, 95.7MB)
```

우선 map에 값을 넣을 때 replace하던 부분을 간략화하여 위와 같이 표현했다.

### 세번째 방식 (stream for-each)

```java
package programmers.courses30.lesson42576;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> participantMap = new HashMap<>();
        Arrays.stream(participant).forEach(player -> participantMap.put(player, participantMap.getOrDefault(player, 0) + 1));
        Arrays.stream(completion).forEach(player -> participantMap.put(player, participantMap.get(player) - 1));

        for (String key : participantMap.keySet()) {
            if (participantMap.get(key) == 1) return key;
        }

        return "invalid";
    }
}
```
```
정확성  테스트
테스트 1 〉	통과 (0.94ms, 52.5MB)
테스트 2 〉	통과 (1.15ms, 52.2MB)
테스트 3 〉	통과 (1.89ms, 53MB)
테스트 4 〉	통과 (2.80ms, 52.8MB)
테스트 5 〉	통과 (7.12ms, 53.1MB)
효율성  테스트
테스트 1 〉	통과 (35.43ms, 83.1MB)
테스트 2 〉	통과 (81.88ms, 88.5MB)
테스트 3 〉	통과 (101.41ms, 96.1MB)
테스트 4 〉	통과 (301.83ms, 94.7MB)
테스트 5 〉	통과 (88.32ms, 95.9MB)
```

for문을 더 간략하게 stream을 사용하여 표현할 수 있을 것이라 생각되어 변경해보았지만 성능이 오히려 떨어지는 현상이 있었다.
stream의 forEach는 가독성 측면에서는 좋지만 그닥 성능적으로 좋지 않다. 이에 대해 아래에서 자세히 분석해보자.

### 네번째 방식 (stream으로 하되 map 초기화)
```java
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> participantMap = new HashMap<>(participant.length);
        Arrays.stream(participant).forEach(player -> participantMap.put(player, participantMap.getOrDefault(player, 0) + 1));
        Arrays.stream(completion).forEach(player -> participantMap.put(player, participantMap.get(player) - 1));
        for (String key : participantMap.keySet()) {
            if (participantMap.get(key) == 1) return key;
        }
        return "invalid";
    }
}
```

```
정확성  테스트
테스트 1 〉	통과 (1.22ms, 52.4MB)
테스트 2 〉	통과 (1.06ms, 53.1MB)
테스트 3 〉	통과 (1.95ms, 53MB)
테스트 4 〉	통과 (2.85ms, 53.1MB)
테스트 5 〉	통과 (2.49ms, 53.8MB)
효율성  테스트
테스트 1 〉	통과 (42.63ms, 81MB)
테스트 2 〉	통과 (85.16ms, 88.5MB)
테스트 3 〉	통과 (84.68ms, 96MB)
테스트 4 〉	통과 (110.82ms, 96.3MB)
테스트 5 〉	통과 (68.39ms, 95.6MB)
```

더 효율좋게 코드를 바꿀 수 있지 않을까? 효율성을 테스트하면서 map에 대용량 데이터를 넣는 듯 한데, map의 initCapacity를 주지 않아서 default 사이즈인 16에서 2배씩 늘리다보면 이 부분이 성능적으로 문제가 될 수 있을 것으로 보인다.
이 부분을 개선하여 initCapacity를 주었더니 stream을 사용했을 때 효율성4가 눈에 띄게 개선되었다. 


### 다섯번째 방식 (stream없이 for문 돌면서 확인, hashmap 초기화)
```java
import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> participantMap = new HashMap<>(participant.length);
        for (String player : participant) {
            participantMap.put(player, participantMap.getOrDefault(player, 0) + 1);
        }

        for (String player : completion) {
            participantMap.put(player, participantMap.get(player) - 1);
        }

        for (String key : participantMap.keySet()) {
            if (participantMap.get(key) == 1) return key;
        }
        return "invalid";
    }
}
```

```
정확성  테스트
테스트 1 〉	통과 (0.06ms, 52.2MB)
테스트 2 〉	통과 (0.08ms, 52.1MB)
테스트 3 〉	통과 (0.67ms, 53.4MB)
테스트 4 〉	통과 (1.42ms, 54MB)
테스트 5 〉	통과 (1.12ms, 52.9MB)
효율성  테스트
테스트 1 〉	통과 (41.90ms, 80.4MB)
테스트 2 〉	통과 (78.79ms, 90.8MB)
테스트 3 〉	통과 (72.28ms, 95.1MB)
테스트 4 〉	통과 (84.77ms, 95MB)
테스트 5 〉	통과 (76.87ms, 95.3MB)
```

stream은 던지고 다시 기본적인 for로직으로 돌아왔다. stream 내에서 추가적으로 수행하는 부분도 없어서 더 빠른듯.
map에는 initCapacity를 참가자의 크기만큼 주었다. 두번째 방식보다 대용량 데이터에서 약간 성능이 좋아졌다.

---
### 최종 정리

가장 빠른 방식은 다섯번째 방식이다. HashMap에 저장을 하되, 초기화 값을 주고 참가자 배열을 먼저 넣고, 그 뒤에 실제로 온 선수들의 숫자를 map에서 찾아 값을 빼준뒤 1인 값을 찾아 반환한다.

주의할 점은, HashMap에 초기화 값을 주어야 대용량 데이터 효율성도 괜찮게 나오는 부분이다.

Stream으로 for-each를 돌리는 것보다 for문을 돌리는 것이 효율이 더 괜찮게 나왔다. 가독성 측면에서는 stream을 사용하는 것이 좋지만, 대용량 데이터 효율성을 측정해야 한다면 좋지 않은 방법으로 보인다.

Stream을 사용할 때 주의할 점에 대해 아래 블로그에서 잘 설명하고 있다.
[참고 링크](https://madplay.github.io/post/mistakes-when-using-java-streams)

> 관련 참고자료를 인용하면, 단순 for-loop의 경우 오버헤드가 없는 단순한 인덱스 기반 메모리 접근이기 때문에 Stream을 사용했을 때보다 더 빠르다고 합니다. (“It is an index-based memory access with no overhead whatsoever.”)
>
> 또, 컴파일러의 관점에서 오랫동안 유지해온 for-loop의 경우 최적화를 할 수 있으나 반대로 비교적 최근에 도입된 스트림의 경우 for-loop와 같은 정교한 최적화를 수행하지 않습니다.

[참고 링크](https://homoefficio.github.io/2016/06/26/for-loop-%EB%A5%BC-Stream-forEach-%EB%A1%9C-%EB%B0%94%EA%BE%B8%EC%A7%80-%EB%A7%90%EC%95%84%EC%95%BC-%ED%95%A0-3%EA%B0%80%EC%A7%80-%EC%9D%B4%EC%9C%A0/)

> 원시 데이터(primitive data type)를 반복문으로 처리할 때는 절대적으로 전통적인 for-loop를 써야한다(collections보다 배열의 경우에는 특히 더).
> Stream을 사용한 코드에서 Exception이 발생할 때 일반적으로 더 많은 작업을 내부적으로 수행한다.
> Exception in thread "main" java.lang.ArithmeticException: / by zero
> 	at Test.lambda$1(Test.java:18)
>	at java.util.stream.Streams$RangeIntSpliterator.forEachRemaining(Streams.java:110)
>	at java.util.stream.IntPipeline$Head.forEach(IntPipeline.java:557)
>	at Test.lambda$0(Test.java:17)
>	at java.util.Arrays$ArrayList.forEach(Arrays.java:3880)
>	at Test.main(Test.java:16)