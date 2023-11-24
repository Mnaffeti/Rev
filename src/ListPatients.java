import java.util.*;

public class ListPatients implements InterfacePatient  {
     private List<Patient> listP;

    public ListPatients() {

        this.listP = new ArrayList<Patient>();
    }

    public void ajouterPatient(Patient p) {
        listP.add(p);
    }

    public void supprimerPatient(Patient p) {
        listP.remove(p);
    }
    public boolean rechercherPatient(Patient p) {
        return listP.stream().anyMatch(patient -> patient.equals(p));
    }
    public boolean rechercherPatient(int cin) {
        return listP.stream().anyMatch(n->n.getCin()==cin) ;

    }
    public void afficherPatients() {
        listP.stream().forEach(System.out::println);
    }
    /* Avec l’api Stream */

    public void trierPatientsParNom() {
            listP.sort(Comparator.comparing(Patient::getNom));
    }


    /* Avec l&#39;api stream */
    public void PatientSansRedondance() {
        Set<Patient> uniquePatients = new HashSet<>(listP);
        uniquePatients.forEach(System.out::println);
    }
}