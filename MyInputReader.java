
import java.io.*;
import java.util.*;

public class MyInputReader {
public static void main(String[] args) throws Exception {


    // Step 1: Take raw byte input from keyboard
    InputStream input = System.in;

    // Step 2: Convert bytes → characters
    InputStreamReader reader = new InputStreamReader(input);        

    // Step 3: Read characters one by one
    System.out.println("Type something: ");

    int data = reader.read();   // reads only ONE character
    System.out.println("You typed: " + (char)data);
}

}
