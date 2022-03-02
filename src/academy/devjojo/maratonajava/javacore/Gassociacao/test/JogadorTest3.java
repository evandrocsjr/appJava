package academy.devjojo.maratonajava.javacore.Gassociacao.test;

import academy.devjojo.maratonajava.javacore.Gassociacao.domain.Jogador;
import academy.devjojo.maratonajava.javacore.Gassociacao.domain.Time;

public class JogadorTest3 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Cafu");
        Jogador jogador2 = new Jogador("João");
        Time time = new Time("Brasil");

        Jogador[] jogadores = {jogador, jogador2};

        jogador.setTime(time);
        jogador2.setTime(time);

        time.setJogadores(jogadores);

        System.out.println("-----------JOGADOR");

        jogador.imprime();

        System.out.println("-----------TIME");

        time.imprime();
    }
}
