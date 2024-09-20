import jade.content.onto.Ontology;
import jade.core.AID;
import jadescript.content.JadescriptConcept;

@SuppressWarnings("all")
public class Request implements JadescriptConcept {
  private AID sender;

  public AID getSender() {
    return this.sender;
  }

  public void setSender(final AID sender) {
    this.sender = sender;
  }

  private ToyParts toyPart;

  public ToyParts getToyPart() {
    return this.toyPart;
  }

  public void setToyPart(final ToyParts toyPart) {
    this.toyPart = toyPart;
  }

  public String toString() {
    java.lang.StringBuilder _sb = new java.lang.StringBuilder();
    _sb.append("Request");
    _sb.append("(");
    _sb.append(java.lang.String.valueOf(getSender()));
    _sb.append(", ");
    _sb.append(java.lang.String.valueOf(getToyPart()));
    _sb.append(")");
    return _sb.toString();
  }

  public boolean equals(final Object obj) {
    if(obj instanceof Request) {
    	Request o = (Request) obj;
    	return true && java.util.Objects.equals(this.getSender(), o.getSender()) && java.util.Objects.equals(this.getToyPart(), o.getToyPart());
    } else {
    	return super.equals(obj);
    }
  }

  public Request() {
    {
    	this.setSender(new jade.core.AID());
    	
    	this.setToyPart(new ToyParts());
    }
  }

  public Request(final AID sender, final ToyParts toyPart) {
    super();
    
    this.setSender(sender);
    this.setToyPart(toyPart);
  }

  public Ontology __getDeclaringOntology() {
    return WorkOntology.getInstance();
  }

  private WorkOntology __metadata_Request(final AID sender, final ToyParts toyPart) {
    return null;
  }
}
