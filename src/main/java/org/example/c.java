package org.example;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class c {
    public static void main(String[] args) {

        List<String> nombresPaises = Arrays.stream(Locale.getISOCountries())
                .map(codigo -> new Locale("", codigo).getDisplayCountry(new Locale("es", "ES")))
                .sorted()
                .collect(Collectors.toList());

        // Imprimir solo los nombres
        nombresPaises.forEach(System.out::println);
    }
}
