public class Employee {
    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax() {
        if (this.salary < 1000) {
            return 0;
        } else {
            return (this.salary * (0.03));
        }
    }

    double bonus() {
        if (this.workHours > 40) {
            return (workHours - 40) * 30;
        } else {
            return 0;
        }
    }

    double raiseSalary() {
        if (2021 - this.hireYear < 10) {
            return this.salary * (0.05);


        } else if (2021 - this.hireYear > 9 && 2021 - this.hireYear < 20) {
            return this.salary * (0.1);

        } else if (2021 - this.hireYear > 19) {
            return this.salary * (0.15);

        } else {
            return 0;
        }


    }

    static void toString(Employee employee) {
        System.out.println("Adi :" + employee.name);
        System.out.println("Maas : " + employee.salary);
        System.out.println("Calisma Saati : " + employee.workHours);
        System.out.println("Baslangic Yili : " + employee.hireYear);
        System.out.println("Vergi : " + employee.tax());
        System.out.println("Bonus : " + employee.bonus());
        System.out.println("Maas Artisi : " + (employee.raiseSalary()));
        System.out.println("Vergi ve Bonuslarla Birlikte Maas : " + (employee.salary + employee.bonus() - employee.tax()));
        System.out.println("Toplam maas : " + (employee.salary + employee.raiseSalary() + employee.bonus() - employee.tax()));

    }

    String name;
    double salary;
    int workHours;
    int hireYear;

}
