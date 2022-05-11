public class Roman extends Document {
  private String type;

  public Roman(
      long isbn,
      String titre,
      String auteur,
      double prix,
      int nbpages,
      String type) {
    super(isbn, titre, auteur, prix, nbpages);
    this.type = type;
  }

  public void afficher() {
    System.out.println(super.isbn + " " + super.titre + " " + super.auteur + " " + super.prix + " " + super.nbpages
        + " " + this.type);
  }
}
