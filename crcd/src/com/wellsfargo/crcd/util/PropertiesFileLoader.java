package com.wellsfargo.crcd.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesFileLoader {
    static Properties properties;

    public static void loadProperties() {
        String propertiesFilePath = "C:\\projects\\crcd\\resources\\crcd.properties";

        try {
            InputStream input = new FileInputStream(propertiesFilePath);
            properties = new Properties();
            properties.load(input);

        }  catch (FileNotFoundException e) {
            e.printStackTrace();
        }  catch(IOException ioe) {
            ioe.printStackTrace();
        }

    }

    public static String getProperties (String key) {
        return properties.getProperty(key);
    }

}
