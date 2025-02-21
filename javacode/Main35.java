public class Main35 {
	public static void main(String[] args) {
		// 請印出 1~10 並最後算出總合
		int x = 1;
		int sum = 0; // x 資料的累計
		while(x <= 10) {
			System.out.println(x);
			sum = sum + x; // 累加
			x++;
		}
		System.out.printf("總和: %d%n", sum);
	}
}