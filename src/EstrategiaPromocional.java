public class EstrategiaPromocional implements EstrategiaDePontuacao {
    @Override
    public int calcularPontuacao(int distanciaDeVoo) {
        return distanciaDeVoo/10;
    }
}
