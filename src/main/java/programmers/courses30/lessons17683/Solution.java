/*
    https://programmers.co.kr/learn/courses/30/lessons/17683
    [프로그래머스][2018 카카오 블라인드 테스트 3차] 방금 그곡
 */
package programmers.courses30.lessons17683;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public String solution(String m, String[] musicinfos) {
        // 음악 저장하기
        List<Song> musicList = new ArrayList<>();
        for (String musicInfo : musicinfos) {
            String[] music = musicInfo.split(",");
            int playTime = getPlayTime(music[0], music[1]);
            Song song = new Song(music[2], playTime, music[3]);
            musicList.add(song);
        }

        // 노래 찾아보기
        return findMusic(m, musicList);
    }

    private int getPlayTime(String startTime, String endTime) {
        String[] startTimes = startTime.split(":");
        String[] endTimes = endTime.split(":");
        int start = Integer.parseInt(startTimes[0]) * 60 + Integer.parseInt(startTimes[1]);
        int end = Integer.parseInt(endTimes[0]) * 60 + Integer.parseInt(endTimes[1]);
        return end - start;
    }

    private String findMusic(String m, List<Song> musicList) {
        String answer = "(None)";
        int answerPlayTime = 0;
        for (Song song : musicList) {
            if (isSameSong(song, Song.transform(m), answerPlayTime)) {
                answer = song.name;
                answerPlayTime = song.playTime;
            }
        }
        return answer;
    }

    private boolean isSameSong(Song song, String m, int answerPlayTime){
        if (song.totalSong.contains(m) && answerPlayTime < song.playTime) {
            return true;
        }
        return false;
    }
}

class Song {
    String name;
    int playTime;
    String song;
    String totalSong;

    public Song(String name, int playTime, String song) {
        this.name = name;
        this.playTime = playTime;
        this.song = transform(song);
        this.totalSong = getTotalSong(playTime, transform(song));
    }

    // 라디오에 나온 노래 전체 저장하기
    private String getTotalSong(int playTime, String song) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < playTime / song.length(); i++) {
            sb.append(song);
        }
        String lastWord = song.substring(0, playTime % song.length());
        sb.append(lastWord);
        return sb.toString();
    }

    // song 값 # 변환하기
    public static String transform(String song) {
        StringBuilder sb = new StringBuilder();
        char[] songArr = song.toCharArray();
        for (int i = 0; i < song.length(); i++) {
            if ((i!=song.length()-1) && (songArr[i+1]=='#')) {
                sb.append(Character.toLowerCase(songArr[i]));
            } else if (songArr[i]!='#'){
                sb.append(songArr[i]);
            }
        }
        return sb.toString();
    }
}
