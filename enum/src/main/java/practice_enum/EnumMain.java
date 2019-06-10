package practice_enum;

public class EnumMain {
	public static void main(String[] args) {
		
		// 1. ���: 'STARCRAFT'
		System.out.println("---------- 1. ���: 'STARCRAFT' ----------");
		System.out.println(MyGame.STARCRAFT);
		System.out.println(MyGame.STARCRAFT.toString());
		System.out.println(MyGame.STARCRAFT.name());
		
		// 2. String �� ��
		System.out.println("---------- 2. String �� �� ----------");
		System.out.println("STARCRAFT".equals(MyGame.STARCRAFT)); // false : MyGame.STARCRAFT �� Ŭ���� �̴�.
		System.out.println("STARCRAFT".equals(MyGame.STARCRAFT.toString())); // true
		System.out.println("STARCRAFT".equals(MyGame.STARCRAFT.name())); // true
		
		// 3. �����ϴ� enum, ordinal ���
		// : STARCRAFT, WARCRAFT, DOTA2, BATTLEGROUND
		// : ordinal() �� ��ϵ� enum �ε��� �� - 0 ���� ����
		System.out.println("---------- 3. �����ϴ� enum, ordinal ��� ----------");
		for(MyGame mygame : MyGame.values()) {
			System.out.println("name: " + mygame + ", ordinal: " + mygame.ordinal());
		}
		
		// 4. valuOf�� ���� enum �������� 
		System.out.println("---------- 4. valuOf�� ���� enum ��������  ----------");
		MyGame mygame1 = MyGame.valueOf(MyGame.class, "DOTA2");
		MyGame mygame2 = MyGame.valueOf("DOTA2");
		MyGame mygame3 = MyGame.DOTA2;
		
		System.out.println(mygame1);
		System.out.println(mygame2);
		System.out.println(mygame3);
		
		// 5. �Ӽ��� ��������
		System.out.println("---------- 5. �Ӽ��� ��������  ----------");
		System.out.println(mygame1.getName());
		System.out.println(mygame1.getPrice());
		System.out.println(mygame1.getGanre());
		
	}
}
