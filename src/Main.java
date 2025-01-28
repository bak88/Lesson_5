import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Employee jack = new Employee("Jack", "Vorobei", "Petrovich", "Engineer", "jack@mail.ru", 123456789, 35000, 25);
        Employee anna = new Employee("Anna", "Ivanova", "Sergeevna", "Manager", "anna@mail.ru", 987654321, 40000, 30);
        Employee sergey = new Employee("Sergey", "Petrov", "Igorevich", "Developer", "sergey@mail.ru", 456789123, 45000, 28);
        Employee olga = new Employee("Olga", "Sidorova", "Alexeevna", "Designer", "olga@mail.ru", 654321987, 38000, 26);
        Employee mikhail = new Employee("Mikhail", "Kuznetsov", "Nikolaevich", "Tester", "mikhail@mail.ru", 321654987, 37000, 27);

        var persList = new ArrayList<Employee>();
        persList.add(jack);
        persList.add(anna);
        persList.add(sergey);
        persList.add(olga);
        persList.add(mikhail);

        for (var item : persList) {
            item.printInfo();
        }
        System.out.println();

        Park park = new Park("Суворова", "Колокольчик", "9:00 - 18:00", 200);

        System.out.println(park);

    }
}