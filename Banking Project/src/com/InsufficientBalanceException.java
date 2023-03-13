package com;

public class InsufficientBalanceException extends RuntimeException
{
	private String message;
	InsufficientBalanceException(String message)
	{
		this.message=message;
	}
	@Override
	public String getMessage()
	{
		return message;
		
	}
}
/**
 (it is Documentation Commeyt)
  1.create class with the exception name
 2a. extends Exception-->Checked Excption
 2b. extends RuntimeException-->Unchecked Excption
 3. Override getMessage()-->(variable,constructor,method)
 4.invoke the exception object using throw keyword & Handle it using try & catch Block
*/