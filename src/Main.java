public class Main {
    public static void main(String[] args) {


        isLysHere(false);
        isLysHere(true);
    }

    private static void isLysHere(boolean isAlyssaHere) {
        if(isAlyssaHere){
            System.out.println("Hello world!, I'm here");
        }
        else{
            System.out.println("I'm not here. Or Maybe I am");
        }
    }
}