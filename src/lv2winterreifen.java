import java.util.Scanner;

public class lv2winterreifen {
    public static void main(String[] args) {
        int temperatur = 0;
        boolean rutschigeFahrbahn = false;
        Scanner getData = new Scanner(System.in);

        System.out.print("Geben Sie die Temperatur ein: ");
        temperatur = getData.nextInt();

        System.out.print("Ist die Fahrbahn rutschig? (true / false) ");
        rutschigeFahrbahn = getData.nextBoolean();

        if(isWinterreifenpflicht(temperatur, rutschigeFahrbahn)){
            System.out.println("Bitte Winterreifen verwenden!");
        }
        else{
            System.out.println("Winterreifen sind nicht erforderlich.");
        }
    }

    public static boolean isWinterreifenpflicht(int temperatur, boolean rutschigeFahrbahn){
        if (temperatur < 4){
            return true;
        }
        else if ((temperatur < 10) && (rutschigeFahrbahn)){
            return true;
        }
        else{
            return false;
        }
    }
}
