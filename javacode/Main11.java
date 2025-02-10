// 飲料一瓶 10 元
// 買一送一
// 請問買 10 瓶要花多少錢
public class Main11 {
	public static void main(String[] args) {
		// 每瓶飲料價格
		int pricePerBottle = 10;
		// 要買的瓶數
		int bottlesToBuy = 11;
		// 買一送一 (計算買一送一個組合數量)
		int fullSets = bottlesToBuy / 2; // 每組 2 瓶, 可買幾組
		int remainingBottoles = bottlesToBuy % 2; // 剩餘的瓶數

		// 計算總花費 (每瓶飲料價格 * (組數 + 餘瓶))
		int totalCost = pricePerBottle * (fullSets + remainingBottoles);
		System.out.printf("要買的瓶數 $%d%n", bottlesToBuy);
		System.out.printf("總花費 $%d%n", totalCost);

	}
}