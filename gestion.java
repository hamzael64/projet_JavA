import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class GestionnaireEmployes {
    private List<Employe> listeEmployes;

    public GestionnaireEmployes() {
        this.listeEmployes = new ArrayList<>();
    }

    public void ajouterEmploye(Employe employe) {
        listeEmployes.add(employe);
    }

    public void afficherListeEmployes() {
        for (Employe employe : listeEmployes) {
            System.out.println("Nom: " + employe.getNom());
            System.out.println("Prenom: " + employe.getPrenom());
            System.out.println("Date: " + employe.getDate());
            System.out.println();
        }
    }
    public void calculerEtAfficherSalaire(int heuresTravail, int tauxHoraire, int bonus) {
          for (Employe employe : listeEmployes) {
              int salaire = (heuresTravail * tauxHoraire) + bonus;
              System.out.println("Nom: " + employe.getNom());
              System.out.println("Prénom: " + employe.getPrenom());
              System.out.println("Salaire: " + salaire);
              System.out.println();
        }

    public void supprimerEmploye(String nom, String prenom) {
        Iterator<Employe> iterator = listeEmployes.iterator();
        while (iterator.hasNext()) {
            Employe employe = iterator.next();
            if (employe.getNom().equals(nom) && employe.getPrenom().equals(prenom)) {
                iterator.remove();
                System.out.println("Employe avec le nom " + nom + " et le prenom " + prenom + " supprime.");
                return;
            }
        }
        System.out.println("Aucun employe trouve avec le nom " + nom + " et le prenom " + prenom);
    }
}
