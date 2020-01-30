package arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		
		// arrays are collections of elements of the same data type
		// there are two types of arrays
		// 1 single dimensional  2 two/multi-dimensional array
		
		int a[] = new int[5];
		System.out.println("lengfth of the array is " + a.length);
		
		a[0] = 100;
		a[1] = 200;
		a[2] = 300;
		a[3] = 400;
		a[4] = 500;
		
//		System.out.println(a[2]);
		
		
		for (int i=0; i<=a.length-1;i++) {
			System.out.println(a[i]);
		}
		
		for (int i:a) {
			System.out.println(i);
		}
	}

}
