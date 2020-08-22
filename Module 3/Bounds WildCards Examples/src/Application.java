import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Application {
    public static void main(String[] args) {
        // is not row type anymore.it is generic
        Container<Integer, String> container1 = new Container<>(13, "Hello");
        int x = container1.getItem1();
        Container<Double, String> container2 =
                new Container<>(13.0, "Hello");

        Set<String> set1 = new HashSet<>();
        set1.add("Java");
        set1.add("JavaScript");
        set1.add("HTML");

        Set<String> set2 = new HashSet<>();
        set2.add("Angular");
        set2.add("Java");
        set2.add("CSS");
        Set<String> result = union(set1, set2);

        // print the result
        // user generic with iterator
        Iterator<String> itr = result.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }


        // Working with wildcards

        Employee employee = new Employee();
        Accountant accountant = new Accountant();
        employee=accountant;// this will work fine because of polymorphism

        ArrayList<Employee> employees= new ArrayList<>();
//        ArrayList<Accountant> accountants = new ArrayList<>();
        ArrayList<Object> objects= new ArrayList<>();
//        employees=accountants; // cannot because arraylist of accountants cannot be arraylist of Employees
//        objects=accountants; // cannot because arraylist of accountants cannot be arraylist of objects

        ArrayList<?> employees2 = new ArrayList<>();
        ArrayList<Accountant>accountants= new ArrayList<>();
        employees2= accountants; // it is legal because of Wildcard

        // upper bound

        ArrayList<? extends Employee> employees1= new ArrayList<>();
        ArrayList<Accountant> accountants1= new ArrayList<>();
        employees1=employees;// it will accept Employee and its children

        // we can  use extends with a class or interface
        ArrayList<? extends PartTime> partTimes= new ArrayList<>();
        ArrayList<PartTime> partTime=new ArrayList<>();

        // if we use interface it will accept the interface and the classes that implement
        // the interface and its children
        partTimes=accountants1;
        partTimes= partTime;

        // lower bound
        ArrayList<? super Employee> superEmp= new ArrayList<>();


        superEmp=partTime;// accept the interface that is implemented by the class Employee
//        superEmp=accountants1; // does not accept children.
        superEmp=employees; // accept the class itself
        superEmp=objects; //accept object because it is the super class of employee




    }


    // creating Generic Method
    //E is a generic type whatever is this type
    public static <E> Set<E> union(Set<E> set1, Set<E> set2) {
        Set<E> result = new HashSet<>(set1);
        result.addAll(set2);
        return result;
    }
}
