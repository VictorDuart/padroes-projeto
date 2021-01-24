public class Bilhete  {

    String classe;

    public Bilhete(String tipo){
        classe = tipo;
    }

    public boolean isPrimeiraClasse(){
        if(this.classe.equals("primeira")){
            return true;
        }else{
            return false;
        }
    }

    public boolean isClasseEconomica(){
        if(this.classe.equals("economica")){
            return true;
        }else{
            return false;
        }
    }

    public boolean isPromocional(){
        if(this.classe.equals("promocional")){
            return true;
        }else{
            return false;
        }
    }

}

