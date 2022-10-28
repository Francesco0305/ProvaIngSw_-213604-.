package prova;

import static org.junit.Assert.*;

import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import mainApp.FunnyAlgorithms;

public class TestBinary {

	FunnyAlgorithms f;
	int numeri1[] = {1,2,3,4,6};
	
	static DateTime time;
	
	@BeforeClass
	static public void setTime() throws Exception {
		time=new DateTime();
		
	}

	@Before
	public void setUp() throws Exception {
		f = new FunnyAlgorithms();
		
	}

	@Test
	public void testTargetOut() {
		assertNotEquals("target doesn't exist in the array " + time.toLocalTime() ,-1, f.binarySearch(numeri1, 10));
	}
	
	

}
