package exercise1;

import java.util.ArrayList;
import java.util.List;

public class FilteringMachineTwo {
    // metoda powinna zwrócić imiona wszystkich niedorosłych osób (mniej niż 18 lat)
    public List<String> findKidNames(List<Person> ppl) {
        List<String> name = new ArrayList<>();
        ppl.stream()
                .filter(person -> person.getAge() < 18)
                .forEach(person -> name.add(person.getName()));
        return name;
    }

    public List<User> convertPeopleToUsers(List<Person> people) {
        List<User> user = new ArrayList<>();
        people.stream()
                .forEach(person -> user.add(new User(person.getName(), person.getAge(), person.getName() + "_" + person.getAge())));
        return user;
    }
}
