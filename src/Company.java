public class Company {
    private Employee[] employees;
    private ScannerEmployees scannerEmployees;

    public Company() {
        scannerEmployees = new ScannerEmployees();
        employees = new Employee[scannerEmployees.setupCountOfEmployees()];
    }

    public void add(Employee employee){
        int index = 0;
        while(index < employees.length){
            if (!isRowInArrayObject(index)){
                employees[index] = employee;
                break;
            }
            index++;
        }
    }

    public Employee get(int index){
            return employees[index];
    }

    public int getCountOfEmployees(){
        return employees.length;
    }

    public double totalSalaries(){
        TotalSalaries totalSalaries = new TotalSalaries();
        return totalSalaries.amount(employees);
    }

    public boolean isRowInArrayObject(int index){
        return employees[index] instanceof Object;
    }
}
