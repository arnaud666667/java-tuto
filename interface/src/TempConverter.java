import java.util.Scanner;

public class TempConverter {

    public static void main(String[] args) {

        System.out.println("CONVERTISSEUR DEGRES CELSIUS ET DEGRES FARENHEITS");
        System.out.println("-------------------------------------------------\n");
        System.out.println("\n");

        char choice='O';
        String enteredValue;
        int side;

        Float toConvert, converted;
        Scanner sc = new Scanner(System.in);

        while (choice=='O') {

            System.out.println("Choisissez le mode de conversion : ");
            System.out.println("1 - Celsius vers Farenheits");
            System.out.println("2 - Farenheits vers Celsius");

            sc = new Scanner(System.in);
            enteredValue = sc.nextLine();

            while (!enteredValue.equals("1") && !enteredValue.equals("2")) {
                System.out.println("Valeur incorrecte : " + enteredValue+"\n");
                System.out.println("Choisissez le mode de conversion : ");
                System.out.println("1 - Celsius vers Farenheits");
                System.out.println("2 - Farenheits vers Celsius");

                sc = new Scanner(System.in);
                enteredValue = sc.nextLine();
            }
            side = Integer.parseInt(enteredValue);

            System.out.println("Température à convertir : ");
            sc = new Scanner(System.in);
            toConvert = sc.nextFloat();

            switch (side) {
                case 1:
                    converted = ((9 * toConvert) / 5) + 32;
                    System.out.println(toConvert.toString() + "° C correspond à " + converted.toString() + "° F");
                    break;
                case 2:
                    converted = ((toConvert - 32) * 5) / 9;
                    System.out.println(toConvert.toString() + "° F correspond à " + converted.toString() + "° C");
                    break;
            }

            System.out.println("Voulez-vous continuer ? (O/N) ");
            sc=new Scanner(System.in);
            choice=sc.nextLine().charAt(0);

            while (choice!='O' && choice!='N') {
                System.out.println("Valeur incorrecte : " + choice + "\n");
                System.out.println("Voulez-vous continuer ? (O/N) ");

                sc=new Scanner(System.in);
                choice=sc.nextLine().charAt(0);
            }
        }
    }
}
