package codility.woowahan.test2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
//        assertEquals("music 1011b\nimages 0b\nmovies 10200b\nother 105b", new Solution().solution("my.song.mp3 11b\ngreatSong.flac 1000b\nnot3.txt 5b\nvideo.mp4 200b\ngame.exe 100b\nmov! e.mkv 10000b"));
//        assertEquals("music 1000011b\nimages 0b\nmovies 10200b\nother 105b", new Solution().solution("my.song.mp3 11b\ngreatSong.flac 1000000b\nnot3.txt 5b\nvideo.mp4 200b\ngame.exe 100b\nmov! e.mkv 10000b"));
        assertEquals("music 1000011b\nimages 100b\nmovies 10200b\nother 105b", new Solution().solution("hello image00! i like cat very much.jpg 100b\nhello my.song.mp3 11b\ngreatSong.hello.wkel.flac 1000000b\nnot3.txt 5b\nvideo.mp4 200b\ngame.exe 100b\nmov! e.mkv 10000b"));
    }
}