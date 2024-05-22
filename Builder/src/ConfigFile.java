import java.util.ArrayList;
import java.io.FileReader;
import java.util.Scanner;
import java.io.IOException;

public class ConfigFile {

    ArrayList<ConfigFileLine> lines = new ArrayList<ConfigFileLine>();

    public void read(String filepath) {
        try {
            FileReader configFileReader = new FileReader(filepath);
            Scanner configFileScanner = new Scanner(configFileReader);
            while (configFileScanner.hasNextLine()) {
                Scanner lineScanner = new Scanner(configFileScanner.nextLine());
                String lineType = lineScanner.next();
                switch(lineType){
                    case "I":
                        System.out.println("Item");
                        break; 
                    case "F":
                        System.out.println("Freight");
                        break;
                    default:
                        System.out.println("Default");
                }
                lineScanner.close();
            }
            configFileScanner.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
