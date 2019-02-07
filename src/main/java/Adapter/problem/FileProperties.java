package Adapter.problem;

import java.io.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.Properties;

public class FileProperties implements FileIO {
    Properties prop = new Properties();

    @Override
    public void readFromFile(String filename) throws IOException {
        prop.load(new FileReader(filename));
    }

    @Override
    public void writeToFile(String filename) throws IOException {
        LocalDate date = LocalDate.now();

        OutputStream os = new FileOutputStream(filename);
        String header = "#written by FileProperties\n#"+date.toString();

        prop.store(os,header);
    }

    @Override
    public void setValues(String key, String value) {
        prop.setProperty(key, value);
    }

    @Override
    public String getValue(String key) {
        return prop.getProperty(key);
    }
}
