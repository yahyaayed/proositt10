import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome! from yahya");
        DepartementHashSet departement = new DepartementHashSet();
        Set<Departement> yahyaSet = new HashSet<>();
        Departement d1 = new Departement(1,"informatique",30);
        Departement d2 = new Departement(5,"réseau",5);
        Departement d3 = new Departement(4,"gestion",3);

        yahyaSet.add(d1);
        yahyaSet.add(d2);
        yahyaSet.add(d3);

        System.out.println(yahyaSet);
        System.out.println("--------------");
        departement.ajouterDepartement(d1);
        departement.ajouterDepartement(d2);
        departement.ajouterDepartement(d3);
        departement.displayDepartement();



    }
}