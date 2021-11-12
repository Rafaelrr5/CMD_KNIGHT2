import java.util.Random;

public class Monstro {
    
    private int categoria, vidatot, dano, atkspeed;
    private String nome;
    Random n = new Random();

    //Inicialização do montro pegando parâmetros gerados aleatoriamente
    protected Monstro(){

        this.categoria = 
        this.vidatot = 
        this.dano = 
        this.atkspeed = 

        categoria = n.nextInt(3);

        switch(categoria){
            case 1:
            nome = "Esqueleto";
            break;

            case 2:
            nome = "Orc";

            break;

            case 3:
            nome = "Slime";

            break;

            default:

        }

    }

    //Inicialização do montro pro tutorial
    protected Monstro(int vidatot, int  dano, int atkspeed, int categoria){

        vidatot = 50;  dano = 1;  atkspeed = 1; categoria = 1;

        switch(categoria){
            case 1:
            nome = "Esqueleto";
            break;

            case 2:

            break;

            case 3:

            break;

            default:

        }

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

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public int getVidatot() {
        return vidatot;
    }

    public void setVidatot(int vidatot) {
        this.vidatot = vidatot;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
