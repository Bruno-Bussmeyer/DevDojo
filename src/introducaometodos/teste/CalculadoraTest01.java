package introducaometodos.teste;

import introducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int [] numeros = {1,2,3,4,5,6,7};

       //  calculadora.somaArray(numeros);
        calculadora.somaVarArgs(numeros);
    }
}
