
public class CarCredit implements Credit{
	
	int yillikFaizOrani = 18;

	@Override
	public void calculate(double creditAmount, int years) {
		double yearLyInterest = (creditAmount * yillikFaizOrani /100);//Yıllık faiz miktarı
		double totalAmount = creditAmount;//toplam miktar
		for (int i = 0; i < years; i++) {
			totalAmount += yearLyInterest;
		}
		
		System.out.println("Taşıt kredisi miktarı : " + totalAmount);
	}
	

}
