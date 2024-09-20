import jade.content.onto.Ontology;
import jadescript.content.JadescriptAction;

@SuppressWarnings("all")
public class askToyParts implements JadescriptAction {
  private ToyParts PreferedPart;

  public ToyParts getPreferedPart() {
    return this.PreferedPart;
  }

  public void setPreferedPart(final ToyParts PreferedPart) {
    this.PreferedPart = PreferedPart;
  }

  public String toString() {
    java.lang.StringBuilder _sb = new java.lang.StringBuilder();
    _sb.append("askToyParts");
    _sb.append("(");
    _sb.append(java.lang.String.valueOf(getPreferedPart()));
    _sb.append(")");
    return _sb.toString();
  }

  public boolean equals(final Object obj) {
    if(obj instanceof askToyParts) {
    	askToyParts o = (askToyParts) obj;
    	return true && java.util.Objects.equals(this.getPreferedPart(), o.getPreferedPart());
    } else {
    	return super.equals(obj);
    }
  }

  public askToyParts() {
    {
    	this.setPreferedPart(new ToyParts());
    }
  }

  public askToyParts(final ToyParts PreferedPart) {
    super();
    
    this.setPreferedPart(PreferedPart);
  }

  public Ontology __getDeclaringOntology() {
    return WorkOntology.getInstance();
  }

  private WorkOntology __metadata_askToyParts(final ToyParts PreferedPart) {
    return null;
  }
}
