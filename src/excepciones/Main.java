package excepciones;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        /*DivisionPorCero divisionPorCero=new DivisionPorCero(5,0);
        try {
            System.out.println(divisionPorCero.division());
        }catch (ArithmeticException e){
            System.out.println("Oiga no se puede dividir por 0, error: "+e);
        }catch (IOException e){
            System.out.println("Oiga ocurrio otro error: "+e);
        }*/

        /*Arreglo arreglo = new Arreglo();
        try {
            System.out.println(arreglo.obtenerNumero(2));
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Oiga no sea tan pendejo de buscar una posicion que no existe");
        }*/
        try {
            // creating object of FileReader
            FileReader reader = new FileReader("file.txt");

            // passing FileReader to
            // buffered reader
            BufferedReader br = new BufferedReader(reader);

            // declaring empty string
            String data = null;

            // while loop to read data
            // and printing them
            while ((data = br.readLine()) != null) {
                System.out.println(data);
            }

            // closing the object
            br.close();
        } catch (IOException e) {
            System.out.println("Exception " + e);
        }
    }


}

