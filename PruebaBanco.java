package Bancario;

public class PruebaBanco {

	public static void main(String[] args) {
		Cliente ClienteAhorro1=new Cliente("James Smith");
		CuentaAhorro CtaAhorro1 = new CuentaAhorro(500,3);
		System.out.println("Cliente 1: "+ClienteAhorro1.getnombre());
		System.out.println("Cuenta de Ahorro: B/."+CtaAhorro1.getBalance()+ ", "+"Interes: "+CtaAhorro1.interesRate()+"%");
		
		Cliente ClienteCheques1=new Cliente("Owen Bryant");
		CuentaCheques CuentaCheques1 = new CuentaCheques(500);
		System.out.println("Cliente 2: "+ClienteCheques1.getnombre());
		System.out.println("Cuenta de Cheques: B/."+CuentaCheques1.getBalance()+", sin protección sobregiro");

		Cliente ClienteCheques2=new Cliente("Tim Soley");
		CuentaCheques CuentaCheques2 = new CuentaCheques(500,500);
		System.out.println("Cliente 3: "+ClienteCheques2.getnombre());
		System.out.println("Cuenta de Cheques: B/."+CuentaCheques2.getBalance()+", "+"protección sobregiro de: B/."+CuentaCheques2.getSobregiro());
		
		Cliente ClienteCheques3=new Cliente("Maria Soley");
		CuentaCheques CuentaCheques3 = new CuentaCheques(500);
		System.out.println("Cliente 4: "+ClienteCheques3.getnombre()+", comparte Cuenta con Cliente 3: "+ClienteCheques2.getnombre());
		System.out.println("Cuenta de Cheques: B/."+CuentaCheques3.getBalance());
	}
}
