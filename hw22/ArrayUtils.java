/*
Ayman Ahmed
APCS1 pd5
HW#22 -- Augmenting Your Array of Tools
2015-11-02
*/

import java.util.Random;

public class ArrayUtils {
    Random rnum = new Random();
    public static void Populate(int[] a) {
	for (int i = 0 ; i < a.length ; i++) {
	    a[i] = rnum.nextInt(Integer.MAX_VALUE);
	}
    }
    public static String arrayReturn(int[] a) {
	String retstr = "";
	for (int i = 0 ; i < a.length ; i++) {
	    retstr += Arrays.toString(a[i]);
	}
	return retstr;
    }
    public static void main(String[] args) {
	int[] array = new int[5];
	Populate(a);
	System.out.println(arrayReturn(a));
    }
}
