public class Jornal extends Document {
  private String periode;

  public Jornal(
      long isbn,
      String titre,
      String auteur,
      double prix,
      int nbpages,
      String periode) {
    super(isbn, titre, auteur, prix, nbpages);
    this.periode = periode;
  }

  public void afficher() {
    System.out.println(super.isbn + " " + super.titre + " " + super.auteur + " " + super.prix + " " + super.nbpages
        + " " + this.periode);
  }
}
