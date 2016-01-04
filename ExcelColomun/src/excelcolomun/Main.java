// This Programme Converts the numeric value to Excel Colomun Header

package excelcolomun;

import java.io.*;
import java.nio.file.ReadOnlyFileSystemException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tareq
 */
public class Main {
    
    public static void main(String[] args) {
        
        //Reads file
        
        String fileName = "column Header.txt";
        
        try {
            Scanner scanFile = new Scanner(new File(fileName));
            
            while(scanFile.hasNext()){
            String columnNumber = scanFile.next();
            
            // Generates The Column Header
            String columnHeader = "";

            int quotient = Integer.parseInt(columnNumber);

            int reminder = 0;

            while(quotient > 0){

                quotient = quotient - 1; 
                reminder = quotient % 26;
                quotient = quotient / 26;

                columnHeader = (char)(reminder + 97) + columnHeader;
            }

            System.out.println(columnHeader.toUpperCase());
            
            }
        } catch (FileNotFoundException ex) {
            System.out.println("No File Found");
        }
    }
    
}
