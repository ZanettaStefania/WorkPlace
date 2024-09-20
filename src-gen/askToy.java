import jade.content.onto.Ontology;
import jade.core.AID;
import jadescript.content.JadescriptAction;

@SuppressWarnings("all")
public class askToy implements JadescriptAction {
  private AID sender;

  public AID getSender() {
    return this.sender;
  }

  public void setSender(final AID sender) {
    this.sender = sender;
  }

  public String toString() {
    java.lang.StringBuilder _sb = new java.lang.StringBuilder();
    _sb.append("askToy");
    _sb.append("(");
    _sb.append(java.lang.String.valueOf(getSender()));
    _sb.append(")");
    return _sb.toString();
  }

  public boolean equals(final Object obj) {
    if(obj instanceof askToy) {
    	askToy o = (askToy) obj;
    	return true && java.util.Objects.equals(this.getSender(), o.getSender());
    } else {
    	return super.equals(obj);
    }
  }

  public askToy() {
    {
    	this.setSender(new jade.core.AID());
    }
  }

  public askToy(final AID sender) {
    super();
    
    this.setSender(sender);
  }

  public Ontology __getDeclaringOntology() {
    return WorkOntology.getInstance();
  }

  private WorkOntology __metadata_askToy(final AID sender) {
    return null;
  }
}
