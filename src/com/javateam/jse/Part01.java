package com.javateam.jse;

//부모 클래스 : parent/super/base(기본/기반) class
//조직체 =>중간 계층  (지시+수행)

public class Part01 {

		String name;
		String address;
		int money;
		
		Part01(){
			System.out.println("부모 클래스의 기본 생성자");
		}
		
		void parentsMethod() {
			System.out.println("부모 클래스의 멤버 메서드");
		}
		
		{
			System.out.println("인스턴스 블럭");
		}
		
		static {
			System.out.println("정적 블럭");
		}
		
		
		
		
	
}
