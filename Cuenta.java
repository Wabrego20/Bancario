package Bancario;

public class Cuenta {
protected double balance, nuevoBalance;
	public Cuenta(double balance) {
		this.balance=balance;
	}
	public double getBalance() {
		return balance;
	}
	public boolean procedeRet(double retiro) {
		if (retiro<=balance) {
			return true;
		}
		else {
		return false;
		}
	}
}
