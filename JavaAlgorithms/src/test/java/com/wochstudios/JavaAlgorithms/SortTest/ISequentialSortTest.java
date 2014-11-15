package com.wochstudios.JavaAlgorithms.SortTest;



import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.wochstudios.JavaAlgorthims.Sort.*;

public class ISequentialSortTest {
	ISequentialSortAlgorithm SSA;
	Integer[] test = {54, 1, 36, 27, 6, 103,42};
	
	@Test
	public void testSelectionSort() {
		SSA = new SelectionSort();
		SSA.Sort(test);
		System.out.println(test[0]);
		assertEquals("1 is in the array",true,test[0] == 1);
		
	}
	
	@Test
	public void testInsertionSort(){
		SSA = new InsertionSort();
		SSA.Sort(test);
		System.out.println(test[0]);
		assertEquals("1 is in the array",true,test[0] == 1);
	}

	
	@Test
	public void testBubbleSort(){
		SSA = new BubbleSort();
		SSA.Sort(test);
		System.out.println(test[0]);
		assertEquals("1 is in the array",true,test[0] == 1);
	}
	
}
