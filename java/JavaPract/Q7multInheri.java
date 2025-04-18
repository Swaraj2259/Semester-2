class Level1
{
    Level1(){System.out.println("Inside the constructor of level1");}
}

class Level2 extends Level1
{
    Level2(){System.out.println("Inside the constructor of level2");}
}

class Level3 extends Level2
{
    Level3(){System.out.println("Inside the constructor of level3");}
}



public class Q7multInheri {
    public static void main(String[] args) {
        Level3 obj=new Level3();
    }
}

