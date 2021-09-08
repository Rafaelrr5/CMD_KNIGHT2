public class Arqueiro {
    
    private int vida, atk, def, energia, danoArco, atkspeedArco;

    public int getDanoArco() {
        return danoArco;
    }

    public void setDanoArco(int danoArco) {
        this.danoArco = danoArco;
    }

    public int getAtkspeedArco() {
        return atkspeedArco;
    }

    public void setAtkspeedArco(int atkspeedArco) {
        this.atkspeedArco = atkspeedArco;
    }

    protected Arqueiro(){

        vida = 80; atk = 40; def = 10; energia = 100;

        Arco inicial = new Arco (2,1);

        danoArco = inicial.getDano();
        atkspeedArco = inicial.getAtkspeed();

    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }
    

    
}
