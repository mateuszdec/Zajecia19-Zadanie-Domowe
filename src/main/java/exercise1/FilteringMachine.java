package exercise1;

import java.util.List;
import java.util.stream.Collectors;


public class FilteringMachine {
    public List<Integer> filterOutNotEvenNumbers(List<Integer> numberList) {
        List<Integer> newNumberList = numberList.stream()
                .filter(a -> a % 2 != 0)
                .collect(Collectors.toList());
        return newNumberList;
    }

    public List<Integer> filterOutLowerNumbersThan20(List<Integer> numberList) {
        return null;
    }

    public List<Book> convertToBooks(List<String> titles) {
        return null;
    }

    // Metoda powinna przekształcić tytuły na książki i zwrócić tylko te które rozpoczynają się od słowa "Gra"
    public List<Book> convertToBooksAndReturnOnlyStartingWithGra(List<String> titles) {
        return null;
    }
}
