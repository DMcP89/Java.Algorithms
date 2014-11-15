package com.wochstudios.JavaAlgorithms.Search;

public class BinarySearch implements ISearchAlgorithm {
	//Binary searching only works for data sets that are sorted.
	public <T extends Comparable<? super T>> boolean Search(T[] data, int min,int max, T target) {
		boolean found = false;
		int midpoint = (min + max) /2;
		
		// check midpoint for target
		if(data[midpoint].compareTo(target) == 0){
			found = true;
		//Search Bottom half	
		} else if(data[midpoint].compareTo(target) > 0){
			if(min <= midpoint -1)
				found = Search(data, min, midpoint -1,target);
		//Search Top half	
		} else if(midpoint +1 <= max)
			found = Search(data, min, midpoint +1,target);
		
		return found;
	}

}
