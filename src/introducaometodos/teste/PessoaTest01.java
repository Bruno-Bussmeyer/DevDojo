package introducaometodos.teste;
import introducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();

        p1.setNome("Jiraya");
        p1.setIdade(18);
        p1.imprime();
    }
}
