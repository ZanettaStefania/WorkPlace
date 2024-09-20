import jade.content.onto.Ontology;
import jadescript.content.JadescriptAction;

@SuppressWarnings("all")
public class confirmFinishedToy implements JadescriptAction {
  private BaseToy currentToy;

  public BaseToy getCurrentToy() {
    return this.currentToy;
  }

  public void setCurrentToy(final BaseToy currentToy) {
    this.currentToy = currentToy;
  }

  public String toString() {
    java.lang.StringBuilder _sb = new java.lang.StringBuilder();
    _sb.append("confirmFinishedToy");
    _sb.append("(");
    _sb.append(java.lang.String.valueOf(getCurrentToy()));
    _sb.append(")");
    return _sb.toString();
  }

  public boolean equals(final Object obj) {
    if(obj instanceof confirmFinishedToy) {
    	confirmFinishedToy o = (confirmFinishedToy) obj;
    	return true && java.util.Objects.equals(this.getCurrentToy(), o.getCurrentToy());
    } else {
    	return super.equals(obj);
    }
  }

  public confirmFinishedToy() {
    {
    	this.setCurrentToy(new BaseToy());
    }
  }

  public confirmFinishedToy(final BaseToy currentToy) {
    super();
    
    this.setCurrentToy(currentToy);
  }

  public Ontology __getDeclaringOntology() {
    return WorkOntology.getInstance();
  }

  private WorkOntology __metadata_confirmFinishedToy(final BaseToy currentToy) {
    return null;
  }
}
