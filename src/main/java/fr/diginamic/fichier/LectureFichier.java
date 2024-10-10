package fr.diginamic.fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LectureFichier {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:\\Users\\lmayran\\IdeaProjects\\JavaObjet\\approche-objet\\recensement.csv");
        List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);

        // Exercice LireFichier
        /*for(String l : lines){
            System.out.println(l);
        }*/

        // Exercice LireFichierAvecInstanciation
        ArrayList<Commune> listCommune = new ArrayList<>();
        for (int i =1; i< lines.size();i++){
            System.out.println(lines.get(i));
            String[] tokens = lines.get(i).split(";");
            String nbPop = tokens[7].replaceAll("\\s","");
            Commune commune = new Commune(tokens[1],tokens[2],tokens[0],Integer.parseInt(nbPop));
            listCommune.add(commune);
        }

        // Exercice GenererFichier
        Path pathNew= Paths.get("C:\\Users\\lmayran\\IdeaProjects\\JavaObjet\\approche-objet\\recensement2.csv");
        ArrayList<String> finalList = new ArrayList<>();
        for (Commune c : listCommune){
            if(c.getPopulationTotale()>25000){
                finalList.add(c.getNom());
                finalList.add(c.getCodeDepartement());
                finalList.add(c.getNomRegion());
                finalList.add(""+c.getPopulationTotale());
            }
        }

        Files.write(pathNew,finalList,StandardCharsets.UTF_8);
    }
}
