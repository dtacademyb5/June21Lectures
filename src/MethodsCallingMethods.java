public class MethodsCallingMethods {

    public static void main(String[] args) {

       printHello1000times();
       // When a method is called the execution moves to the called method

    }

    public static void printHello5Times(){
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
    }

    public static void printHello50times(){
        printHello5Times();
        printHello5Times();
        printHello5Times();
        printHello5Times();
        printHello5Times();
        printHello5Times();
        printHello5Times();
        printHello5Times();
        printHello5Times();
        printHello5Times();

    }

    public static void printHello200times(){
        printHello50times();
        printHello50times();
        printHello50times();
        printHello50times();
    }

    public static void printHello1000times(){
        printHello200times();
        printHello200times();
        printHello200times();
        printHello200times();
    }


}
