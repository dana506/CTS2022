package assignment;

public class Account {
	public double loanValue, monthlyRate;
	public int daysActive, accountType;
	public static final int STANDARD = 0, BUDGET = 1, PREMIUM = 2, SUPER_PREMIUM = 3;

	public double getLoanValue() {
		System.out.println("The loan value is " + this.loanValue);
		return loanValue;
	}

	public double getMonthlyRate() {
		System.out.println("The rate is " + monthlyRate);
		return this.monthlyRate;
	}

	// must have method - the lead has requested it in all classes
	public double getMonthlyRateValue() {
		return loanValue * monthlyRate;
	}

	public void setLoanValue(double value) throws Exception {
		if (value < 0)
			throw new Exception();
		else {
			loanValue = value;
		}
	}

	public String toString() {
		return "Loan: " + this.loanValue + "; rate: " + this.monthlyRate + "; days active:" + daysActive + "; Type: "
				+ accountType + ";";
	}

	public void print() {
		int vb = 10;
		System.out.println("This is an account");
	}

	public static double calculate(Account[] accounts) {
		double totalFee = 0.0;
		Account account;
		int temp = 365;
		for (int i = 0; i < accounts.length; i++) {
			account = accounts[i];
			if (account.accountType == Account.PREMIUM || account.accountType == Account.SUPER_PREMIUM)
				totalFee += .0125 * ( // 1.25% broker's fee
				account.loanValue * Math.pow(account.monthlyRate, (account.daysActive / 365)) - account.loanValue); // interest-principal
		}
		return totalFee;
	}

	public Account(double value, double monthlyRate, int accountType) throws Exception {
		if (value < 0) {
			loanValue = value;
		}
		this.monthlyRate = monthlyRate;
		this.accountType = accountType;
	}

}
