public class DataCast {
    public static void main(String[] args) {
        double a = 3.5;
        double b = 1;
        System.out.println(b); // 1.0
        //int c = 1.1; => This is Error
        int d = (int) 1.1; // Change Types from double to integer
        System.out.println(d); // 1
        double b1 = (double) 1.0; // Same Meaning with Line 4
        String strToInt = Integer.toString(1);
        System.out.println(strToInt); // "1" => Work as String
        System.out.println(strToInt.getClass()); // Let Us Know Which Datatype it is
    }
}