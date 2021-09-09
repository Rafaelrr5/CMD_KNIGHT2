public class Monstro {
    
    private int categoria, vidatot, dano, atkspeed;
    private String nome;

    //Inicialização do montro pegando parâmetros gerados aleatoriamente
    protected Monstro(int categoria, int vida, int vidaat, int dano, int atkspeed){

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

    //Inicialização do montro pro tutorial
    protected Monstro(){

        this.vidatot = 50; this.dano = 1; this.atkspeed = 1; this.categoria = 1;
        
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
