package practice_enum;

public enum MyGame {
	STARCRAFT("��Ÿũ����Ʈ", cal(19000), "����/�ùķ��̼�"),
	WARCRAFT("��ũ����Ʈ", cal(39000), "����/�ùķ��̼�"),
	DOTA2("��Ÿ2", cal(100), "����"),
	BATTLEGROUND("��Ʋ�׶���", cal(20000), "FPS");
	
	final private String name;
	final private int price;
	final private String ganre;
	
	private MyGame(String name, int price, String ganre) {
		this.name = name;
		this.price = price;
		this.ganre = ganre;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public String getGanre() {
		return ganre;
	}
	
	public static int cal(int price) {
		return 2 * price;
	}
	
}
