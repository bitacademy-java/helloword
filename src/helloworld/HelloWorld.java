package helloworld;

/*
Hello World 클래스 정의
작성자 안대혁
작성일 2020.05.07
*/
public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello Wolrd");
		
		// 값(Vlaue)
		int number1 = 10;
		int number2 = 5 + 5;
		int number3 = ten();

		System.out.println(number1 + ":" + number2 + ":" + number3);
	}
	
	public static int ten() {
		int a = 10;
		int b = 20;
		
		if( a > b ) {
			a = b * 10;
			System.out.println(a);
		}
		
		return 10;
	}
}
