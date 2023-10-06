import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in); //Bu sayede kullanıcıdan veri alabilicez

        int fizik,matematik,turkce,kimya,müzik,tarih;
        float ortalama;

        System.out.print("Fizik notunuz: ");
        fizik=input.nextInt();  //kullanıcıdan alınan fizik notunu buraya uyarladık

        System.out.print("Matematik notunuz: ");
        matematik=input.nextInt();

        System.out.print("Turkce notunuz: ");   //print ile println farkı "ln" eki alt satıra atıyor
        turkce=input.nextInt();

        System.out.print("Kimya notunuzu: ");
        kimya=input.nextInt();

        System.out.print("Müzik notunuzu girin: ");
        müzik=input.nextInt();

        System.out.print("Tarih notunuzu girin: ");
        tarih=input.nextInt();

            ortalama=(fizik+matematik+turkce+kimya+müzik+tarih) / 6;

            System.out.print("Ortalamanız: "+ortalama);




        }
    }
