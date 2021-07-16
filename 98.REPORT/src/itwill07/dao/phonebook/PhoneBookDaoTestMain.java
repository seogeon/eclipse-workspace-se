package itwill07.dao.phonebook;

public class PhoneBookDaoTestMain {

	
		public static void main(String[] args) throws Exception {
			PhoneBookDao phonebook = new PhoneBookDao();
			System.out.println(">> insert");
			PhoneBook phonebook1 =  new PhoneBook(8, "발락", "010-8121-2328");
			phonebook.insert(phonebook1);
			
			System.out.println(">> update");
			PhoneBook phonebook2 = new PhoneBook(9, "조콜", "010-8120-2328");
			phonebook.updateByNo(phonebook2);
			
			System.out.println(">> selectByNo");
			phonebook.selectByNo(1);
			
			System.out.println(">> selectAll");
			phonebook.selectAll();
			
			System.out.println(">> delete");
			phonebook.deleteByNo(0);
			
			System.out.println(">> delete 후 selectAll");
			phonebook.selectAll();
	}

}
