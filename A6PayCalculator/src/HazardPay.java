import java.math.BigDecimal;


public class HazardPay extends PayCalculator {

	public HazardPay(BigDecimal payRate) {
		super(payRate);
	}

	@Override
	public BigDecimal computePay() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public BigDecimal computePay(double factor) {
		return computePay(new BigDecimal(factor));
	}

}
