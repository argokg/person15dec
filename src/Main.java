import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.vehicles.Car;
import com.company.vehicles.Lorry;
import com.company.vehicles.SportCar;

public class Main {
    public static void main(String[] args) {

        /*
        Person person = new Person();
        person.fullName="David Bekham";
        person.age = 30;
        person.move();

        Person vandam = new Person("Van Dame", 40);
        vandam.talk();
         */

        Car car = new Car("BMW", "sedan", 1500.0, new Driver("Bekham", 5), new Engine(400, "///M"));
        System.out.println(car);

        Lorry lorry = new Lorry("MAN", "lorry", 3000, new Driver("Anna", 10), new Engine(200, "MAN"), 20000);
        System.out.println(lorry);

        SportCar ferrari = new SportCar("Ferrari", "sport car", 1000, new Driver("Shumaher", 10), new Engine(500, "Ferrari Mototrs"), 350);
        System.out.println(ferrari);

     }
}