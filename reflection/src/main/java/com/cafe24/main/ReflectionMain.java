package com.cafe24.main;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.cafe24.service.UserService;

/**
 * 런타임 중 자바 콤포넌트(클래스) 속성 확인 가능.
 */
public class ReflectionMain {
	
	public static void main(String[] args) throws ClassNotFoundException {
		// Class.class 클래스에 대한 정의 정보를 가지고 있음.
		// ? (wildcard) - type을 지정
		
		/**
		 *  1. 클래스 가져오기
		 *  : 클래스를 못찾을 경우 ClassNotFoundException 발생
		 */

		//자바기본형에 대한 클래스 정보를 얻는 방법. 3가지
		//방법 1 : 
		//Class<?> c = Class.forName("java.lang.String");
		
		//방법 2 : 
	    //Class<Integer> integerClass1 = int.class;
		
	    //방법 3 : 기본형의 경우 (Integer 와 같은) Wrapper 에 기정의된 TYPE을 사용한다. 
		//Class<Integer> integerClass2 = Integer.TYPE;

		Class<?> anyClass = Class.forName("com.cafe24.service.UserService");
		
		System.out.println("Class Name: " + anyClass.getName());
		
		/**
		 *  2. 필드 정보
		 *  : private 일 경우 출력 되지 않는다.
		 */
		Field[] fields = anyClass.getFields();
		
		System.out.println("Existed fields:");
		for(Field f : fields) {
			System.out.println("\t" +f.getName());
		}
		
		
		/**
		 *  3. 메소드 정보
		 *  : private 이여도 출력 된다.
		 */
		Method[] declaredMethods = anyClass.getDeclaredMethods();
		
		System.out.println("Existed Methods:");
		for(Method m : declaredMethods) {
			System.out.println("\t" +m.getName());
		}
		
		/**
		 * 4. 구조체 정보
		 */
		Constructor<?>[] constructors = anyClass.getConstructors();
		
		System.out.println("Existed Constructor:");
		for(Constructor c : constructors) {
			System.out.println("\t" +c.getName() + ", Param Count: " + c.getParameterCount());
		}
		
		/**
		 * 5. 같은 클래스인지 확인
		 */
		boolean result = anyClass.isInstance(new UserService());
		System.out.println("IsSameClass? " + result);
	}
	
	
	
}
