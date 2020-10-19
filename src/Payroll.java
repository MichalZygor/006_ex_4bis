public class Payroll {
    public static void main(String[] args) {
        ScannerEmployees scannerEmployees = new ScannerEmployees();
        TotalSalaries totalSalaries = new TotalSalaries();

        System.out.printf("Suma wypłat dla %d pracowników wynosi: %.2f\n",
                +scannerEmployees.getEmployees().length,
                +totalSalaries.amount(scannerEmployees.getEmployees()));
    }
}
