package com.gyojincompany.spring_3_1;

public class MyCalculator {
	
	private int a;
	private int b;	
	Calculator calcu;//객체를 멤버변수로 선언->calcu에게 의존!
	
	public void add() {
		calcu.addition(a, b);
	}
	
	public void sub() {
		calcu.subtraction(a, b);
	}
	
	public void mul() {
		calcu.multiplication(a, b);
	}
	
	public void div() {
		calcu.division(a, b);
	}

	public void setA(int a) {
		this.a = a;
	}

	public void setB(int b) {
		this.b = b;
	}

	public void setCalcu(Calculator calcu) {
		this.calcu = calcu;
	}
	
	
}
