package annotaion;

public class HeroTest {
	
	public static void main(String[] args) {
		test();
	}
	
	//��ֹ����
	@SuppressWarnings("deprecation")
	public static void test() {
		Hero hero = new Hero();
		hero.say(); //��ʱ
		hero.speak();
	}
}
