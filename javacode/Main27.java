import java.util.Scanner;

public class Main27 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入身分證號:");
		String id = sc.next(); // 取字串
		// id 第 1 碼透過 id.chatAt(0) 
		// id 第 2 碼透過 id.chatAt(1) 用來表示性別
		// id 第 3 碼透過 id.chatAt(2) 

		char gender = id.charAt(1);
		// if-else
		if(gender == '1') {
			System.out.println("男性");
		} else if(gender == '2') {
			System.out.println("女性");
		} else {
			System.out.println("錯誤");
		}
		
		// switch-case
		switch(gender) {
			case '1':
				System.out.println("男性");
				break;
			case '2':
				System.out.println("女性");
				break;	
			default:
				System.out.println("錯誤");	
		}

	}
}