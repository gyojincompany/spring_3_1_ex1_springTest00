package com.gyojincompany.spring_3_1;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyCalculator myCal = new MyCalculator();
		Calculator cal = new Calculator();
		
		myCal.setCalcu(cal);//멤버객체 calcu 초기화;
		
		myCal.setA(10);//멤버변수 a 초기화
		myCal.setB(20);//멤버변수 b 초기화
		
		myCal.add();
		
	}

}
