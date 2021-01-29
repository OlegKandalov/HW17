package com.cursor.homework17springdatacomputer;

import com.cursor.homework17springdatacomputer.model.Computer;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

@Component
public class Generate {
    final static Random random = new Random();

    public static int gModel() {
        int model = 243;
        return random.nextInt(model);
    }

    public static String gManufacturer() {
        String[] f = {"a", "p", "p", "l", "e"};
        List<String> randomBrand = Arrays.asList(f);
        Collections.shuffle(randomBrand);
        return String.join("",randomBrand);
    }

    public static String gProcessor() {
        String[] f = {"i", "n", "1", "7", "3", "f", "4", "3", "g"};
        List<String> randomProcessor = Arrays.asList(f);
        Collections.shuffle(randomProcessor);
        return String.join("",randomProcessor);
    }

    public static int gMemory() {
        return random.nextInt(18) + 4;
    }

    public static boolean gIsNew() {
       return random.nextBoolean();
    }

    public static String gMaterialType() {
        String[] material = {"steel", "styrofoam"};
        return material[random.nextInt(material.length)];
    }

    public static double gPrice() {
        return random.nextDouble() + 400;
    }

    public static LocalDate gRelease() {
        LocalDate release = LocalDate.of(1985,9,12);
        return release.plusYears(random.nextInt(2) + 4);
    }

    public static Computer randomComp() {
        return new Computer(gModel(),
                gManufacturer(),
                gProcessor(),
                gMemory(),
                gIsNew(),
                gMaterialType(),
                gPrice(),
                gRelease());
    }
}
