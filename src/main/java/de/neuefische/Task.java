package de.neuefische;

public class Task {

    //Schreibe einen Test für eine Methode, die die Summe von zwei ganzen Zahlen berechnet.
    public static int sum(int a, int b) {
        return a + b;
    }

    // Schreibe einen Test für eine Methode, die prüft, ob eine gegebene Zahl gerade ist (even).
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    // Schreibe einen Test für eine Methode, die das Produkt zweier ganzer Zahlen berechnet.
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Schreibe einen Test für eine Methode, die eine gegebene Zeichenkette in Großbuchstaben umwandelt.
    public static String wordToUpperCase(String word) {
        return word.toUpperCase();
    }

    // Schreibe einen Test für eine Methode, die prüft, ob eine gegebene Zahl positiv ist.
    public static boolean isPositive(int n) {
        return n > 0;
    }
}
