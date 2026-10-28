import java.util.Scanner;

public class L9E4 {
    
    int n;
    
    public static char verificar(int numero) {
        
        if(numero > 0) {
            return 'P';
        }
        
        else {
            return 'N';
        }
        
    }
 
    public static void main(String[] args) {
        
        int a;
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite um número:");
        a = leia.nextInt();
        
        System.out.println(verificar(a));
    }
}
