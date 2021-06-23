public class Egg {

    /*
     * Write a complete Java program in a class named Egg2 that generates the following output. Use static methods to show structure and eliminate redundancy in your solution.
     *
     *   _______
     *  /       \
     * /         \
     * \         /
     *  \_______/
     * -"-'-"-'-"-
     *   _______
     *  /       \
     * /         \
     * \         /
     *  \_______/
     * -"-'-"-'-"-
     * \         /
     *  \_______/
     *   _______
     *  /       \
     * /         \
     * -"-'-"-'-"-
     * \         /
     *  \_______/
     */


    public static void main(String[] args) {


        uppperHalf();
        lowerHalf();
        middle();
        uppperHalf();
        lowerHalf();
        middle();
        lowerHalf();
        uppperHalf();
        middle();
        lowerHalf();



    }

    public static void uppperHalf(){
        System.out.println("            _______\n" +
                "           /       \\\n" +
                "          /         \\");
    }

    public static void lowerHalf(){
        System.out.println("          \\         /\n" +
                           "           \\_______/");
    }


    public static void middle(){
        System.out.println("          -\"-'-\"-'-\"-");
    }


}
