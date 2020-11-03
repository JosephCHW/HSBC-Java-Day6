package QA.hsbc.utilities;

import org.springframework.stereotype.Service;

@Service
public class TaxCalculation {
	
	public float calculateTax(int sal) {
		int tax;
		if (sal < 1000) tax = 0;
		else if (sal >= 1000 && sal < 2000) tax = 15;
		else tax = 25;
		return (sal * tax)/100;
	}
}
