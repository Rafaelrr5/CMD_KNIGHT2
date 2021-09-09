public class Arco {
    
    private int dano, atkspeed;

    //Inicialização do arco pegando parâmetros
    protected Arco(int dano,int atkspeed){
        dano = this.dano;
        atkspeed = this.atkspeed;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public int getAtkspeed() {
        return atkspeed;
    }

    public void setAtkspeed(int atkspeed) {
        this.atkspeed = atkspeed;
    }   
    
}
