package Casting;

class Mae{
	Mae(String s){
		
	}
	Mae (int i){
		
	}
}

class Filha extends Mae {
   Filha (int i){
   this("numero: " + i);
   System.out.println("fim do construtor com numero");
   }
   Filha (String s){
	   super(s);
	   System.out.println(s);
   }
}
class TestaConstrutores3{
	public static void main(String[] args) {
		new Filha("567");
	}
}