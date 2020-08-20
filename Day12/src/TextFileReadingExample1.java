import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
 

public class TextFileReadingExample1 {
 
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("files1.txt");
            int character;
 
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        try{
            File f = new File("files1.txt");
            Scanner scanner = new Scanner(f);
            int sum = 0;
            while (scanner.hasNext()){
                sum += scanner.nextInt();
            }
            System.out.println("Sum:"+sum);
            scanner.close();
        }catch(Exception err){
            err.printStackTrace();
        }
        
//        try
//        {
//            String filename= "files1.txt";
//            Scanner scnr = new Scanner(filename);
//            FileWriter fw = new FileWriter(filename,true); //the true will append the new data
//            int numAdd = scnr.nextInt();
//            fw.write(numAdd);//appends the string to the file
//            fw.close();
//            scnr.close();
//        }
//        catch(IOException ioe)
//        {
//            System.err.println("IOException: " + ioe.getMessage());
//        }
        

    }                        
    }    
    
 
