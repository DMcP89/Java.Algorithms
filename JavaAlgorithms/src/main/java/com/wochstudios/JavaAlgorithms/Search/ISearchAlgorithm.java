package com.wochstudios.JavaAlgorithms.Search;

public interface ISearchAlgorithm {

	public <T extends Comparable<? super T>>boolean Search(T[] data, int min, int max, T target);
}
