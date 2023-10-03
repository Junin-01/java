class Moto{
	public static final int PADRAO_TOTAL_DE_MOTOS = 8;
	public static int totaldeMotos = PADRAO_TOTAL_DE_MOTOS;
	
	String marca;
	
	public static int getTotalDeMotos() {
		return Moto.totaldeMotos;
	}
}

public class TestaStatic {
   public static void main(String[] args) {
	//Moto.TotalDeMotos = 15;
	System.out.println(Moto.getTotalDeMotos());
}
}
