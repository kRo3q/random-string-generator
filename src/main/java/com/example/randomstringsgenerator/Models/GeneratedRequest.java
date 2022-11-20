package com.example.randomstringsgenerator.Models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
public class GeneratedRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private int minLength;
    private int maxLength;

    private String usedCharacters;

    @ElementCollection
    List<String> generatedStrings;

}
