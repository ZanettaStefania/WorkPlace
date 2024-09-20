import jade.content.onto.Ontology;
import jadescript.content.JadescriptAtomicProposition;

@SuppressWarnings("all")
public class requestAssistance implements JadescriptAtomicProposition {
  public String toString() {
    java.lang.StringBuilder _sb = new java.lang.StringBuilder();
    _sb.append("requestAssistance");
    return _sb.toString();
  }

  public boolean equals(final Object obj) {
    if(obj instanceof requestAssistance) {
    	requestAssistance o = (requestAssistance) obj;
    	return true;
    } else {
    	return super.equals(obj);
    }
  }

  public requestAssistance() {
    {
    }
  }

  public Ontology __getDeclaringOntology() {
    return WorkOntology.getInstance();
  }

  private WorkOntology __metadata_requestAssistance() {
    return null;
  }
}
