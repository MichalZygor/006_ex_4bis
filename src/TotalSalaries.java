public class TotalSalaries {
    public double amount(Employee[] employees) {
        int index = 0;
        double totalSalaries = 0;
        while (index < employees.length && employees[index] instanceof Object) {
            totalSalaries += employees[index].getSalary();
            index++;
        }
        return totalSalaries;
    }
}
