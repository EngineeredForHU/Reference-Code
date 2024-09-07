package ExceptionINFO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exception {

    public static void main(String[] args) {
        int[] nums = new int[3];
        System.out.println("Hi");

        if (nums.length > 3){
            System.out.println(nums[3]);
        }
        System.out.println("bye");


        /*
        * Checked Exceptions  - explicitly checks for in our code
        * Try, catch block - handles checked exceptions.
        *
        *
        * Unchecked Exception - something we have control over and only occurs if we make mistakes in our code
        *
        * */

        try {
            FileReader fileReader = new FileReader("smethingnew.txt");

        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        }finally {
            System.out.println("FINALLY");
        }
        System.out.println("after catch");

        try {
            System.out.println(openFile("moon.jpg"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException("File not found: "+e);
        }

    }

    public static FileReader openFile(String fileName) throws FileNotFoundException{
        return new FileReader(fileName);
    }
}
