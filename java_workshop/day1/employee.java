// package demoproj;

public class employee {
    int id;
    String name;
    double salary;
    float age;

    public employee(int eid, String ename, double esalary, float eage) {
        id = eid;
        name = ename;
        salary = esalary;
        age = eage;
        
    }
    public void display() {
        System.out.println("Employee id: "+id);
        System.out.println("Employee name: "+name);
        System.out.println("Employee salary: "+salary);
        System.out.println("Employee age: "+age);
    }

    
    public static void main(String[] args) {
        employee e1 = new employee(101, "John", 50000.00, 25);
        // e1.id = 101;
        // e1.name = "John";
        // e1.salary = 50000.00;
        // e1.age = 25;
        // e1.display();
        e1.display();
    }
}
