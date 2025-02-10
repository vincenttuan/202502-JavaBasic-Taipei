// 飲料一瓶 10 元
// 買一送一
// 請問買 10 瓶要花多少錢
public class Main11 {
	public static void main(String[] args) {
		// 每瓶飲料價格
		int pricePerBottle = 10;
		// 要買的瓶數
		int bottlesToBuy = 11;
		// 買一送一 (實際上只要支付一半的價格)
		int bottlesToPayFor = bottlesToBuy / 2; // 實際上需要支付的瓶數
		// 計算總花費 (每瓶飲料價格 * 實際上需要支付的瓶數)
		int totalCost = pricePerBottle * bottlesToPayFor;
		System.out.printf("總花費 $%d%n", totalCost);

	}
}