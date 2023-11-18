import java.util.Scanner;

public class StudentDataWithUserInput
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        //pobieranie danych od użytkownika
        System.out.println("Podaj imię: ");
        String imieInput = scanner.nextLine();
        System.out.println("Podaj nazwisko: ");
        String nazwiskoInput = scanner.nextLine();
        System.out.println("Podaj PESEL: ");
        String peselInput = scanner.nextLine();
        System.out.println("Podaj kierunek: ");
        String kierunekInput = scanner.nextLine();
        System.out.println("Podaj grupę: ");
        String grupaInput = scanner.nextLine();

        //wyświetlenie pobranych danych na konsoli
        System.out.println("Dane studenta: ");
        System.out.println(imieInput + " " + nazwiskoInput);
        System.out.println("PESEL: " + peselInput);
        System.out.println(kierunekInput + ", grupa " + grupaInput);

        scanner.close();
    }
}
