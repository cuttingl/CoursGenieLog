package exercice1;

import datamocklib.Person;
import datamocklib.TxtHelper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainExercice1 {

    // Format du fichier : firstName,lastName,birthDate,gender,cityOfResidence,cityOfBirth
    // Pas de header
    public List<Person> parse(List<String> data) {
        // A COMPLETER

        return new ArrayList<Person>();
    }

    public static void main(String[] args) {
        // EXO 1
        List<String> personsData = TxtHelper.getDataFromTxt("D:\\cours\\java_genielog\\CoursGenieLog\\persons.txt");
        System.out.println(personsData);
        // List<Person> personsParsed = new MainExercice1().parse(persons);
        String[] personsFormat = {"firstName","lastName","birthDate","gender","cityOfResidence", "cityOfBirth"};
        Map<String, List<Person>> personsKey = new HashMap<>();
        for (int i= 0; i< personsData.size(); i++){
            personsKey.put(personsFormat[i], personsData.get(0));
        }
        

        /*
         * - Récuperez la liste des personnes sous la forme -> firstName,lastName,birthDate,gender,cityOfResidence,cityOfBirth
         *   grâce à la fonction TxtHelper.getDataFromTxt("persons.txt")
         * - Parser la liste des Personnes grâce à la fonction parse())
         * - Calculer le nombre de personnes nées dans chaque ville avec les données obtenues.
         * Les données contiennent une trentaine de villes, Bonne chance !
         * 
        */


    }
}
