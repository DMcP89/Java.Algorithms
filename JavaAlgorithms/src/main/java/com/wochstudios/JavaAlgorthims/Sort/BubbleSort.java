package com.wochstudios.JavaAlgorthims.Sort;

public class BubbleSort implements ISequentialSortAlgorithm {

	@Override
	public <T extends Comparable<? super T>> void Sort(T[] data) {
		// TODO Auto-generated method stub
		int position, scan;
		T temp;
		
		for(position = data.length-1;position >= 0; position--){
			for(scan = 0; scan <= position-1; scan++){
				if(data[scan].compareTo(data[scan+1])>0){
					temp = data[scan];
					data[scan] = data[scan+1];
					data[scan+1] = temp;
				}
			}
		}
	}

}
