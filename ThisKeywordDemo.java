//12 demonstration of this KeyWord
class Point3D{
		double x;
		double y;
		double z;
		Point3D(double x,double y, double z)
		{
			this.x = x;
			this.y = y;
			this.z = z;
		}
}
class ThisKeywordDemo{
    public static void main(String[] agrs) {
		Point3D p = new Point3D(1.1,3.4,-2.8);
		System.out.println("p.x =" + p.x);
		System.out.println("p.y =" + p.y);
		System.out.println("p.z =" + p.z);
	}
}