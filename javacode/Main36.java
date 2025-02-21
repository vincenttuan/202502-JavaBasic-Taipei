public class Main36 {
	// 請計算出 1~10 偶數與奇數的總和各為多少
	public static void main(String[] args) {
		int x = 1;
		int sumOfEven = 0; // 偶數的總和
		int sumOfOdd = 0;  // 奇數的總和
		while(x <= 10) {
			if(x % 2 == 0) {
				sumOfEven += x; // sumOfEven = sumOfEven + x;
			} else {
				sumOfOdd += x; // sumOfOdd = sumOfOdd + x;
			}
			x++;
		}
		System.out.printf("偶數總和: %d%n", sumOfEven);
		System.out.printf("奇數總和: %d%n", sumOfOdd);
	}
}