package academy.devjojo.maratonajava.javacore.Bintroducaometodos.domain;

public class ImprimeEstudante {
    public void imprime(Estudante estudante) {
        System.out.println("----------------------");

        System.out.println(estudante.nome);
        System.out.println(estudante.sexo);
        System.out.println(estudante.idade);
    }
}
