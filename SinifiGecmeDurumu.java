import java.util.Scanner;

public class SinifiGecmeDurumu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mat,fiz,turk,kim,müz;
        System.out.println("Matematik,fizik,türkçe,kimya,müzik dersi notlarınızı sırasıyla giriniz");
        mat = scanner.nextInt();
        fiz = scanner.nextInt();
        turk = scanner.nextInt();
        kim = scanner.nextInt();
        müz = scanner.nextInt();
        scanner.close();

        if(mat < 0  || mat >100) mat =0;
        if(fiz < 0  || fiz >100) fiz =0;
        if(turk <0  || turk >100) turk =0;
        if(kim < 0  || kim >100) kim =0;
        if(müz < 0  || müz >100) müz =0;

        double ort = (mat+müz+fiz+turk+kim)/5;
        System.out.println(ort >55 ? "Geçtiniz" : "Kaldınız");

    }
}
