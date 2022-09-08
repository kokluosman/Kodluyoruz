import java.util.Scanner;
public class LoginContreller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kullanıcı Adını Giriniz: ");
        String id = scanner.nextLine();
        System.out.println("Şifrenizi Giriniz: ");
        String pw = scanner.nextLine();
        System.out.println(pw);

        if((id == "osman")&&(pw=="1234")){
            System.out.println("Sisteme Giriş Yapıldı.");
        }else{
            System.out.println("Şifrenizi sıfırlamak ister misiniz? (Evet için 'e' ye Hayır için 'h' ye basınız.)");
            String kar=scanner.nextLine();
            if(kar == "h"){
                System.out.println("Sisteme Giriş Yapılamadı. ");
            }else if(kar == "e"){
                System.out.println("Şifrenizi Giriniz: ");
                String data = scanner.nextLine();
                if(data == "1234"){
                    System.out.println("Şifreniz Eski Şifrenizle aynı olamaz: ");

                }else{
                    pw =data ;
                    System.out.println("Şifreniz Değiştirildi. ");
                }
            }else{
                System.out.println("Yanlış giriş yaptınız.");
            }
            
        }
        scanner.close();
    }
}
