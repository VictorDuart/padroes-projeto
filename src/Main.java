import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        int pontosCalculados;
        int totalDePontos;

        Voo voo1 = new Voo("Belo Horizonte", "Rio de Janeiro", 441, 5566);
        Voo voo2 = new Voo("Rio de Janeiro", "São Paulo", 432, 1528);

        List voosPendentes = new ArrayList();

        voosPendentes.add(voo1);
        voosPendentes.add(voo2);

        Passageiro passageiro = new Passageiro("Victor", false, 300, voosPendentes);

        Calculo calculo = new Calculo();

        pontosCalculados = calculo.calcularPontuacao(passageiro);

        System.out.println("\nPassageiro: "+passageiro.nome+"\nPontuação dos voos pendentes: "+pontosCalculados+"\nPontuação atual: " +
                passageiro.pontuacao);
    }

}
