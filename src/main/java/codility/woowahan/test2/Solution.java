package codility.woowahan.test2;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String S) {
        // Create a File class that stores all file information
        File allFile = new File();

        // Put each line of the incoming String value into the File class.
        String[] files = S.split("\n");
        for (String file : files){
            allFile.putFile(file);
        }

        // Get the information of the entire file.
        String answer = allFile.getAnswer();
        System.out.println(answer);
        return answer;
    }
}
class File {
    private Map<String, Long> map;
    final String music = "music";
    final String image = "images";
    final String movie = "movies";
    final String etc = "other";

    File () {
        // Initializes the main 4 extension types in HashMap.
        map = new HashMap<>();
        map.put(music, 0l);
        map.put(image, 0l);
        map.put(movie, 0l);
        map.put(etc, 0l);
    }

    public void putFile(String file){
        // Separate the extension and file size values from the string.
        String[] info = file.split(" ");
        String[] name = info[info.length - 2].split("\\.");
        String extension = name[name.length - 1];
        String[] sizes = info[info.length - 1].split("b");

        // File size is added to HashMap by extension.
        long size = Long.parseLong(sizes[0]);
        switch (extension){
            case "mp3":
            case "aac":
            case "flac":
                map.replace(music, map.get(music) + size);
                break;
            case "jpg":
            case "bmp":
            case "gif":
                map.replace(image, map.get(image) + size);
                break;
            case "mp4":
            case "avi":
            case "mkv":
                map.replace(movie, map.get(movie) + size);
                break;
            default:
                map.replace(etc, map.get(etc) + size);
                break;
        }

    }

    public String getAnswer(){
        // Converts HashMap information to String and returns.
        StringBuilder sb = new StringBuilder();
        sb.append(music + " " + map.get(music) + "b\n");
        sb.append(image + " " + map.get(image) + "b\n");
        sb.append(movie + " " + map.get(movie) + "b\n");
        sb.append(etc + " " + map.get(etc) + "b");
        return sb.toString();
    }
}