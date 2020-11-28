public class Test {

    public static void main(String[] args) {
        Boiler blrFirst = Boiler.getInstance(1);
        Boiler blrSecond = Boiler.getInstance(1);
        Boiler blrThird = Boiler.getInstance(2);
        Boiler blrFourth = Boiler.getInstance(3);
        Boiler blrFifth = Boiler.getInstance(2);

        /* Print the identityHashCode of the five
         * objects */
    }
}
