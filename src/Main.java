import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String username, password;
        String d_password,new_password,ekran;
        d_password="java";
        Scanner input = new Scanner(System.in);
        System.out.println("Kullanıcı Adınız: ");
        username = input.nextLine();

        System.out.println("Şifreniz: ");
        password = input.nextLine();

        if(username.equals("patika") && password.equals("java"))
        {
            System.out.println("Giriş yaptınız!");
        }
        else if(username.equals("patika"))
        {
            if(!(password.equals("java")))
            {
                System.out.println("Şifreniz hatalı!");
                System.out.println("Şifrenizi sıfırlamak istiyorsanız ekrana Evet yazınız");
                ekran = input.nextLine();

                if(ekran.equals("Evet"))
                {
                    System.out.println("Yeni şifrenizi giriniz!");
                    new_password=input.nextLine();

                    if((new_password==password) || (new_password==d_password) )
                    {
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");

                    }
                    else
                    {
                        d_password=new_password;
                        System.out.println( "Şifre oluşturuldu" );
                    }
                }
            }
        }
        else
        {
            System.out.println("Bilgileriniz yanlış!");
        }

    }
}