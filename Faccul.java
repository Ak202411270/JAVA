package Azul;

import java.util.Scanner;

public class Faccul {
    public static void main(String[] args) {
       float[][]notas=new float[4][4];
       float[] vetorDP=new float[4];
       Scanner leia=new Scanner(System.in); 
int i,j,k=0;
float maiorDP,menorDS;
for(i=0;i<4;i++){
    for(j=0;j<4;j++){
System.out.println("Digite o elemento("+i+"-"+j+")da matriz");
notas[i][j]=leia.nextFloat();
    }
}
System.out.println("\nMatriz digitada: \n");
for(i=0;i<4;i++){
System.out.println("\n");
for(j=0;j<4;j++){
    System.out.println(notas[i][j]+"\t");
}

}maiorDP = notas[0][0];
System.out.println("\nNotas da Diagonal Principal: \n");
for(i=0;i<4;i++){
    for(j=0;j<4;j++){
        if(i==j){
            vetorDP[k] = notas[i][j];  k++;
            System.out.println(notas[i][j]+"\t");
            if(notas[i][j]>maiorDP){
                maiorDP=notas[i][j];
            }
        }
    }
}
menorDS=notas[0][3];
System.out.println("\nNotas Diagonal Secundaria: \n");
for(i=0;i<4;i++){
for(j=0;j<4;j++){
    if(i+j==3){
        System.out.println(notas[i][j]+"\t");
        if(notas[i][j]<menorDS){
            menorDS=notas[i][j];
        }
    }
}

}System.out.println("\nMaior nota da DP"+ maiorDP);
System.out.println("\nMenor nota da Ds:"+menorDS);
System.out.println("\n Notas carregadas no vetorDP:");
for(k=0;k<4;k++){
    System.out.println(vetorDP[k]+"\t");
}
    }
    
}
