import java.util.Scanner;

public class Main24 {
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

		// 1. 若 score 不在 0~100 的範圍之內則不往下做
		if(score < 0 || score > 100) {
			System.out.println("成績錯誤!");
			return; // 方法停止不往下執行
		}

		// 2. score 保證是在 0~100 之內進行成績判斷
		if(score >= 90) {
			System.out.println("A");
		} else if(score >= 80) {
			System.out.println("B");
		} else if(score >= 70) {
			System.out.println("C");
		} else if(score >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}
}