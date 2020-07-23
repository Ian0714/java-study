import java.util.Scanner;

public class JavaIO {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str;
        str = scan.nextLine();
        System.out.println(str);
        int integer;
        integer = scan.nextInt();
        System.out.println(integer);
        double doub;
        doub = scan.nextDouble();
        System.out.println(doub);
    }
}