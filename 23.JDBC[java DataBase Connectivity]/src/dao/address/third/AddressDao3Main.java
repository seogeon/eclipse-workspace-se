package dao.address.third;

public class AddressDao3Main {

	public static void main(String[] args) throws Exception {
		
		AddressDao3 addressDao3 = new AddressDao3();
		System.out.println(">> delete");
		addressDao3.deleteByNo(11);
		System.out.println(">> selectByNo");
		addressDao3.selectByNo(15);
		System.out.println(">> selectAll");
		addressDao3.selectAll();
		/***************************case 1*********************************/
		System.out.println(">> insert");
		addressDao3.insert("zzz", "김수로", "888-9090", "서울시민");
		System.out.println(">> update");
		addressDao3.updateByNo(12, "eight", "팔팔팔", "888-8888", "팔도시");
		/***************************case 2(DTO Address)*********************/
	
	}

}
