public class Rectangle{
	private float length;
	private float width;

	public void setlength(float length1){
		if(length1 > 0){
		length = length1;
		}
	}
	public float getlength(){
		return length;
	}	
	public float calArea(){
		return length * width;
	}
	public float calPeri(){
		return (length + width) * 2;
	}

	


}