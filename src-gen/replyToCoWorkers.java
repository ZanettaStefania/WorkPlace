import jade.content.onto.Ontology;
import jadescript.content.JadescriptAction;

@SuppressWarnings("all")
public class replyToCoWorkers implements JadescriptAction {
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
    _sb.append("replyToCoWorkers");
    _sb.append("(");
    _sb.append(java.lang.String.valueOf(getAvailability()));
    _sb.append(", ");
    _sb.append(java.lang.String.valueOf(getHasMissingPieces()));
    _sb.append(")");
    return _sb.toString();
  }

  public boolean equals(final Object obj) {
    if(obj instanceof replyToCoWorkers) {
    	replyToCoWorkers o = (replyToCoWorkers) obj;
    	return true && java.util.Objects.equals(this.getAvailability(), o.getAvailability()) && java.util.Objects.equals(this.getHasMissingPieces(), o.getHasMissingPieces());
    } else {
    	return super.equals(obj);
    }
  }

  public replyToCoWorkers() {
    {
    	this.setAvailability(false);
    	
    	this.setHasMissingPieces(false);
    }
  }

  public replyToCoWorkers(final Boolean Availability, final Boolean HasMissingPieces) {
    super();
    
    this.setAvailability(Availability);
    this.setHasMissingPieces(HasMissingPieces);
  }

  public Ontology __getDeclaringOntology() {
    return WorkOntology.getInstance();
  }

  private WorkOntology __metadata_replyToCoWorkers(final Boolean Availability, final Boolean HasMissingPieces) {
    return null;
  }
}
