package core.selenium.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * ReaderFile class.
 *
 * @author Raul Choque
 * @version 0.0.1
 */
public class ReaderFile {

    public static Properties getProperties() {
        Properties prop = new Properties();
        InputStream input = null;
        try {
            input = new FileInputStream("gradle.properties");
            prop.load(input);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return prop;
    }
}
