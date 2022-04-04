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

	public double computeMonthlyRate() {
		return loanValue * monthlyRate;
	}

	public void setLoanValue(double loanValue) throws Exception {
		if (loanValue < 0)
			throw new Exception();
		else {
			this.loanValue = loanValue;
		}
	}

	public String getAccountDetails() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(System.getProperty("line.separator"));
		stringBuilder.append("ACCOUNT DETAILS");
		stringBuilder.append(System.getProperty("line.separator"));
		stringBuilder.append("Loan value: ");
		stringBuilder.append(this.loanValue);
		stringBuilder.append("Monthly rate: ");
		stringBuilder.append(this.monthlyRate);
		stringBuilder.append("Days active: ");
		stringBuilder.append(this.daysActive);
		stringBuilder.append("Account type: ");
		stringBuilder.append(this.accountType);
		stringBuilder.append(System.getProperty("line.separator"));
		return stringBuilder.toString();}

	public void print() {
		int vb = 10;
		System.out.println("This is an account");
	}

	public static double getPremiumAccountsTotalFeesValue(Account[] accounts) {
		double totalFee = 0.0;
		Account account;
		int temp = 365;
		for (int i = 0; i < accounts.length; i++) {
			account = accounts[i];
			if (account.accountType == Account.PREMIUM || account.accountType == Account.SUPER_PREMIUM)
				totalFee += .0125 * ( 
				account.loanValue * Math.pow(account.monthlyRate, (account.daysActive / 365)) - account.loanValue); 
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
