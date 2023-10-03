package UnitProject;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.Bean;

import ch.qos.logback.core.recovery.ResilientSyslogOutputStream;

public class TestCalculator {
Calculator c=new Calculator();
@org.junit.Before
public void hi() {
	System.out.println("Hello");
}
@org.junit.Test
public void testAdd() {
	System.out.println(c.Add(10, 20));
}
@org.junit.Test
public void testmul() {
	c.mul(10, 20);
}
@org.junit.Test
public void testSub() {
	System.out.println(c.sub());
}
@org.junit.Test
public void testDiv() {
	c.div();
}
@org.junit.After
public void display() {
	System.out.println("bye");
}
@Test
public void chechAddSub() {
	assertEquals(c.Add(10, 20),c.Add(20, 10));
}
@Test
public void chechNotAddSub() {
	assertNotEquals(c.Add(10, 20),c.sub());
}
Sample s=new Sample();
@Test
public void testMin() {
	int[]a= {5,7,10,2,8,12};
   assertEquals(s.findMin(a),2);
}
SampleStringArray g=new SampleStringArray();
@Test
public void findlength() {
	String[]a= {"Abu","Benzz","Audi"};
   assertSame(g.findlength(a),"Benzz"
		   );
}
}     