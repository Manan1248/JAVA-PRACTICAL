public class p16 {

    public static void main(String[] args) {

    

        parent p1= new parent();

        child c1= new child();

        p1.call();

        c1.call1();

        c1.call();

    }

}

 

class parent{

    void call(){

        System.out.println("This is a parent class.");

    }

   

}

 

class child extends parent{

    void call1(){

        System.out.println("This is a child class.");

    }

}
