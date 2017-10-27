import java.awt.List;

interface Sorting {
	List sort(List list);
}

//MergeSort IS Sorting
class MergeSort implements Sorting {
	public List sort(List list) {
		// sort implementation
		return list;
	}
}

//QuickSort IS Sorting
class QuickSort implements Sorting {
	public List sort(List list) {
		// sort implementation
	return list;
	}
}

//DynamicDataSet HAS Sorting
class DynamicDataSet {
	Sorting sorting;
	public DynamicDataSet() {
		sorting = new MergeSort();
	}
	// DynamicDataSet implementation
}

//SnapshotDataSet HAS Sorting
class SnapshotDataSet {
	Sorting sorting;
	public SnapshotDataSet() {
		sorting = new QuickSort();
	}
	// SnapshotDataSet implementation
}