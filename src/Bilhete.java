public class Bilhete  {

    String classe;

    public Bilhete(String tipo){

        classe = tipo;
    }

    public boolean isPrimeiraClasse(){
        if(this.classe == "primeira"){
            return true;
        }else{
            return false;
        }
    }

    public boolean isClasseEconomica(){
        if(this.classe == "economica"){
            return true;
        }else{
            return false;
        }
    }

    public boolean isPromocional(){
        if(this.classe == "promocional"){
            return true;
        }else{
            return false;
        }
    }

}

