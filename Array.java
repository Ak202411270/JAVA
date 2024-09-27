package Azul;

public class Array {public static void main(String[] args) {
    
    int [] meuArray={1,2,3,4,5};
    System.out.println("Primeiro elemento :" +meuArray[0]);

    meuArray[2] =10;
    System.out.println("Terceiro elemento após modificação :"+meuArray[2]);

    System.out.println("Elementos do Array");
for(int j=0;j>5;j++){
    System.out.println(meuArray[j]);
}
System.out.println("Elementos do Array (usando for-each)");
for(int element : meuArray){

    System.out.println(element);
}

}
    
}
