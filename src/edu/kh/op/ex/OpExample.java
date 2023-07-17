package edu.kh.op.ex;

import java.util.Scanner;

public class OpExample {//예제 코드 작성용 클래스
	
	//ex1()  method : 객체지향 프로그래밍에서 객체와 관련된 함수
	//->OpExample이 가지고 잇는 기능중 ex1()이라는 기능
	public void ex1() {
		//syso + ctrl + space;
		System.out.println("OpExample 클래스에 ex1() 기능수행");
		System.out.println("클래스 분리 테스트");
		System.out.println("println 자동완성도 배웠어요~");
		
	}
	
	
	public void ex2() {
		
		Scanner sc = new Scanner(System.in);
		//실행될때 ExampleRun -> OpExample -> Scanner 순으로 만들어냄
		//scanner는 같은 패키지내에 있지않아서 import(수입) 해와야한다.
		
		System.out.print("정수입력 1 : ");
		int input1 = sc.nextInt(); // 다음 입력되는 정수 읽어옴
		
		System.out.print("정수입력 2 : ");
		int input2 = sc.nextInt(); 
		
		System.out.printf("%d / %d = %d\n",input1,input2,input1/input2);
		System.out.printf("%d %% %d = %d\n",input1,input2,input1%input2);
		// %% : printf 에서 '%' 문자 를 출력하는 방법
	
	}
		public void ex3() {
			//증감 (증가,감소) 연산자 : ++, --
			//-> 피연사자(값)을 1증가 또는 감소시키는 연산자
			
			int iNum1 = 10;
			int iNum2 = 10;
			
			iNum1++; //iNum1 1증가
			iNum2--; // iNum2 1감소
			
			System.out.println("iNum1: "+ iNum1);
			System.out.println("iNum1: "+ iNum2);
			
			//전위연산 : ++3, --2 연산자가 앞쪽에 배치
			//->다른연산자보다 먼저 증가/감소
		
			int temp1 = 5;
			System.out.println(++temp1 +5);
								//++5 + 5
			  					//6 + 5  == 11
			
			System.out.println("temp1 :" + temp1);  //6
			
			//후위 연산 : 10++, 6--    연산자가 뒤쪽에 배치
			//->다른 연산자보다 나중에 증가/감소

			int temp2 = 3;
			System.out.println(temp2-- + 2);  //5
			//3--  +  2   //5
			//temp2=-1;(1감소)
			//temp2는? 2
			System.out.println("temp2:" + temp2); //2
			
			
			
			
			//문제1)최종적으로 a,b,c는 각각얼마인가?
			int a = 3;
			int b = 5;
			int c = a++ + --b;
			
			//      3++ +--5
			//  c = 3++ +4
			//  c = 7
			
			//미뤄놧던 a 후위연산 a++ ==> 3+1 ==>4
			
			System.out.printf("%d / %d / %d\n",a ,b ,c);
			//a=4
			//b=4
			//c=7
			
			
			}
			
		
			public void ex4() {
				
				//비교 연산자 : >, <, >=, <=, ==, !=
				//->비교연산자의 결과는 항상 논리값(true, false)
				//-등호(=)가 포함된 연산자에서 등호는 항상 오른쪽
				
				//같다 기호는 =, ==?
				//--> ==
				//등호1개(=)대입연산자로 사용
				//  -->구분능 위해서 두개(==)를 "같다"라는 의미로 사용
				
				int a = 10;
				int b = 20;
				
				System.out.println( a > b );//false
				System.out.println( a < b );//true
				System.out.println( a != b );//true
				System.out.println(( a == b ) == false);//true
				//괄호안에있는거 먼저연산
				//false == false -> true
				
				System.out.println("---------------------");
				
				int c = 4;
				int d = 5;
				
				System.out.println( c < d ); //true
				System.out.println( c + 1 <= d ); //true
									//4+1 <= 5
									//산술연산이 비교연산자보다 우선순위가 높기때문에
									//더하기 먼저 해야한다!
				
				System.out.println( c >= d-1 );//true
				System.out.println( (++c != d ) == (--c != d) );//true
									//( ++4  != 5)  -> false
									//               (--5 != 5) -> true
									//false == true
									//false
				
				System.out.println("---------------------");
				
				int temp =723;
				
				System.out.println("temp는 짝수인가?" + (temp % 2 == 0)); //false
				System.out.println("temp는 짝수인가?" +(temp % 2 != 1)); //false
				
				System.out.println("temp는 홀수인가?"+(temp % 2 == 1));  //true
				System.out.println("temp는 홀수인가?"+(temp % 2 != 0));  //true
				
				System.out.println("temp는 3의 배수인가?"+ (temp%3==0)); //true
				System.out.println("temp는 3의 배수인가?"+ (temp%4==0)); //false
				System.out.println("temp는 3의 배수인가?"+ (temp%5==0)); //false
				
				
			}
			
			public void ex5() {
				
				//논리 연산자 : &&(AND), || (OR)
				//&&(AND)연산자 : 둘다 true면 true , 나머지는 false
				//와 , 그리고, ~면서, ~이면서, ~부터, ~까지 , ~사이

				//ex)사과와 바나나, 사과 그리고 바나나, 사과이면서 바나나
				
				int a = 101;
				
				//a는 100이상이면서 짝수인가?
				System.out.println(a>=100);  //a는100이상 ?true
				
				//a는 짝수?
				System.out.println(a % 2 ==0); //true
				
				System.out.println((a>=100)&&(a % 2 ==0)); //false
				
				
				int b =5;
				//b는 1부터 10까지 숫자범위에 포함되어 있는가?
				//==>b는 1부터 10사이의 숫자인가?
				//==>b는 1보다 크거나 같으면서,10보다 작거나 같은가?
				
				System.out.println(b>=1);// b는 1이상인가? true
				System.out.println(b<=10);// b는 10이하인가? true
				System.out.println((b>=1) && (b <= 10));//  true
				
				
				
				
				
				System.out.println("=============================");
				
				// || (OR) 연산자 : 둘다 false면 false , 나머지는 true(AND의 반대)
				//~또는 , ~이거나 , ~거나
				
				int c = 10;
				
				//c는 10을 초과했거나 짝수인가?
				System.out.println(( c > 10) || (c % 2 == 0) );
				
				
				}
				public void ex6() {
					//논리 부정 연산자 : !
					//->논리값을 반대로 바꾸는 연산자
					
					boolean bool1 = true;
					boolean bool2 = !bool1; //false
					System.out.println("booli1 : "+bool1 ); //true
					System.out.println("booli2 : "+bool2 ); //false
					
					System.out.println("-----------------------");
					
					
					Scanner sc = new Scanner(System.in);
					
					//정수를 하나 입력 받았을때
					//1)해당 정수가 1부터 100 사이 값이 맞는지 확인 (1이상100이하)
					//2)(반대) 1부터 100사이 값이 아닌지 확인
					System.out.println("정수입력 :" );
					int input = sc.nextInt();
					
					// 1 <= input <=100
					boolean result1 = input>=1 && input <=100;
					//				(input>=1) && (input <= 100);
					
					System.out.printf("%d는 1이상, 100이하의 정수인가? : %b\n ", input,result1);
					
					//1이상 이면서 100이하 ,<->미만 또는 100 초과
					boolean result2 = (input < 1) || (input>100);
					boolean result3 = !((input < 1) || (input>100));
					
					
					System.out.printf("%d는  1미만, 100 초과정수 인가? :%b /%b\n",input,result2,result3);
				}
				
				
				public void ex7() {
					//복합 대입 연산자 : +=, -=, *=, /=, %=
					//피연산자가 자신과 연산후 결과를 다시 자신에게 대입
					
					int a = 10;
					
					// a를 1증가
					a++;  // a = a + 1
					System.out.println("a를 1증가: " + a);//11
					
					//a를 4증가
					a += 4;  //a = a + 4
					System.out.println("a를 4증가: "+ a);//15
					
					//a를 10감소
					a-=10; //a=a+10
					System.out.println("a를 10 감소 :" + a);//5;
					
					//a를 3배 증가
					a*=3;
					System.out.println("a를 3배증가 : " +a); //15
					
					//a를 6으로 나눴을때 몫
					a/=6;
					System.out.println("a를 6으로 나눴을때 몫 : "+a); // 2
					
					//a를 2로 나눴을때나머지
					a%=2;
					System.out.println("a를 2로 나눴을때나머지 : "+a);//0
				}
				public void ex8(){
					//삼항연산자: 조건식 ? 식1 : 식2
					
					//조건식의 결과가 true면 식1,
					//false이면 식2를 수행하는 연산자
					
					//* 조건식 : 연산 결과가 true또는 false
					//(비교, 논리 , 논리부정 연산이포함)
					
					int num=30;
					//num이 30보다 크면(초과) "num은 30보다 큰수이다"
					//아니면 "num은 30이하의 수이다" 출력
					String result = num > 30 ? "num은 30보다 큰수이다":"num은 30이하의 수이다";
									//조건식?     식1(true)      :           식2(false)
					System.out.println(result);
					
					System.out.println("========================");
					// 입력 받은 정수가 음수인지 양수인지 구분
					//단,0은 양수로처리
					
					//ex) 
					//정수입력 : 4
					//양수입니다
					
					//정수입력 : -5
					//음수입니다.
					
					Scanner sc = new Scanner(System.in);
					
					System.out.println("정수입력 : ");
					int input1 = sc.nextInt();
					
			
					
					String str1 = "양수입니다";
					String str2 = "음수입니다";
					
					String result2 =  input1 >= 0 ? str1 : str2;
							
				}
				
	}
	
