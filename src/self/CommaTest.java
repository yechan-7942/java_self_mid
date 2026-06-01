package self;

public class CommaTest {
    public static void main(String[] args) {
        String line = "40945,900,100,yechan";
        String[] arr = line.split(",");
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
    }
}
