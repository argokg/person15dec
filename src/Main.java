public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.fullName="David Bekham";
        person.age = 30;
        person.move();

        Person vandam = new Person("Van Dame", 40);
        vandam.talk();

     }
}