package ex_20_Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

    public class Lab133_Throws {
        public static void main(String[] args) throws FileNotFoundException {

            FileReader f = new FileReader(new File("C://abc.txt"));
        }
    }
