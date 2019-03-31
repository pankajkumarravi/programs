public class ReverseTest {

	public static void main(String[] args) {
		ReverseArray ar=new ReverseArray();
		MergeTwoArray ma=new MergeTwoArray();
		System.out.println("Enter array elements");
		int[] rr=ma.readArray();
		System.out.println("Array elements are");
		ma.dispArray(rr);
		ar.reverse(rr);
		System.out.println("reversed array");
		  ma.dispArray(rr);
	}

}
