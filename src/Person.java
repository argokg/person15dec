public class Person {
    public String fullName;
    public int age;

    public Person() {

    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move(){
        System.out.printf("%s идёт \n", fullName);
    }
    public void talk(){
        System.out.printf("%s говорит", fullName);
    }

}
