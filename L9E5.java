import java.util.Scanner;

public class L9E5 {
    
    public static double somaImposto(double taxaImposto, double custo) {
        return custo * taxaImposto;
    }
  
    public static void main(String[] args) {
     
     Scanner leia = new Scanner(System.in);
     
     double valor;
     double imposto;
     
     System.out.println("Digite o valor original do produto:");
     valor = leia.nextDouble();
     
     while(valor <=0) {
         System.out.println("O valor precisa ser maior que 0.");
         valor = leia.nextDouble();
     }
     
     System.out.println("Digite a taxa do imposto:");
     imposto = leia.nextDouble();
     
     while(imposto <= 0) {
         System.out.println("O valor precisa ser maior que 0.");
         imposto = leia.nextDouble();
     }
     
     double imp = imposto;
     
     imposto = imposto / 100;
     double preco = valor + somaImposto(imposto, valor);
     
     System.out.println("====RESULTADOS====");
     System.out.println("Valor original do produto R$: " + valor);
     System.out.println("Taxação: " + imp + "%");
     System.out.println("Valor com impostos R$: " + preco);
    }
}
