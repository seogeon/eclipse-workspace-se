package byte_stream.object_stream;

import java.util.List;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

import byte_stream.filter_stream.Account;

public class AccountArrayListSerializationMain {

	public static void main(String[] args)throws Exception {
		ObjectInputStream ois=
				new ObjectInputStream(
						new FileInputStream("accountArrayList.ser"));
						List<Account> accountList=
								(List<Account>)ois.readObject();
						System.out.println("accountArrayList.ser--->ArrayList");
						Account.headerPrint();
						for(Account account : accountList) {
							account.print();
						}

	}

}
