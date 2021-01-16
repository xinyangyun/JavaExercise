package annotaion;

public class Hero {

	//这个注解用来标记过时的元素
	@Deprecated
	public void say() {
		System.out.println("Nothing has to say ");
	}
	
	public void speak() {
		System.out.println("I have a dream!");
	}
	
}
