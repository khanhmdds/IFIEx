public class Employee {
    private double hoursWorkPerDay;
    private double salary;

    public Employee(double salary) {
        this.salary = salary;
    }

    public double getHoursWorkPerDay() {
        return hoursWorkPerDay;
    }

    public double getSalary() {
        return salary;
    }

    public void setInfo(double hours){
        this.hoursWorkPerDay = hours;
    }

    public double computeBaseSalary(double baseSalary){
        return this.salary = baseSalary * 20;
    }

    public double addSal(double baseSalary){
        if (baseSalary < 500){
            return this.salary = baseSalary + 10;
        }
        return this.salary = baseSalary;

    }

    public double addWork(double baseSalary){
        if (this.hoursWorkPerDay > 6){
            return this.salary = baseSalary + 5;
        }
        return this.salary = baseSalary;

    }

    public void getInfo(){
        System.out.println("Total salary of employee is "+addSal(computeBaseSalary(addWork(this.salary))));
    }

}
