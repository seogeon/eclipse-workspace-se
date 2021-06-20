package lang;

public class ObjectMain {

	public static void main(String[] args) {
		/*
		Class Object is the root of the class hierarchy. 
		Every class has Object as a superclass. 
		All objects, including arrays, implement the methods of this class.
		*/
		Object o1=new Object();
		Object o2=new Object();
		Object o3=o1;
		
		/*
		public String toString()
			- Returns a string representation of the object.
			- It is recommended that all subclasses override this method.
			Returns:
					a string representation of the object.
		 */
		String str1=o1.toString();
		//String str2=o2.toString();
		System.out.println(str1);
		System.out.println(o2.toString());
		System.out.println(o2);
		
		/*
		 public boolean equals(Object obj)
		      - 주소가같은지비교  
		 */
		boolean	isEqual = o1.equals(o2);
		System.out.println(isEqual);
		if(o1.equals(o3)) {
			System.out.println("o1과o3의 주소가동일하다[equals]");
		}
		if(!o1.equals(o2)) {
			System.out.println("o1과o2의 주소가동일하지않다[equals]");
		}
		
		if(o1==o3) {
			System.out.println("o1 == o3의 주소가동일하다");
		}
		if(o1!=o2) {
			System.out.println("o1 != o2의 주소가동일하지앟다");
		}
		
		System.out.println("--------ObjectChild--------");
		ObjectChild oc1=new ObjectChild();
		ObjectChild oc2=new ObjectChild();
		ObjectChild oc3=oc1;
		System.out.println(oc1.toString());
		System.out.println(oc2.toString());
		System.out.println(oc3.toString());
		if(oc1.equals(oc3)) {
			System.out.println("oc1주소 oc3주소동일하다.");
		}
	}

}











