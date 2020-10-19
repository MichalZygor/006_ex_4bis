import java.util.Locale;
import java.util.Scanner;

public class ScannerEmployees {
    private Employee[] employees;
    private int countOfUsers;

    public ScannerEmployees() {
        setupCountOfEmployees();
        scannerEmployees();
    }

    private void scannerEmployees() {
        int index = 0;
        employees = new Employee[countOfUsers];
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.GERMAN);
        System.out.println("Uwaga! Użyj przecinka jako separatora przy wprowadzaniu wynagrodzenia!");
        while (index < employees.length) {
            employees[index] = new Employee();
            System.out.printf("Podaj dane dla pracownika %d/%d:\n", (index + 1), employees.length);
            System.out.print("Podaj imię: ");
            employees[index].setName(scanner.next());
            System.out.print("Podaj nazwisko: ");
            employees[index].setLastName(scanner.next());
            System.out.print("Podaj wynagrodzenie: ");
            employees[index].setSalary(scanner.nextDouble());
            index++;
        }
    }

    private void setupCountOfEmployees() {
        boolean status = false;
        countOfUsers = 0;
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
    }

    public Employee[] getEmployees() {
        return employees;
    }
}
