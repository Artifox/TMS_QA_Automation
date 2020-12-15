package lesson5;

import java.sql.SQLOutput;

public class MainClass {
    public static void main(String[] args) {
        Artefact aztecs = new Artefact(212121, "aztecs", 12);
        Artefact egyptians = new Artefact(212121,"egyptians");
        Artefact belarusians = new Artefact(212121);
        belarusians.culture = "belarusians";

        System.out.println(belarusians);
    }
}
