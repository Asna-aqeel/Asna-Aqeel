public class RectDriver{
	public static void main(String[] args){
		Rectangle rec = new Rectangle();
		rec.setlength(3.5);
		System.out.println("length is " + rec.getlength);
		System.out.println("area of rectangle is " + rec.calArea());
		System.out.println("perimeter of rectangle is " + rec.calPeri());
		Circle c = new Circle();
		c.radius = 2.5;
		System.out.println("area of circle is " + c.calArea());
		System.out.println("perimeter of circle is " + c.calPerimeter());
		
}
}