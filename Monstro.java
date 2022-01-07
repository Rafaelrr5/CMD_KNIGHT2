import java.util.Random;

public abstract class Monstro {
    
    private int categoria, vidatot, dano, atkspeed;
    private String classe;
    Random n = new Random();

    //Inicialização do montro com parâmetros gerados aleatoriamente (batalhas aleatórias)
    protected Monstro(){

        //Geração que não passa de 3 e também nunca é 0
        this.categoria = (n.nextInt(3)) + 1;

        //Categoria que o monstro vai ser (gerado aleatoriamente)
        switch(categoria){
            case 1:
            classe = "Fraco";
            //Atributos gerados que nunca serão iguais a 0
            this.vidatot = n.nextInt(20) + 10;
            this.dano = n.nextInt(5) + 1;
            this.atkspeed = 1;
            break;

            case 2:
            classe = "Intermediário";
            //Atributos gerados que nunca serão iguais a 0
            this.vidatot = n.nextInt(40) + 20;
            this.dano = n.nextInt(7) + 3;
            this.atkspeed = 2;
            break;

            case 3:
            classe = "Forte";
            //Atributos gerados que nunca serão iguais a 0
            this.vidatot = n.nextInt(70) + 30;
            this.dano = n.nextInt(15) + 5;
            this.atkspeed = 3;
            break;

        }

    }

    //Inicialização do montro pro tutorial
    protected Monstro(int vidatot, int  dano, int atkspeed, int categoria){

        vidatot = 50;  dano = 1;  atkspeed = 1; categoria = 1;

        switch(categoria){
            case 1:
            classe = "Esqueleto";
            break;

            case 2:

            break;

            case 3:

            break;

            default:

        }

    }

    public int getDano() {
        System.out.println(this.dano);
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public int getAtkspeed() {
        System.out.println(this.atkspeed);
        return atkspeed;
    }

    public void setAtkspeed(int atkspeed) {
        this.atkspeed = atkspeed;
    }

    public int getCategoria() {
        System.out.println(this.categoria);
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public int getVidatot() {
        System.out.println(this.vidatot);
        return vidatot;
    }

    public void setVidatot(int vidatot) {
        this.vidatot = vidatot;
    }

    public String getclasse() {
        System.out.println(this.classe);
        return classe;
    }

    public void setclasse(String classe) {
        this.classe = classe;
    }

}
