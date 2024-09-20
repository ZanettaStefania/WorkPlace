import jade.content.onto.Ontology;
import jadescript.content.JadescriptAtomicProposition;

@SuppressWarnings("all")
public class informOnInitialToy implements JadescriptAtomicProposition {
  public String toString() {
    java.lang.StringBuilder _sb = new java.lang.StringBuilder();
    _sb.append("informOnInitialToy");
    return _sb.toString();
  }

  public boolean equals(final Object obj) {
    if(obj instanceof informOnInitialToy) {
    	informOnInitialToy o = (informOnInitialToy) obj;
    	return true;
    } else {
    	return super.equals(obj);
    }
  }

  public informOnInitialToy() {
    {
    }
  }

  public Ontology __getDeclaringOntology() {
    return WorkOntology.getInstance();
  }

  private WorkOntology __metadata_informOnInitialToy() {
    return null;
  }
}
