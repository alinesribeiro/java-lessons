/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author lab101p2
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int i = 0;
        while (i <= 300) {
            int j = 1;
            boolean divisivel = false;
            while (j < i - 1) {
                j += 1;
                if (i % j == 0) {
                    divisivel = true;
                    break;
                }
            }
            if (divisivel == false){
                System.out.println(i);
            }
            i+=1;      
        }
    }
}
