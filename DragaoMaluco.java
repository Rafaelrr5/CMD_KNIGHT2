import java.util.Random;

//Classe de boss que o jogador encontraria em determinada parte do jogo (decidida pelo administrador, não aleatório)
public class DragaoMaluco implements Boss{

    int ataquebase = 100, atkspeed = 4;
    double vidatot = 200;

    //Cálculo do padrão de ataques do boss em cada turno com base no dano e na categoria de seu ataque
    public int ataque(int ataquebase, int atkspeed){
        Random n = new Random();
        int dano=0;
        
        int categoria = (n.nextInt(2) + 1);
        switch (categoria){
            case(1):
            System.out.println("Dragão Maluco gira sua cauda e te joga para longe!");
            dano = ataquebase * 2;
            break;

            case(2):
            System.out.println("Dragão Maluco te joga fogo e te põe em chamas!");
            dano = ataquebase * 4;
            break;
        }
        
        return dano;
    }

    //Cálculo da regeneração do boss a cada 2 turnos de batalha com base em sua vida máxima
    public void regeneracao(double vidatot){

        this.vidatot = this.vidatot + (this.vidatot * 0.2);

    }

    public int getAtaquebase() {
        System.out.println(this.ataquebase);
        return ataquebase;
    }

    public void setAtaquebase(int ataquebase) {
        this.ataquebase = ataquebase;
    }

    public int getAtkspeed() {
        System.out.println(this.atkspeed);
        return atkspeed;
    }

    public void setAtkspeed(int atkspeed) {
        this.atkspeed = atkspeed;
    }

    public double getVidatot() {
        System.out.println(this.vidatot);
        return vidatot;
    }

    public void setVidatot(double vidatot) {
        this.vidatot = vidatot;
    }
    

    
}
