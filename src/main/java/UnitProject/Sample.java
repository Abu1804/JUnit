package UnitProject;

public class Sample {
	public int findMin (int[] a) {
		int min=a[0];
	for(int i=1;i<a.length;i++) {
		if(min>a[i]) {
			min=a[i];
		}
	}
	return min;
}
}
