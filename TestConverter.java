package prova;

import static org.junit.Assert.*;

import org.joda.time.DateTime;
import org.joda.time.JodaTimePermission;
import org.junit.Before;
import org.junit.Test;

import mainApp.FunnyAlgorithms;

public class TestConverter {
	FunnyAlgorithms f;
	DateTime time;

	@Before
	public void setUp() throws Exception {
	f = new FunnyAlgorithms();
	time = new DateTime();
	
	}

	
	@Test
	public void TestCaratterispeciali() {
		System.out.println("time " +  time.toLocalTime());
		 f.stringToIntConverter("2n");
	}
	


}
