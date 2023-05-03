package sec03.ex05;

import java.util.Scanner;

public class ArrayQuiz06 {

	public static void main(String[] args) {
		//키보드로부터 학생 수와 각 학생들의 점수를 입력받아서, 최고 점수 및 평균점수를 구하는 프로그램
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("-----------------------------------------------");
			System.out.println("1. Student Num | 2. type Score | 3. Scores List | 4.Analyze | 5.Quit ");
			System.out.println("-----------------------------------------------");
			System.out.print("select > ");
			
			int selectNum = Integer.parseInt(sc.nextLine());
			
			if(selectNum == 1) {
				System.out.println("Student Number > ");
				studentNum = Integer.parseInt(sc.nextLine());
				scores = new int[studentNum];
			} else if(selectNum == 2) {
				for(int i=0; i<scores.length; i++) {
					System.out.println("score["+i+"]>");
					scores[i]= Integer.parseInt(sc.nextLine());
				}
			} else if(selectNum == 3) {
				for(int i=0; i<scores.length; i++) {
					System.out.println("score["+i+"] = " +scores[i]);
				}
			} else if(selectNum == 4) {
				int sum = 0;
				int max = 0;
				double avg = 0.0;
				
				for(int i=0; i<scores.length; i++) {
					sum+=scores[i];
					max = (max<scores[i])? scores[i] :max;
				}
				
				avg = (double)sum/studentNum;
				System.out.println("sum : " + sum);
				System.out.println("max : " + max);
				System.out.println("avg : "+ avg);
				
			} else if(selectNum == 5) {
				run = false;
			}
			System.out.println("program Quit");
		}

	}

}
