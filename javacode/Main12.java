// 飲料一瓶 10 元
// 買二送一
// 請問買 10 瓶要花多少錢
public class Main12 {
	public static void main(String[] args) {
		// 每瓶飲料價格
		int pricePerBottle = 10;
		// 要買的瓶數
		int bottlesToBuy = 10;
		// 買二送一 (每一組 3 瓶)
		int fullSets = bottlesToBuy / 3; // 每組 3 瓶, 可買幾組
		int remainingBottoles = bottlesToBuy % 3; // 剩餘的瓶數

		// 計算總花費 (每瓶飲料價格 * (組數*2 + 餘瓶))
		// 每一組需要支付 2 瓶的價格
		int totalCost = pricePerBottle * (fullSets*2 + remainingBottoles);
		System.out.printf("要買的瓶數 $%d%n", bottlesToBuy);
		System.out.printf("總花費 $%d%n", totalCost);

	}
}