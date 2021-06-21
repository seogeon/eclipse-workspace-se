
public abstract class Employee {
	public final static double INCENTIVE_RATE = 0.1;
	private int no;
	private String name;
	private int pay;
	public Employee() {
	}
    public Employee(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}
    /*
     * 인센티브계산
     * -재정의금지(회장님의 방침)
     * -모든사원들의 인센티브계산이 동일하다.
     * 
     */
    public double calculateIncentive() {
    	double incentive=0.0;
    	if(this.pay>=1000000) {
    		incentive = this.pay*Employee.INCENTIVE_RATE;
    		
    	}
    	return incentive;
    }
    
    /*
     * 급여계산
     *   - 실제구현작업 불가능
     *   - 자식객체에서 반드시 재정의해야하는 메쏘드
     *   - 재정의강제(규칙,specification)
     */
	public abstract void caculatePay();

	public void print() {
		System.out.print(no+"\t"+name+"\t"+pay+"\t");
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;

	}
}
