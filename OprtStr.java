public class OprtStr {
    public static void main(String[] args){
        System.out.println("Hello World".length()); // 11
        System.out.println("Hello, Hi, Bye".replace("Hi", "Anyong")); // Hello, Anyong, Bye
        System.out.println("Hello, [[name]], Bye".replace("[[name]]", "Anyong")); // Same as above
    }
}