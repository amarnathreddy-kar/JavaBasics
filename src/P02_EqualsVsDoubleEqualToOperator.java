/*
Both equals() method and the == operator are used to compare two objects in Java. == is an operator and equals() is method.
But == operator compares reference or memory location of objects in a heap, whether they point to the same location or not.
Whenever we create an object using the operator new, it will create a new memory location for that object.
So we use the == operator to check memory location or address of two objects are the same or not.

In general, both equals() and “==” operators in Java are used to compare objects to check equality,
but here are some of the differences between the two:

The main difference between the .equals() method and == operator is that one is a method, and the other is the operator.
We can use == operators for reference comparison (address comparison) and .equals() method for content comparison.
In simple words, == checks if both objects point to the same memory location whereas .equals() evaluates to the comparison of values in the objects.
If a class does not override the equals method, then by default,
it uses the equals(Object o) method of the closest parent class that has overridden this method. See Why to Override equals(Object) and hashCode() method ?
in detail.
Note: String class and Wrapper classes implement the Comparable interface by default. S
o if you store the objects of string or wrapper classes in a list, set or map, it will be Comparable by default.
*/
public class P02_EqualsVsDoubleEqualToOperator {

    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");

        System.out.println(s1==s2);//true
        System.out.println(s2==s3);//false

        System.out.println(s1.equals(s2)); //true
        System.out.println(s2.equals(s3));//true
    }
}
