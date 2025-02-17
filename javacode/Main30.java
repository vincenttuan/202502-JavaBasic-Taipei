import java.util.Scanner;

public class Main30 {

	public static void main(String[] args) {
		/*
		若總金額超過 1000 打九五折
		菜單
		1: 漢堡 150 元
		2: 披薩 300 元
		3: 沙拉 100 元
		4: 飲料 200 元
		=> 請點餐(1-4): 2
		=> 請輸入數量: 5
		*/
		Scanner sc = new Scanner(System.in);
		String menu = "菜單\n1: 漢堡 150 元\n2: 披薩 300 元\n3: 沙拉 100 元\n4: 飲料 200 元\n=> 請點餐(1-4): ";
		System.out.print(menu);
		int number = sc.nextInt();
		System.out.print("請輸入數量: ");
		int amount = sc.nextInt();

		int total = switch(number) {
			case 1 -> 150 * amount;
			case 2 -> 300 * amount;
			case 3 -> 100 * amount;
			case 4 -> 200 * amount;
			default -> 0;
		};
		total = (total > 1000) ? (int)(total * 0.9) : total;

		System.out.printf("總金額: %d%n", total);
	}

}