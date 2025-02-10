/* 
	printf 格式化輸出
	%d 代表格式化整數
	%f 代表格式化浮點數
	%s 代表格式化字串
	%b 代表格式化布林
	%c 代表格式化字元
	%n 代表換行或寫成 \n 也行
*/	
public class Main8 {

	public static void main(String[] args) {
		double r = 3.141593; // 半徑 (double 表示 浮點數)
		System.out.println("半徑 " + r);
		System.out.printf("半徑 %f%n", r);
		System.out.printf("半徑 %.2f%n", r); // .2 表示只顯示到小數點 2 位
	}

}