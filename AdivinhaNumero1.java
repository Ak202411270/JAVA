import java.util.Random;
import java.util.Scanner;

public class AdivinhaNumero1 {
    public static void main(String[]args)
    {
       Scanner leia = new Scanner(System.in);
        Random random = new Random();
        int maxTentativas = 10;
        boolean acertou= false;
    System.out.println ("Escolha o modo de jogo");
    System.out.println("1. Ia adivinha o seu numero");
System.out.println("2. Voce adivinha o numero da Ia");
int modo=leia.nextInt();
leia.nextLine();

if(modo == 1){
    System.out.println("Pense em um número entre 1 e 100 e eu vou tentar descobrir");
int min= 1;
int max = 100;
int tentativas = 0;
while(! acertou && tentativas < maxTentativas)

{int palpite= (min+ max)/2;
    tentativas++;
    System.out.println("Meu palpite é:"+ palpite);
    System.out.println("Digite'maior'se o numero for maior,'menor' se o numero for menor e 'correto' se eu acertei");
    String resposta= leia.nextLine();
    if(resposta.equalsIgnoreCase("maior"))
    {min=palpite+1;
    }else if(resposta.equalsIgnoreCase("menor"))
    {max = palpite-1;
    }else if(resposta.equalsIgnoreCase("correto")){
        acertou=true;
        System.out.println("Acertei! o numero é"+ palpite);
    }else{
        System.out.println("Resposta invalida.Por favor,responda com'maior','menor' ou'correto'");
        tentativas--;
    }
if(!acertou && tentativas == maxTentativas){

    System.out.println("Não consegui adivinhar o número em"+maxTentativas+"tentativas");
}
}

    }else if(modo == 2){
        int numeroSecreto = random.nextInt(100)+1;
        int tentativas=0;
        System.out.println("Eu escolhi um número entre 1 e 100,Tente adivinhar.");

while(!acertou && tentativas<maxTentativas){

    System.out.println("Seu palpite");
    int palpite=leia.nextInt();
    leia.nextLine();
    tentativas++;
    if(palpite == numeroSecreto){
        acertou=true;
        System.out.println("Parabéns você acertou o número"+""+numeroSecreto);
    }else if(palpite < numeroSecreto){
        System.out.println("O número é maior");
    }else{
    System.out.println("O número é menor");
    }

    if(!acertou){
        int diferenca=Math.abs(palpite - numeroSecreto);
        if(diferenca>20){
            System.out.println("Vocé está muito longe!");

        }else if(diferenca>10){
            System.out.println("Você está longe");
        }else {System.out.println("Você esta perto!");

    }
    }
    if(!acertou && tentativas == maxTentativas){
        System.out.println("Suas tentativas acabaram. O numero era"+numeroSecreto+".");
    }
    
}
}else{System.out.println("Modo de jogo inválido.");
}leia.close();
}
}