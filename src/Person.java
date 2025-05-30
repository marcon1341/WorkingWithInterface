public class Person implements Comparable<Person>{
    private String firstName;
    private String lastName;
    private int age;

    public  Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public String getFirstName() { return this.firstName; }
    public String getLastName() { return this.lastName; }
    public int getAge() { return this.age; }

    @Override
    public String toString(){
        return "full name: "+firstName + " " + lastName + " age: (" + age + ")";
    }

    @Override
    public int compareTo(Person other) {
        int last = this.lastName.compareTo(other.getLastName());
        if(last != 0)return last;

        int first = this.firstName.compareTo(other.getFirstName());
        if(first != 0) return first;

        return Integer.compare(this.age, other.getAge());
    }
}
