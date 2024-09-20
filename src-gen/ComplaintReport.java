import jade.content.onto.Ontology;
import jade.core.AID;
import jadescript.content.JadescriptAction;

@SuppressWarnings("all")
public class ComplaintReport implements JadescriptAction {
  private AID Supplier;

  public AID getSupplier() {
    return this.Supplier;
  }

  public void setSupplier(final AID Supplier) {
    this.Supplier = Supplier;
  }

  public String toString() {
    java.lang.StringBuilder _sb = new java.lang.StringBuilder();
    _sb.append("ComplaintReport");
    _sb.append("(");
    _sb.append(java.lang.String.valueOf(getSupplier()));
    _sb.append(")");
    return _sb.toString();
  }

  public boolean equals(final Object obj) {
    if(obj instanceof ComplaintReport) {
    	ComplaintReport o = (ComplaintReport) obj;
    	return true && java.util.Objects.equals(this.getSupplier(), o.getSupplier());
    } else {
    	return super.equals(obj);
    }
  }

  public ComplaintReport() {
    {
    	this.setSupplier(new jade.core.AID());
    }
  }

  public ComplaintReport(final AID Supplier) {
    super();
    
    this.setSupplier(Supplier);
  }

  public Ontology __getDeclaringOntology() {
    return WorkOntology.getInstance();
  }

  private WorkOntology __metadata_ComplaintReport(final AID Supplier) {
    return null;
  }
}
