package A20240602;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
//        properties.put("asd","oiy");
//        properties.put("ags","hdgn");
//        properties.put("fdg","cvnnk");
        File file = new File("src/A20240602/config.properties");
        properties.load(new FileInputStream(file));
        System.out.println(properties);
    }
}
