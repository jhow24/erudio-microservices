package br.com.erudio.foo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UnsuportedMatOperationException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	
	public UnsuportedMatOperationException(String exception) {
		super(exception);
	}
}
