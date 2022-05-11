public class Document implements CompareDoc, Comparable<Document> {
  protected long isbn;
  protected String titre;
  protected String auteur;
  protected double prix;
  protected int nbpages;

  public Document(
      long isbn,
      String titre,
      String auteur,
      double prix,
      int nbpages) {
    this.isbn = isbn;
    this.titre = titre;
    this.auteur = auteur;
    this.prix = prix;
    this.nbpages = nbpages;
  }

  public void afficher() {
    System.out.println(this.isbn + " " + this.titre + " " + this.auteur + " " + this.prix + " " + this.nbpages);
  }

  @Override
  public Document plusCher(Document d) {
    return this.prix >= d.prix ? this : d;
  }

  public Document plusVolumineux(Document d) {
    return this.nbpages >= d.nbpages ? this : d;
  }

  @Override
  public int compareTo(Document d) {
    // we need casting here!
    return (int) this.prix - (int) d.prix;
  }
}
