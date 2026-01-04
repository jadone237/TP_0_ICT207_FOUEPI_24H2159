
public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(3, 1); // création (appel constructeur)
        Point p2 = new Point();     // création (appel constructeur)
        Point p3 = new Point(p1);   // création (appel constructeur)

        System.out.println("P2: " + p2.x + "," + p2.y); // accès aux attributs
        p3.afficher();        // (3, 1)
        System.out.println(p1.distance(p2)); // appel de méthode

        p3.deplacer(-3, -2);  // appel de méthode
        p3.afficher();        // (0, -1)

    }
}