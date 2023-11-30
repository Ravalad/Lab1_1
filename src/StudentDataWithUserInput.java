import java.util.Scanner;

public class StudentDataWithUserInput
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        //pobieranie danych od użytkownika
        System.out.println("Podaj imię: ");
        String nameInput = scanner.nextLine();
        System.out.println("Podaj nazwisko: ");
        String lastnameInput = scanner.nextLine();
        System.out.println("Podaj PESEL: ");
        String peselInput = scanner.nextLine();
        System.out.println("Podaj kierunek studiów: ");
        String majorInput = scanner.nextLine();
        System.out.println("Podaj grupę, do której należy student: ");
        String studygroupInput = scanner.nextLine();

        //wyświetlenie pobranych danych na konsoli
        System.out.println("Dane studenta: ");
        System.out.println(nameInput + " " + lastnameInput);
        System.out.println("PESEL: " + peselInput);
        System.out.println(majorInput + ", grupa " + studygroupInput);

        scanner.close();
    }
}
