package hackerrank.basic;

import java.util.Scanner;

class MyRegex{
	public String pattern = "^([01]?\\d?\\d|2[0-4]\\d|25[0-5])\\."
							+ "([01]?\\d?\\d|2[0-4]\\d|25[0-5])\\."
							+ "([01]?\\d?\\d|2[0-4]\\d|25[0-5])\\."
							+ "([01]?\\d?\\d|2[0-4]\\d|25[0-5])$";
}

public class JavaRegex {
	
    public static void main(String[] args){
    	System.out.println("입력");
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
    
}
