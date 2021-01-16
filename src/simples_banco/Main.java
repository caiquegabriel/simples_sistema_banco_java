package simples_banco;

import core.Session; 
import simples_banco.Banco;

public class Main {
	 
	 
	
	public static void main(String[] args) {  
		//Vamos carregar a dependência de sessão
		Session session = new Session(); 
		
		Banco b = new Banco();
		b.main(session);  
	}

}
