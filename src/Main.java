import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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

        Comparator<Person> comparator = (o1, o2) -> {
            int surnameLenghtFirst = o1.getSurname().split(" ").length;
            int surnameLenghtSecond = o2.getSurname().split(" ").length;

            if (surnameLenghtFirst == surnameLenghtSecond) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }

            if (surnameLenghtFirst < surnameLenghtSecond) return -1;

            return 1;
        };

        Collections.sort(personsList, comparator);

        System.out.println("Отсортировванный по условию список выглядит так:" + "\n" + personsList);


    }
}
