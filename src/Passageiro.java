import java.util.List;
import java.util.Scanner;

public class Passageiro {
    String nome;
    boolean diamante;
    int pontuacao;
    List<Voo> voosPendentes;
    Scanner ler = new Scanner(System.in);

    public Passageiro(String nome, boolean diamante, int pontuacao, List<Voo> voosPendentes){
        this.nome = nome;
        this.diamante = diamante;
        this.pontuacao = pontuacao;
        this.voosPendentes = voosPendentes;
    }

    public List<Voo> getVoosComPontuacaoPendente(){
        return this.voosPendentes;
    }

    public void atualizarPontuacao(int novaPontuacao){
        this.pontuacao += novaPontuacao;
    }

    public void marcarVoosComoProcessados(){
        voosPendentes.clear();
    }

    public boolean isDiamante(){
        return this.diamante;
    }

    public Bilhete getBilhete(int numeroVoo){

        String classe;

        System.out.println("Insira a classe o voo "+numeroVoo+" (primeira, economica, promocional): \n");
        classe = ler.next();

        Bilhete bilhete = new Bilhete(classe);

        return bilhete;
    }

}
