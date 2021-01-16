package atguigu.observer.improve;

public class Client {
	public static void main(String[] args) {
		// ����һ��weatherData
		WeatherData weatherData = new WeatherData();

		// �����۲���
		CurrentConditions currentConditions = new CurrentConditions();
		BaiduSite baiduSite = new BaiduSite();

		// ע�Ե�weatherData
		weatherData.registerObserver(currentConditions);
		weatherData.registerObserver(baiduSite);

		// ����
		System.out.println("֪ͨ�����Ĺ۲��ߣ�������Ϣ");
		weatherData.setData(10f, 100f, 30.3f);
		
		weatherData.removeObserver(currentConditions);

		// ����
		System.out.println();
		System.out.println("֪ͨ�����Ĺ۲��ߣ�������Ϣ");
		weatherData.setData(10f, 100f, 30.3f);

	}
}
