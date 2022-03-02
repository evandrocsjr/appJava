package academy.devjojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devjojo.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;
import academy.devjojo.maratonajava.javacore.Npolimorfismo.servico.RepositorioArquivo;
import academy.devjojo.maratonajava.javacore.Npolimorfismo.servico.RepositorioBancoDeDados;

public class RepositorioTest {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioArquivo();

        repositorio.salvar();
    }
}
