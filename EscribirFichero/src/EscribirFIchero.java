import java.io.*;

public class EscribirFIchero {
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader (System.in);
        BufferedReader teclado = new BufferedReader (isr);
        FileWriter fw = null;
        BufferedWriter bw = null;
                
        String texto = "a";
        try{
            fw = new FileWriter("prueba.txt");
            bw = new BufferedWriter(fw);
            do{
              
        texto = teclado.readLine();
        if (!texto.equals("$")){  
        bw.write(texto);
        bw.newLine();
        }
            } while(!texto.equals("$"));
        } catch (IOException e){
            System.err.println("Eres malo");
        } finally {
            try {
                if (fw!= null) {
            bw.close();        
            fw.close();                                              
                }
            } catch (IOException es) {
                System.err.println("Ha ocurrido una IOException");

            }
        
        
    }
}
}
