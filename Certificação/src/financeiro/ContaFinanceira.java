package financeiro;
import modelo.*;
public class ContaFinanceira extends Conta {
	   @Override
	 protected  void fecha() {
		   System.out.println("financeira");
	   
   }
}
