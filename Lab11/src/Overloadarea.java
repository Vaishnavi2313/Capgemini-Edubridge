class Areaoffig{
	
	void area(int i){
		int a;
		a=i*i;
		System.out.println("area of square:"+a);

	}
	void area(int i,int b){
		float a;
		a=i*b;
		System.out.println("area of rectangle:"+a);

	}
	 void area(int base,float ht){
		 double a;
		a= 0.5*base*ht;
		System.out.println("area of Traingle:"+a);

	}
		void area(double radius){
			double a;
			a=3.14*radius*radius;
			System.out.println("area of circle:"+a);

		}
}
public class Overloadarea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Areaoffig a = new Areaoffig();
		a.area(3);
		a.area(5, 6);
		a.area(2, 3.2f);
		a.area(7);

	}

}
