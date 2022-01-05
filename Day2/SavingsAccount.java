package Day2;

public class SavingsAccount extends Account {
	
	private double rate = 0.02;
	
	public SavingsAccount(double startingBalance){
		super(startingBalance);
	}
	
	@Override
	public String toString() {
		return String.format("Saving CurrentBalance : $%.2f",this.getBalance());
	}
}