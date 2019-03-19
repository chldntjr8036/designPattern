package Facade.pageMaker;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

class Database {
    private Database() { } //new에서 인스턴스 생성 방지하기 위해 private 선언
    public static Properties getProperties(String dbname) {
        String filename = dbname+".txt";
        Properties prop = new Properties();
        try{
            prop.load(new FileInputStream(filename));
        }catch (IOException e) {
            System.out.println("Warning: " + filename + " is not found.");
        }
        return prop;
    }
}
