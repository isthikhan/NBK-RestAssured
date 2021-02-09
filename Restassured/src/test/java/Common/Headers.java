package Common;

import java.util.HashMap;

import Utili.Constant;

public class Headers {
		
		
		public HashMap<String, ?> UserCreationHeaders() {
	        HashMap<String, String> headers = new HashMap<String, String>();
	        headers.put(Constant.CONTENT_TYPE, Constant.APPLICATION_JSON);
	        return headers;
	    }

		public HashMap<String, ?> UserLoginHeaders() {
	        HashMap<String, String> headers = new HashMap<String, String>();
	        headers.put(Constant.CONTENT_TYPE, Constant.APPLICATION_JSON);
	        return headers;
	    }

		public HashMap<String, ?> UserRegisterHeaders() {
	        HashMap<String, String> headers = new HashMap<String, String>();
	        headers.put(Constant.CONTENT_TYPE, Constant.APPLICATION_JSON);
	        return headers;
	    }


}
