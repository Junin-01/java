import java.util.*;

abstract class Conta{
	int id;
	void liga() {}
}
class ContaJuridica extends Conta{
	String cnpj;
	void fecha() {}
}
class ContaFisica extends Conta{
	void fecha() {}
}
public class TestaTipoDeReferenciaEObjeto {
     public static void main(String[] args) {
		
    	 Conta c = new ContaJuridica();
    	 List lista = new ArrayList();
    	 c.id = 15;
    	 c.liga();
    	 ///c.fecha();
    	 //c.cnpj = "5000";
    	 
    	 (new ContaJuridica()).cnpj = "15";
    	 //ContaJuridica d = c;
    	 
    	// List lista = new ArrayList();
	}
}
