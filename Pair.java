public class Pair<T1, T2> {
    private T1 first;
    private T2 second;

    public Pair(T1 first, T2 second) {
        this.first = first;
        this.second = second;
    }

    public void showTypes() {
        System.out.println(first.getClass().getSimpleName() + " (" + first + ") & " + 
                           second.getClass().getSimpleName() + " (" + second + ")");
    }

    public Pair<T2, T1> swap() {
        return new Pair<>(this.second, this.first);
    }

    public static void main(String[] args) {
        Pair<Integer, String> p1 = new Pair<>(1, "Satu");
        p1.showTypes();
        Pair<String, Integer> swappedP1 = p1.swap();
        swappedP1.showTypes();

        Pair<Double, Boolean> p2 = new Pair<>(99.5, true);
        p2.showTypes();
    }
} 
