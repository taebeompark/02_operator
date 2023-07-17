package edu.kh.op.ex;
import java.util.Scanner;
public class ExampleRun { //  코드실행용 클래스

	//메인메서드 필수 작성
	public static void main(String[] args) {
		
		//OpExample 생성
		Scanner sc = new Scanner(System.in);
		OpExample ex = new OpExample();
		//같은 package (edu.kh.op.ex) 안에있는 클래스는
		//import 를 하지않아도 불러다 쓸수있다(에러x)
		
		//ex.ex1(); // ex가 가지고 잇는 ex1()메서드 실행
		//ex.ex2();
		//ex.ex3();
		//ex.ex4();
		//ex.ex5();
		//ex.ex6();
		//ex.ex7();
		ex.ex8();
	}
}
