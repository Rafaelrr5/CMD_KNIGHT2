import java.util.Scanner;
import java.io.File;import java.io.IOException;import javax.sound.sampled.*;
import java.util.Random; 
public class Main{

    public static final int senha = 1234; //constante

    public static Personagem classeGuer(){

        Personagem user = new Personagem(1);

        return user;
    
    }

    public static Personagem classeArq(){

        Personagem user = new Personagem(1,1);

        return user;

    }

    public static void cls() throws IOException, InterruptedException{
        if (System.getProperty("os.name").contains("Windows")){
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        }
        else{
            Runtime.getRuntime().exec("clear");
        }
    }

    public static boolean Musiquinha(boolean musica){
        
        return musica =! musica;
        
    }

    public static void main(String[] args) throws IOException, InterruptedException, LineUnavailableException, UnsupportedAudioFileException {
  
        File file = new File("D:/Downloads/pastas/progsjava/TrabPOO/musica.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);

        Scanner ent = new Scanner(System.in);
        String nome="", nomeclasse="";
        int classe=0, escolha=0, inicio=0;
        Personagem user = new Personagem(1); Personagem useradm = new Personagem(1); 
        Personagem users[] = new Personagem[5];
        boolean musica=true;
        Random gerador = new Random();
        user.addInv("1", "item");
        
        System.out.printf("Carregando");
        for(int i=0;i<3;i++){
            System.out.printf(".");
            Thread.sleep(500);
        }

        cls();
        clip.start();
        System.out.println("Saudações, aventureiro! Bem vindo a...\n");

        System.out.println("  ___         ___                     ___   ___         ___         ___  ");
        System.out.println(" |     |\\ /|   | |       |  /  |\\  |   |   |     |   |   |             | ");
        System.out.println(" |     | + |   + |       |-+   | + |   +   | +-  |-+-|   +          -+-  ");
        System.out.println(" |     |   |   | |       |  \\  |  \\|   |   |   | |   |   |         |     ");
        System.out.println("  ---         ---                     ---   ---                     ---  \n\n");

        Thread.sleep(1100);

        while(escolha!=1 && escolha!=4){
        
        if(inicio!=0){
        cls();
        System.out.println("  ___         ___                     ___   ___         ___         ___  ");
        System.out.println(" |     |\\ /|   | |       |  /  |\\  |   |   |     |   |   |             | ");
        System.out.println(" |     | + |   + |       |-+   | + |   +   | +-  |-+-|   +          -+-  ");
        System.out.println(" |     |   |   | |       |  \\  |  \\|   |   |   | |   |   |         |     ");
        System.out.println("  ---         ---                     ---   ---                     ---  \n\n");
        }inicio++;
        
        System.out.println("Este é o menu principal! Escolha sabiamente uma opção:");
        System.out.printf("1 - Iniciar o jogo\n");
        System.out.printf("2 - Ativar/Desativar música\n");
        System.out.printf("3 - Créditos\n");
        System.out.printf("4 - Sair do jogo\n");
        System.out.printf("5 - Acesso Restrito\n\n");
        System.out.printf("Sua escolha: [ ]\b\b");

        escolha = ent.nextInt();
        

        switch (escolha) {
            case 1:
                break;
            case 2:
                musica = Musiquinha(musica);
                if(musica){
                    clip.start();
                }
                else{
                    clip.stop();
                }

                break;
            case 3:
                cls();
                System.out.println("   _________         _________                                              ");
                System.out.println("  /         \\       /         \\                       ___                                             ___   ___   ___                          ");
                System.out.println(" /  /~~~~~\\  \\     /  /~~~~~\\  \\                     |   |              |  /        |                 | |   | |   | |                          ");
                System.out.println(" |  |     |  |     |  |     |  |                     |   |    --        |-+    -    |-    |-     -     -+-   -+-   -+-                         ");
                System.out.println(" |  |     |  |     |  |     |  |                     |   |     \\        |  \\  | |   | |   |     | |     | |   | |   | |                        ");
                System.out.println(" |  |     |  |     |  |     |  |         /            ---     --               -     -           --    ---   ---   ---                         ");
                System.out.println(" |  |     |  |     |  |     |  |       //                                   ");
                System.out.println("(o  o)    \\  \\_____/  /     \\  \\_____/ /             Integrantes do grupo: Rafael Rocha e Pedro Freitas                      ");
                System.out.println(" \\__/      \\         /       \\        /              Voluntário humilde: Caio Rangel                      ");
                System.out.println("  |         ~~~~~~~~~         ~~~~~~~~                                      ");
                System.out.println("  ^");
                
                System.out.println("Pressione enter para voltar ao menu");
                ent.nextLine();
                ent.nextLine();
                break;
            case 4:
                System.exit(0);
                break;
            case 5:
                System.out.println("Você está prestes a entrar no menu de administrador, digite a senha para continuar"); 
                int senhaconf = ent.nextInt();
                ent.nextLine();

                if(senhaconf == senha){
                    cls();
                    System.out.println("Você entrou no menu de administrador, o que você deseja fazer?");
                    System.out.println("1 - Criar um personagem administrador");
                    System.out.println("2 - Editar um personagem");
                    System.out.println("3 - Voltar");
                    System.out.printf("\nSua escolha: [ ]\b\b");
                    int adm = ent.nextInt();

                    switch(adm){
                        case 1:
                            System.out.println("Digite o nome do personagem: ");
                            ent.nextLine();
                            String nomeadm = ent.nextLine();
                            useradm.setNome(nomeadm);
                            System.out.println("Personagem criado! Digite enter para continuar");
                            ent.nextLine();
                            break;
                        case 2:
                            System.out.println("Pesquise o nome do personagem para editá-lo");
                            ent.nextLine();
                            nomeadm = ent.nextLine();
                            if(nomeadm.equals(user.getNome())  || nomeadm.equals(useradm.getNome()) ){
                                cls();
                                System.out.printf("\n\nVocê entrou no menu do personagem %s, o que deseja editar?", nome);
                                System.out.println("\n1 - Nivel\n2 - Ouro\n3 - Vida Total\n4 - Ataque");
                                System.out.println("5 - Defesa Total\n6 - Atack Speed\n7 - Apagar personagem");
                                adm = ent.nextInt();
                                if(nomeadm.equals(user.getNome())){
                                switch(adm){
                                    case 1:
                                        System.out.println("Defina o novo nível: ");
                                        user.setNvl(ent.nextInt());
                                        System.out.printf("Nível setado para %d", user.getNvl());
                                    break;
                                    case 2:
                                        System.out.println("Defina o nova quantia de ouro: ");
                                        user.setOuro(ent.nextInt());
                                        System.out.printf("Ouro setado para %d", user.getOuro());
                                    break;
                                    case 3:
                                        System.out.println("Defina a nova vida total: ");
                                        user.setVidatotal(ent.nextInt());
                                        System.out.printf("Vida setada para %d", user.getVidatotal());
                                    break;
                                    case 4:
                                        System.out.println("Defina o novo ataque total: ");
                                        user.setAtktotal(ent.nextInt());
                                        System.out.printf("Ataque setado para %d", user.getAtktotal());
                                    break;
                                    case 5:
                                        System.out.println("Defina a nova defesa total: ");
                                        user.setDeftotal(ent.nextInt());
                                        System.out.printf("Defesa setada para %d", user.getDeftotal());
                                    break;
                                    case 6:
                                        System.out.println("Defina o novo atack speed: ");
                                        user.setAtkspeedtotal(ent.nextInt());
                                        System.out.printf("Atack speed setado para %d", user.getAtkspeedtotal());
                                    break;
                                    case 7:
                                        user = null;
                                    break;
                                    default:
                                }
                                
                            }
                            
                                else if(nomeadm.equals(useradm.getNome())){
                                switch(adm){
                                    case 1:
                                        System.out.println("Defina o novo nível: ");
                                        useradm.setNvl(ent.nextInt());
                                        System.out.printf("\nNível setado para %d!\n", useradm.getNvl());
                                    break;
                                    case 2:
                                        System.out.println("Defina o nova quantia de ouro: ");
                                        useradm.setOuro(ent.nextInt());
                                        System.out.printf("\nOuro setado para %d\n", useradm.getOuro());
                                    break;
                                    case 3:
                                        System.out.println("Defina a nova vida total: ");
                                        useradm.setVidatotal(ent.nextInt());
                                        System.out.printf("\nVida setada para %d\n", useradm.getVidatotal());
                                    break;
                                    case 4:
                                        System.out.println("Defina o novo ataque total: ");
                                        useradm.setAtktotal(ent.nextInt());
                                        System.out.printf("\nAtaque setado para %d\n", useradm.getAtktotal());
                                    break;
                                    case 5:
                                        System.out.println("Defina a nova defesa total: ");
                                        useradm.setDeftotal(ent.nextInt());
                                        System.out.printf("Defesa setada para %d\n", useradm.getDeftotal());
                                    break;
                                    case 6:
                                        System.out.println("Defina o novo atack speed: ");
                                        useradm.setAtkspeedtotal(ent.nextInt());
                                        System.out.printf("\nAtack speed setado para %d\n", useradm.getAtkspeedtotal());
                                    break;
                                    case 7:
                                        useradm = null;
                                    break;
                                    default:
                                }
                            }
                            
                            }

                            else{
                                System.out.println("Não existe nenhum personagem criado com esse nome, digite enter pra voltar ao menu");
                                ent.nextLine();
                                break;
                            }

                        break;
                        case 3:
                        break;
                        default:
                    }
                    
                }

                else{

                    System.out.println("Senha inválida, pressione enter para voltar ao menu");
                    ent.nextLine();
                    break;
                }

            default:
            System.out.println("Insira um número válido!");
            Thread.sleep(1000);
            break;
        }

    }

        System.out.printf("Qual o seu nome, nobre cavaleiro?\n-> ");
        ent.nextLine();
        nome = ent.nextLine();
        
        while(classe < 1 || classe > 2){
        cls();
        System.out.printf("Quase lá %s, escolha sua classe:",nome);
        System.out.println("\n\n1 - Guerreiro || 2 - Arqueiro");
        classe = ent.nextInt();

        switch(classe){
            case 1:
            user = classeGuer();
            nomeclasse = "Guerreiro";
            break;
            case 2:
            user = classeArq();
            nomeclasse = "Arqueiro";
            break;
            default:
            System.out.println("Escolha uma classe válida");

        }
    }

        System.out.printf("%s, sua aventura começa agora...", nome);

        Thread.sleep(2000);

        cls();
    
        System.out.printf("Seus status no nível %d como %s são:\n\nAtaque - %d\nDefesa - %d\nVida - %d\nVelocidade de Ataque: %d\nOuro na Bolsa: %d",
        user.getNvl(),nomeclasse,user.getAtktotal(),user.getDeftotal(),user.getVidatotal(),user.getAtkspeedtotal(),user.getOuro()); 

        System.out.println("\n\nPressione enter pra continuar");
        ent.nextLine();
        
        System.out.println("Ok, estamos quase prontos para a batalha. Deseja fazer o tutorial?\n1 - Sim!\n2 - Não, obrigado");
        escolha = ent.nextInt();

        switch(escolha){
            case 1:
                cls();
                Batalha tutorial = new Batalha(user,0,0);
                tutorial.Loot();
            break;

            case 2:

            break;

            default:
            break;
        }

        ent.close();
    }
  }