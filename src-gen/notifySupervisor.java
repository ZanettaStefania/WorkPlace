import jade.content.onto.Ontology;
import jadescript.content.JadescriptAtomicProposition;

@SuppressWarnings("all")
public class notifySupervisor implements JadescriptAtomicProposition {
  public String toString() {
    java.lang.StringBuilder _sb = new java.lang.StringBuilder();
    _sb.append("notifySupervisor");
    return _sb.toString();
  }

  public boolean equals(final Object obj) {
    if(obj instanceof notifySupervisor) {
    	notifySupervisor o = (notifySupervisor) obj;
    	return true;
    } else {
    	return super.equals(obj);
    }
  }

  public notifySupervisor() {
    {
    }
  }

  public Ontology __getDeclaringOntology() {
    return WorkOntology.getInstance();
  }

  private WorkOntology __metadata_notifySupervisor() {
    return null;
  }
}
