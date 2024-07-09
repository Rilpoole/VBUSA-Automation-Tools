import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

public class EstimateBuilder {

    private static ArrayList<Category> categories = new ArrayList<Category>();

    public static void build() {
        //Add categories
        File parent = new File("Estimate Builder Config\\");
        String[] tmp = parent.list();
        for (String category : tmp) {
            categories.add(new Category(category));
        }

        //Add config files
        for(Category cat : categories){
            
        }
    }

}
