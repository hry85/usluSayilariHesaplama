import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n,k;
        Scanner sc=new Scanner(System.in);
        System.out.print("Ussu alinacak sayi : ");
        n=sc.nextInt();
        System.out.print("Us olacak sayi : ");
        k=sc.nextInt();
        int total=1;

        int i=1;
        while (i<=k){
            total*= n;
            i++;
        }
        System.out.println("Sonuc : " +total);
        System.out.println("---------------------");
        //for dongusuyle hesaplama
        int m,r;
        Scanner input=new Scanner(System.in);
        System.out.print("Sayiyi giriniz : " );
        m=input.nextInt();
        System.out.print("Ussu giriniz : ");
        r=input.nextInt();

        int result=1;

        for (int j=1;j<=r;j++){
            result*=m;

        }
        System.out.println("Cevap : " +result);
    }
}
