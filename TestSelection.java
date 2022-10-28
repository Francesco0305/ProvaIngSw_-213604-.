package prova;

import static org.junit.Assert.*;

import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import mainApp.FunnyAlgorithms;

public class TestSelection {
	FunnyAlgorithms f;
	int numeri1[] = {1,2,3,4,6};
	

	static DateTime time;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		time=new DateTime();
	}

	@Before
	public void setUp() throws Exception {
		f = new FunnyAlgorithms();
	}

	@Test
	public void testOutLimite() {
		f.selectionSort(numeri1, 2);
	}

	@Test
	public void testAllOk() {
		f.selectionSort(numeri1, 0);
	}
}
