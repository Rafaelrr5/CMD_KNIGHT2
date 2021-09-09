//Import de scanner | abrir o arquivo da música | exceção para a função do CLS | tocar a música e manipulá-la | gerar números aleatórios
import java.util.Scanner; import java.io.File; import java.io.IOException;import javax.sound.sampled.*; import java.util.Random;

public class Main{

    //Constante para senha do menu de administrador
    public static final int senha = 1234; 

    //Classe para a criação de um personagem guerreiro
    public static Personagem classeGuer(){

        Personagem user = new Personagem(1);

        return user;
    
    }

    //Classe para a criação de um personagem arqueiro
    public static Personagem classeArq(){

        Personagem user = new Personagem(1,1);

        return user;

    }

    //Limpar terminal
    public static void cls() throws IOException, InterruptedException{
        if (System.getProperty("os.name").contains("Windows")){
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        }
        else{
            Runtime.getRuntime().exec("clear");
        }
    }

    //Ativar/desativar música
    public static boolean Musiquinha(boolean musica){
        
        return musica =! musica;
        
    }

    public static void main(String[] args) throws IOException, InterruptedException, LineUnavailableException, UnsupportedAudioFileException {
  
        //Configurações para tocar a música
        File file = new File("D:/Downloads/pastas/progsjava/TrabPOO/musica.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);

        Scanner ent = new Scanner(System.in); //Criação do scanner
        String nome="", nomeclasse=""; //Nome do personagem criado e da classe para o output
        int classe=0, escolha=0, inicio=0; //Determinar a classe que será criada, escolha no menu e se ele já iniciou o jogo uma vez
        Personagem user = new Personagem(1); Personagem useradm = new Personagem(1); //Criação do personagem normal e administrador
        Personagem users[] = new Personagem[2]; //Vetor para guardar os personagens
        boolean musica=true; //Determinar a ativação e desativação da música
        Random gerador = new Random(); //Gerador de números aleatórios
        user.addInv("1", "item"); //Inicialização do futuro sistema de inventário
         
        System.out.printf("Carregando");
        for(int i=0;i<3;i++){
            System.out.printf(".");
            Thread.sleep(500);
        }

        cls();
        //Inicia a música
        clip.start(); 
        //Primeira inicialização
        System.out.println("Saudações, aventureiro! Bem vindo a...\n");

        System.out.println("  ___         ___                     ___   ___         ___         ___  ");
        System.out.println(" |     |\\ /|   | |       |  /  |\\  |   |   |     |   |   |             | ");
        System.out.println(" |     | + |   + |       |-+   | + |   +   | +-  |-+-|   +          -+-  ");
        System.out.println(" |     |   |   | |       |  \\  |  \\|   |   |   | |   |   |         |     ");
        System.out.println("  ---         ---                     ---   ---                     ---  \n\n");

        Thread.sleep(1100);

        while(escolha!=1 && escolha!=4){ //Rodar o menu para ser possível voltar para cá
        
        if(inicio!=0){
        cls();
        System.out.println("  ___         ___                     ___   ___         ___         ___  ");
        System.out.println(" |     |\\ /|   | |       |  /  |\\  |   |   |     |   |   |             | ");
        System.out.println(" |     | + |   + |       |-+   | + |   +   | +-  |-+-|   +          -+-  ");
        System.out.println(" |     |   |   | |       |  \\  |  \\|   |   |   | |   |   |         |     ");
        System.out.println("  ---         ---                     ---   ---                     ---  \n\n");
        }inicio++;
        
        //Menu principal
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
                //Variável para confirmação da senha para entrar no menu de administrador
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
                            //Criação do personagem administrador
                            users[1] = useradm;
                            System.out.println("Digite o nome do personagem: ");
                            ent.nextLine();
                            users[1].setNome(ent.nextLine());
                            System.out.println("Personagem criado! Digite enter para continuar");
                            ent.nextLine();
                            break;
                        case 2:
                            System.out.println("Pesquise o vetor do personagem para editá-lo (0 para personagem normal e 1 para criado por administrador)");
                            ent.nextLine();
                            int vetor = ent.nextInt();
                            if(vetor==0 || vetor==1){
                                cls();
                                System.out.printf("\n\nVocê entrou no menu do personagem %s, o que deseja editar?", users[vetor].getNome());
                                System.out.println("\n1 - Nivel\n2 - Ouro\n3 - Vida Total\n4 - Ataque");
                                System.out.println("5 - Defesa Total\n6 - Atack Speed\n7 - Apagar personagem\n8 - Voltar ao menu");
                                adm = ent.nextInt();

                                switch(adm){
                                    case 1:
                                        System.out.println("Defina o novo nível: ");
                                        users[vetor].setNvl(ent.nextInt());
                                        System.out.printf("Nível setado para %d no personagem %s\n\n", users[vetor].getNvl(),users[vetor].getNome());
                                        
                                        break;
                                    case 2:
                                        System.out.println("Defina o nova quantia de ouro: ");
                                        users[vetor].setOuro(ent.nextInt());
                                        System.out.printf("Ouro setado para %d no personagem %s", users[vetor].getOuro(),users[vetor].getNome());
                                    
                                        break;
                                    case 3:
                                        System.out.println("Defina a nova vida total: ");
                                        users[vetor].setVidatotal(ent.nextInt());
                                        System.out.printf("Vida setada para %d no personagem %s", users[vetor].getVidatotal(),users[vetor].getNome());
                                   
                                        break;
                                    case 4:
                                        System.out.println("Defina o novo ataque total: ");
                                        users[vetor].setAtktotal(ent.nextInt());
                                        System.out.printf("Ataque setado para %d no personagem %s", users[vetor].getAtktotal(),users[vetor].getNome());
                                    
                                        break;
                                    case 5:
                                        System.out.println("Defina a nova defesa total: ");
                                        users[vetor].setDeftotal(ent.nextInt());
                                        System.out.printf("Defesa setada para %d no personagem %s", users[vetor].getDeftotal(),users[vetor].getNome());
                                    
                                        break;
                                    case 6:
                                        System.out.println("Defina o novo atack speed: ");
                                        users[vetor].setAtkspeedtotal(ent.nextInt());
                                        System.out.printf("Atack speed setado para %d no personagem %s", users[vetor].getAtkspeedtotal(),users[vetor].getNome());
                                    
                                        break;
                                    case 7:
                                        users[vetor] = null;
                                    break;
                                    case 8:
                                    break;
                                    default:
                                    System.out.println("Opção inválida, voltando ao menu...");
                                    Thread.sleep(1500);
                                }
                            
                            }

                            else{
                                System.out.println("Digite uma posição válida, clique enter para voltar");
                                ent.nextLine();
                                break;
                            }

                        break;
                        case 3:
                        break;
                        default:
                        System.out.println("Opção inválida");
                        Thread.sleep(500);
                    }
                    
                }

                else{

                    System.out.println("Senha inválida, pressione enter para voltar ao menu");
                    ent.nextLine();
                    break;
                }

            default:
        }

    }

        System.out.printf("Qual o seu nome, nobre cavaleiro?\n-> ");
        ent.nextLine();
        nome = ent.nextLine();
        
        //While para caso o usuário não escolha uma das opções disponíveis
        while(classe < 1 || classe > 2){
        cls();
        System.out.printf("Quase lá %s, escolha sua classe:",nome);
        System.out.println("\n\n1 - Guerreiro || 2 - Arqueiro");
        classe = ent.nextInt();

        switch(classe){
            case 1:
            user = classeGuer();
            users[0] = user;
            nomeclasse = "Guerreiro";
            break;
            case 2:
            user = classeArq();
            users[0] = user;
            nomeclasse = "Arqueiro";
            break;
            default:
            System.out.println("Escolha uma classe válida");

        }
    }

        System.out.printf("%s, sua aventura começa agora...", nome);

        Thread.sleep(2000);

        cls();
    
        //Atributos iniciais da classe escolhida   
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