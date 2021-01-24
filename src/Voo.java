public class Voo {
    String origem, destino;
    int distancia, numero;

    public Voo(String origem, String destino, int distancia, int numero){
        this.origem = origem;
        this.destino = destino;
        this.distancia = distancia;
        this.numero = numero;
    }

    public int getDistancia(){
        return this.distancia;
    }

    public int getNumero(){
        return this.numero;
    }
}
