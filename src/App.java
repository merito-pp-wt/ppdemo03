import java.util.Scanner;
public class App {
    public void readDataInt() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Podaj cenę netto: ");
        int netto = sc.nextInt();
        System.out.print("Podaj stawkę VAT: ");
        int vat = sc.nextInt();

        int cenaZVat = (100 + vat) * netto / 100;
        System.out.println("Cena brutto: " + cenaZVat);
    }

    public void readDataDouble() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Podaj cenę netto: ");
        double netto = sc.nextDouble();
        System.out.print("Podaj stawkę VAT: ");
        double vat = sc.nextDouble();

        double cenaZVat = (1.0 + vat / 100.0 ) * netto ;
        System.out.println("Cena brutto: " + cenaZVat);
    }
}
