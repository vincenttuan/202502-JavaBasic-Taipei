/*
	智能家庭自動調節燈光與空調
	1.如果房間光線強度小於 100 Lux 且房間有人燈光要開啟否則關閉
	2.如果房間溫度高於 28度C 且房間有人空調要開啟否則關閉
	3.當房間沒有人時 自動關閉燈光與空調 節省能源
*/
public class Main20 {
	public static void main(String[] args) {
		// 假設的環境條件
		int lux = 80; // 光線強度
		int tmp = 30; // 房間溫度
		boolean hasPerson = true; // 房間是否有人?

		// 控制燈光
		boolean light = (lux < 100) && (hasPerson == true);
		if(light == true) {
			System.out.println("燈光已開啟");
		} else {
			System.out.println("燈光已關閉");
		}

		// 控制空調
		boolean ac = (tmp > 28) && (hasPerson == true);
		if(ac == true) {
			System.out.println("空調已開啟");
		} else {
			System.out.println("空調已關閉");
		}

		// 如果房間都沒人關閉燈光與空調
		if(!(hasPerson == true)) {
			System.out.println("房間都沒人關閉燈光與空調");
		}

	}
}