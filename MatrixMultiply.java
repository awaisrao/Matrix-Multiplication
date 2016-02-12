/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;
import java.util.*;
/**
 *
 * @author zulfiqar.bscs13seecs
 */
public class MatrixMultiply {
   public static int dim1;
   public static int dim2;
    public static int[][] matrix1;
    public static int[][] matrix2;
    public static int[][] result;
    public static void MatrixMultiply(){}
    

       public static void multiply(){
           //multiplying matrices
           int dim1 = 10;
        int dim2 = 10;
        
        //defining random object
        Random random = new Random();
        //defining matrices
        matrix1 = new int [dim1][dim2];
        matrix2 = new int[dim1][dim2];
        result = new int[dim1][dim2];
        //initializing matrices
        for( int i = 0 ; i < matrix1.length ; i++ ) { 
           for ( int j = 0 ; j < matrix1[i].length ; j++ ) { 
              matrix1[i][j] = random.nextInt(5);
              matrix2[i][j] = random.nextInt(5);
              result[i][j]=0;
           }
        }
        for(int i =0; i < dim1;  i++){
            for(int j =0; j < dim2; j++){
                for(int k =0; k < dim1; k++){
                    result[i][j] += matrix1[i][k]*matrix2[k][j]; 
                }
            }
        }
       }
       public static void print(){
           //printing result matrix
         for( int y =0; y<result.length;y++ ) {
             for(int n =0 ; n< result[y].length ; n++){
                 System.out.print( result[y][n]+" ");
             }
            System.out.print("\n");
        }
       }
        
}
