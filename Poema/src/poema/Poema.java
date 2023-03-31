/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poema;

import java.io.*;
public class Poema {

    public static void main(String[] args) {
        
        FileReader fr = null;
        BufferedReader br = null;
        String linea;
        int cont = 1;
        try {
        fr = new FileReader("poemaE.txt");
        br = new BufferedReader(fr);
        while ((linea = br.readLine()) != null) {
            for (int i = 0; i < linea.length(); i++) {
                System.out.print((char)(linea.charAt(i)- cont));  
            }
            System.out.println("");
            cont++;
        }
        }catch (IOException e){
            System.err.println("Ha ocurrido una IOException");
    } finally {
            try {
                if (fr!= null) {
            br.close();        
            fr.close();                                              
                }
            } catch (IOException es) {
                System.err.println("Ha ocurrido una IOException");

            }

        }
}
}
