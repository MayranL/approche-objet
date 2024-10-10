package fr.diginamic.fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CreerFichier {
    public static void main(String[] args) throws IOException {
        Path pathDirectory= Paths.get("C:\\Users\\lmayran\\IdeaProjects\\JavaObjet\\approche-objet\\recensement.csv");
        Path pathNew= Paths.get("C:\\Users\\lmayran\\IdeaProjects\\JavaObjet\\approche-objet\\recensement2.csv");
        List<String> listes = Files.readAllLines(pathDirectory,StandardCharsets.UTF_8);
        ArrayList<String> listes100 = new ArrayList<>();
        for(int i=0;i<100;i++){
            listes100.add(listes.get(i));
        }
        Files.write(pathNew,listes100);
    }
}
