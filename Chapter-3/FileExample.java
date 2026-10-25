// Writing to a File

import java.io.PrintWriter;

public class FileExample {
    public static void main(String[] args) throws Exception {
        
        // Create a text file
        PrintWriter writer = new PrintWriter("notes.txt");

        // Write into the text file
        writer.println("Chapter 3: Object Oriented Programming");

        // Close the file
        writer.close();

        System.out.println("File saved.");
    }
}
