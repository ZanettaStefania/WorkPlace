import jade.content.onto.Ontology;
import jadescript.content.JadescriptAtomicProposition;

@SuppressWarnings("all")
public class sendWorkingReport implements JadescriptAtomicProposition {
  public String toString() {
    java.lang.StringBuilder _sb = new java.lang.StringBuilder();
    _sb.append("sendWorkingReport");
    return _sb.toString();
  }

  public boolean equals(final Object obj) {
    if(obj instanceof sendWorkingReport) {
    	sendWorkingReport o = (sendWorkingReport) obj;
    	return true;
    } else {
    	return super.equals(obj);
    }
  }

  public sendWorkingReport() {
    {
    }
  }

  public Ontology __getDeclaringOntology() {
    return WorkOntology.getInstance();
  }

  private WorkOntology __metadata_sendWorkingReport() {
    return null;
  }
}
