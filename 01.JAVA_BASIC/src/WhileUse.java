
public class WhileUse {

	public static void main(String[] args) {
		System.out.println("---10회반복----");
		int i=0;
		while(i<10) {
			System.out.println("stmt:"+i);
			i++;
		}
		System.out.println(">> 1~10사이의 정수출력");
		i=0;
		while(i<10) {
			int no = i+1;
			System.out.print(no+",");
			i++;
		}
		
		
		
		System.out.println();
		System.out.println(">> 1~10사이의 정수출력");
		i=1;
		while(i<=10) {
			System.out.print(i+",");
			i++;
		}
		System.out.println();
		System.out.println(">> 1~10사이의 정수중 홀수출력");
		i=1;
		while(i<=10) {
			if(i%2==1) {
				System.out.print(i+",");
			}
			i++;
		}
		System.out.println();
		System.out.println(">> 1~10사이의 정수중 4의배수출력");
		i=1;
		while(i <= 10) {
			if(i%4==0) {
				System.out.print(i+",");
			}
			i++;
		}
		System.out.println();
		System.out.println(">> 1~100 사이의 정수출력");
		i=1;
		while(i <= 100) {
			System.out.print(i+"\t");
			if(i%10==0) {
				System.out.println();
			}
			i++;
		}
		System.out.println(">> 1~100 사이의 정수중 3의배수이면서 4의배수인수 출력");
		
		i=1;
		while(i<=100) {
			if(i%3==0 && i%4==0) {
				System.out.print(i+" ");
			}
			i++;
		}
		System.out.println();
		/*
		 * 1~100사이의 정수합
		 * 1~100사이의 홀수합
		 * 1~100사이의 짝수합
		 */
		i=1;
		int tot=0;
		int evenTot=0;
		int oddTot=0;
		while(i<=100) {
			if(i%2==0) {
				evenTot=evenTot+i;
				//evenTot+=i;
			}else {
				oddTot=oddTot+i;
				//oddTot+=i;
			}
			tot = tot+i;
			//tot+=i;
			i++;
		}
		System.out.println("1~100사이의 정수합:"+tot);
		System.out.println("1~100사이의 홀수합:"+oddTot);
		System.out.println("1~100사이의 짝수합:"+evenTot);
		
		/*
		 * 문자출력
		 */
		char c1 = 0;
		while(c1 < 65535) {
			System.out.print(c1);
			if(c1%200==0) {
				System.out.println();
			}
			c1++;
		}
		System.out.println();
		/*
		 * 영문소문자출력
		 */
		char c2='a';
		while(c2<='z') {
			System.out.print(c2);
			c2++;
		}
		System.out.println();
		/*Quiz
		 * 1.한글출력
		 * 2.영문대문자
		 * 3.숫자형문자(0 ~ 9)
		 */
		
	}
}