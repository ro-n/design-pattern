import java.util.LinkedList;

class Boiler {
    private static LinkedList<Boiler> blrs
            = new LinkedList<>();
    static {
        int numOfBoilers = 3;
        for (int i = 0; i < numOfBoilers; i++)
    { blrs.add(new Boiler()); } }

    private Boiler() { }
    public static Boiler getInstance(int n) {
        return blrs.get(n - 1);
    }
}
