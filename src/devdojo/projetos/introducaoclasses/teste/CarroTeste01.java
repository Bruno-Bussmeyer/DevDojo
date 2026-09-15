package devdojo.projetos.introducaoclasses.teste;
import devdojo.projetos.introducaoclasses.dominio.Carro;

//Bibliotecas
import java.util.Scanner;

public class CarroTeste01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        System.out.println("Digite o nome do carro: ");
        carro1.nome = input.nextLine();
        System.out.println("Digite o marca do carro: ");
        carro1.marca = input.nextLine();
        System.out.println("Digite o ano do carro: ");
        carro1.ano = input.nextInt();

        System.out.println(carro1.nome + carro1.ano + carro1.marca);
    }
}
