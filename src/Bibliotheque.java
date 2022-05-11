import java.util.ArrayList;
import java.util.Collections;
// import java.util.Iterator;

// we can add generic here.
// <T extends Document>
public class Bibliotheque {
  private ArrayList<Document> livers;

  public Bibliotheque() {
    this.livers = new ArrayList<Document>();
  }

  public void AjouterDocument(Document d) throws DocumentException {
    boolean isExistDocument = this.livers.contains(d);
    if (isExistDocument)
      throw new DocumentException("Document already exist on the library");
    this.livers.add(d);
  }

  public Document ChercherDocument(String titre) {
    for (Document document : this.livers)
      if (document.titre.equals(titre))
        return document;

    return null;
  }

  public void SupprimerDocument(Document d) {
    this.livers.remove(d);
  }

  public ArrayList<Document> TrierDocument() {
    Collections.sort(this.livers);
    return this.livers;
  }

  public Document DocPlusCher() {
    Document plusCherDocument = this.livers.get(0);
    Document currentDocument;

    // we can replace the traditional for with iterator.
    // example:
    // Iterator iter = this.livers.iterator();
    // Document plusCherDocument = iter.next();
    // Document currentDocument;
    // while (iter.hasNext()) {
    // currentDocument = iter.next();
    // if (plusCherDocument.prix < currentDocument.prix) {
    // plusCherDocument = currentDocument;
    // }
    // }
    for (int i = 1; i < this.livers.size(); i++) {
      currentDocument = this.livers.get(i);
      if (plusCherDocument.prix < currentDocument.prix)
        plusCherDocument = currentDocument;
    }

    return plusCherDocument;
  }

  public void AfficherBib() {
    for (Document document : this.livers) {
      document.afficher();
    }
  }
}
