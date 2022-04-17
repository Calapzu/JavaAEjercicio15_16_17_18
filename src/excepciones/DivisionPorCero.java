package excepciones;

import java.io.IOException;

public class DivisionPorCero {
    private int numero1;
    private int numero2;

    public DivisionPorCero() {
    }

    public DivisionPorCero(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double division() throws ArithmeticException, IOException {
        return this.numero1/this.numero2;
    }
}
