import java.math.BigDecimal;


public class PayCalculatorDemo {
	public static void main(String [] args) {
		BigDecimal payRate = new BigDecimal(35);
		RegularPay rp = new RegularPay(payRate);
		System.out.println(rp.computePay(10));
		
		PayCalculator pay = new HazardPay(payRate);
		System.out.println(pay.computePay(10));
		
	}
}
