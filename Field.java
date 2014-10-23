/*
 
 Tim Miller / Field Class
 
 Group 4
 ----------------------
 Carter Davis: Indexer
 Chung Meng Chua: Database
 Austin Washburn: FieldSearch
 Tim Miller: Field
 
 */


package org.uiowa.cs2820.engine;

public class Field {
    
	private String Name;
	private String Value;
    
    //constructor
	Field(String FieldName, String FieldValue) {
		Name = FieldName;
		Value = FieldValue;
	}
    
    //getters
	String getFieldName() {
		return Name;
	}
    
	String getFieldValue() {
		return Value;
	}
    
    //setters
	void setFieldName(String a) {
		Name = a;
	}
    
	void setFieldValue(String b) {
		Value = b;
        
	}
}