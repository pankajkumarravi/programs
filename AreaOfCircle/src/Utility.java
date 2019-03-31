
public class Utility {
	final double PIE=3.142;
	void findAreaOfCircle(double radius){
		double area=PIE*radius*radius;
		System.out.println("Area of Circle="+area);

	}
	public void main(String args[]){
		Utility u=new Utility();
		u.findAreaOfCircle(20.9);
		double r=6.30;
		u.findAreaOfCircle(r);
	}
}
