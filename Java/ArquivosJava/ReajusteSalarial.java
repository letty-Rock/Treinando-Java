import java.util.Scanner;

public class ReajusteSalarial {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in); 
        System.out.println("Digite seu salário");
        int salario = sc.nextInt();
        Double percentual = 15.0/100;
        Double reajust = salario + (percentual * salario);

        System.out.println("Seu salário antes do reajuste era: "+ salario);
        System.out.println("Com o reajuste de 7% seu novo salário é: R$"+reajust);
      sc.close(); 
    }
}
