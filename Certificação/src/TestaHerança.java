class Júnior extends Object{
	
}
class Mãe {

}
class Filha extends Mãe{
	
}
class Neta extends Filha{
	
}
class Avenida extends modelo.Endereço{
	
	
	}
class X {
    int x;
	void y() {
		System.out.println("Invocando y em um objeto");
	}
}
class Y extends X{
	
}
class W{
	public static void metodo() {
		System.out.println("invocando o metodo estatico que foi definido em W");
	}
}



class Z extends W{
	public static void metodo() {
		System.out.println("invocando o metodo estatico que foi definido em Z");
	}
}
class Gato{
	String corDosOlhos;
	public String toString() {
		return "[Gato " + corDosOlhos + "]";
	}
}
class TestaHerança{
	public static void main(String[] args) {
		Gato g = new Gato();
		g.corDosOlhos = "mel";
		System.out.println("Estou com um: " + g);
		
		Y y = new Y();
		y.x = 15;
		y.y();
		
		W.metodo();
		Z.metodo();
		
		Z z = new Z();
		z.metodo();
		
		W w = new Z();
		w.metodo();
	}
}


