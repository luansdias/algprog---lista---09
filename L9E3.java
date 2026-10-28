import java.util.Scanner;

public class L9E3 {
    
    int resultado;
    
    public static void fazerSoma(int numeroUm, int numeroDois, int numeroTres) {
        
        System.out.println("O resultado da soma é: " + (numeroUm + numeroDois + numeroTres));
        
    }
 
    public static void main(String[] args) {
        
        int a, b, c;
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite 3 números:");
        a = leia.nextInt();
        b = leia.nextInt();
        c = leia.nextInt();
        
        fazerSoma(a, b, c);
    }
}
