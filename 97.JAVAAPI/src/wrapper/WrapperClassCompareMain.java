package wrapper;

public class WrapperClassCompareMain {
	public static void main(String[] args) {
		Integer wi1=new Integer(89);
		Integer wi2=new Integer(89);
		Integer wi3=wi1;
		/*
		 * 
		 * Wrapper,String객체 
		 *   - 비교연산자( == )를 사용하면 주소비교[사용금지]
		 *   - equals메쏘드사용(멤버필드기본형값비교)[재정의]
		 *   
		 */
		/*
		if(wi1==wi2) {
			System.out.println("wi1과 wi2의 주소가같다");
		}else {
			System.out.println("wi1과 wi2의 주소가다르다");
		}
		if(wi1==wi3) {
			System.out.println("wi1과 wi3의 주소가같다");
		}else {
			System.out.println("wi1과 wi3의 주소가다르다");
		}
		*/
		if(wi1.equals(wi2)) {
			System.out.println("wi1,wi2의 값이 동일하다.");
		}
		if(wi1.equals(wi3)) {
			System.out.println("wi1,wi3의 값이 동일하다.");
		}
		if(wi2.equals(wi3)) {
			System.out.println("wi2,wi3의 값이 동일하다.");
		}
		System.out.println("******************************************");
		/*
		if(wi1==89) {
			System.out.println("wi1.intValue()==89 값이 동일하다.");
		}
		if(wi1 > 67) {
			System.out.println("wi1.intValue() > 67");
		}
		if(wi1 >= wi2) {
			System.out.println("wi1.intValue() >= wi2.intValue()");
		}
		*/
	}

}

