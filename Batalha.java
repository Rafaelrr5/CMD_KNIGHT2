import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.io.IOException;

public class Batalha {
    
    //Todas as variáveis que serão mudadas no meio da batalha
    public static int vidamonstro=30, vidaplayer=30;
    int escolha, confirma, atkmonstro, atkplayer, verifica=0;
    Random gerador = new Random();

    //Cria um histórico infinito de quais monstros você já matou
    ArrayList <String> hist = new ArrayList<String>();

    protected Batalha(Personagem user, int escolha) throws IOException, InterruptedException{

        Esqueleto novo = new Esqueleto();
        Scanner ent = new Scanner(System.in);
        vidamonstro = novo.getVidatot();
        vidaplayer = user.getVidatotal();

        System.out.printf("Você encontrou um %s com %d de vida!", novo.getNome(),novo.getVidatot());

        while(vidamonstro>0 || vidaplayer>0){
        System.out.printf("\n\n%s com %d/%d de vida || Você tem %d/%d de vida", novo.getNome(), vidamonstro, novo.getVidatot(),
        vidaplayer, user.getVidatotal());
        System.out.println("\n\n1 - Atacar\n2 - Bolsa\n3 - Fugir da batalha");
        escolha = ent.nextInt();

        switch(escolha){
            case 1:
                //Intervalo para a geração do número aleatório 
                vidamonstro = vidamonstro - gerador.nextInt((user.getAtktotal() - (user.getAtktotal() - 10)) + (user.getAtktotal()-10));

            break;

            case 2:

            break;

            case 3:

            break;

            default:
            cls();
            System.out.println("\nEscolha uma opção válida!");
        }

        vidaplayer = vidaplayer - novo.getDano();

        if(vidamonstro<=0){
            System.out.println("Boa cria");

           //Adiciona monstro ao histórico de abates 
            hist.add(novo.getNome());
            break;
        }

        if(vidaplayer<=0){
            System.out.println("Morreu cria");
            break;
        }

    }
        ent.close();
    
    }

    //Batalha do tutorial
    protected Batalha(Personagem user, int confirma, int escolha){ 

        Esqueleto novo = new Esqueleto();
        Scanner ent = new Scanner(System.in);
        vidamonstro = novo.getVidatot();
        vidaplayer = user.getVidatotal();

        System.out.printf("Você encontrou um %s com %d de vida!", novo.getNome(),novo.getVidatot());

        while(vidamonstro>0 || vidaplayer>0){
        System.out.printf("\n\n%s com %d/%d de vida || Você tem %d/%d de vida", novo.getNome(), vidamonstro, novo.getVidatot(),
        vidaplayer, user.getVidatotal());
        System.out.println("\n\n1 - Atacar\n2 - Bolsa\n3 - Fugir da batalha");
        escolha = ent.nextInt();

        switch(escolha){
            case 1:
                //Intervalo para a geração do número aleatório 
                vidamonstro = vidamonstro - gerador.nextInt((user.getAtktotal() - (user.getAtktotal() - 10)) + (user.getAtktotal()-10));

            break;

            case 2:

            break;

            case 3:

            break;

            default:

        }

        vidaplayer = vidaplayer - novo.getDano();

        if(vidamonstro<=0){
            System.out.println("Boa cria");
            break;
        }

        if(vidaplayer<=0){
            System.out.println("Morreu cria");
            break;
        }

    }
        ent.close();
        
    }

    public void Loot(){
        
    }

    public int getEscolha() {
        return escolha;
    }

    public void setEscolha(int escolha) {
        this.escolha = escolha;
    }

    public int getConfirma() {
        return confirma;
    }

    public void setConfirma(int confirma) {
        this.confirma = confirma;
    }

    public int getVidamonstro() {
        return vidamonstro;
    }

    public int getVidaplayer() {
        return vidaplayer;
    }

    public int getAtkmonstro() {
        return atkmonstro;
    }

    public void setAtkmonstro(int atkmonstro) {
        this.atkmonstro = atkmonstro;
    }

    public int getAtkplayer() {
        return atkplayer;
    }

    public void setAtkplayer(int atkplayer) {
        this.atkplayer = atkplayer;
    }

    public Random getGerador() {
        return gerador;
    }

    public void setGerador(Random gerador) {
        this.gerador = gerador;
    }

    public static void cls() throws IOException, InterruptedException{
        if (System.getProperty("os.name").contains("Windows")){
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        }
        else{
            Runtime.getRuntime().exec("clear");
        }
    }

}
