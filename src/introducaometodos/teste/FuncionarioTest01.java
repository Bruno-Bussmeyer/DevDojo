package introducaometodos.teste;

import introducaometodos.dominio.Funcionarios;

public class FuncionarioTest01 {

    public static void main(String[] args) {


        Funcionarios funcionario1 = new Funcionarios();

        funcionario1.nome = "Bruno";
        funcionario1.idade = 32;
        funcionario1.salario1 = 4200;
        funcionario1.salario2 = 400;
        funcionario1.salario3 = 321;

        funcionario1.imprimirDadosFuncionarios();
    }
}
