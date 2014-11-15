package com.wochstudios.JavaAlgorthims.Sort;

public class MergeSort implements IRecursiveSortAlgorithm {

	@Override
	public <T extends Comparable<? super T>> void Sort(T[] data, int min,
			int max) {
		T[] Temp;
		int index1, left, right;
		
		if( min == max)
			return;
		
		int size = max - min +1;
		int pivot = (min + max)/2;
		Temp = (T[])(new Comparable[size]);
		
		
		this.Sort(data, min, pivot);
		this.Sort(data, pivot+1, max);
		
		for(index1 =0; index1 < size; index1++)
			Temp[index1] = data[min + index1];
		
		left = 0;
		right = pivot-min+1;
		for(index1 = 0; index1 < size; index1++){
			if(right <= max - min)
				if(left <= pivot - min)
					if(Temp[left].compareTo(Temp[right])> 0)
						data[index1 + min] = Temp[right++];
					else
						data[index1 + min] = Temp[left++];
				else
					data[index1 + min] = Temp[right++];
			else
				data[index1 + min]= Temp[left++];
				
			
		}
	}
	
	

}
