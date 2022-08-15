public class Member implements Comparable<Member>{

    private int memberId;
    private String Name;
    private int age;

    public Member(int memberId, String name, int age) {
        this.memberId = memberId;
        Name = name;
        this.age = age;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberId=" + memberId +
                ", Name='" + Name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Member member) {
        if(this.age == member.getMemberId()){
            return 0;
        } else if (this.age < member.getMemberId()){
            return 1;
        } else
        return -1;
    }
}
