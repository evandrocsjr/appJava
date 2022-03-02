package academy.devjojo.maratonajava.javacore.Gassociacao.test;

import academy.devjojo.maratonajava.javacore.Gassociacao.domain.Jogador;
import academy.devjojo.maratonajava.javacore.Gassociacao.domain.Time;

public class JogadorTest2 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pele");
        Time time = new Time("Seleção brasileira");
        jogador1.setTime(time);
        jogador1.imprime();
    }
}
