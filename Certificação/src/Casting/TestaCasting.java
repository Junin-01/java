package Casting;

interface Automatico{}
class Veiculo{}
class Moto extends Veiculo{}
class Carro extends Veiculo{}
class CarroAutomatico extends Carro implements Automatico{}
class MotoX extends Moto implements Automatico{}

public class TestaCasting {
      public static void main(String[] args) {
    	  CarroAutomatico ca = new CarroAutomatico();
    	  Carro c2 = ca;
    	  Automatico a = (Automatico) c2;
    	  
    	  Moto m2 = new Moto();
    	  Automatico a2 = (Automatico) m2;
    	  
    	  Veiculo v = new Carro();
    	  Moto m = (Moto) v;
    	  
    	  Carro c = new Carro();
    	  
		Object[] objetos = new Object[100];
		String s = "certificacao";
		objetos[0] = s;
		
		String recuperada = (String) objetos[0];
	}
}
