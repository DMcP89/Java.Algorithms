package com.wochstudios.JavaAlgorthims.Sort;

public class InsertionSort implements ISequentialSortAlgorithm{

	@Override
	public <T extends Comparable<? super T>> void Sort(T[] data) {
		for (int index =1; index < data.length; index++){
			T key = data[index];
			int position = index;
			while(position > 0 && data[position-1].compareTo(key)>0){
				data[position]=data[position-1];
				position --;
			}
			data[position] = key;
		}
	}

}
