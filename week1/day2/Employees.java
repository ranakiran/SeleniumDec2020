package week1.day2;

public class Employees {

	public void getEmployeeAddress(String empName){
		System.out.println(empName);
		System.out.println("NETHERLANDS");
	}
	public void printEmployeePhoneNumber(String empName, int empId) {
		System.out.println(empName);
		System.out.println(empId);
	}
	//argument to give input
	public String getEmployeeName(int empId) {
		String name;
		if(empId == 100) {
			name = "KIRAN";
			}
		else {
			name = "Dont exist";
		}
		return name;//to give output
		
	}
	public static void main(String[] args) {
		Employees emp = new Employees();
		emp.getEmployeeAddress("Kiran");
        emp.printEmployeePhoneNumber("Narasimha", 123);
        String empName = emp.getEmployeeName(100);
        System.out.println(empName);
        
	}

}	

