import jade.content.onto.Ontology;
import jade.core.AID;
import jadescript.content.JadescriptConcept;

@SuppressWarnings("all")
public class WorkerStatus implements JadescriptConcept {
  private AID sender;

  public AID getSender() {
    return this.sender;
  }

  public void setSender(final AID sender) {
    this.sender = sender;
  }

  private Boolean Availability;

  public Boolean getAvailability() {
    return this.Availability;
  }

  public void setAvailability(final Boolean Availability) {
    this.Availability = Availability;
  }

  private Boolean HasMissingPieces;

  public Boolean getHasMissingPieces() {
    return this.HasMissingPieces;
  }

  public void setHasMissingPieces(final Boolean HasMissingPieces) {
    this.HasMissingPieces = HasMissingPieces;
  }

  public String toString() {
    java.lang.StringBuilder _sb = new java.lang.StringBuilder();
    _sb.append("WorkerStatus");
    _sb.append("(");
    _sb.append(java.lang.String.valueOf(getSender()));
    _sb.append(", ");
    _sb.append(java.lang.String.valueOf(getAvailability()));
    _sb.append(", ");
    _sb.append(java.lang.String.valueOf(getHasMissingPieces()));
    _sb.append(")");
    return _sb.toString();
  }

  public boolean equals(final Object obj) {
    if(obj instanceof WorkerStatus) {
    	WorkerStatus o = (WorkerStatus) obj;
    	return true && java.util.Objects.equals(this.getSender(), o.getSender()) && java.util.Objects.equals(this.getAvailability(), o.getAvailability()) && java.util.Objects.equals(this.getHasMissingPieces(), o.getHasMissingPieces());
    } else {
    	return super.equals(obj);
    }
  }

  public WorkerStatus() {
    {
    	this.setSender(new jade.core.AID());
    	
    	this.setAvailability(false);
    	
    	this.setHasMissingPieces(false);
    }
  }

  public WorkerStatus(final AID sender, final Boolean Availability, final Boolean HasMissingPieces) {
    super();
    
    this.setSender(sender);
    this.setAvailability(Availability);
    this.setHasMissingPieces(HasMissingPieces);
  }

  public Ontology __getDeclaringOntology() {
    return WorkOntology.getInstance();
  }

  private WorkOntology __metadata_WorkerStatus(final AID sender, final Boolean Availability, final Boolean HasMissingPieces) {
    return null;
  }
}
