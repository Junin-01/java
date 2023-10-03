class Livro{
	Livro(){
		System.out.println("sem argumentos");
	}
	Livro(String... s){
		System.out.println("strings");
	}
	Livro(int i){
		this(valor());
		System.out.println("construtor com int");
	}
	static String valor() {
		return "xpto";
	}
}


public class TestaConstrutor2 {
  public static void main(String[] args) {
	Livro l = new Livro(234);
}
}
