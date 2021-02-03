package programmers.courses30.lesson42579;

import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        Map<String, Genres> map = new HashMap<>();
        for (int i = 0; i < genres.length; i++) {
            if (map.get(genres[i]) == null) {
                map.put(genres[i], new Genres(genres[i], i, plays[i]));
            } else {
                map.get(genres[i]).addSong(i, plays[i]);
            }
        }

        List<Genres> genresList = sortedGenresList(map);
        return getAnswer(genresList);
    }

    private List<Genres> sortedGenresList(Map<String, Genres> map) {
        List<Genres> genresList = new ArrayList<>();
        for (Genres g : map.values()) {
            genresList.add(g);
        }
        Collections.sort(genresList);
        return genresList;
    }

    private int[] getAnswer(List<Genres> genresList) {
        List<Integer> answerList = new ArrayList<>();
        for (int i = 0; i < genresList.size(); i++) {
            List<Integer> songs = genresList.get(i).getSortedSongList();
            for (int j = 0; j < songs.size(); j++) {
                answerList.add(songs.get(j));
            }
        }

        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        return answer;
    }
}

class Genres implements Comparable<Genres> {
    String name;
    int totalPlays = 0;
    List<Song> songs;

    Genres(String name, int num, int plays) {
        this.songs = new ArrayList<>();
        this.songs.add(new Song(num, plays));
        this.name = name;
        this.totalPlays += plays;
    }

    public void addSong(int num, int plays) {
        this.songs.add(new Song(num, plays));
        this.totalPlays += plays;
    }

    public List<Integer> getSortedSongList() {
        List<Integer> songs = new ArrayList<>();
        Collections.sort(this.songs);
        if (this.songs.size() >= 2) {
            for (int i = 0; i < 2; i++) {
                songs.add(this.songs.get(i).num);
            }
        } else {
            for (Song song : this.songs) {
                songs.add(song.num);
            }
        }
        return songs;
    }

    @Override
    public int compareTo(Genres genres) {
        return genres.totalPlays - this.totalPlays;
    }
}

class Song implements Comparable<Song> {
    int num;
    int plays;

    Song(int num, int plays) {
        this.num = num;
        this.plays = plays;
    }

    @Override
    public int compareTo(Song song) {
        return song.plays - this.plays;
    }
}