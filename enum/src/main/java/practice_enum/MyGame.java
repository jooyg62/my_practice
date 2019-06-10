package practice_enum;

public enum MyGame {
    STARCRAFT("스타크래프트", cal(19000), "전략/시뮬레이션"),
    WARCRAFT("워크래프트", cal(39000), "전략/시뮬레이션"),
    DOTA2("도타2", cal(100), "협동"),
    BATTLEGROUND("배틀그라운드", cal(20000), "FPS");
	
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
