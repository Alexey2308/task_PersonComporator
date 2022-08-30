import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> personsList = new ArrayList<>();
        personsList.add(new Person("Андрей", "Фамилия Из Четырёх Слов", 22));
        personsList.add(new Person("Ольга", "Два Слова", 18));
        personsList.add(new Person("Сергей", "Из Трёх Слов", 18));
        personsList.add(new Person("Алексей", "Фамилия Три Слова", 20));
        personsList.add(new Person("Роман", "Фамилия ДваСлова", 20));

        System.out.println("Неотсортированный список выглядит так:" + "\n" + personsList);

        Collections.sort(personsList, new PersonCompare());
        System.out.println("Отсортировванный по условию список выглядит так:" + "\n" + personsList);


    }
}
