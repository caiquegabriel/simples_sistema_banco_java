package helpers;

import helpers.Type;

public class Validate {
	
	public static boolean is_string( Object value ) {  
		if( value.getClass().equals("class java.lang.String") ) {
			return true;
		} 
		return false;
	}

}
