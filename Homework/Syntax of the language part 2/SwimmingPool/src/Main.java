public class Main {
    public static void main(String[] args) {
        int volume = 1200;
        int fillingSpeed = 30;
        int devastationSpeed = 10;
        int currentPoolVolume = 0;
        int time = 0;
        while (true) {
            time++;
            currentPoolVolume += fillingSpeed - devastationSpeed;

            if (currentPoolVolume >= volume) {
                System.out.println("Время наполнения: " + time + " минут");
                break;
            }
        }
    }
}