/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package was;



/**
 *
 * @author Estudiante
 */
public class NewClass {
    public static void main(String[] args) {
        java.util.Scanner lec= new java.util.Scanner(System.in);
      System.out.println("tamano");
      int tam=lec.nextInt();
     int[] vectorB=new int[tam];
      int[] vectorA=new int[tam];
     for(int i=0; i<tam; i++){
         System.out.println("Dato"+i+"A");
                 vectorA[i]=lec.nextInt();
         System.out.println("Dato"+i+"B");
                 vectorB[i]=lec.nextInt();
     }
     int[] resultado= SumaVectores(vectorB, vectorB);
     for (int i=0; i<tam; i++)
        {
            System.out.println(resultado[i]);
        }
        
     }
    
     static int[] SumaVectores (int[]A, int[]B){
         int r[] = new int[A.length];
         for(int i=0; i<A.length; i++){
             r[i]=A[i]+B[i];
         }
         return r;
     }
}
