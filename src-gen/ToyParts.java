import jade.content.onto.Ontology;
import jadescript.content.JadescriptConcept;

@SuppressWarnings("all")
public class ToyParts implements JadescriptConcept {
  private String item;

  public String getItem() {
    return this.item;
  }

  public void setItem(final String item) {
    this.item = item;
  }

  private String color;

  public String getColor() {
    return this.color;
  }

  public void setColor(final String color) {
    this.color = color;
  }

  public String toString() {
    java.lang.StringBuilder _sb = new java.lang.StringBuilder();
    _sb.append("ToyParts");
    _sb.append("(");
    _sb.append("\"" + java.lang.String.valueOf(getItem()) + "\"");
    _sb.append(", ");
    _sb.append("\"" + java.lang.String.valueOf(getColor()) + "\"");
    _sb.append(")");
    return _sb.toString();
  }

  public boolean equals(final Object obj) {
    if(obj instanceof ToyParts) {
    	ToyParts o = (ToyParts) obj;
    	return true && java.util.Objects.equals(this.getItem(), o.getItem()) && java.util.Objects.equals(this.getColor(), o.getColor());
    } else {
    	return super.equals(obj);
    }
  }

  public ToyParts() {
    {
    	this.setItem("");
    	
    	this.setColor("");
    }
  }

  public ToyParts(final String item, final String color) {
    super();
    
    this.setItem(item);
    this.setColor(color);
  }

  public Ontology __getDeclaringOntology() {
    return WorkOntology.getInstance();
  }

  private WorkOntology __metadata_ToyParts(final String item, final String color) {
    return null;
  }
}
