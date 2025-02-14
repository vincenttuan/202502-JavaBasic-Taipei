public class Main18 {

	public static void main(String[] args) {
		// 條件運算子: &&, ||, !
		int x1 = 80;
		int x2 = 50;
		// 判斷 x1 是否大於 x2 且(&&) x1 及格
		boolean check = (x1 > x2) && (x1 >= 60);
		System.out.println(check); 

		int y1 = 40;
		// y1 及格"或" y1 是偶數 印出判斷結果
		boolean check2 = (y1 >= 60) || (y1 % 2 == 0);
		System.out.println(check2);

		int y2 = 50;
		// y2 是否"不"及格
		boolean check3 = !(y2 >= 60);
		System.out.println(check3);
	}

}