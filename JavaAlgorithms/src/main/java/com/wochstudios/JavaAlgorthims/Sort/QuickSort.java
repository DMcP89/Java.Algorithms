package com.wochstudios.JavaAlgorthims.Sort;

public class QuickSort implements IRecursiveSortAlgorithm {

	@Override
	public <T extends Comparable<? super T>> void Sort(T[] data, int min,
			int max) {
		if(data == null || data.length == 0){
			return;
		}
		partitionArray(data,min,max);
	}
	
	private static <T extends Comparable<? super T>> void partitionArray(T[] data, int min, int max){
		int lower, higher;	
		int middle= min +(max -min)/2;
		lower = min;
		higher = max;
		T piviotElement = data[middle];
		while (lower <= higher){
			while(data[lower].compareTo(piviotElement)< 0){
				lower ++;
			}
			while(data[higher].compareTo(piviotElement)> 0){
				higher --;
			}
			
			if(lower <= higher){
				exchangePositions(data, lower, higher);
				lower ++;
				higher --;
			}
		}
		if(min < lower)
			partitionArray(data, min, higher);
		if(lower < max)
			partitionArray(data, lower, max);
	}
		
	private static<T extends Comparable<? super T>> void exchangePositions(T[] data,int i, int j){
		T temp = data[i];
		data[i] = data[j];
		data[j] = temp;
	}
}
