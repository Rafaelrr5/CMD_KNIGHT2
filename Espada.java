public class Espada {
    
    private int dano, atkspeed, preco;

    protected Espada (int dano, int atkspeed){
        this.dano = dano;
        this.atkspeed = atkspeed;
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

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

}
