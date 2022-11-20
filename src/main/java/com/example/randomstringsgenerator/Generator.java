package com.example.randomstringsgenerator;

import java.util.ArrayList;
import java.util.List;

public class Generator {
    public final Integer minLength;
    public final Integer maxLength;
    public final String charsToUse;

    public Generator(Integer minLength, Integer maxLength, String charsToUse) {
        this.minLength = minLength;
        this.maxLength = maxLength;
        this.charsToUse = charsToUse;
    }
    public List<String> GenerateStrings () {
        //TODO: implement generations
        return new ArrayList<>();
    }
}
