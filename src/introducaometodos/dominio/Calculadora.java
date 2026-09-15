package introducaometodos.dominio;

public class Calculadora {
    //Forma classica de representar Arays
    public int somaArray(int [] numeros){
        int soma = 0;
        for (int num: numeros){
            soma = soma + num;
        }
        return soma;
    }
    //Forma nova de representar Arays
    public void somaVarArgs(int... numeros){
        int soma = 0;
        for (int num:numeros){
            soma = soma + num;
        }

    }
    public void alteraDoisNumeros(int numero1, int numero2){
        numero1 = 99;
        numero2 = 23;

        System.out.println("Dentro do alteradoisNumeros");
        System.out.println("Numero1: " + numero1);
        System.out.println("Numero2: " + numero2);
    }

    public void SomaArray(int[] numeros){
        int soma = 0;
        for (int num : numeros){
            soma = soma + num;
        }
        System.out.println("Soma: " + soma);
    }
}
