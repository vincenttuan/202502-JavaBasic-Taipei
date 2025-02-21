public class Main38 {
	
	public static void main(String[] args) {
		int x = 1;
		while(x <= 10) {
			if(x == 8) {
				break;
			}
			if(x % 3 == 0) {
				x++;
				continue;
			}
			System.out.println(x);
			x++;
		}	
	}

}