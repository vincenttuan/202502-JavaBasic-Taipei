// 整數運算
// byte, short, int, long
public class Main6 {

	public static void main(String[] args) {
		byte b = 2; // 建立一個 byte 變數 b
		System.out.println(b); // 印出 b 的內容

		short s = 30000; // 建立一個 short 變數 s
		System.out.println(s); // 印出 s 的內容

		int i = 100_0000; // 建立一個 int 變數 i
		System.out.println(i);

		// 因為 100_234_567_8900 超過 int 的最大值所以要加上 L
		long x = 100_234_567_8900L; // 建立一個 long 變數 x
		System.out.println(x);
	}

}