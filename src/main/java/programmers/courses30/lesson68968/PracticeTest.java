package programmers.courses30.lesson68968;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
	private final int[][] pattern = { { 1, 2, 3, 4, 5 }, { 2, 1, 2, 3, 2, 4, 2, 5 }, { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 } };
	public int[] solution(int[] answers) {
        List<Student> studentList = new ArrayList<Student>();
        for (int i = 1; i<=pattern.length ; i++) {
        	studentList.add(new Student(i, pattern[i-1]));
        }
        return getHighScoreStudent(studentList, answers);
    }
	
	private int[] getHighScoreStudent(List<Student> studentList, int[] answers) {
		List<Integer> highScoreStudentList = new ArrayList<Integer>();
		
		for (int i = 0; i<studentList.size(); i++) {
			Student student = studentList.get(i);
			student.countStudentScore(answers);
		}
		
		Collections.sort(studentList);
		int maxScore = 0;
		for (int i = 0; i <studentList.size(); i++) {
			if (studentList.get(i).getScore() >= maxScore) {
				maxScore = studentList.get(i).getScore();
				highScoreStudentList.add(studentList.get(i).getStudentId());
			} else {
				break;
			}
		}
		return changeListToArray(highScoreStudentList);
	}
	
	private int[] changeListToArray(List<Integer> list){
		int[] array = new int[list.size()];
		for (int i = 0; i<list.size(); i++) {
			array[i] = list.get(i);
		}
		return array;
	}
}

class Student implements Comparable<Student>{
	private int studentId;
	private int score;
	private int[] pattern;
	
	public Student(int studentId, int[] pattern) {
		this.score = 0;
		this.studentId = studentId;
		this.pattern = pattern;
	}

	public void countStudentScore(int[] answer) {
		for (int i = 0; i < answer.length; i++) {
			if (pattern[i % pattern.length] == answer[i]) {
				this.score++;
			}
		}
	}

	public int getScore() {
		return score;
	}
	
	public int getStudentId() {
		return studentId;
	}

	@Override
	public int compareTo(Student o) {
		return o.getScore() - this.score;
	}
}

public class PracticeTest {
	public static void main(String[] args) {
//		int[] answer = new Solution().solution(new int[] { 1, 2, 3, 4, 5 });
		int[] answer = new Solution().solution(new int[] { 1, 3, 2, 4, 2 });
//		int[] answer = new Solution().solution(new int[] { 1, 2, 3, 4, 5 , 1, 2, 3, 1, 2, 3, 1, 2, 3, 4, 2, 1, 2, 4});
		
		for (int i = 0; i <answer.length; i++) {
			System.out.println(answer[i]);		
		}
	}
}
