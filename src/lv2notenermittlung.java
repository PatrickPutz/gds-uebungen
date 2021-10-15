import java.util.Scanner;

public class lv2notenermittlung {
    public static void main(String[] args) {
        int punkte = 0;
        Scanner getData = new Scanner(System.in);

        System.out.print("Geben Sie die erreichte Punktzahl ein: ");
        punkte = getData.nextInt();

        System.out.println(getNotentext(punkte));
    }

    public static String getNotentext(int punkte){
        if ((punkte < 0) || (punkte > 100)){
            return "Punktezahl nicht möglich.";
        }
        else if(punkte >= 90){
            return "Note: Sehr Gut";
        }
        else if(punkte >= 78){
            return "Note: Gut";
        }
        else if(punkte >= 65){
            return "Note: Befriedigend";
        }
        else if(punkte >= 51){
            return "Note: Genügend";
        }
        else{
            return "Note: Nicht Genügend";
        }
    }
}
