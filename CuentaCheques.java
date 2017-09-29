package Bancario;

public class CuentaCheques extends Cuenta {
	private double sobreGiro;
	public CuentaCheques(double balance) {
		super(balance);
	}
	public CuentaCheques(double balance, double protect) {
		super(balance);
		sobreGiro=protect;
	}
	public boolean retiro(double retiro) {
		if (balance>0){
			return true;
		}
		else {
			return false;
		}
	}
	public double getSobregiro(){
		return sobreGiro;
	}
}
