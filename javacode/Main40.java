public class Main40 {
	public static void main(String[] args) {
		int sum = 0;
		for(int x=1;x<=9;x++) {
			for(int y=1;y<=9;y++) {
				//System.out.printf("%dx%d=%d ", x, y, (x*y));
				//System.out.printf("%dx%d=%d\t", x, y, (x*y));
				//System.out.printf("%2dx%-2d=%-3d ", x, y, (x*y));
				System.out.printf("%02dx%02d=%03d ", x, y, (x*y));
				sum += (x*y);
			}
			System.out.println();
		}

		System.out.printf("總和 = %,d%n", sum);

	}
}