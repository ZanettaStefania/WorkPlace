import jade.content.onto.Ontology;
import jadescript.content.JadescriptConcept;

@SuppressWarnings("all")
public class BaseToy implements JadescriptConcept {
  private ToyParts head;

  public ToyParts getHead() {
    return this.head;
  }

  public void setHead(final ToyParts head) {
    this.head = head;
  }

  private ToyParts arms;

  public ToyParts getArms() {
    return this.arms;
  }

  public void setArms(final ToyParts arms) {
    this.arms = arms;
  }

  private ToyParts legs;

  public ToyParts getLegs() {
    return this.legs;
  }

  public void setLegs(final ToyParts legs) {
    this.legs = legs;
  }

  public String toString() {
    java.lang.StringBuilder _sb = new java.lang.StringBuilder();
    _sb.append("BaseToy");
    _sb.append("(");
    _sb.append(java.lang.String.valueOf(getHead()));
    _sb.append(", ");
    _sb.append(java.lang.String.valueOf(getArms()));
    _sb.append(", ");
    _sb.append(java.lang.String.valueOf(getLegs()));
    _sb.append(")");
    return _sb.toString();
  }

  public boolean equals(final Object obj) {
    if(obj instanceof BaseToy) {
    	BaseToy o = (BaseToy) obj;
    	return true && java.util.Objects.equals(this.getHead(), o.getHead()) && java.util.Objects.equals(this.getArms(), o.getArms()) && java.util.Objects.equals(this.getLegs(), o.getLegs());
    } else {
    	return super.equals(obj);
    }
  }

  public BaseToy() {
    {
    	this.setHead(new ToyParts());
    	
    	this.setArms(new ToyParts());
    	
    	this.setLegs(new ToyParts());
    }
  }

  public BaseToy(final ToyParts head, final ToyParts arms, final ToyParts legs) {
    super();
    
    this.setHead(head);
    this.setArms(arms);
    this.setLegs(legs);
  }

  public Ontology __getDeclaringOntology() {
    return WorkOntology.getInstance();
  }

  private WorkOntology __metadata_BaseToy(final ToyParts head, final ToyParts arms, final ToyParts legs) {
    return null;
  }
}
