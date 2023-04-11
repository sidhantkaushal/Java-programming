public class Main {
    static int number=0;
    int work=0;
    public static void main(String[] args) {
        //Instantiated main class by making an object obj.
        Main obj=new Main();
        // Calling a static method .
        fun();
        //Calling a non static method.
        obj.fun1();
        //Number is a static variable.
        System.out.println(Main.number);
        //Work is a non static variable.
        System.out.println(obj.work);

    }

    static void fun(){
        System.out.println("I am static method");
        Main.number+=2;
    }
    // A non static method can call a non static method.
    void fun1(){
        System.out.println("I am non static method");
        fun3();
    }

    void fun3(){
        System.out.println("I am in function 3 which is non static");
    }
}

