package com.test;

import junit.framework.TestCase;

import com.dys.Bank;
import com.dys.Expression;
import com.dys.Money;

public class testMul extends TestCase {
	//乘法测试
	public void testMulti(){
		Money five = Money.Dash(5);
//		Dash product = five.multi(2);
//		Assert.assertEquals(10, product.amount);
		assertEquals(Money.Dash(10),five.multi(2));
		assertEquals(Money.Dash(15),five.multi(3));
//		product = five.multi(3);
//		Assert.assertEquals(15, product.amount);		
		
		five = Money.franc(5);
		assertEquals( Money.franc(10),five.multi(2));
		assertEquals( Money.franc(15),five.multi(3));
	
	}
	
	//等价测试
	//TODO 不同货币货币之间的等价测试
	public void  testEqual(){
		assertTrue(Money.Dash(5).equals(Money.Dash(5)));
		assertFalse(Money.Dash(5).equals(Money.Dash(6)));
		assertTrue(Money.franc(5).equals(Money.franc(5)));
		assertFalse(Money.franc(5).equals(Money.franc(6)));
		assertFalse(Money.franc(5).equals(Money.Dash(5)));
	}
	
	//

	
	//货币测试

	public void testCurrency(){
		assertEquals("USD", Money.Dash(1).gerCurrnecy());
		assertEquals("FRC", Money.franc(1).gerCurrnecy());
	}
	
	//不同货币之间加法测试
	public void testPlus(){
		Money five = Money.Dash(5);
		Expression sum = five.plus(5);
		Bank bank = new Bank();
		Money reduced = bank.reduce(sum,"USD");
		assertEquals(Money.Dash(10), reduced);
	}
}
