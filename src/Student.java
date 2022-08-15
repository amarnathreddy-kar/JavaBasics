public class Student implements Comparable<Student>{

    private int rollNbr;
    String name;
    int age;

    public Student(int rollNbr, String name, int age) {
        this.rollNbr = rollNbr;
        this.name = name;
        this.age = age;
    }

    public int getRollNbr() {
        return rollNbr;
    }

    public void setRollNbr(int rollNbr) {
        this.rollNbr = rollNbr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNbr=" + rollNbr +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student student) {
        if(this.age == student.getAge()){
            return 0;
        } else if (this.age > student.getAge()) {
            return 1;
        } else
        return -1;
    }
}
