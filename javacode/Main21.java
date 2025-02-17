import java.util.Scanner;

public class Main21 {
	public static void main(String[] args) {
		System.out.print("請輸入成績:");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt(); // 將使用者所輸入的資料轉成 int
		System.out.printf("成績: %d%n", score);
		// 判斷成績 
		if(score >= 60) {
			System.out.println("及格");
		} else {
			System.out.println("不及格");
		}
	}
}