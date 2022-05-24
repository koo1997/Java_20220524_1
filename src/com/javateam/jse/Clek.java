package com.javateam.jse;

public class Clek implements Director1 {
	
	@Override

	public void orderFromPresident() {
		Director1.super.orderFromPresident();
		System.out.println("사원이 일을한다");
	}
	@Override
	
	public void orderFromVicePresident() {
		Director1.super.orderFromPresident();
		System.out.println("사원이 부장님지시대로 일을한다");
	}


}
