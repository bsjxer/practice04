package prob5;

public class Depart extends Employee {
	private String department;
	
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Depart(){
	}
	
	public Depart( String name, int salary, String depart ){
		setName(name);
		setSalary(salary);
		setDepartment(depart);
	}
	
	@Override
	public void getInformation() {
		super.getInformation();
		System.out.println("부서:" + getDepartment());
		//System.out.printf( "이름:" + getName() + "  연봉:" + getSalary() + "  부서:" + getDepartment() );
	}

	//Employee 클래스에서 getInformation을 아예 지워버렸는데, Override 인가? phoneApp에서는 subclass에서 실행한 후 조건이 맞지 않으면 superclass로 넘어가는데  찝찝
}
