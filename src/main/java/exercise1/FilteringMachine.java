package exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class FilteringMachine {
    public List<Integer> filterOutNotEvenNumbers(List<Integer> numberList) {
        List<Integer> newNumberList = numberList.stream()
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());
        return newNumberList;
    }

    public List<Integer> filterOutLowerNumbersThan20(List<Integer> numberList) {
        List<Integer> newNumberList = numberList.stream()
                .filter(number -> number > 20)
                .collect(Collectors.toList());
        return newNumberList;
    }

    public List<Book> convertToBooks(List<String> titles) {
        List<Book> book = new ArrayList<>();
        titles.stream()
                .forEach(titleBook -> book.add(new Book(titleBook)));
        return book;
    }

    // Metoda powinna przekształcić tytuły na książki i zwrócić tylko te które rozpoczynają się od słowa "Gra"
    public List<Book> convertToBooksAndReturnOnlyStartingWithGra(List<String> titles) {
        List<Book> book = new ArrayList<>();
        titles.stream()
                .filter(title -> title.startsWith("Gra"));
        return book;
    }
}
