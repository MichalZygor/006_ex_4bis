public class Payroll {
    public static void main(String[] args) {
        ScannerEmployees scannerEmployees = new ScannerEmployees();
        Company company = new Company(new Employee[scannerEmployees.setupCountOfEmployees()]);
        company.add(scannerEmployees.scan());
        company.add(scannerEmployees.scan());
        company.add(scannerEmployees.scan());

        System.out.printf("Suma wypłat dla %d pracowników wynosi: %.2f\n",
                +company.getCountOfEmployees(),
                +company.totalSalaries());

        System.out.println("Wartości wynagrodzen dla wszystkich indeksów:");
        int x = 0;
        while (x < company.getCountOfEmployees() && company.isRowInArrayObject(x)) {
            System.out.printf("Indeks: %d wartość: %.2f\n", x, company.get(x).getSalary());
            x++;
        }

    }
}
