package com.wochstudios.JavaAlgorthims.Sort;

public interface IRecursiveSortAlgorithm {
	public <T extends Comparable<? super T>> void Sort(T[] data, int min, int max);
}
