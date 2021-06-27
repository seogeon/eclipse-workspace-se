import java.util.HashSet;
import java.util.Iterator;

public class HashSetMain {

	public static void main(String[] args) {
		HashSet accountSet = new HashSet();
		System.out.println("# set size :" + accountSet.size());

		Account acc1 = new Account(1111, "BING", 33000, 0.5);
		Account acc2 = new Account(2222, "KING", 23000, 0.1);
		Account acc3 = new Account(3333, "KING", 89000, 0.2);
		Account acc4 = new Account(4444, "YONG", 12000, 0.5);
		Account acc5 = new Account(5555, "SANG", 99000, 0.8);

		System.out.println("------------1.add---------------");
		accountSet.add(acc1);
		accountSet.add(acc2);
		accountSet.add(acc3);
		accountSet.add(acc4);
		
		System.out.println("# set size:"+accountSet.size());
		System.out.println(accountSet);
		System.out.println("-----------add[같은객체]---------");
		/*
		 * equals메쏘드를 사용해서 중복체크를한다.
		 */
		boolean isAdd=accountSet.add(acc2);
		System.out.println("isAdd:"+isAdd);
		isAdd=accountSet.add(acc3);
		System.out.println("isAdd:"+isAdd);
		System.out.println(accountSet);
		System.out.println("# set size:"+accountSet.size());
		System.out.println("-------2.remove--------------");
		boolean isRemove = accountSet.remove(acc1);
		System.out.println("isRemove:"+isRemove);
		isRemove = accountSet.remove(acc1);
		System.out.println("isRemove:"+isRemove);
		System.out.println("# set size:"+accountSet.size());
		System.out.println(accountSet);
		
		
		
		System.out.println("####################iteration[전체출력]######################");
		Iterator  accountIter = accountSet.iterator();
		System.out.println(accountIter);
		
		while(accountIter.hasNext()) {
			Account tempAccount = (Account)accountIter.next();
			tempAccount.print();
		}
		System.out.println(accountIter.hasNext());
		accountIter.next();
		

	}

}
