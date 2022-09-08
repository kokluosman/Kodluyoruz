import java.util.Scanner;

public class Sicaklik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sıcaklık değerini giriniz: ");
        double heat = scanner.nextDouble();
        scanner.close();
        String kayak = (heat<5 ? "Kayak yapınız" :"");
        String sinema = (heat>5 && heat<15) ? "Sinemaya gidiniz" : "";
        String piknik = heat > 15 && heat <25 ? "Pikniğe gidiniz" :"";
        String yuzme = heat>25? "Yüzmeye gidiniz" : "";
        System.out.println(kayak);
        System.out.println(sinema);
        System.out.println(piknik);
        System.out.println(yuzme);
    }
}
