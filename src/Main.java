public class Main {
        private static Employee[] employees = new Employee[10];

        public static void main(String[] args) {
            employees[0] = new Employee("фио0", 1, 10_000.0);
            employees[1] = new Employee("фио1", 2, 20_000.0);
            employees[2] = new Employee("фио2", 3, 30_000.0);
            employees[3] = new Employee("фио3", 4, 40_000.0);
            employees[4] = new Employee("фио4", 5, 50_000.0);
            employees[5] = new Employee("фио5", 1, 60_000.0);
            employees[6] = new Employee("фио6", 2, 70_000.0);
            employees[7] = new Employee("фио7", 3, 80_000.0);
            employees[8] = new Employee("фио8", 4, 90_000.0);
            employees[9] = new Employee("фио9", 5, 100_000.0);

            printAll();
            System.out.println(sumByMonth());
            System.out.println(EmployeeWithMinSalary());
            System.out.println(EmployeeWithMaxSalary());
            System.out.println(Average());
            printNames();
        }
//Получить список всех сотрудников со всеми имеющимися по ним данными (вывести в консоль значения всех полей (toString))
        private static void printAll() {
            for (Employee employee : employees) {
                System.out.println(employee);
            }
        }
//Посчитать сумму затрат на зарплаты в месяц
        private static double sumByMonth() {
            double sum = 0;
            for (Employee employee : employees) {
                sum += employee.getSalary();
            }
            return sum;
        }
//Найти сотрудника с минимальной зарплатой
        private static Employee EmployeeWithMinSalary() {
            double minSalary = Double.MAX_VALUE;
            Employee minSalaryEmployee = null;
            for (Employee employee : employees) {
                if (minSalary > employee.getSalary()) {
                    minSalary = employee.getSalary();
                    minSalaryEmployee = employee;
                }
            }
            return minSalaryEmployee;
        }
//Найти сотрудника с максимальной зарплатой
        private static Employee EmployeeWithMaxSalary() {
            double maxSalary = Double.MIN_VALUE;
            Employee maxSalaryEmployee = null;
            for (Employee employee : employees) {
                if (maxSalary < employee.getSalary()) {
                    maxSalary = employee.getSalary();
                    maxSalaryEmployee = employee;
                }
            }
            return maxSalaryEmployee;
        }
//Подсчитать среднее значение зарплат (можно использовать для этого метод из пункта b)
        private static double Average() {
            double average = 0.0;
            for (Employee employee : employees) {
                average += employee.getSalary() / employees.length;
            }
            return average;
        }
//Получить Ф. И. О. всех сотрудников (вывести в консоль)
        private static void printNames() {
            for (Employee employee: employees) {
                System.out.println(employee.getFullName());
            }
        }
    }