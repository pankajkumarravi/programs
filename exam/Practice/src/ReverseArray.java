public class ReverseArray {
	void reverse(int x[])
	{
		for (int i = 0; i < x.length/2; i++) {
			int t=x[i];
			x[i]=x[x.length-1-i];
			x[x.length-1-i]=t;
		}
	}
}
