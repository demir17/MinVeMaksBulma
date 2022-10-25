import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, min= 0,maks= 0 ;

        System.out.print("Kaç tane sayı gireceksiniz? ");
        n = sc.nextInt();

        for(int i =1; i<= (n); i++){
            System.out.print(i + "Sayi giriniz.");
            int temp1 = sc.nextInt();

            if(i == 1){
                min = temp1;
                maks = temp1;
            }
            else if (temp1 > maks) {
                maks = temp1;
            }
            else if (temp1 < min) {
                min = temp1;

            }


        }

        System.out.print("En büyük Sayı: " + maks);
        System.out.println();
        System.out.print("En küçük sayı: " + min);


    }
}
