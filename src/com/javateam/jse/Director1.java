package com.javateam.jse;
//다중상속(multiple inheritance)
public interface Director1 extends President, VicePresident {
	
	//인터페이스가 구현을한다!  => default

	@Override
	default void orderFromPresident() {
		System.out.println("부장님이 회장님의 지시대로 일하다");
	}
	

}
