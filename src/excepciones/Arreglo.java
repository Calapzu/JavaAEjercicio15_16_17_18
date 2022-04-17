package excepciones;

public class Arreglo {
    int[] array = {1,2,3,4,5,6};

    public Arreglo() {
    }

    public int obtenerNumero(int numero)throws ArrayIndexOutOfBoundsException{
        return array[numero];
    }
}
