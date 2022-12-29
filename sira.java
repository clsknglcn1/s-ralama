import java.util.Arrays;
import java.util.Scanner;
public class sira {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("dizinin uzunlugunu giriniz:");
        int uzunluk= input.nextInt();
        int []arr= new int [uzunluk];
        for (int i =0; i<uzunluk;i++){
            System.out.println("enter the"+ (i+1)+".number");
            int a = input.nextInt();
            arr[i]=a;

        }
        Arrays.sort(arr);
        System.out.println("sayıların sıralaması:"+Arrays.toString(arr));

    }
}
