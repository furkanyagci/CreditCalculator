import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		List<Credit> credits = new ArrayList<Credit>();
		credits.add(new NeedCredit());
		credits.add(new CarCredit());
		
		Customer customer = new Customer(1,"Furkan");	
		
		Application application = new Application(credits, customer);
		application.customerCreditApplication(50000, 5);
	}
	
}
