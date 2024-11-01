package lesson035_practic.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

@AllArgsConstructor
@Getter
public enum Genus {
    CAT("Cat"), DOG("Dog");
    private String value;

    public static Genus of(String value){
        return Arrays.stream(values())
                .filter(it -> it.value.equalsIgnoreCase(value))
                .findFirst()
                .orElse(null);
    }
}
