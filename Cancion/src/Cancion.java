import java.io.*;

public class Cancion {
    public static void main(String[] args) {
        FileReader fr = null;
        BufferedReader br = null;
        String linea;
        int cont = 0;
        try{
        fr = new FileReader("cancion.txt");
        br = new BufferedReader(fr);
        
        while ((linea = br.readLine()) != null){
                 cont++;
                 System.out.println("la linea " +cont +" tiene " +linea.split(" ").length +" palabras");
             
             
        } System.out.println("LA cancion tiene: "+cont +" lineas");
        } catch(FileNotFoundException e){
            System.err.println("Eres tonto pon un archivo valido");
        } catch (IOException e){
            System.err.println("TNTO");
        }
        finally {
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
