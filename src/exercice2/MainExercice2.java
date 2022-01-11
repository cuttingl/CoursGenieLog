package exercice2;

import java.io.FileNotFoundException;
import java.util.List;

import datamocklib.Person;
import datamocklib.TxtHelper;
import exercice2.models.*;

public class MainExercice2 implements Exo2 {

    /* EXO 2
     * Recupérez depuis le serveur la liste des gens qui sont nés à Chambéry.
     * La récupération de Data se fait dans l'ordre :
     *  - Récupération de data sur le server grâce à TxtHelper.getDataFromTxt("server.txt");
     *  - Vider la base de données locale grâce à la fonction TxtHelper.clearDataLocal();
     *  - Insérer les données dans la database locale grâce à la fonction TxtHelper.insertDataInTxt(line, "local.txt")
     *  - Afficher les données locale grace à TxtHelper.getDataFromTxt("local.txt")
     */

    @Override
    public void displayPersonFromChambery() {
        List<String> bddlocale = TxtHelper.getDataFromTxt("local.txt");
        for(String line : bddlocale){
            String[] person = line.split(",");
            if(person[4].equals("Chambéry")){
                System.out.println(person);
            }
        }
        
    }

    /*
     * Recupérez depuis le serveur la liste des gens qui ont plus de 25 ans.
     * La récupération de Data se fait comme dans la question précedente
     * Tips : Vous avez dans la class Person la fonction getAge();
     */
    @Override
    public void displayBoomers() {
        List<String> bddlocale = TxtHelper.getDataFromTxt("local.txt");
        for (String line : bddlocale) {
            String[] person = line.split(",");
            if (Integer.parseInt(person[2]) > 25) {
                System.out.println(person);
            }
        }
    }

    /*
     * Recupérez depuis le serveur la liste des gens de sexe féminin.
     * La récupération de Data se fait comme dans la question précedente
     */
    @Override
    public void displayFemales() {
        List<String> bddlocale = TxtHelper.getDataFromTxt("local.txt");
        for (String line : bddlocale) {
            String[] person = line.split(",");
            if (person[3].equals("female")) {
                System.out.println(person);
            }
        }
    }

    /*
     * Recupérez depuis le serveur la liste des femmes de plus de 25 ans.
     * La récupération de Data se fait comme dans la question précedente
     */
    @Override
    public void displayFemaleBoomers() {
        List<String> bddlocale = TxtHelper.getDataFromTxt("local.txt");
        for (String line : bddlocale) {
            String[] person = line.split(",");
            if (person[2].equals("female") && Integer.parseInt(person[3]) > 25) {
                System.out.println(person);
            }
        }
    }

    public static void main(String[] args) {
        

        Exo2 exo2 = new MainExercice2();
        List<String> bddServer = TxtHelper.getDataFromTxt("D:\\cours\\java_genielog\\CoursGenieLog\\server.txt");
        try {
            TxtHelper.clearDataLocal();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        for (String line : bddServer) {
            TxtHelper.insertDataInTxt(line, "local.txt");
        }
        List<String> bddLocal = TxtHelper.getDataFromTxt("local.txt");

        exo2.displayBoomers();
    }
}
