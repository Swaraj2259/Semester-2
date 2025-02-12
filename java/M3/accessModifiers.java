class accessModifier {
    private int id;
    private String name;
    private int marks1;
    private int marks2;

    accessModifier(){
        id = 0;
        name = " ";
        marks1 = 0;
        marks2 = 0;
    }

    accessModifier(int id, String name, int marks1, int marks2){
        this.id = id;
        this.name = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
    }
    public String toString(){
        return "ID: " + id + " Name: " + name + " Marks1: " + marks1 + " Marks2: " + marks2;
    }
    public int getid(){
        return id;
    }
    public void setid(int id){
        this.id = id;
    }
    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name = name;
    }
    public int getmarks1(){
        return marks1;
    }   
    public void setmarks1(int marks1){
        this.marks1 = marks1;
    }
    public int getmarks2(){
        return marks2;
    }
    public void setmarks2(int marks2){
        this.marks2 = marks2;
    }
    //method to calculate total marks
    public void result(){
        System.out.println("Total marks: " + (marks1 + marks2));
    }
}
class accessModifiers{
    public static void main(String[] args) {
        accessModifier s1 = new accessModifier();
        System.out.println("Student 1: " + s1);
        s1.setid(1);
        s1.setname("John");
        s1.setmarks1(50);
        s1.setmarks2(60);
        System.out.println("Student 1: " + s1);
        s1.result();

        accessModifier s2 = new accessModifier(2, "Jane", 70, 80);
        System.out.println("Student 2: " + s2);
        s2.setid(3);
        System.err.println("after changing id: " + s2.getid());



    }
}


    