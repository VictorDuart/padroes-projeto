import java.util.List;

public class Calculo {

    public int calcularPontuacao(Passageiro passageiro){
        int totalDePontos = 0;
        List<Voo> voosPendentes = passageiro.getVoosComPontuacaoPendente();

        for(Voo voo:voosPendentes){
            Bilhete bilhete = passageiro.getBilhete(voo.numero);
            escolheEstrategia escolhe = new escolheEstrategia(bilhete);
            EstrategiaDePontuacao estrategia = escolhe.getEstrategiaDePontuacao(passageiro.isDiamante());
            totalDePontos += estrategia.calcularPontuacao(voo.getDistancia());
        }

        passageiro.atualizarPontuacao(totalDePontos);
        passageiro.marcarVoosComoProcessados();

        return totalDePontos;
    }
}
