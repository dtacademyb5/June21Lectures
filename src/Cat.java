public class Cat {


    public static void print5RandomLowercaseChars() {  //public static void print5RandomLowercaseChars() -> method header
                                      // print5RandomLowercaseChars() -> name and the parameters of a method -> method signature
        int r1 = (int)(97 +Math.random() *26);
        int r2 = (int)(97 +Math.random() *26);
        int r3 = (int)(97 +Math.random() *26);
        int r4 = (int)(97 +Math.random() *26);
        int r5 = (int)(97 +Math.random() *26);

        char ch1 = (char) r1;
        char ch2 =(char) r2;
        char ch3 = (char) r3;
        char ch4 =(char) r4;
        char ch5 = (char) r5;

        System.out.print(ch1);
        System.out.print(ch2);
        System.out.print(ch3);
        System.out.print(ch4);
        System.out.print(ch5);
        System.out.println();
    }




    public static void main(String[] args) {

        // Some code...
//        print5RandomLowercaseChars();
//
//        // 100 lines of code..
//        print5RandomLowercaseChars();
//
//
//        Utility.generatePassword();
//        Utility.generateUsername();
//        Utility.generateEmail();

        Animals.printAnimal();



    }





}
