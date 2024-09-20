import jade.content.onto.Ontology;
import jadescript.content.JadescriptAction;

@SuppressWarnings("all")
public class deliverNewToyParts implements JadescriptAction {
  private ToyParts NewToyPart;

  public ToyParts getNewToyPart() {
    return this.NewToyPart;
  }

  public void setNewToyPart(final ToyParts NewToyPart) {
    this.NewToyPart = NewToyPart;
  }

  public String toString() {
    java.lang.StringBuilder _sb = new java.lang.StringBuilder();
    _sb.append("deliverNewToyParts");
    _sb.append("(");
    _sb.append(java.lang.String.valueOf(getNewToyPart()));
    _sb.append(")");
    return _sb.toString();
  }

  public boolean equals(final Object obj) {
    if(obj instanceof deliverNewToyParts) {
    	deliverNewToyParts o = (deliverNewToyParts) obj;
    	return true && java.util.Objects.equals(this.getNewToyPart(), o.getNewToyPart());
    } else {
    	return super.equals(obj);
    }
  }

  public deliverNewToyParts() {
    {
    	this.setNewToyPart(new ToyParts());
    }
  }

  public deliverNewToyParts(final ToyParts NewToyPart) {
    super();
    
    this.setNewToyPart(NewToyPart);
  }

  public Ontology __getDeclaringOntology() {
    return WorkOntology.getInstance();
  }

  private WorkOntology __metadata_deliverNewToyParts(final ToyParts NewToyPart) {
    return null;
  }
}
