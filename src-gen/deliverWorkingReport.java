import jade.content.onto.Ontology;
import jade.core.AID;
import jadescript.content.JadescriptPredicate;

@SuppressWarnings("all")
public class deliverWorkingReport implements JadescriptPredicate {
  private Integer numberOfWorkerRequest;

  public Integer getNumberOfWorkerRequest() {
    return this.numberOfWorkerRequest;
  }

  public void setNumberOfWorkerRequest(final Integer numberOfWorkerRequest) {
    this.numberOfWorkerRequest = numberOfWorkerRequest;
  }

  private Integer UnUsedToyParts;

  public Integer getUnUsedToyParts() {
    return this.UnUsedToyParts;
  }

  public void setUnUsedToyParts(final Integer UnUsedToyParts) {
    this.UnUsedToyParts = UnUsedToyParts;
  }

  private Integer numberOfSupplierRequest;

  public Integer getNumberOfSupplierRequest() {
    return this.numberOfSupplierRequest;
  }

  public void setNumberOfSupplierRequest(final Integer numberOfSupplierRequest) {
    this.numberOfSupplierRequest = numberOfSupplierRequest;
  }

  private Integer numberOfFinishedToys;

  public Integer getNumberOfFinishedToys() {
    return this.numberOfFinishedToys;
  }

  public void setNumberOfFinishedToys(final Integer numberOfFinishedToys) {
    this.numberOfFinishedToys = numberOfFinishedToys;
  }

  private Integer numberOfPartsPassed;

  public Integer getNumberOfPartsPassed() {
    return this.numberOfPartsPassed;
  }

  public void setNumberOfPartsPassed(final Integer numberOfPartsPassed) {
    this.numberOfPartsPassed = numberOfPartsPassed;
  }

  private Integer numberOfToyPassed;

  public Integer getNumberOfToyPassed() {
    return this.numberOfToyPassed;
  }

  public void setNumberOfToyPassed(final Integer numberOfToyPassed) {
    this.numberOfToyPassed = numberOfToyPassed;
  }

  private AID workerID;

  public AID getWorkerID() {
    return this.workerID;
  }

  public void setWorkerID(final AID workerID) {
    this.workerID = workerID;
  }

  public String toString() {
    java.lang.StringBuilder _sb = new java.lang.StringBuilder();
    _sb.append("deliverWorkingReport");
    _sb.append("(");
    _sb.append(java.lang.String.valueOf(getNumberOfWorkerRequest()));
    _sb.append(", ");
    _sb.append(java.lang.String.valueOf(getUnUsedToyParts()));
    _sb.append(", ");
    _sb.append(java.lang.String.valueOf(getNumberOfSupplierRequest()));
    _sb.append(", ");
    _sb.append(java.lang.String.valueOf(getNumberOfFinishedToys()));
    _sb.append(", ");
    _sb.append(java.lang.String.valueOf(getNumberOfPartsPassed()));
    _sb.append(", ");
    _sb.append(java.lang.String.valueOf(getNumberOfToyPassed()));
    _sb.append(", ");
    _sb.append(java.lang.String.valueOf(getWorkerID()));
    _sb.append(")");
    return _sb.toString();
  }

  public boolean equals(final Object obj) {
    if(obj instanceof deliverWorkingReport) {
    	deliverWorkingReport o = (deliverWorkingReport) obj;
    	return true && java.util.Objects.equals(this.getNumberOfWorkerRequest(), o.getNumberOfWorkerRequest()) && java.util.Objects.equals(this.getUnUsedToyParts(), o.getUnUsedToyParts()) && java.util.Objects.equals(this.getNumberOfSupplierRequest(), o.getNumberOfSupplierRequest()) && java.util.Objects.equals(this.getNumberOfFinishedToys(), o.getNumberOfFinishedToys()) && java.util.Objects.equals(this.getNumberOfPartsPassed(), o.getNumberOfPartsPassed()) && java.util.Objects.equals(this.getNumberOfToyPassed(), o.getNumberOfToyPassed()) && java.util.Objects.equals(this.getWorkerID(), o.getWorkerID());
    } else {
    	return super.equals(obj);
    }
  }

  public deliverWorkingReport() {
    {
    	this.setNumberOfWorkerRequest(0);
    	
    	this.setUnUsedToyParts(0);
    	
    	this.setNumberOfSupplierRequest(0);
    	
    	this.setNumberOfFinishedToys(0);
    	
    	this.setNumberOfPartsPassed(0);
    	
    	this.setNumberOfToyPassed(0);
    	
    	this.setWorkerID(new jade.core.AID());
    }
  }

  public deliverWorkingReport(final Integer numberOfWorkerRequest, final Integer UnUsedToyParts, final Integer numberOfSupplierRequest, final Integer numberOfFinishedToys, final Integer numberOfPartsPassed, final Integer numberOfToyPassed, final AID workerID) {
    super();
    
    this.setNumberOfWorkerRequest(numberOfWorkerRequest);
    this.setUnUsedToyParts(UnUsedToyParts);
    this.setNumberOfSupplierRequest(numberOfSupplierRequest);
    this.setNumberOfFinishedToys(numberOfFinishedToys);
    this.setNumberOfPartsPassed(numberOfPartsPassed);
    this.setNumberOfToyPassed(numberOfToyPassed);
    this.setWorkerID(workerID);
  }

  public Ontology __getDeclaringOntology() {
    return WorkOntology.getInstance();
  }

  private WorkOntology __metadata_deliverWorkingReport(final Integer numberOfWorkerRequest, final Integer UnUsedToyParts, final Integer numberOfSupplierRequest, final Integer numberOfFinishedToys, final Integer numberOfPartsPassed, final Integer numberOfToyPassed, final AID workerID) {
    return null;
  }
}
