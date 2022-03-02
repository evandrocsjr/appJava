package academy.devjojo.maratonajava.javacore.Gassociacao.test;

import academy.devjojo.maratonajava.javacore.Gassociacao.domain.Escola;
import academy.devjojo.maratonajava.javacore.Gassociacao.domain.Professor;

public class EscolaTeste01 {
    public static void main(String[] args) {
        Professor professor = new Professor("Evandro");
        Professor professor2 = new Professor("João");
        Professor[] professores = {professor, professor2};

        Escola escola = new Escola("Escola 1", professores);

        escola.imprime();
    }
}
