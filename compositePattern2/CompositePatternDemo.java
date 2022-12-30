package compositePattern2;

public class CompositePatternDemo {
    public static void main(String[] args){
        Employee CEO = new Employee("John","CEO", 300000);
        Employee headSales = new Employee("Robert","Head Sales", 200000);
        Employee headMarketing = new Employee("Michel","Head Marketing", 200000);
        Employee clerk1 = new Employee("Laura","Marketing", 100000);
        Employee salesExecutive1 = new Employee("Rob","Sales", 100000);

        CEO.add(headSales);
        CEO.add(headMarketing);

        headSales.add(salesExecutive1);

        headMarketing.add(clerk1);

        //print all employees of the organization
        System.out.println(CEO);

        for (Employee headEmployee : CEO.getSubordinates()) {
            System.out.println(headEmployee);

            for (Employee employee : headEmployee.getSubordinates()) {
                System.out.println(employee);
            }
        }
    }
}

