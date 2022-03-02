package academy.devjojo.maratonajava.javacore.Jmodificadorfinal.dominio;

// final não autoriza a classe ser extendida
public class Carro {
    private String nome;
    public static final double VELOCIDADE_LIMITE = 250; // VALOR QUE NUNCA PODE SER ALTERADO (VALOR CONSTANTE)
    public final Comprador COMPRADOR = new Comprador();

    public final void imprime(){
        System.out.println(this.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
