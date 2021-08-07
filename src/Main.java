import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double sicaklik;
        String kayak="Kayak Yapabilirsiniz.", sinema="Sinemaya Gidebilirsiniz.",
                piknik ="Pikniğe Gidebilirsiniz.", yuzme= "Yüzmeye Gidebilirsiniz.";

        System.out.print("Sıcaklığı Giriniz: ");
        sicaklik = input.nextDouble();

        if (sicaklik<5){
            System.out.println(kayak);
        }
        else if (sicaklik<=10){
            System.out.println(sinema);
        }
        else if (sicaklik<15){
            System.out.println(sinema+" "+piknik);
        }
        else if (sicaklik<=25){
            System.out.println(piknik);
        }
        else{
            System.out.println(yuzme);
        }
    }
}