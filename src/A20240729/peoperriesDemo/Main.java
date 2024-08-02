package A20240729.peoperriesDemo;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        File file = new File("src/A20240729/DEMO/file.properties");
        Properties properties = new Properties();
        try {
            properties.load(new FileReader(file));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        properties.setProperty("Name", "tom");
        properties.put("Name", "tom");
        System.out.println(properties.getProperty("Name"));
    }
}
