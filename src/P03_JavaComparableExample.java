/*
Java Comparable interface is used to order the objects of the user-defined class.
This interface is found in java.lang package and contains only one method named compareTo(Object).
It provides a single sorting sequence only, i.e., you can sort the elements on the basis of single data member only.
For example, it may be rollno, name, age or anything else.

compareTo(Object obj) method:
public int compareTo(Object obj): It is used to compare the current object with the specified object.
It returns, positive integer, if the current object is greater than the specified object.
    negative integer, if the current object is less than the specified object.
    zero, if the current object is equal to the specified object.

Note: String class and Wrapper classes implement the Comparable interface by default.
So if you store the objects of string or wrapper classes in a list, set or map, it will be Comparable by default.
*/

import java.util.ArrayList;
import java.util.Collections;

public class P03_JavaComparableExample {
//Sorting by age in ascending order
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student(101, "Amarnath", 35));
        students.add(new Student(102,"Mamatha", 32));
        students.add(new Student(103, "Keethan", 4));
        students.add(new Student(104,"Nuthan", 2));

    Collections.sort(students);
        System.out.println(students);

    //printing as a stream
    students.stream().forEach(s -> System.out.println(s.getAge()+" "+s.getRollNbr()+" "+s.getName()));
    }

}
