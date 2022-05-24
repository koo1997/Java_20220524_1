package com.javateam.jse;


//인터페이스(interface)
//대외 : 홍보
//대내 :	지시/명령

//public interface Director {   O
	abstract public interface Director {//O
	//원래:상수(constant)+추상 메서드들로만 구성
		
//	인터페이스느 public 접근 제한자만 허용!
//	무표기 =default/package 접근 제한자(X) 
//		public 접근 제한자 으로 간주
//	인터페이스의 멤버 필드는 상수(constant)만 허용	
//	String name;//X	
	String name = "java";//O	
//	protected String name = "java";//X	
//	private String name = "java";//X	
//	static String name = "java";//O	
//	final static String name = "java";//O	
	
	
	abstract void order();//O
	
//	public void order2();//O
	void order2();//O
	//일반 인스턴스 메서드 사용불가
//	void instanceMethod() {}
//	Director(){
//		인터페이스 생성자 불가
//	}
	static void staticMethod() {
		System.out.println("인터페이스의 정적 메서드");
	}
		
//	{
//		인스턴스 블럭 (X)
//	}
//	static {
//	정적 블럭 (X)	
//	}
	
	
	
	public static void main(String[] args) {
		
		
		System.out.println("인터페이스의 실행");
		Director.staticMethod();
	}
//	default (기존) 메서드
	default void defaultMethod() {
		System.out.println("디폴트 메서드");
	}//
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
