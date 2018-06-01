package SavingsBalance;

public class SavingsBalance {
	public static int annualInterestRate;
	double SavingsBalance;
	public void SavingsBalance(double balance){
		this.SavingsBalance=balance;
	}
	public void calculateMonthlyInterest(int annualInterestRate,double SavingsBalance) {
		double interst=(SavingsBalance * (annualInterestRate/100.0))/12;
				this.SavingsBalance=SavingsBalance+annualInterestRate;
				
	}
	
	public void modifyInterest(double SavingsBalance) {
		System.out.println(annualInterestRate);
		double interst=(SavingsBalance * annualInterestRate/100.0)/12;
				this.SavingsBalance=SavingsBalance+annualInterestRate;
				
	}
	
	public static void modifyInterstRate(int newValue) {
		
		annualInterestRate=newValue;
		System.out.println(annualInterestRate);
	}
	public void showBalance() {
		System.out.println("balance"+SavingsBalance);
	}
	public static void main(String[] args) {
		
		SavingsBalance sb1=new SavingsBalance();
		SavingsBalance sb2=new SavingsBalance();
		sb1.calculateMonthlyInterest(4,5000);
		sb1.showBalance();
		sb2.calculateMonthlyInterest(4,6000);
		sb2.showBalance();
		sb1.modifyInterstRate(5);
		sb1.modifyInterest(5000);
		sb1.showBalance();
		sb1.modifyInterstRate(5);
		sb1.modifyInterest(6000);
		sb1.showBalance();
		}

}
