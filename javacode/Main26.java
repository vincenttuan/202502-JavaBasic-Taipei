public class Main26 {
	public static void main(String[] args) {
		// 三元運算子 ? :
		int score = 80;

		if(score >= 60) {
			System.out.println("及格");
		} else {
			System.out.println("不及格");
		}

		System.out.println( (score>=60)?"及格":"不及格" );

		// 三元運算子嵌套
		// 分數 >= 85 優秀, >= 60 良好, < 60 加油

		System.out.println( (score>=85)?"優秀":(score>=60)?"良好":"加油" );



	}	
}