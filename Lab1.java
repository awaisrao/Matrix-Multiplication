/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab1;
import java.util.*;
import lab1.MatrixMultiply;
import lab1.Strassen;
/**
 *
 * @author zulfiqar.bscs13seecs
 */
public class Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Defining dimensions of square mtrices
        MatrixMultiply max = new MatrixMultiply();
              long startTime = System.currentTimeMillis();
                max.multiply();
            long stopTime = System.currentTimeMillis();
                long elapsedTime = stopTime - startTime;
                max.print();
      System.out.println("Time Elapsed:"+elapsedTime);

        
        Strassen str = new Strassen();
      startTime = System.currentTimeMillis();
        str.multiply();
        stopTime = System.currentTimeMillis();
        elapsedTime = stopTime - startTime;
        System.out.println("Time Elapsed:"+elapsedTime);
    }
    
}
