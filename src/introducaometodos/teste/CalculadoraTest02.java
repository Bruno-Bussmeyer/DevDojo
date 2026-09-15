package introducaometodos.teste;

import introducaometodos.dominio.Calculadora;

public class CalculadoraTest02 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {1,2,3,5,65,84};

        calculadora.SomaArray(numeros);
    }

}
