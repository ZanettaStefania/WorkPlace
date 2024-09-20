import jade.content.onto.Ontology;
import jadescript.content.JadescriptConcept;

@SuppressWarnings("all")
public class Price implements JadescriptConcept {
  private String item;

  public String getItem() {
    return this.item;
  }

  public void setItem(final String item) {
    this.item = item;
  }

  private Integer price;

  public Integer getPrice() {
    return this.price;
  }

  public void setPrice(final Integer price) {
    this.price = price;
  }

  public String toString() {
    java.lang.StringBuilder _sb = new java.lang.StringBuilder();
    _sb.append("Price");
    _sb.append("(");
    _sb.append("\"" + java.lang.String.valueOf(getItem()) + "\"");
    _sb.append(", ");
    _sb.append(java.lang.String.valueOf(getPrice()));
    _sb.append(")");
    return _sb.toString();
  }

  public boolean equals(final Object obj) {
    if(obj instanceof Price) {
    	Price o = (Price) obj;
    	return true && java.util.Objects.equals(this.getItem(), o.getItem()) && java.util.Objects.equals(this.getPrice(), o.getPrice());
    } else {
    	return super.equals(obj);
    }
  }

  public Price() {
    {
    	this.setItem("");
    	
    	this.setPrice(0);
    }
  }

  public Price(final String item, final Integer price) {
    super();
    
    this.setItem(item);
    this.setPrice(price);
  }

  public Ontology __getDeclaringOntology() {
    return WorkOntology.getInstance();
  }

  private WorkOntology __metadata_Price(final String item, final Integer price) {
    return null;
  }
}
