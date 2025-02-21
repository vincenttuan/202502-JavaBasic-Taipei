public class Main37 {
	public static void main(String[] args) {
		// 印出 1~10 的奇數但是若為 3 的倍數則不印
		int x = 1;
		while(x <= 10) {
			if(x % 2 == 1) {
				if(x % 3 != 0) {
					System.out.println(x);
				}
			}
			x++;
		}
		//-- 利用 continue 改善效率 ---------------
		x = 1; // 重新指派 x = 1
		while(x <= 10) {
			if(x % 3 == 0) {
				x++;
				continue;
			}
			if(x % 2 == 1) {
				System.out.println(x);
			}
			x++;
		}

		//-- 利用 continue + 條件運算子 || 改善效率 --------------- 
		x = 1;
		while(x <= 10) {
			if(x % 3 == 0 || x % 2 == 0) {
				x++;
				continue;
			}
			System.out.println(x);
			x++;
		}
	}
}