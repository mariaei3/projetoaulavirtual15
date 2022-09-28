import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o quanto você ganha por hora : ");
        double salariohora = sc.nextDouble();

        System.out.println("Entre com o número de horas trabalhadas no mês : ");
        double horasmensais = sc.nextDouble();

        double salariobruto = salariohora * horasmensais;
        System.out.println("Salário Bruto: " + salariobruto);

        double desctir = ((salariobruto / 100) * 11);
        System.out.println("Imposto de Renda: " + desctir);

        double desctinss = ((salariobruto / 100) * 8);
        System.out.println("Desconto INSS: " + desctinss);

        double desctsind = ((salariobruto / 100) * 5);
        System.out.println("Desconto Sindicato: " + desctsind);

        double salarioliquido = salariobruto - desctir - desctinss - desctsind;
        System.out.println("Salário Liquído: " + salarioliquido);

    }
}