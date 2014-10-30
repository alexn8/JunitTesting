import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class MysteryTest {


	@Test
	public void testMystery1()
	{
		Mystery x = new Mystery("Alex");
		assertEquals(1,x.mystery1(5,6));
		assertEquals(1,x.mystery1(7,6));
		assertEquals(2,x.mystery1(2,6));
		assertEquals(3,x.mystery1(3,9));
		assertEquals(2,x.mystery1(4,2));
		assertEquals(1,x.mystery1(5,1));
		assertEquals(1,x.mystery1(8,9));
		assertEquals(1,x.mystery1(7,6));	
		assertEquals(3,x.mystery1(6,3));
		assertEquals(1,x.mystery1(2,1));
	}
	@Test
	public void testMystery2()
	{
		Mystery a = new Mystery("Hi");
		assertEquals(-2,a.mystery2(1,5,6),1);
		assertEquals(-3,a.mystery2(1,7,12.0),1);
        assertEquals(3,a.mystery2(2,4,-30),0.01);
		assertEquals(-2,a.mystery2(2,10,12),1);
		assertEquals(-3,a.mystery2(2,14,22),1);
		assertEquals(3,a.mystery2(-4,-8,60),1);
		assertEquals(3,a.mystery2(8,16,-120),1);
		assertEquals(-3.0,a.mystery2(4,28,44),1);
		assertEquals(-2,a.mystery2(4,20,24),1);
		assertEquals(3,a.mystery2(16,32,-240),1);
		
	}
    
}
