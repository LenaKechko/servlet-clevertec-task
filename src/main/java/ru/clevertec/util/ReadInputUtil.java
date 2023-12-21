package ru.clevertec.util;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import static java.util.stream.Collectors.joining;

public class ReadInputUtil {
    public static String readInputStream(InputStream stream) {
        return new BufferedReader(new InputStreamReader(stream)).lines().collect(joining("\n"));
    }
}
