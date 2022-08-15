import java.util.*;
import java.util.function.Predicate;

public class P06_ArrayListIsNullOrIsEmptyCheck {
    public static void main(String[] args) {
        Predicate<String> isNull = Objects::isNull;
        Predicate<String> isEmpty = String::isEmpty;
        Predicate<String> isBlank = String::isBlank;
        Predicate<String> isNullOrEmpty = isNull.or(isEmpty).or(isBlank);

        Collection<String> strings = new ArrayList<>();
        strings.add(null);
        strings.add("");
        strings.add("one");
        strings.add("two");
        strings.add("");
        strings.add("three");
        strings.add(null);
        strings.add("Five");
        strings.add(" ");

        System.out.println("strings = " + strings);
        strings.removeIf(isNullOrEmpty);
        System.out.println("filtered strings = " + strings);



    }
}
