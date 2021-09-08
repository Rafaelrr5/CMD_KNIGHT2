#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <windows.h>
#include <conio.h>

    char nome[50],senha[50];
    int i,respos=0,din=0,pot=2,atk=5,def=1,vidap=20,vidam=0,atkm=0,vidapat=0,vidamat=0,esp=0,loja=0,lojac=0,mons=0,exp=0,expn=50,niv=1,cont=0,npc=0;

void confirm();
void confirm(){
   printf("Tem certeza que deseja comprar esse item?\n1 para confirmar e 2 para voltar [ ]\b\b");
 }

int main()
{
    setlocale(LC_ALL,"Portuguese");

    printf("Bem vindo ao CMD KNIGHT\nPor: Rafael Rocha\n\n");

     printf("Insira seu nome de cavaleiro: ");
     gets(nome);
     fflush(stdin);

     printf("Sua jornada começa agora %s...\n",nome);
     Sleep(2000);
     system("cls");
     printf("Seus status básicos são:\nAtaque: %d\nDefesa:%d\nPo��es na bolsa: %d\nOuro na bolsa: %d\nVoc� est� no n�vel 1 e come�a sem espada e com um escudo\n",atk,def,pot,din);
     system("pause");
     system("cls");
     vidapat=vidap;
     do{
     npc=rand()%20;
     }while(npc<8);
    do{
    do{
    do{
    vidam=rand()%16;
    }while(vidam<6);
    do{
    atkm=rand()%4;
    }while(atkm<1);
    i++;
    vidamat=vidam;
    do{
    mons=rand()%4;
    }while(mons==0);

    while(vidamat>0){
    if(vidapat<=0){
        printf("Ops! Voc� morreu!\nVoc� voltar� para o in�cio com os itens comprados mas sem ouro.\n");
        system("pause");
        din=0;
        system("cls");
        return main();
    }
    switch(mons){
case 1:
    printf("Um Slime apareceu no meio do seu caminho! PV:%d/%d\nVoc� tem %d/%d PV\n\n\n",vidamat,vidam,vidapat,vidap);
    break;
case 2:
    printf("Um Orc apareceu no meio do seu caminho! PV:%d/%d\nVoc� tem %d/%d PV\n\n\n",vidamat,vidam,vidapat,vidap);
    break;
case 3:
    printf("Um Caio apareceu no meio do seu caminho! PV:%d/%d\nVoc� tem %d/%d PV\n\n\n",vidamat,vidam,vidapat,vidap);
    break;
case 4:
    printf("Um Troll apareceu no meio do seu caminho! PV:%d/%d\nVoc� tem %d/%d PV\n\n\n",vidamat,vidam,vidapat,vidap);
    break;
}
    printf("O que voc� ir� fazer?\n1- Atacar\n2- Defender\n3- Tomar po��o de vida\n4- Sair do jogo fodase\n[ ]\b\b");
    scanf("%d",&respos);
    switch(respos){
    case 1:
    vidamat=vidamat-atk;
    vidapat=vidapat-atkm;
    printf("Voc� atacou o monstro e tirou %d pontos de vida dele!\nMas � claro que n�o foi de gra�a, ele tirou %d pontos de vida seus\n",atk,atkm);
    system("pause");
    system("cls");
    break;
    case 2:
    atkm=atkm-def;
    vidapat=vidapat-atkm;
    printf("Voc� defendeu uma parte do ataque do monstro! Ele tirou %d pontos de vida seus!\n",atkm);
    system("pause");
    system("cls");
    atkm=atkm+def;
    break;
    case 3:
        if(pot==0){
            printf("Voc� n�o tem po��es!\n");
            Sleep(500);
        }

        else{
            vidapat=vidapat+10;
            pot=pot-1;
            printf("Voc� tomou uma po��o de vida! 10 pontos de vida foram adicionados � sua vida atual\n");
            system("pause");
            system("cls");
        }
        break;
    case 4:
        printf("Tem certeza de que quer sair do jogo? Digite 1 para sim e 2 para n�o.\n [ ]\b\b");
        scanf("%d",&respos);
        if(respos==1){
        return 0;
        }
        else{
        respos=0;
        system("cls");
        }
        break;
    }
    }
    din=din+rand()%10;
    exp=exp+rand()%10;
    if(exp>=expn){
        system("cls");
        niv++;
        printf("Voc� passou para o n�vel %d!",niv);
        printf("\n\nAtaque +1\nDefesa +1\nVida +2\n");
        vidap=vidap+2;
        def++;
        atk++;
        expn=expn+50;
        exp=0;
        vidapat=vidapat+2;
        system("pause");
        system("cls");
    }

    cont++;
    if(cont==npc){
        printf("Ol�! Nobre cavaleiro %s. Eu sou �edro, um mercador que aparece de 100 em 100 anos... Voc� tem sorte de eu ter te encontrado, tome 100 moedas, pois n�o h� necessidade de questionar sua honra. Adeus, boa sorte, grande %s!",nome,nome);
     din=din+100;
    }
    }while(i<5);

    i=0;
    do{
    system("cls");
    printf("Vendendor: Bom dia cavaleiro! Voc� passou 5 ondas de monstro! O que voc� deseja?\nOuro atual:%d\n\n",din);
    printf("1- Espada de bronze (5 de atk) - 20 moedas\n2- Espada de ferro (7 de atk) - 50 moedas\n3- Espada de diamante (10 de atk) - 100 moedas\n4- Po��o de vida - 10 moedas\n5- Nada, obrigado!\n[ ]\b\b");
    scanf("%d",&loja);

    switch(loja){
    case 1:
    confirm();
    scanf("%d",&lojac);
    if(lojac==1){
    if(din>=20 && esp==0){
        din=din-20;
        printf("Voc� obteve a espada de bronze! O ataque da espada foi somado aos seus status\n");
        Sleep(900);
        atk=atk+5;
        esp=1;
    }
    else{
        printf("Voc� n�o pode comprar isso! Voc� j� tem uma espada ou n�o tem dinheiro suficiente para essa.\n");
        Sleep(900);
    }
    }
    break;
    case 2:
        confirm();
        scanf("%d",&lojac);
        if(lojac==1){
            if(din>=50 && esp<2){
                din=din-50;
                printf("Voc� obteve a espada de ferro! O ataque da espada foi somado aos seus status\n");
                Sleep(500);
                if(esp==1){
                    atk=atk+2;
                    esp=2;
                }
                else{
                    atk=atk+7;
                    esp==2;
                }
            }
            else{
                printf("Voc� n�o pode comprar isso! Voc� j� tem uma espada ou n�o tem dinheiro suficiente para essa.\n");
                Sleep(900);
            }
        }
    break;
    case 3:
        confirm();
        scanf("%d",&lojac);
        if(lojac==1){
            if(din>=100 && esp<3){
                din=din-100;
                printf("Voc� obteve a espada de diamante! O ataque da espada foi somado aos seus status\n");
                Sleep(900);
                if(esp==1){
                    atk=atk+5;
                    esp=3;
                }
                else if(esp==2){
                    atk=atk+3;
                    esp==3;
                }
                else{
                    atk=atk+10;
                    esp==3;
                }
            }
        else{
            printf("Voc� n�o pode comprar isso! Voc� j� tem uma espada ou n�o tem dinheiro suficiente para essa.\n");
            Sleep(900);
            }
        }
        break;
    case 4:
        confirm();
        scanf("%d",&lojac);
        if(lojac==1){
        if(din>=10){
            din=din-10;
            pot=pot+1;
            printf("Voc� comprou uma po��o de vida\nPo��es restantes:%d\n",pot);
            Sleep(900);
        }
        else{
            printf("Voc� n�o tem dinheiro pra isso!\n");
            Sleep(900);
        }
        }
    }
    }while(loja<5);
    system("cls");
    printf("Seus status atuais s�o:\nAtaque: %d\nDefesa:%d\nPo��es na bolsa: %d\nOuro na bolsa: %d\n",atk,def,pot,din);
    switch(esp){
case 0:
    printf("Voc� tem um escudo e n�o tem espada\n");
    break;
case 1:
    printf("Voc� tem um escudo e uma espada de bronze\n");
    break;
case 2:
    printf("Voc� tem um escudo e uma espada de ferro\n");
    break;
case 3:
    printf("Voc� tem um escudo e uma espada de diamante\n");
    break;
    }
    system("pause");
    system("cls");
    vidapat=vidap;
}while(respos<4);
}
