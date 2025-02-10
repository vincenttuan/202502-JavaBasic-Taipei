/* 
	printf 格式化輸出
	%d 代表格式化整數
	%f 代表格式化浮點數
	%s 代表格式化字串
	%b 代表格式化布林
	%c 代表格式化字元
	%n 代表換行或寫成 \n 也行
*/	
public class Main7 {
	public static void main(String[] args) {
		int cash = 2000000000;
		System.out.println("月薪 " + cash);
		System.out.printf("月薪 %d%n", cash);
		System.out.printf("月薪 %,d%n", cash);
	}
}

