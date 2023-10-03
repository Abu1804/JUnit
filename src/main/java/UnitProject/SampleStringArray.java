package UnitProject;

public class SampleStringArray {

	public String findlength(String[] a) {
		String b=a[0];
	    for(int i=0;i<a.length;i++) {
	    	if(a[i].length()>b.length()) {
	    		b=(a[i]);
	    	}
	    }
	    return b;
	}
}
