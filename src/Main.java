public class Main {
    public static Employee[] employees = new Employee[10];
    public static void main(String[] args) {

        employees[0] = new Employee("Иванов Иван Иванович", 1, 45504);
        employees[1] = new Employee("Ильин Гордей Григорьевич", 2, 48670);
        employees[2] = new Employee("Осипова Александра Давидовна", 1, 43560);
        employees[3] = new Employee("Денисов Марк Егорович", 4, 42340);
        employees[4] = new Employee("Алешина Вероника Матвеевна", 3, 44870);
        employees[5] = new Employee("Суворова Вероника Даниловна", 2, 46550);
        employees[6] = new Employee("Ершов Константин Максимович", 5, 45670);
        employees[7] = new Employee("Платонов Николай Андреевич", 5, 44980);
        employees[8] = new Employee("Львова Агния Ильинична", 3, 45220);
        employees[9] = new Employee("Семенов Вячеслав Владиславович", 4, 47130);


        printToString();
        System.out.println(calculateSalaryCosts());
        System.out.println(calculateAverageSalary());
        printEmployees();
        Employee employee1 = findMinSalary();
        System.out.println(employee1.getSalary());
        Employee employee2 = findMaxSalary();
        System.out.println(employee2.getSalary());
    }

    public static void printToString() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }

    public static int calculateSalaryCosts() {
        int total = 0;
        for (int i = 0; i < employees.length; i++) {
            total += employees[i].getSalary();
        }
        return total;
    }

    public static double calculateAverageSalary() {
        return (double) calculateSalaryCosts()/employees.length;
    }

    public static void printEmployees() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getLastFirstMiddleName());
        }
    }
    public static Employee findMaxSalary() {
        int max = employees[0].getSalary();
        int count = 0;
        for (int i = 0; i < employees.length; i++) {
            if (max < employees[i].getSalary()) {
                max = employees[i].getSalary();
                count = i;
            }
        }
        return employees[count];
    }

    public static Employee findMinSalary() {
        int min = employees[0].getSalary();
        int count = 0;
        for (int i = 0; i < employees.length; i++) {
            if (min > employees[i].getSalary()) {
                min = employees[i].getSalary();
                count = i;
            }
        }
        return employees[count];
    }
}