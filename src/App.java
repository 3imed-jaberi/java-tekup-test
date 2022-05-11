/**
 * Imed Jaberi 1ere TIC N - EXAM JAVA
 * email: imed-jaberi@outlook.com
 */
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("========== Welcome ! ==========");
        Bibliotheque bibliotheque = new Bibliotheque();

        bibliotheque.AjouterDocument(new Document(00000001, "Learn React.js", "Dan Abramov", 119.99, 300));
        bibliotheque.AjouterDocument(new Document(00000002, "Learn Python", "Mosh Hamadani", 99.99, 100));
        bibliotheque.AjouterDocument(new Document(00000003, "Learn Remix", "Kent C. Dodds", 149.99, 120));
        System.out.println("========== Document added ==========");
        System.out.println("========== All documents inside the library ==========");
        bibliotheque.AfficherBib();
        System.out.println("========== All documents inside the library (sorted) ==========");
        for (Document document : bibliotheque.TrierDocument()) {
            document.afficher();
        }
        System.out.println("========== Most expensive document ==========");
        bibliotheque.DocPlusCher().afficher();
    }
}
