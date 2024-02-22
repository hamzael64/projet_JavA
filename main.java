import javax.swing.*;
import java.awt.event.*;

public class gestion_gui extends JFrame {
    private GestionnaireEmployes gestionnaire;

    public gestion_gui() {
        gestionnaire = new GestionnaireEmployes();
        setTitle("Gestionnaire d'employes");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        createGUI();
    }

    private void createGUI() {
        JPanel panel = new JPanel();
        getContentPane().add(panel);

        JButton addButton = new JButton("Ajouter Employe");
        JButton displayButton = new JButton("Afficher Liste");
        JButton calculateButton = new JButton("Calculer Salaire");
        JButton removeButton = new JButton("Supprimer Employe");

        panel.add(addButton);
        panel.add(displayButton);
        panel.add(calculateButton);
        panel.add(removeButton);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nom = JOptionPane.showInputDialog("Nom:");
                String prenom = JOptionPane.showInputDialog("Prenom:");
                int date = Integer.parseInt(JOptionPane.showInputDialog("Date d'embauche (annee):"));
                gestionnaire.ajouterEmploye(new Employe(nom, prenom, date));
            }
        });

        displayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gestionnaire.afficherListeEmployes();
            }
        });

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int heuresTravail = Integer.parseInt(JOptionPane.showInputDialog("Heures de travail:"));
                int tauxHoraire = Integer.parseInt(JOptionPane.showInputDialog("Taux horaire:"));
                int bonus = Integer.parseInt(JOptionPane.showInputDialog("Bonus:"));
                gestionnaire.calcsalire(heuresTravail, tauxHoraire, bonus);
            }
        });

        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nom = JOptionPane.showInputDialog("Nom de l'employe à supprimer:");
                String prenom = JOptionPane.showInputDialog("Prenom de l'employe a supprimer:");
                gestionnaire.supprimerEmploye(nom, prenom);
            }
        });
    }
    public static void main() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new gestion_gui().setVisible(true);
            }
        });
    }
}
