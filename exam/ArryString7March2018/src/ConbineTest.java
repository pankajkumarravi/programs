public class ConbineTest {
	public static void main(String[] args) {
		ConbineArray mm=new  ConbineArray();
		System.out.println("enter first array element");
		int a[]=mm.readArray();
		System.out.println("enter second array element");
		int b[]=mm.readArray();
		int rs[]=mm.mergeArray(a, b);
		System.out.println("First Array");
		mm.dispArray(a);
		System.out.println("Second Array");
		mm.dispArray(b);
		System.out.println("Combined Array elements");
		mm.dispArray(rs);
	}

}