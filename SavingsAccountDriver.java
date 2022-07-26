/**
 * 
 */
package SAVINGS;

/**
 * @author CamilleDayao
 *
 */
public class SavingsAccountDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int ACCOUNT_NUMBER = 0;
		double actualBalance = 0;

		SavingsAccount saver1 = new SavingsAccount(10002, 2000);
		SavingsAccount saver2 = new SavingsAccount(10003, 3000);
		
		saver1.setAnnualRate(0.05);
		saver2.setAnnualRate(0.05);

		System.out.println("Monthly balances for one year with 0.05 annual interest:");
		final String HEADING_TABLE_FORMAT = "%-13s%10s%13s%13s%13s";
		String FORMAT_TABLE = "%-13s %-13s %-13s %-13s %-13s";
		System.out.printf(HEADING_TABLE_FORMAT, "Month", "Account #", "Balance", "Account #", "Balance\n");
		System.out.printf(HEADING_TABLE_FORMAT, "-----", "--------", "--------", "--------", "--------\n");
		
			
			for(int i=0; i<=12; i++) {
			if(i==0) {
				System.out.printf(FORMAT_TABLE,i, saver1.accountNumAccesors(ACCOUNT_NUMBER),saver1.actualBalance(actualBalance),
						saver2.accountNumAccesors(ACCOUNT_NUMBER), saver2.actualBalance(actualBalance));
				System.out.println();
			}
			else if(i>0) {
			saver1.AddMonthlyInterest();
			saver2.AddMonthlyInterest();
			
			System.out.printf(FORMAT_TABLE,i, saver1.accountNumAccesors(ACCOUNT_NUMBER), saver1.actualBalance(actualBalance), 
						saver2.accountNumAccesors(ACCOUNT_NUMBER), saver2.actualBalance(actualBalance));
			System.out.println();		
			}
			}
			double total = saver1.actualBalance(actualBalance) + saver2.actualBalance(actualBalance);
			total = Math.round(total * Math.pow(10, 2))
	                / Math.pow(10, 2);
			System.out.println("Final balance of both accounts combined: "+ total);
	}

}
