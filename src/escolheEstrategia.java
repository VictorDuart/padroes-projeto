public class escolheEstrategia {

    Bilhete bilhete;

    public escolheEstrategia(Bilhete bilhete){
        this.bilhete = bilhete;
    }

    public EstrategiaDePontuacao getEstrategiaDePontuacao(boolean isPassageiroDiamante){
        if (bilhete.isPrimeiraClasse() && isPassageiroDiamante) {
            return new EstrategiaPrimeiraClasseDiamante();
        } else if (bilhete.isPrimeiraClasse()) {
            return new EstrategiaPrimeiraClasse();
        } else if (bilhete.isClasseEconomica()) {
            return new EstrategiaClasseEconomica();
        } else {
            return new EstrategiaPromocional();
        }
    }
}
