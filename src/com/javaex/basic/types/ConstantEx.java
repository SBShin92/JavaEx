package com.javaex.basic.types;

public class ConstantEx {

	public static void main(String[] args) {
		// 상수 : 변하지 않는 수
		// 초기화, 조회는 가능하지만 재할당은 불가능하다.
		
		final double PI = 3.14159; // 상수의 이름은 모두 대문자, _로 단어 구분
		final int MAXIMUM_SPEED = 110;
		
		System.out.println(PI);
		System.out.println(MAXIMUM_SPEED);

		// 재할당 불가
//		MAXIMUM_SPEED = 100;
		System.out.println("현재 제한 속도는 " + MAXIMUM_SPEED + " 입니다.");
		System.out.println("제한속도 " + MAXIMUM_SPEED + " 이하로 주행해 주세요.");
		System.out.println("-------------------------------");
		

		// 상수의 사용 목적?
		// 1. 코드 가독성을 높인다.
		// 2. 특정 데이터를 한 곳에서 일괄 관리할 때 쓴다.
		// 3. 코드를 변경할 수 없다 (불변성)
//		System.out.println(Calendar.MARCH); // 여기서, 우린 Calendar.MARCH를 임의로 바꿀 수 없다.

		int intValue = 103029770;
		byte byteValue = (byte)intValue; // 강제 타입 변환
		System.out.println(byteValue);
	
	}

	
	
	
}
