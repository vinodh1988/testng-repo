package com.unit;

public class NoArgPassedException extends Exception{
@Override	
  public String getMessage() {
		return "You have not any parameter";  
  }
}
