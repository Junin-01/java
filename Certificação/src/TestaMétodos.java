class Param{
	String getNumero(int a) {
		if(true) return "verdadeiro";
		throw new RuntimeException("jogando exception resolve o problema");
	}
	
	void primitivo (double a) {
		if(a > 5);
		return;
	}
	void referencia(Object o){
	}
	void teste(final int a, int b) {
		b = 10;
		// a = 5;
	}
}

class ClasseComMétodos{
	
	int getNumero() {
		return 5;
	}
}



public class TestaMétodos {
  public static void main(String[] args) {
	Param p = new Param();
	int a = 1;
    System.out.println(p.getNumero(46));
    String resultado = p.getNumero(423);
	
	p.primitivo('Z');
	p.referencia(new Object());
	p.referencia("junior");
	p.primitivo(a);
	p.teste(1, 2);
}
}
