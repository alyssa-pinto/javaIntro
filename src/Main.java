
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        isLysHere(false);
        isLysHere(true);
    }

    private static void isLysHere(boolean isAlyssaHere) {
        LocalDate currentTime = LocalDate.now();
        if(isAlyssaHere){
            System.out.println("Hello world!, I'm here and today is: " + currentTime.getDayOfWeek());
        }
        else{
            System.out.println("I'm not here. Or Maybe I am");
        }
    }
}