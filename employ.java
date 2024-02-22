public class Employe {
    private String nom;
    private String prenom;
    private int date;

    public Employe(String nom, String prenom, int date) {
        this.nom = nom;
        this.prenom = prenom;
        this.date = date;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getDate() {
        return date;
    }
}
