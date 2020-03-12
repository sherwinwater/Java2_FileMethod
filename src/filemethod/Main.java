package filemethod;

import data.TheFile;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        try {
            String[] worker = {"Fred Smith, Hamilton", "Barney Budd, Barrie", "Dino Smith, Hamilton"};
            
            TheFile.setData("Barney.dat", worker);
            System.out.println(TheFile.getData("Barney.dat"));
        } catch (IOException e) {
            System.out.println("problem ");
        }
    }
}
