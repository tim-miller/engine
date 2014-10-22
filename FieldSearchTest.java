package org.uiowa.cs2820.engine;

import java.util.ArrayList;
import static org.junit.Assert.*;

import org.junit.Test;

public class FieldSearchTest {

	@Test
	public void test0() {
		//test the constructor
		FieldSearch T = new FieldSearch();
		ArrayList<String> S = new ArrayList<String>();
		assertEquals(T.getT(), S);
		
	}

}
