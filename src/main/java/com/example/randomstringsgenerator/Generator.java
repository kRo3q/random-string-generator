package com.example.randomstringsgenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Generator {
    private final Integer minLength;
    private final Integer maxLength;
    private final Long requestedAmountOfStrings;
    private final char[] providedChars;

    public Generator(Integer minLength, Integer maxLength, Long requestedAmountOfStrings, String charsToUse) {
        this.minLength = minLength;
        this.maxLength = maxLength;
        this.requestedAmountOfStrings = requestedAmountOfStrings;
        this.providedChars = charsToUse.toCharArray();
    }
    public List<String> generateStrings() {
        if (Math.pow(providedChars.length,maxLength-minLength) < requestedAmountOfStrings) {
            throw new IllegalArgumentException("Can't generate that many strings from provided data");
        }
        StringBuilder sb = new StringBuilder();
        Random generator = new Random();
        int numberOfCharacters = providedChars.length;
        int index;
        List<String> generatedStrings = new ArrayList<>();
        for (int currentNumberOfStrings = 0; currentNumberOfStrings < requestedAmountOfStrings; currentNumberOfStrings++) {

            int lengthOfStringToGenerate = generator.nextInt(minLength,maxLength);

            while (sb.length() <= lengthOfStringToGenerate) {

                index = generator.nextInt(0,numberOfCharacters);
                sb.append(providedChars[index]);
            }
            if (generatedStrings.contains(sb.toString())) {
                currentNumberOfStrings--;
                continue;
            }
            generatedStrings.add(sb.toString());
            sb = new StringBuilder();
        }

        return generatedStrings;
    }
}
