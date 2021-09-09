public class Guerreiro {
    
    private int vida, atk, def, energia, danoEsp, atkspeedesp;

    //Inicialização dos atributos básicos da classe guerreiro 
    protected Guerreiro(){

        vida = 100; atk = 25; def = 25; energia = 80;

        Espada inicial = new Espada(2,1);

        danoEsp = inicial.getDano();
        atkspeedesp = inicial.getAtkspeed();

    }

    public void setDanoEsp(int danoEsp) {
        this.danoEsp = danoEsp;
    }

    public int getDanoEsp() {
        return danoEsp;
    }

    public void setDanoesp(int danoEsp) {
        this.danoEsp = danoEsp;
    }

    public int getAtkspeedesp() {
        return atkspeedesp;
    }

    public void setAtkspeedesp(int atkspeedesp) {
        this.atkspeedesp = atkspeedesp;
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
