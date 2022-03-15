import java.util.List;

public class Application {
	
	private List<Credit> credits;
	private Customer customer;
	
	public Application(List<Credit> credits, Customer customer) {
		super();
		this.credits = credits;
		this.customer = customer;
	}
	
	void customerCreditApplication(double creditAmount, int years) {
		if (credits.size() >0) {
			
			System.out.println(customer.getId()+ " / " + customer.getName() + " / adlı kişinin "+ creditAmount +" TL "+ years +" yıl geri ödemeli kredisinin toplam maliyeti : ");
			for (Credit credit : credits) {
				credit.calculate(creditAmount, years);
			}		
			
		}else {
			System.out.println("Lütfen en az bir kredi seçiniz");
		}
	}

}
