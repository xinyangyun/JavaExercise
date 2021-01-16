package atguigu.observer.improve;

//接口，让WetherData来实现
public interface Subject {

	public void registerObserver(Observer o); 
	public void removeObserver(Observer o); 
	public void notifyObservers(); 
	
}
