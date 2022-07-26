/**
 * 
 */
package SAVINGS;

/**
 * @author CamilleDayao
 *
 */
public class SavingsAccount {
	private double annualInterestRate;
	private final int ACCOUNT_NUMBER;
	private double balance;

	
	public SavingsAccount(int ACCOUNT_NUMBER, double balance) {
		this.ACCOUNT_NUMBER = ACCOUNT_NUMBER;
		this.balance = balance;
	}
	public int accountNumAccesors(int ACCOUNT_NUMBER) {
		return this.ACCOUNT_NUMBER;
	}
	public double balanceAccessor(double balance) {
		return this.balance;

	}
	public double actualBalance(double actualBalance) {
		actualBalance = this.balance;
		 actualBalance = (double) (Math.round(actualBalance*100.0)/100.0);
		return actualBalance;
	}
	
	public double setAnnualRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
		return annualInterestRate;
	}
	public void AddMonthlyInterest() {
	
		double balanceInterest = (this.balance * this.annualInterestRate) /12;
		balance = balance + balanceInterest;
		
	}
}

