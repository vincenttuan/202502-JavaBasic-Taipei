import java.util.Scanner;

public class Main29 {

	public static void main(String[] args) {
		// 12~2: 冬, 3~5: 春, 6~8: 夏, 9~11: 秋
		// 請輸入月份(1~12): 4
		// 季節: 春
		// 限用 switch-case
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入月份(1~12): ");
		int month = sc.nextInt();

		// JDK 11(含)以前的寫法
		switch(month) {
			case 12:
			case 1:
			case 2:
				System.out.println("冬");
				break;
			case 3:
			case 4:
			case 5:
				System.out.println("春");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("夏");
				break;
			case 9:case 10:case 11:
				System.out.println("秋");
				break;
		}
		// JDK 12(含)以後的寫法
		switch(month) {
			case 12, 1, 2:
				System.out.println("冬");
				break;
			case 3, 4, 5:
				System.out.println("春");
				break;
			case 6, 7, 8:
				System.out.println("夏");
				break;
			case 9, 10, 11:
				System.out.println("秋");
				break;			
		}

		

	}

}