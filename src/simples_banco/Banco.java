package simples_banco;

import core.Session;
import auth.Login;
import helpers.Validate;
import java.util.Scanner; 

public class Banco { 

	protected Session session; 
	
	public void main(Session session) {
		
		Scanner scanner = new Scanner(System.in);
		
		if( session.has_logged() == true ) {
			//Est� logado.
			System.out.println("Login efetuado com sucesso, senhor Ca�que"); 
			
			
			return;
		}else {
			//N�o estou logado, vamos pedir pra fazer o login
			System.out.println("Voc� n�o est� logado."); 
			try {
				String email    = scanner.nextLine();
				String password = scanner.nextLine();
				
				String token = Login.login(email, password);
				if( token != null ) {
					session.set_token(token);
					session.set_valid(true);
				} 
				
			}catch(Exception e) {
				System.out.println("Fatal error."); 
			}
		}
		
		this.main(session);
	}

}
