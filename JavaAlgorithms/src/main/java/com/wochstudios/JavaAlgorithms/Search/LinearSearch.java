package com.wochstudios.JavaAlgorithms.Search;

public class LinearSearch implements ISearchAlgorithm {
//Linear searches will work on all data sets sorted and unsorted
	public <T extends Comparable<? super T>> boolean Search(T[] data, int min,int max, T target) {
		int index = min;
		boolean found = false;
		while(!found && index <= max){
			if(data[index].compareTo(target) == 0){
				found = true;
			}
			index ++;
		}
		return found;
	}

}
