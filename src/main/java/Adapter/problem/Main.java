package Adapter.problem;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileIO f = new FileProperties();
        try{
            f.readFromFile("file.txt");
            f.setValues("year","2019");
            f.setValues("month","2");
            f.setValues("day","7");
            f.writeToFile("newFile.txt");

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
