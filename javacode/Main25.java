import java.util.Scanner;
public class Main25 {
	public static void main(String[] args) {
		// 讓使用者可以輸入身高(cm), 體重(kg)
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入身高(cm):");
		double h = sc.nextDouble();
		System.out.print("請輸入體重(kg):");
		double w = sc.nextDouble();
		// bmi = 體重kg / (身高m*身高m)
		// bmi 診斷狀態:
		// 1.若 bmi <= 18 則過輕
		// 2.若 bmi > 23 則過重
		// 3.其餘皆正常
		// 請印出 bmi 值與 bmi 診斷狀態
		h = h / 100; // 將身高由 cm 變為 m
		double bmi = w / (h*h);
		System.out.printf("bmi: %.1f%n", bmi);

		// bmi 診斷狀態
		if(bmi <= 18) {
			System.out.println("過輕");
		} else if(bmi > 23) {
			System.out.println("過重");
		} else {
			System.out.println("正常");
		}

	}
}