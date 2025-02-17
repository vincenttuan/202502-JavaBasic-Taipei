import java.util.Scanner;

public class Main28 {
	public static void main(String[] args) {
		// 系統使用情境:
		// 請輸入第一個數字: 10      <-- int x = sc.nextInt();
		// 請輸入運算符號(+-*/): +   <-- String op = sc.next();
		// 請輸入第二個數字: 5       <-- int y = sc.nextInt(); 
		// 得到答案: 15
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入第一個數字:");
		int x = sc.nextInt();
		System.out.print("請輸入運算符號(+-*/):");
		String op = sc.next();
		System.out.print("請輸入第二個數字:");
		int y = sc.nextInt();

		System.out.print("得到答案:");
		switch(op) {
			case "+":
				System.out.println(x+y);
				break;
			case "-":
				System.out.println(x-y);
				break;
			case "*":
				System.out.println(x*y);
				break;
			case "/":
				System.out.println(x/y);
				break;
			default:
				System.out.println("運算符號錯誤");
		}
	}
}