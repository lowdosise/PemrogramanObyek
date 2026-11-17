public class Cell<T> {
    private T data;
    public void setValue(T data) { this.data = data; }
    public T getValue() { return data; }

    public void displayType() {
        if (data != null) {
            System.out.println("Tipe data: " + data.getClass().getSimpleName() + " | Nilai: " + data);
        }
    }

    public static void main(String[] args) {
        Cell<Integer> intCell = new Cell<>();
        intCell.setValue(100);
        intCell.displayType();

        Cell<String> strCell = new Cell<>();
        strCell.setValue("Informatika Unhas");
        strCell.displayType();
    }
}