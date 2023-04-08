public class Oop1_classes {
    public static class Human{
        char gender;
        int age;
        String name;
        //final keyword 
        final int exp=20;
        
        protected void finalize( ) {
            // finalization code here if any action to be done during garbage collection.
            System.out.println("object is being destroyed");
            }

        // Default constructor

        Human(){
            System.out.println("This is default constructor which is called when we instantiate class by making an object.");
        }

        // Parameterized Constructor

         Human(String name,int age,char gender){
            this.name=name;
            this.age=age;
            this.gender=gender;
         }

         Human( Human copy){
            this.name=copy.name;
            this.age=copy.age;
            this.gender=copy.gender;
         }
    }
    
    public static void main(String[] args) {

        // Human male=new Human("Sidhant",21,'m');

        // Human Person=new Human(male);
        // System.out.println(male.age);
        // System.out.println(male.gender);
        // System.out.println(male.name);
        // System.out.println(Person.age);
        // System.out.println(Person.gender);
        // System.out.println(Person.name);
        // System.out.println(male.exp);
        for(int i=0;i<1000000;i++){
            Human kid=new Human();
        }

    }
}
