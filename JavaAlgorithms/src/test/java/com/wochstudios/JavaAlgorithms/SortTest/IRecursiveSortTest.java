package com.wochstudios.JavaAlgorithms.SortTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.wochstudios.JavaAlgorthims.Sort.IRecursiveSortAlgorithm;
import com.wochstudios.JavaAlgorthims.Sort.MergeSort;
import com.wochstudios.JavaAlgorthims.Sort.QuickSort;

public class IRecursiveSortTest {
	Integer[] test = {305,65,6,90,120,110,8, 6, 17, 435, 1829, 3};
	IRecursiveSortAlgorithm RSA;
	@Test
	public void testQuickSort() {
		RSA = new QuickSort();
		RSA.Sort(test, 0, test.length-1);
		System.out.println(test[0]);
		assertEquals("1 is the first entry in this list", true, test[0] == 3);
	}
	
	@Test
	public void testMergeSort(){
		RSA = new MergeSort();
		RSA.Sort(test, 0, test.length-1);
		System.out.println(test[0]);
		assertEquals("1 is the first entry in this list", true, test[0] == 3);
	}

}
