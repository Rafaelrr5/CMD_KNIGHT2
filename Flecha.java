public class Flecha {
    
    private int tipo, dano;

     //Inicialização da flecha pegando parâmetros
     protected Flecha(int dano,int tipo){
        dano = this.dano;
        tipo = this.tipo;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

}
