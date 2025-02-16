// package lab_session.14thFeb;
class employee{
    int empId;
    String empName;

    employee(int id, String name) {
        this.empId = id;
        this.empName = name;
    }
 
    @SuppressWarnings("unused")
    void display() {
        System.out.println("ID: " + empId + ", Name: " + empName);
    }
}

    
class manger extends employee{
    String department;

    public manger(int id,String name,String department){
        super(id,name);
        this.department = department;


    }
    @Override
    void display(){
        System.out.println("ID: " + empId + ", Name: " + empName + ", Department: " + department);
    }

    

}
class engineer extends employee{
    String project;

    public engineer(int id,String name,String project){
        super(id,name);
        this.project = project;
    }
    @Override
    void display(){
        System.out.println("ID: " + empId + ", Name: " + empName + ", Project: " + project);
    }

}
class Salesperson extends employee{
    int sales;

    public Salesperson(int id,String name,int sales){
        super(id,name);
        this.sales = sales;
    }
    @Override
    void display(){
        System.out.println("ID: " + empId + ", Name: " + empName + ", Sales: " + sales);
    }

}
public class company {
    public static void main(String[] args) {
        manger m1 = new manger(1,"Prasad","IT");
        m1.display();
       
        engineer e1 = new engineer(3,"Rahul","Java");
        e1.display();
       
        Salesperson s1 = new Salesperson(5,"Raj",10000);
        s1.display();
       
    }
}
