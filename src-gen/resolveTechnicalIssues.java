import jade.content.onto.Ontology;
import jadescript.content.JadescriptAtomicProposition;

@SuppressWarnings("all")
public class resolveTechnicalIssues implements JadescriptAtomicProposition {
  public String toString() {
    java.lang.StringBuilder _sb = new java.lang.StringBuilder();
    _sb.append("resolveTechnicalIssues");
    return _sb.toString();
  }

  public boolean equals(final Object obj) {
    if(obj instanceof resolveTechnicalIssues) {
    	resolveTechnicalIssues o = (resolveTechnicalIssues) obj;
    	return true;
    } else {
    	return super.equals(obj);
    }
  }

  public resolveTechnicalIssues() {
    {
    }
  }

  public Ontology __getDeclaringOntology() {
    return WorkOntology.getInstance();
  }

  private WorkOntology __metadata_resolveTechnicalIssues() {
    return null;
  }
}
