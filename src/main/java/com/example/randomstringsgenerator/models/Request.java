package com.example.randomstringsgenerator.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Request {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int minLength;
    private int maxLength;
    private long requestedAmountOfStrings;
    private String usedCharacters;

    @ElementCollection
    List<String> generatedStrings;

    @Override
    public String toString() {
        return "Request{" +
                "id=" + id +
                ", minLength=" + minLength +
                ", maxLength=" + maxLength +
                ", requestedAmountOfStrings=" + requestedAmountOfStrings +
                ", usedCharacters='" + usedCharacters + '\'' +
                ", generatedStrings=" + generatedStrings +
                '}';
    }
}
