import java.util.Scanner;

public class Main23 {
	public static void main(String[] args) {
		System.out.print("請輸入成績:");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		// 判斷成績
		// 90~100 印出 A
		// 80~89  印出 B
		// 70~79  印出 C
		// 60~69  印出 D
		// 0~59   印出 F
		// 超過 100 或低於 0 印出 "成績錯誤!"

		if(score >= 90 && score <= 100) {
			System.out.println("A");
		} else if(score >= 80 && score <= 89) {
			System.out.println("B");
		} else if(score >= 70 && score <= 79) {
			System.out.println("C");
		} else if(score >= 60 && score <= 69) {
			System.out.println("D");
		} else if(score >= 0 && score <= 59) {
			System.out.println("F");
		} else {
			System.out.println("成績錯誤!");
		}

	}

}