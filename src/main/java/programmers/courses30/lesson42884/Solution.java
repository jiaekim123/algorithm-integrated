package programmers.courses30.lesson42884;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public int solution(int[][] routes) {
        int answer = 0;
        Queue<Car> remainQueue = new PriorityQueue<>(Comparator.comparing(car -> car.startTime)); // startTime이 작은 순서
        Queue<Car> highwayQueue = new PriorityQueue<>(Comparator.comparing(car -> car.endTime)); // endTime이 작은 순서
        for (int[] route : routes) {
            remainQueue.offer(new Car(route[0], route[1]));
        }
        while (!remainQueue.isEmpty()) {
            boolean flag = false;
            Car car = remainQueue.poll();
            while (!highwayQueue.isEmpty() && highwayQueue.peek().endTime <= car.startTime) {
                highwayQueue.poll();
                flag = true;
            }
            if (flag) answer++;

            highwayQueue.offer(car);
        }

        if (!highwayQueue.isEmpty()) answer++;

        return answer;
    }
    static class Car{
        int startTime;
        int endTime;
        Car (int startTime, int endTime) {
            this.startTime = startTime;
            this.endTime = endTime;
        }
    }
}
