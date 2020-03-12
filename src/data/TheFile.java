package data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TheFile {

//    public static void setData(File file, String[] workers) {
//        if (!file.exists()) {
//            throw new Exception("File not exist");
//        }
//            FileWriter fw = new FileWriter(file);
    public static void setData(String fileName, String[] workers)
            throws IOException {
        FileWriter fw = new FileWriter(fileName);
        BufferedWriter bw = new BufferedWriter(fw);
        for(String s : workers) {
            bw.write(s);
            bw.newLine();
        }
//        bw.flush();
        bw.close();
        fw.close();
    }
    
    public static String getData(String filename) throws IOException {
        FileReader fr = new FileReader(filename);
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();
        String sData = "";
        while(line != null){
            sData += line+"\n";
            line = br.readLine();
        }
        br.close();
        fr.close();
        return sData;
    }
    
}
