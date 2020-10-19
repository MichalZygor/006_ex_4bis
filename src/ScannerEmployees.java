import java.util.Locale;
import java.util.Scanner;

public class ScannerEmployees {

    public Employee scan() {
        int index = 0;
        Employee employee = new Employee();
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.GERMAN);
        System.out.println("Uwaga! Użyj przecinka jako separatora przy wprowadzaniu wynagrodzenia!");
            System.out.println("Podaj dane pracownika.");
            System.out.print("Podaj imię: ");
            employee.setName(scanner.next());
            System.out.print("Podaj nazwisko: ");
            employee.setLastName(scanner.next());
            System.out.print("Podaj wynagrodzenie: ");
            employee.setSalary(scanner.nextDouble());
            return employee;
    }

    public int setupCountOfEmployees() {
        boolean status = false;
        int countOfUsers = 0;
        System.out.print("Podaj liczbę pracowników do uzupełnienia. Wartość całkowitą pomiędzy 2 a 5: ");
        Scanner scanner = new Scanner(System.in);
        while (!status) {
            countOfUsers = scanner.nextInt();
            if (countOfUsers >= 2 && countOfUsers <= 5) {
                status = true;
            } else {
                System.out.print("Podana wartość jest poza zadanego zakresu. Popraw wartość całkowitą pomiędzy 2 a 5: ");
            }
        }
        return countOfUsers;
    }



}
