package com.wochstudios.JavaAlgorithms.SearchTest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.wochstudios.JavaAlgorithms.Search.BinarySearch;
import com.wochstudios.JavaAlgorithms.Search.ISearchAlgorithm;

public class BinarySearchTest {

	@Test
	public void testSearch() {
		Integer[] test = {1,2,3,4,56, 123, 427, 1023, 1305};
		ISearchAlgorithm linear = new BinarySearch();
		assertEquals("1 is in the array",true, linear.Search(test, 0, test.length-1, 56));
	}

}
