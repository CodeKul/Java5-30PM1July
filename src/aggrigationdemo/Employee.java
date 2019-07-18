package aggrigationdemo;

public class Employee {

    int id;
    String name;
    String salary;
    Company company;

    public Employee(int id, String name, String salary, Company company) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.company = company;
    }

    void display(){
        System.out.println(
                "id : "+id+"\n"+
                "name : "+name+"\n"+
                "salary : "+salary+"\n"+
                "Company Name : "+company.name+"\n"+
                "address : "+company.address+"\n");
    }

    public static void main(String[] args) {
        Company company=new Company(1,"Melayer softwares","Pune");
        Employee employee=new Employee(101,"Krati","50,000",company);
        employee.display();
    }
}
