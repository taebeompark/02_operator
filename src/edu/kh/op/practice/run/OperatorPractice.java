package edu.kh.op.practice.run;
import java.util.Scanner;

public class OperatorPractice {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("인원수 : ");
		int input1 = sc.nextInt();
		System.out.println("사탕개수 : ");
		int input2 = sc.nextInt();
		
		System.out.printf("1인당 사탕 개수 %d :",input2/input1);
		System.out.printf("남는 사탕 개수 %d :",input2-(input1*3));
	}
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String input3 = sc.next();
		
		System.out.print("학년(정수만) : ");
		int input4 = sc.nextInt();
		
		System.out.print("반(정수만) : ");
		int input5 = sc.nextInt();
		
		System.out.print("번호(정수만) : ");
		int input6 = sc.nextInt();
		
		System.out.print("성별(남학생/여학생) ");
		String input7 = sc.next();
		
		System.out.print("성적(소수점 아래 둘째 자리까지) ");
		double input8 = sc.nextDouble();
		
		System.out.printf("%s %d학년 %d반 %d번 %s의 성적은 %.2f 이다:",input3,input4,input5,input6,input7,input8);
	}
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		
		int sum = kor + eng + math;
		double avg = sum/3.0;
		
		System.out.println("합계 : "+ sum);
		System.out.printf("평균 : %.1f\n",avg);
		
		boolean result =	(kor >= 40)&& (eng >= 40 ) && (math >= 40 )&&(avg>=60);
		System.out.println(result ? "합격" : "불합격");
		
	}
}
