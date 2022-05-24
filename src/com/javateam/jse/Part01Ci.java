package com.javateam.jse;
//자녀 클래스 : child/sub(서브(부))/derived(파생) class
public class Part01Ci extends Part01 {
	long money=10000;
	
	void Part01CiMethod() {
		System.out.println(this.money+super.money);
	}
	
	
	@Override
	public void parentsMethod() {
		super.parentsMethod();
		System.out.println("오버라이딩된 메서드");
	}
	

}
