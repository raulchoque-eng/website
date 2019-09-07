package core.selenium.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
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

    /**
     * Gets Properties class with data.
     *
     * @return a Properties object.
     */
    public static Properties getProperties() {
        Properties prop = new Properties();
//        InputStream input = null;
        try (InputStream input = new FileInputStream("gradle.properties");) {
            prop.load(input);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop;
    }
}
