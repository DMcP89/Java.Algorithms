package com.wochstudios.JavaAlgorthims.Sort;

public interface ISequentialSortAlgorithm {
	public <T extends Comparable<? super T>> void Sort(T[] data);
}
