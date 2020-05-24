package com.example;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class NewTestNG {
  @Test
  public void TestNGOne() {
	  
	  System.out.println("Welcome To TestNG");
	  
  }
  
  @Test
  public void Testequal() {
	  
	  String name1="Anil";
	  
	  String name2="Anil";
	  
	 assertEquals(name1, name2);
  }
  
  
}
