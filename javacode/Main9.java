// 題目: 半徑 = 10, 請求出圓面積與球體積
// 公式: 圓面積 = pi * r * r
// 公式: 球體積 = 4/3.0 * pi * r * r * r
public class Main9 {
	public static void main(String[] args) {
		int r = 10; // 半徑
		double pi = 3.1415926; // 圓周率

		double area = pi * r * r; // 圓面積
		double volume = 4/3.0 * pi * r * r * r; // 球體積

		// 印出圓面積與球體積到小數點 1 位
		System.out.printf("圓面積 %.1f%n", area);
		System.out.printf("球體積 %.1f%n", volume);
	}
}
