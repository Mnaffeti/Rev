import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hopital {
    public Map<Medecin, ListPatients> medecinPatients;

    public Hopital() {
        medecinPatients = new HashMap<>();
    }

    public void ajouterMedecin(Medecin m) {
        ListPatients listPatients = new ListPatients();
        medecinPatients.put(m,new ListPatients() );
    }

    public void ajouterPatient(Medecin m, Patient p) {
        if (medecinPatients.containsKey(m)) {
            ListPatients listPatients = medecinPatients.get(m);
            listPatients.ajouterPatient(p);
        } else {
            ListPatients listPatients = new ListPatients();
            listPatients.ajouterPatient(p);
            medecinPatients.put(m, listPatients);
        }
    }

    public void afficherMap() {
        medecinPatients.forEach((medecin, listPatients) -> {
            System.out.println("Médecin: " + medecin);
            System.out.println("Patients: ");
            listPatients.afficherPatients();
            System.out.println("----------------------");
        });
    }

    public void afficherMedcinPatients(Medecin m) {
        medecinPatients.forEach((medecin, listPatients) -> {
            if (medecin.getNom().equals("mohamed")) {
                listPatients.afficherPatients();
            }
        });
    } }