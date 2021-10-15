import java.util.Scanner;

public class lv2turmrechnen {
    public static void main(String[] args) {
        int specifiedNumber = 0;
        int multiplier = 2;
        int divisor = 9;
        Scanner getData = new Scanner(System.in);

        System.out.print("Geben Sie die gewünschte Zahl ein: ");
        specifiedNumber = getData.nextInt();

        System.out.println(specifiedNumber);
        while(multiplier <= 9){
            System.out.println((specifiedNumber * multiplier));
            specifiedNumber *= multiplier;
            multiplier++;
        }
        while(divisor >= 2){
            System.out.println((specifiedNumber / divisor));
            specifiedNumber /= divisor;
            divisor--;
        }
    }
}
