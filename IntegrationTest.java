package org.uiowa.cs2820.engine;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class IntegrationTest {
    
    Field F;
	Indexer I;
    Database DB;
    FieldSearch FS;
	
	@Before
	public void initialize(){
		I = new Indexer(String id);
        DB = new Database(String 1, String 2);
        FS = new FieldSearch();
        F = new Field();
	}
	
	@Test
	public void addTest1() {
		Field Field1 = new Field("amount","900");
		I.add(Field1);
		assertTrue(DB.containsPath(Field1));
	}
	
    @Test
	public void removeTest1() {
        Field Field1 = new Field("amount","900");
		I.remove(Field1);
		assertTrue(DB.remove(null));
	}
	
	@Test
	public void closeTest1() {
		Field Field1 = new Field("amount","900");
		I.add(Field1);
        I.close();
		assertTrue(I.id(null));
	}
	
	@Test
	public void resultTest1() {
		Field Field1 = new Field("amount","900");
		assertTrue(FS.getResult(Field1));
	}
	
	@Test
	public void findEqualsTest1() {
		Field Field1 = new Field("amount","900");
		I.add(Field1);
		assertTrue(DB.add(Field1));
	}
}