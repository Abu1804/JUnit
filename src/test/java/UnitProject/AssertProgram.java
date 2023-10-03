package UnitProject;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class AssertProgram {
@Test
public void testAssertEqual() {
	assertEquals(10,10);
}
@Test
public void testAssertTrue() {
	boolean a=10>7;
	assertTrue(a);
}
@Test
public void testSame() {
	assertSame("Nisha","Nisha");
}
@Test
public void testNull() {
	assertNull(null);
}
@Test
public void testArrayEquals() {
	int[]a= {5,10,15};
	int[] b= {5,10,15};
	assertArrayEquals(a,b);
}
@Test
public void testNotEqual() {
	assertNotEquals(10,11);
}
@Test
public void testAssertFalse() {
	boolean a=10<7;
	assertFalse(a);
}
@Test
public void testNotSame() {
	assertNotSame("Nisha","NishA");
}
@Test
public void testNotNull() {
	assertNotNull("abc");
}
}
