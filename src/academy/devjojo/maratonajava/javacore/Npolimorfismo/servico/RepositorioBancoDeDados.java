package academy.devjojo.maratonajava.javacore.Npolimorfismo.servico;

import academy.devjojo.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em um banco de dados.");
    }
}
