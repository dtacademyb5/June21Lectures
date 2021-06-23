public class Dog {

    public         static                     void                 myMethod           (   )               {
        // visibility     // the method             // return type of      // method name    //parameters          //method body
        // modifier      // belongs to the class    // the method                           // can be 0 or more

        System.out.println("Hello Method!");

    }

    // main method is the method that java starts the execution
    public static void main(String[] args) {

//        Math.random();

        // Calling/invoking a method
        // ClassName.methodname();
        // If the method is declared within the same class, the classname can be omitted
//        Dog.myMethod();
        myMethod();
        myMethod();
        myMethod();

        Cat.print5RandomLowercaseChars();

    }


    // method -> collection of statements that do something as a whole
    // Methods offer re-usability and maintainability



    // DRY principle of programming ->  Don't repeat yourself



}
