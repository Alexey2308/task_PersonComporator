import java.util.Comparator;

public class PersonCompare implements Comparator<Person> {
    private int wordsCount;

    public PersonCompare(int wordsCount) {
        this.wordsCount = wordsCount;
    }

    @Override
    public int compare(Person o1, Person o2) {
        int surnameLenghtFirst = o1.getSurname().split(" ").length;
        int surnameLenghtSecond = o2.getSurname().split(" ").length;

        if (surnameLenghtFirst == surnameLenghtSecond) {
            return Integer.compare(o1.getAge(), o2.getAge());
        }

        if (surnameLenghtFirst < surnameLenghtSecond) {
            return -1;
        }

        return 1;
    }

}
