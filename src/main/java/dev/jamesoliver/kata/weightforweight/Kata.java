package dev.jamesoliver.kata.weightforweight;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * My friend John and I are members of the "Fat to Fit Club (FFC)". John is worried because each month a list with the weights of members is published and each month he is the last on the list which means he is the heaviest.</br>
 * </br>
 * I am the one who establishes the list so I told him: "Don't worry any more, I will modify the order of the list". It was decided to attribute a "weight" to numbers. The weight of a number will be from now on the sum of its digits.</br>
 * </br>
 * For example 99 will have "weight" 18, 100 will have "weight" 1 so in the list 100 will come before 99.</br>
 * </br>
 * Given a string with the weights of FFC members in normal order can you give this string ordered by "weights" of these numbers?</br>
 * </br>
 * <strong>Example:</strong></br>
 * "56 65 74 100 99 68 86 180 90" ordered by numbers weights becomes:</br>
 * "100 180 90 56 65 74 68 86 99"</br>
 * </br>
 * When two numbers have the same "weight", let us class them as if they were strings (alphabetical ordering) and not numbers:</br>
 * 180 is before 90 since, having the same "weight" (9), it comes before as a string.</br>
 * </br>
 * All numbers in the list are positive numbers and the list can be empty.</br>
 * </br>
 * <strong>Notes</strong></br>
 * it may happen that the input string have leading, trailing whitespaces and more than a unique whitespace between two consecutive numbers
 */
public class Kata {

    public static String orderWeight(String strng) {
        if(strng == null || strng.isBlank()) {
            return "";
        }

        return Arrays.stream(strng.split(" "))
                .map(String::trim)
                .map(WeightedNumber::create)
                .sorted()
                .map(WeightedNumber::number)
                .collect(Collectors.joining(" "));
    }

    public record WeightedNumber(String number,
                                 int weight) implements Comparable<WeightedNumber> {

        public static WeightedNumber create(String number) {
            var weight = Arrays.stream(number.split(""))
                    .map(Integer::parseInt)
                    .reduce(0, Integer::sum);

            return new WeightedNumber(number, weight);
        }

        @Override
        public int compareTo(WeightedNumber o) {
            int intCompare = Integer.compare(weight, o.weight);

            if(intCompare != 0) {
                return intCompare;
            }

            return String.valueOf(number).compareTo(o.number);
        }
    }
}
