package com.dys;


public  class Money implements Expression {

	protected int amount;
	protected String Currency;

	public Money() {
		super();
	}
	public Money(int price,String Currency ){
		this.Currency=Currency;
		this.amount = price;
	}


	public static Money Dash(int i) {
		return new Money(i,"USD");
	}
	public static Money franc(int i) {
		return new Money(i,"FRC");
	}
	
	public String gerCurrnecy() {
		return Currency;
	}
	
	//public abstract Money multi(int i) ;
	public Money multi(int i) {
		return new Money(i*amount,Currency);
	}
	
	
	@Override
	public boolean equals(Object obj) {
		Money money = (Money)obj;
		return amount==money.amount && Currency==money.gerCurrnecy();
		
	}
	
	public String toString(){
		return amount+"  "+Currency;
	}
	//TODO 实现加法
	public Money plus(int i) {
		return Money.Dash(10);
	}

}