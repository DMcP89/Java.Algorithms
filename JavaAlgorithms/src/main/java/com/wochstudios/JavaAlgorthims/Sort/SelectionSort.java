package com.wochstudios.JavaAlgorthims.Sort;

public class SelectionSort implements ISequentialSortAlgorithm {

	@Override
	public <T extends Comparable<? super T>> void Sort(T[] data) {
		int min;
		T temp;
		for (int index = 0; index < data.length-1; index++){
			min = index;
			for (int scan = index+1; scan < data.length-1;scan++){
				if(data[scan].compareTo(data[min])<0){
					min = scan;
				}	
				temp = data[min];
				data[min]=data[index];
				data[index] = temp;
			}
		}
	}

}
