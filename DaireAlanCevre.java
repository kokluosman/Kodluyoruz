import java.util.Scanner;
public class DaireAlanCevre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dairenin yarıçapını giriniz.");
        double r = scanner.nextDouble();
        double alan = r*r*Math.PI;
        double cevre = 2*Math.PI*r;
        System.out.print("Eğer isterseniz derece olarak hesaplanmak istediğiniz açı değerini giriniz. Hepsinin hesaplanmasını istiyorsanız 360 değerini giriniz");
        double aci = scanner.nextDouble();
        scanner.close();
        alan = (aci*alan)/360;
        System.out.print("Alan: "+alan+" Cevre: "+cevre);
    }
}
