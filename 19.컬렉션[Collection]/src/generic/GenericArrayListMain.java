package generic;

import java.util.ArrayList;

public class GenericArrayListMain {

	public static void main(String[] args) {
		Account acc1=new Account(1111, "BING",33000,0.5);
		Account acc2=new Account(2222, "KING",23000,0.1);
		Account acc3=new Account(3333, "KING",89000,0.2);
		Account acc4=new Account(4444, "YONG",12000,0.5);
		Account acc5=new Account(5555, "SANG",99000,0.8);
		
		ArrayList<Account> accountList=new ArrayList<Account>();
		System.out.println("#size:"+accountList.size());
		System.out.println("-----------------1.add-------------");
		accountList.add(acc1);
		accountList.add(acc2);
		accountList.add(acc3);
		accountList.add(acc4);
		accountList.add(acc5);
		System.out.println("#size:"+accountList.size());
		System.out.println(accountList);
		accountList.add(3, new Account(3334, "TTTT", 12000, 0.1));
		System.out.println("#size:"+accountList.size());
		System.out.println(accountList);
		System.out.println("--------------2.set-------------------");
		accountList.set(3, new Account(3335, "UUUU", 23000, 2.3));
		System.out.println("#size:"+accountList.size());
		System.out.println(accountList);
		System.out.println("--------------3.get------------------------");
		Account getAccount=accountList.get(1);
		getAccount.print();
		getAccount=accountList.get(accountList.size()-1);
		getAccount.print();
		System.out.println("---------------4.remove-------------------");
		Account removeAccount = accountList.remove(accountList.size()-1);
		removeAccount.print();
		System.out.println("#size:"+accountList.size());
		System.out.println(accountList);
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%업무실행%%%%%%%%%%%%%%%%%%%%%");
		System.out.println("****************1.계좌전체출력******************");
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount=accountList.get(i);
			tempAccount.print();
		}
		System.out.println("****************2.계좌번호 3333 계좌한개찾기***************");
		System.out.println("****************3.계좌주이름 KING 계좌여러개찾기***********");
		System.out.println("****************4.계좌번호 4444번한개삭제******************");
		System.out.println("****************5.계좌주이름 KING 계좌 여러개삭제[Quiz]****");
		System.out.println("####################iteration[전체출력]######################");
		
		
		
		
		
	}

}
