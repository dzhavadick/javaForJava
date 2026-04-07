public class Main {
    public static void main(String[] args) {
        int vasyaAge = 53;
        int katyaAge = 34;
        int mishaAge = 58;

        int min = -1;
        int middle = -1;
        int max = -1;

        if (vasyaAge <= katyaAge && vasyaAge <= mishaAge) {
            min = vasyaAge;
            if (katyaAge <= mishaAge) {
                middle = katyaAge;
                max = mishaAge;
            } else {
                middle = mishaAge;
                max = katyaAge;
            }
        }

        if (katyaAge <= vasyaAge && katyaAge <= mishaAge) {
            min = katyaAge;
            if (vasyaAge <= mishaAge) {
                middle = vasyaAge;
                max = mishaAge;
            } else {
                middle = mishaAge;
                max = vasyaAge;
            }
        }

        if (mishaAge <= vasyaAge && mishaAge <= katyaAge) {
            min = mishaAge;
            if (katyaAge <= vasyaAge) {
                middle = katyaAge;
                max = vasyaAge;
            } else {
                middle = vasyaAge;
                max = katyaAge;
            }
        }

        if (min > 0 && max < 120) {
            System.out.println("Minimal age: " + min);
            System.out.println("Middle age: " + middle);
            System.out.println("Maximal age: " + max);
        } else {
            System.out.println("Произошла ошибка, возраст не может быть отрицательным");
        }
    }
}