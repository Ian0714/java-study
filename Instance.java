import java.io.PrintWriter;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Instance {
    public static void main(String[] args) throws IOException{
        PrintWriter pw = new PrintWriter("instance.txt"); // pw is Instance, in the class PrintWriter
        pw.write("Hello"); // Write Hello into instance.txt
        pw.close(); // Close the file instance.txt
        //PrintWriter.write("instance.txt", "Hello") => Works same as written above
    }
}