public class Main34 {

	public static void main(String[] args) {
		// 1~10 中只印出 3 的倍數
		int x = 1;
		while(x <= 10) {
			if(x % 3 == 0) {
				System.out.println(x);
			}
			x++;
		}
	}

}