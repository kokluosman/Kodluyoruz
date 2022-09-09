import java.util.Scanner;

public class ATMApps {
    public static void main(String[] args) {
        String id;
        int password;
        boolean choose = true ;
        int balance=1000;
        while(choose){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Kullanıcı adı giriniz.");
            id= scanner.nextLine();
            System.out.println("Şifre Giriniz");
            password = scanner.nextInt();
           if((password == 1) && (id == "a")){
                System.out.println("Yapmak istediğiniz işlemi seçiniz.");
                System.out.println("'1': Para çekmek\n'2': Para Yatırma\n'3': Bakiye Sorgulama\nÇıkmak için '9' basınız.");
                int sec = scanner.nextInt();
                if(sec == 9){
                    break;
                }else {
                    switch (sec) {
                        case 1:
                            int miktar = scanner.nextInt();
                            if(miktar>balance){
                                System.out.println("Yetersiz Bakiye");
                            }else{
                                balance = balance - miktar;
                                System.out.println("Çekilen tutar: " + miktar+ "TL'dir." +"\nKalan Bakiye "+balance+"TL'dir.");
                            }
                            break;
                        case 2:
                        int para = scanner.nextInt();
                        balance = para + balance;
                        System.out.println("Güncel tutar: " + balance + "TL'dir.");
                        case 3:
                        System.out.println("Güncel Bakiye = " + balance + "TL'dir.");
                        default:
                        System.out.println("Yanlış seçim yapıldı.");
                            break;
                    }

        
                }

                }else{
                System.out.println("Yanlış Şifre Girdiniz. Tekrar deneyiniz");
                scanner.close();
                }
            }
        }
    }
