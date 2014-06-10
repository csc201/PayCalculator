import java.math.BigDecimal;


public abstract class PayCalculator {
	BigDecimal payRate;
	
	public PayCalculator(BigDecimal payRate) {
		this.payRate = payRate;
	}
	public abstract BigDecimal computePay();
	
	public BigDecimal computePay(BigDecimal factor) {
		return (this.payRate.multiply(factor));
	}
	
	
}
