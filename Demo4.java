 
class Demo3{

	int a;	 
	float b;
	char c;
	boolean bool;   // instance variable 

	static int varStatic=100;  // static varible 

	Demo3(){ 
		a = 100;
		b = 100.0f;
		c = 'a';
	}
	Demo3(int a1, float b1, char c1){
		a = a1;
		b = b1;
		c = c1;
	}
	public static void main(String args[]){
	
		Demo3 obj = new Demo3();
		Demo3 obj1 = new Demo3(2,2.2f,'b');

		/*
		System.out.println(obj.varStatic + " staticvar ");
		System.out.println(obj1.varStatic + " staticvar ");
		System.out.println(varStatic + " staticvar ");
		
		varStatic = 200;
		System.out.println(obj.varStatic + " staticvar ");
		System.out.println(obj1.varStatic + " staticvar ");
		*/

		//hashcode
		System.out.println(obj);
		System.out.println(obj);
		} 

}


