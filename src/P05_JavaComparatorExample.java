/*
Java Comparator interface is used to order the objects of a user-defined class.
This interface is found in java.util package and contains 2 methods compare(Object obj1,Object obj2) and equals(Object element).
It provides multiple sorting sequences, i.e., you can sort the elements on the basis of any data member,
for example, rollno, name, age or anything else.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class P05_JavaComparatorExample {
    public static void main(String[] args) {
        ArrayList<Student> listOfStudents = new ArrayList<>();
        listOfStudents.add(new Student(101, "Mamatha J", 32));
        listOfStudents.add(new Student(102, "Amarnath Reddy", 35));
        listOfStudents.add(new Student(103, "Keethannath", 4));
        listOfStudents.add(new Student(104, "Nuthan Sai", 2));

        System.out.println("Sorting with Comparator by Name: ");
        Collections.sort(listOfStudents,new NameComparator());
        Iterator itr = listOfStudents.iterator();

        while(itr.hasNext()){
            Student st = (Student) itr.next();
            System.out.println(st.getRollNbr()+" "+st.getName()+" "+st.getAge());
        }

        System.out.println("Sorting with Comparator by Age: ");
        Collections.sort(listOfStudents, new AgeComparator());

        listOfStudents.stream().forEach(a -> System.out.println(a.getRollNbr()+" "+a.getAge()+" "+a.getName()));

        System.out.println("Sorting with Comparator by RollNbr: ");
        Collections.sort(listOfStudents,new RollNumberComparator());

        Iterator itr2 = listOfStudents.iterator();
        while(itr2.hasNext()){
            Student st = (Student) itr2.next();
            System.out.println(st.getRollNbr()+" "+st.getAge()+" "+st.getName());
        }

        }
    }

