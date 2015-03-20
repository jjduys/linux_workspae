package com.dys;

public class Dash extends Money {
	
	
	public Dash(int price,String Currency){
		super(price,Currency);
//		this.Currency=Currency;
		
	}

	public String toString(){
		return amount+"  "+Currency;
	}

 
}
