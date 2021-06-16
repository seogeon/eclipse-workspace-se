public class AcademyStudent extends AcademyMember {
public String ban;//반
	
	public AcademyStudent() {
		
	}
	//alt+shift+s --> o
	public AcademyStudent(int no,String name,String ban) {
		this.no=no;
		this.name=name;
		this.ban=ban;
	}
	//alt+shift+s --> r
	public String getBan() {
		return ban;
	}
	public void setBan(String ban) {
		this.ban = ban;
	}
	public void studentPrint() {
		this.print();
		System.out.println(this.ban);
	}
	
}
