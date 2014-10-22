package org.uiowa.cs2820.engine;

import java.util.ArrayList;

import static org.junit.Assert.*;

import org.uiowa.cs2820.engine.Database;
import org.uiowa.cs2820.engine.Field;
import org.junit.Test;

public class FieldSearchTest {

	@Test
	public void test0() {
		//test the constructor
		FieldSearch T = new FieldSearch();
		ArrayList<String> S = new ArrayList<String>();
		assertEquals(T.getT(), S);
		
	}

	@Test
	public void test1() {
		//test FindEquals
		FieldSearch T = new FieldSearch();
		Field S = new Field("amount", "900");
		Field X = new Field("amount", "900");
		T.FindEquals(S);
		assertEquals(T.getT(),[amount, 900, sku, 12345, text, blue]);//should be a doc containing S info)
		
		
	}
}
