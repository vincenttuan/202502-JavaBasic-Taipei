/*
	智能家庭自動調節燈光與空調
	1.如果房間光線強度小於 100 Lux 且房間有人燈光要開啟否則關閉
	2.如果房間溫度高於 28度C 且房間有人空調要開啟否則關閉
	3.當房間沒有人時 自動關閉燈光與空調 節省能源
	4.當房間有人時 自動開啟音響否則音響關閉
*/
public class Main20 {
	public static void main(String[] args) {
		// 假設的環境條件
		int lux = 80; // 光線強度
		int tmp = 20; // 房間溫度
		boolean hasPerson = false; // 房間是否有人?
		boolean music = hasPerson; // 音響與hasPerson的資料會一致 

		System.out.printf("光線強度 %d Lux%n", lux);
		System.out.printf("房間溫度 %d °C%n", tmp);
		System.out.printf("是否有人 %b %n", hasPerson);

		// 控制燈光
		boolean light = (lux < 100) && (hasPerson == true);
		if(light == true) {
			System.out.println("燈光已開啟-因光線不足");
		} else {
			System.out.println("燈光已關閉-因光線足夠");
		}

		// 控制空調
		boolean ac = (tmp > 28) && (hasPerson == true);
		if(ac == true) {
			System.out.println("空調已開啟-因溫度過高");
		} else {
			System.out.println("空調已關閉-因溫度過低");
		}

		// 控制音響
		if(music == true) {
			System.out.println("音響已開啟-因房間有人");
		} else {
			System.out.println("音響已關閉-因房間無人");
		}

		// 如果房間都沒人關閉燈光,空調與音響
		if(!(hasPerson == true)) {
			System.out.println("房間都沒人關閉燈光,空調與音響");
		}

	}
}
