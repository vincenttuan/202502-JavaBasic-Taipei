// 台積電 1 股 1025 元
// 請問買 3 張要花多少錢
// 買進手續費 3‰
// 1張 = 1000 股
public class Main10 {
	public static void main(String[] args) {
		// 宣告變數
		int stockPrice = 1025; // 每股價格 1025 元
		int sharesPerLots = 1000; // 每張股票數量 1000 股
		int numberOfLots = 3; // 買進的張數
		double txFeeRate = 0.003; // 手續費率 
		
		// 計算 總股數
		int totalShares = numberOfLots * sharesPerLots;

		// 計算 股票總價 (每股價格 * 總股數)
		int totalStockPrice = stockPrice * totalShares;

		// 計算 手續費 (股票總價 * 手續費率)
		double txFee = totalStockPrice * txFeeRate;

		// 計算 總花費 (股票總價 + 手續費)
		double totalCost = totalStockPrice + txFee;

		// 輸出結果
		System.out.printf("總股數 %,d%n", totalShares);
		System.out.printf("股票總價 $%,d%n", totalStockPrice);
		System.out.printf("手續費 $%,.1f%n", txFee);
		System.out.printf("總花費 $%,.1f%n", totalCost);


	}
}