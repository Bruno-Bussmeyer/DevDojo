package devdojo.projetos.introducaoclasses.dominio;

public class Calculadora {
    
    public void somaDoisNumeros() {

        System.out.println(10 + 10);
    }

    public void multiplicadoDoisNumeros(int num1, int num2) {

        System.out.println(num1 * num2);
    }

    public int divideDoisNumeros(double num1, double num2) {

        return (int) (num1/num2);
    }
    public void somaArray(int [] numeros){
        int soma = 0;
        for (int numero: numeros){
            soma = soma + numero;
        }
    }
}
