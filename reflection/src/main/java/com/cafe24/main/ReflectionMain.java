package com.cafe24.main;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.cafe24.service.UserService;

/**
 * ��Ÿ�� �� �ڹ� ������Ʈ(Ŭ����) �Ӽ� Ȯ��
 */
public class ReflectionMain {
	
	public static void main(String[] args) throws ClassNotFoundException {
		// Class.class Ŭ������ ���� ���� ������ ������ ����.
		// ? (wildcard) - type�� ����
		
		/**
		 *  1. Ŭ���� ��������
		 *  : Ŭ������ ��ã�� ��� ClassNotFoundException �߻�
		 */

		//�ڹٱ⺻���� ���� Ŭ���� ������ ��� ���. 3����
		//��� 1 : 
		//Class<?> c = Class.forName("java.lang.String");
		
		//��� 2 : 
	    //Class<Integer> integerClass1 = int.class;
		
	    //��� 3 : �⺻���� ��� (Integer �� ����) Wrapper �� �����ǵ� TYPE�� ����Ѵ�. 
		//Class<Integer> integerClass2 = Integer.TYPE;

		Class<?> anyClass = Class.forName("com.cafe24.service.UserService");
		
		System.out.println("Class Name: " + anyClass.getName());
		
		/**
		 *  2. �ʵ� ����
		 *  : private �� ��� ��� ���� �ʴ´�.
		 */
		Field[] fields = anyClass.getFields();
		
		System.out.println("Existed fields:");
		for(Field f : fields) {
			System.out.println("\t" +f.getName());
		}
		
		
		/**
		 *  3. �޼ҵ� ����
		 *  : private �̿��� ��� �ȴ�.
		 */
		Method[] declaredMethods = anyClass.getDeclaredMethods();
		
		System.out.println("Existed Methods:");
		for(Method m : declaredMethods) {
			System.out.println("\t" +m.getName());
		}
		
		/**
		 * 4. ����ü ����
		 */
		Constructor<?>[] constructors = anyClass.getConstructors();
		
		System.out.println("Existed Constructor:");
		for(Constructor<?> c : constructors) {
			System.out.println("\t" +c.getName() + ", Param Count: " + c.getParameterCount());
		}
		
		/**
		 * 5. ���� Ŭ�������� Ȯ��
		 */
		boolean result = anyClass.isInstance(new UserService());
		System.out.println("IsSameClass? " + result);
	}
	
	
	
}
