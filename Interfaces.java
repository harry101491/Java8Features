import java.util.Comparator;

public class Interfaces {
    public static void main(String[] args) {
        Employee harry = new Employee("Mike", 500), louie = new Employee("Louie", 600);

        // Anonymous class
        Comparator<Employee> byName = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        System.out.println("By Name :-");
        System.out.println(byName.compare(harry, louie));
        
        try {
            byName.compare(harry, null);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

        // Compartor accepting null values
        Comparator<Employee> byNameLastNull =  Comparator.nullsLast(byName);
        System.out.println(byNameLastNull.compare(harry, null));

        Comparator<Employee> byNameFirstNull = Comparator.nullsFirst(byName);
        System.out.println(byNameFirstNull.compare(harry, null));

        // Reverse Order
        System.out.println("Reverse: "+ byName.reversed().compare(harry, louie));
    }
}