package atguigu.observer.improve;

//�ӿڣ���WetherData��ʵ��
public interface Subject {

	public void registerObserver(Observer o); 
	public void removeObserver(Observer o); 
	public void notifyObservers(); 
	
}
