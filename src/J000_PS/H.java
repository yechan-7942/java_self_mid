package J000_PS;

public class H {
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        H calc = new H();
        int result = calc.add(5, 3);
        System.out.println(result);
    }
}
