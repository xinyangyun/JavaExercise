package annotaion;

public class HeroTest {
	
	public static void main(String[] args) {
		test();
	}
	
	//×èÖ¹¾¯¸æ
	@SuppressWarnings("deprecation")
	public static void test() {
		Hero hero = new Hero();
		hero.say(); //¹ıÊ±
		hero.speak();
	}
}
