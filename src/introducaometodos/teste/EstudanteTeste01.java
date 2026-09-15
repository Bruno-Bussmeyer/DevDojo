package introducaometodos.teste;

import introducaometodos.dominio.Estudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {

        Estudante estudante = new Estudante();
        estudante.nome = "Pedro";
        estudante.sexo = 'M';
        estudante.idade = 12;

        estudante.imprime();
    }
}
