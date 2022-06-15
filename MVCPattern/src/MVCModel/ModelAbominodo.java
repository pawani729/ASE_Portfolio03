package MVCModel;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ModelAbominodo {
public String getData() throws FileNotFoundException, IOException {
 
    if(!(new File("C:\\Users\\DELL\\Desktop\\WelcomeMessage.txt").isFile())) {
    //Create--Make sure file exists -- the file before continuing
        Files.createFile(Paths.get("C:\\Users\\DELL\\Desktop\\WelcomeMessage.txt"));
    }
    String data;
    // We will be using a try-with-resource block
    try (BufferedReader reader = new BufferedReader(
    new FileReader("C:\\Users\\DELl\\Desktop\\WelcomeMessage.txt"))) {
        // Access the data from the file and Create a new StringBuilder
        StringBuilder string = new StringBuilder();
        // Read line-by-line

        String line = reader.readLine();
        string.append("<html>");
        // While there comes a new line, execute this
        
        while(line != null) {
        // Add these lines to the String builder
        string.append(line);
        string.append("<br />");
        // Read the next line
        line = reader.readLine();
        }
        string.append("</html>");
        data = string.toString();
        
    } catch (Exception er) {
    // Since there was an error, you probably want to notify the user and For that e
   
        data = er.getMessage();
    }
    //Return the string read from the file
    return data;
 }
}   
