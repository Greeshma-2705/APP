public class employee {
    String employeename;
    int employeeId,salary;
    employee(String employeename,int employeeId,int salary){
        this.employeename=employeename;
        this.employeeId=employeeId;
        this.salary=salary;
        }
    void display(){
     System.out.println("EMPLOYEE ID: "+employeeId);
     System.out.println("EMPLOYEE NAME: "+employeename);
     System.out.println("SALARY: "+salary);
    }
    public static void main(String[] args) {
        employee e = new employee("Rahul",101,45000);
        e.display();
    }
}
