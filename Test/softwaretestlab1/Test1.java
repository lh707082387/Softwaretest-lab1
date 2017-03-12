package softwaretestlab1;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

public class Test1 {
	String result;
	Stlab1 Stlab1;
	@Before
	public void Sutup(){
		Stlab1 = new Stlab1();
	}
	String result1 = "equilateral";
	String result2 = "isosceles";
	String result3 = "scalene";
	String result4 = "not a triangle";
	
	@Test
	public void test1(){
		result = Stlab1.triangle(1.0,2.0,3.0);
		assertEquals(result4,result);
	}
	
	@Test
	public void  test2(){
		result = Stlab1.triangle(1.0,1.0,1.0);
		assertEquals(result1,result);
	}
	
	@Test
	public void  test3(){
		result = Stlab1.triangle(6.0,6.0,5.0);
		assertEquals(result2,result);
	}
	
	@Test
	public void  test4(){
		result = Stlab1.triangle(6.0,5.0,2.0);
		assertEquals(result3,result);
	}
}
