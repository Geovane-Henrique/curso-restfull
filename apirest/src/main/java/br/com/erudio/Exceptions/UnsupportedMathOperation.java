package br.com.erudio.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UnsupportedMathOperation extends RuntimeException {

	
	public UnsupportedMathOperation(String ex) {
		super(ex);
	}

	private static final long serialVersionUID = 1L;

}
