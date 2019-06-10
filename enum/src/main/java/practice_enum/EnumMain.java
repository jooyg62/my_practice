package practice_enum;

public class EnumMain {
	public static void main(String[] args) {
		
		// 1. 결과: 'STARCRAFT'
		System.out.println("---------- 1. 결과: 'STARCRAFT' ----------");
		System.out.println(MyGame.STARCRAFT);
		System.out.println(MyGame.STARCRAFT.toString());
		System.out.println(MyGame.STARCRAFT.name());
		
		// 2. String 값 비교
		System.out.println("---------- 2. String 값 비교 ----------");
		System.out.println("STARCRAFT".equals(MyGame.STARCRAFT)); // false : MyGame.STARCRAFT 는 클래스 이다.
		System.out.println("STARCRAFT".equals(MyGame.STARCRAFT.toString())); // true
		System.out.println("STARCRAFT".equals(MyGame.STARCRAFT.name())); // true
		
		// 3. 존재하는 enum, ordinal 출력
		// : STARCRAFT, WARCRAFT, DOTA2, BATTLEGROUND
		// : ordinal() 은 등록된 enum 인덱스 값 - 0 부터 시작
		System.out.println("---------- 3. 존재하는 enum, ordinal 출력 ----------");
		for(MyGame mygame : MyGame.values()) {
			System.out.println("name: " + mygame + ", ordinal: " + mygame.ordinal());
		}
		
		// 4. valuOf를 통한 enum 가져오기 
		System.out.println("---------- 4. valuOf를 통한 enum 가져오기  ----------");
		MyGame mygame1 = MyGame.valueOf(MyGame.class, "DOTA2");
		MyGame mygame2 = MyGame.valueOf("DOTA2");
		MyGame mygame3 = MyGame.DOTA2;
		
		System.out.println(mygame1);
		System.out.println(mygame2);
		System.out.println(mygame3);
		
		// 5. 속성값 가져오기
		System.out.println("---------- 5. 속성값 가져오기  ----------");
		System.out.println(mygame1.getName());
		System.out.println(mygame1.getPrice());
		System.out.println(mygame1.getGanre());
		
	}
}
