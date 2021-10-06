package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.unit.BasicMath;
import com.unit.NoArgPassedException;

public class BasicMathTest {
  @Test
  public void highTest() {
	  Assert.assertEquals(BasicMath.highest(2,3), 3);
	  Assert.assertEquals(BasicMath.highest(10,2,3), 10);
	  Assert.assertEquals(BasicMath.highest(25,1,54,344,3), 344);
	  Assert.assertEquals(BasicMath.highest(), 0);
	  
  }
  
  @Test
  public void testDivideProperly() {
	  Assert.assertEquals(BasicMath.divide(5,2),2);
	  Assert.assertEquals(BasicMath.divideProper(10, 3), 3);
	  Assert.assertEquals(BasicMath.divideProper(12,0), -99999);
  }
  
  @Test(expectedExceptions = ArithmeticException.class)
  public void testDivideZero() {
	 BasicMath.divide(12, 0);
  }
  
  @Test
  public void testHighestProper() throws NoArgPassedException {
	
	Assert.assertEquals(BasicMath.highestProper(1,2,3),3);
	
  }
  
  @Test(expectedExceptions = NoArgPassedException.class)
  public void testHighestProper2() throws NoArgPassedException {
	
	BasicMath.highestProper();
	
  }
  
}
