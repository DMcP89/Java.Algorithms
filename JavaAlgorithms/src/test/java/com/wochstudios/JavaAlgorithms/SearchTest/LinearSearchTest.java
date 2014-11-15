package com.wochstudios.JavaAlgorithms.SearchTest;

import org.junit.Test;

import com.wochstudios.JavaAlgorithms.Search.ISearchAlgorithm;
import com.wochstudios.JavaAlgorithms.Search.LinearSearch;

import junit.framework.TestCase;

public class LinearSearchTest extends TestCase {
	@Test
	public void testSearch(){
		Integer[] test = {1,2,3,4,56, 123, 427, 1023, 1305};
		ISearchAlgorithm linear = new LinearSearch();
		assertEquals("1 is in the array",true, linear.Search(test, 0, test.length-1, 56));
	}
}
