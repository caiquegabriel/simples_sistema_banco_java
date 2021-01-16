package core;

public class Session {
	
	private String token; 
	private boolean  valid;
	
	public void set_token(String token) { 
		this.token = token;
	}

	public void set_valid(Boolean valid) { 
		this.valid = valid;
	}

	
	/*
	 * Verifica se está logado
	*/
	public boolean has_logged() { 
		if( this.valid == true )
			return true;
		return false;
	}
	
	
}
