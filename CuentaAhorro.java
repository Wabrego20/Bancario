package Bancario;

public class CuentaAhorro extends Cuenta{
	private double interes;
	public CuentaAhorro (double balance, double interes) {
		super(balance);
		this.interes=interes;
	}
	public double interesRate() {
		return interes;
	}
}
