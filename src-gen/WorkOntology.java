import jade.core.AID;
import jadescript.content.onto.Ontology;
import jadescript.core.exception.ExceptionThrower;
import jadescript.core.exception.JadescriptException;

@SuppressWarnings("all")
public class WorkOntology extends Ontology implements WorkOntology_Vocabulary {
  private ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__DEFAULT_THROWER;

  public void __handleJadescriptException(final JadescriptException __exc) {
    jadescript.core.exception.ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__getExceptionEscalator(WorkOntology.this);
    boolean __handled = false;
    if(!__handled) {
    	__thrower.__throwJadescriptException(__exc);
    }
  }

  private void __initializeProperties() {
    // Initializing properties and event handlers:
    {
    }
  }

  private static Ontology _superOntology = null;

  private static Ontology __instance = new WorkOntology();

  public static final String __NAME = "WorkOntology";

  public static Ontology getInstance() {
    return __instance;
  }

  public static Price Price(final String item, final Integer price) {
    return new Price(item, price);
  }

  public static ToyParts ToyParts(final String item, final String color) {
    return new ToyParts(item, color);
  }

  public static BaseToy BaseToy(final ToyParts head, final ToyParts arms, final ToyParts legs) {
    return new BaseToy(head, arms, legs);
  }

  public static Request Request(final AID sender, final ToyParts toyPart) {
    return new Request(sender, toyPart);
  }

  public static WorkerStatus WorkerStatus(final AID sender, final Boolean Availability, final Boolean HasMissingPieces) {
    return new WorkerStatus(sender, Availability, HasMissingPieces);
  }

  public static deliverFinishedToy deliverFinishedToy(final BaseToy currentToy) {
    return new deliverFinishedToy(currentToy);
  }

  public static confirmFinishedToy confirmFinishedToy(final BaseToy currentToy) {
    return new confirmFinishedToy(currentToy);
  }

  public static askToy askToy(final AID sender) {
    return new askToy(sender);
  }

  public static deliverNewToy deliverNewToy(final BaseToy currentToy) {
    return new deliverNewToy(currentToy);
  }

  public static askToyParts askToyParts(final ToyParts PreferedPart) {
    return new askToyParts(PreferedPart);
  }

  public static deliverNewToyParts deliverNewToyParts(final ToyParts NewToyPart) {
    return new deliverNewToyParts(NewToyPart);
  }

  public static replyToCoWorkers replyToCoWorkers(final Boolean Availability, final Boolean HasMissingPieces) {
    return new replyToCoWorkers(Availability, HasMissingPieces);
  }

  public static passNeededToyPart passNeededToyPart(final BaseToy currentToy) {
    return new passNeededToyPart(currentToy);
  }

  public static passToyToWorker passToyToWorker(final BaseToy currentToy) {
    return new passToyToWorker(currentToy);
  }

  public static askForHelp askForHelp(final BaseToy currentToy) {
    return new askForHelp(currentToy);
  }

  public static deliverToyPart deliverToyPart(final ToyParts NewToyPart) {
    return new deliverToyPart(NewToyPart);
  }

  public static ComplaintReport ComplaintReport(final AID Supplier) {
    return new ComplaintReport(Supplier);
  }

  public static deliverWorkingReport deliverWorkingReport(final Integer numberOfWorkerRequest, final Integer UnUsedToyParts, final Integer numberOfSupplierRequest, final Integer numberOfFinishedToys, final Integer numberOfPartsPassed, final Integer numberOfToyPassed, final AID workerID) {
    return new deliverWorkingReport(numberOfWorkerRequest, UnUsedToyParts, numberOfSupplierRequest, numberOfFinishedToys, numberOfPartsPassed, numberOfToyPassed, workerID);
  }

  public static resolveTechnicalIssues resolveTechnicalIssues() {
    return new resolveTechnicalIssues();
  }

  public static informOnInitialToy informOnInitialToy() {
    return new informOnInitialToy();
  }

  public static requestAssistance requestAssistance() {
    return new requestAssistance();
  }

  public static sendWorkingReport sendWorkingReport() {
    return new sendWorkingReport();
  }

  public static notifySupervisor notifySupervisor() {
    return new notifySupervisor();
  }

  public WorkOntology() {
    super(__NAME, jadescript.content.onto.Ontology.getInstance(), new jade.content.onto.CFReflectiveIntrospector());
    try {
    	
    	
    	add(new jade.content.schema.ConceptSchema(Price), Price.class);
    	add(new jade.content.schema.ConceptSchema(ToyParts), ToyParts.class);
    	add(new jade.content.schema.ConceptSchema(BaseToy), BaseToy.class);
    	add(new jade.content.schema.ConceptSchema(Request), Request.class);
    	add(new jade.content.schema.ConceptSchema(WorkerStatus), WorkerStatus.class);
    	add(new jade.content.schema.AgentActionSchema(deliverFinishedToy), deliverFinishedToy.class);
    	add(new jade.content.schema.AgentActionSchema(confirmFinishedToy), confirmFinishedToy.class);
    	add(new jade.content.schema.AgentActionSchema(askToy), askToy.class);
    	add(new jade.content.schema.AgentActionSchema(deliverNewToy), deliverNewToy.class);
    	add(new jade.content.schema.AgentActionSchema(askToyParts), askToyParts.class);
    	add(new jade.content.schema.AgentActionSchema(deliverNewToyParts), deliverNewToyParts.class);
    	add(new jade.content.schema.AgentActionSchema(replyToCoWorkers), replyToCoWorkers.class);
    	add(new jade.content.schema.AgentActionSchema(passNeededToyPart), passNeededToyPart.class);
    	add(new jade.content.schema.AgentActionSchema(passToyToWorker), passToyToWorker.class);
    	add(new jade.content.schema.AgentActionSchema(askForHelp), askForHelp.class);
    	add(new jade.content.schema.AgentActionSchema(deliverToyPart), deliverToyPart.class);
    	add(new jade.content.schema.AgentActionSchema(ComplaintReport), ComplaintReport.class);
    	add(new jade.content.schema.PredicateSchema(deliverWorkingReport), deliverWorkingReport.class);
    	add(new jade.content.schema.PredicateSchema(resolveTechnicalIssues), resolveTechnicalIssues.class);
    	add(new jade.content.schema.PredicateSchema(informOnInitialToy), informOnInitialToy.class);
    	add(new jade.content.schema.PredicateSchema(requestAssistance), requestAssistance.class);
    	add(new jade.content.schema.PredicateSchema(sendWorkingReport), sendWorkingReport.class);
    	add(new jade.content.schema.PredicateSchema(notifySupervisor), notifySupervisor.class);
    	
    	
    	
    	
    	jade.content.schema.ConceptSchema _csPrice = (jade.content.schema.ConceptSchema) getSchema(Price);
    _csPrice.add(Price_item, (jade.content.schema.PrimitiveSchema) getSchema(jade.content.onto.BasicOntology.STRING));
    _csPrice.add(Price_price, (jade.content.schema.PrimitiveSchema) getSchema(jade.content.onto.BasicOntology.INTEGER));
    
    	jade.content.schema.ConceptSchema _csToyParts = (jade.content.schema.ConceptSchema) getSchema(ToyParts);
    _csToyParts.add(ToyParts_item, (jade.content.schema.PrimitiveSchema) getSchema(jade.content.onto.BasicOntology.STRING));
    _csToyParts.add(ToyParts_color, (jade.content.schema.PrimitiveSchema) getSchema(jade.content.onto.BasicOntology.STRING));
    
    	jade.content.schema.ConceptSchema _csBaseToy = (jade.content.schema.ConceptSchema) getSchema(BaseToy);
    _csBaseToy.add(BaseToy_head, (jade.content.schema.ConceptSchema) getSchema(ToyParts));
    _csBaseToy.add(BaseToy_arms, (jade.content.schema.ConceptSchema) getSchema(ToyParts));
    _csBaseToy.add(BaseToy_legs, (jade.content.schema.ConceptSchema) getSchema(ToyParts));
    
    	jade.content.schema.ConceptSchema _csRequest = (jade.content.schema.ConceptSchema) getSchema(Request);
    _csRequest.add(Request_sender, (jade.content.schema.ConceptSchema) getSchema(jade.content.lang.sl.SL0Vocabulary.AID));
    _csRequest.add(Request_toyPart, (jade.content.schema.ConceptSchema) getSchema(ToyParts));
    
    	jade.content.schema.ConceptSchema _csWorkerStatus = (jade.content.schema.ConceptSchema) getSchema(WorkerStatus);
    _csWorkerStatus.add(WorkerStatus_sender, (jade.content.schema.ConceptSchema) getSchema(jade.content.lang.sl.SL0Vocabulary.AID));
    _csWorkerStatus.add(WorkerStatus_Availability, (jade.content.schema.PrimitiveSchema) getSchema(jade.content.onto.BasicOntology.BOOLEAN));
    _csWorkerStatus.add(WorkerStatus_HasMissingPieces, (jade.content.schema.PrimitiveSchema) getSchema(jade.content.onto.BasicOntology.BOOLEAN));
    
    	jade.content.schema.AgentActionSchema _asdeliverFinishedToy = (jade.content.schema.AgentActionSchema) getSchema(deliverFinishedToy);
    _asdeliverFinishedToy.add(deliverFinishedToy_currentToy, (jade.content.schema.ConceptSchema) getSchema(BaseToy));
    
    	jade.content.schema.AgentActionSchema _asconfirmFinishedToy = (jade.content.schema.AgentActionSchema) getSchema(confirmFinishedToy);
    _asconfirmFinishedToy.add(confirmFinishedToy_currentToy, (jade.content.schema.ConceptSchema) getSchema(BaseToy));
    
    	jade.content.schema.AgentActionSchema _asaskToy = (jade.content.schema.AgentActionSchema) getSchema(askToy);
    _asaskToy.add(askToy_sender, (jade.content.schema.ConceptSchema) getSchema(jade.content.lang.sl.SL0Vocabulary.AID));
    
    	jade.content.schema.AgentActionSchema _asdeliverNewToy = (jade.content.schema.AgentActionSchema) getSchema(deliverNewToy);
    _asdeliverNewToy.add(deliverNewToy_currentToy, (jade.content.schema.ConceptSchema) getSchema(BaseToy));
    
    	jade.content.schema.AgentActionSchema _asaskToyParts = (jade.content.schema.AgentActionSchema) getSchema(askToyParts);
    _asaskToyParts.add(askToyParts_PreferedPart, (jade.content.schema.ConceptSchema) getSchema(ToyParts));
    
    	jade.content.schema.AgentActionSchema _asdeliverNewToyParts = (jade.content.schema.AgentActionSchema) getSchema(deliverNewToyParts);
    _asdeliverNewToyParts.add(deliverNewToyParts_NewToyPart, (jade.content.schema.ConceptSchema) getSchema(ToyParts));
    
    	jade.content.schema.AgentActionSchema _asreplyToCoWorkers = (jade.content.schema.AgentActionSchema) getSchema(replyToCoWorkers);
    _asreplyToCoWorkers.add(replyToCoWorkers_Availability, (jade.content.schema.PrimitiveSchema) getSchema(jade.content.onto.BasicOntology.BOOLEAN));
    _asreplyToCoWorkers.add(replyToCoWorkers_HasMissingPieces, (jade.content.schema.PrimitiveSchema) getSchema(jade.content.onto.BasicOntology.BOOLEAN));
    
    	jade.content.schema.AgentActionSchema _aspassNeededToyPart = (jade.content.schema.AgentActionSchema) getSchema(passNeededToyPart);
    _aspassNeededToyPart.add(passNeededToyPart_currentToy, (jade.content.schema.ConceptSchema) getSchema(BaseToy));
    
    	jade.content.schema.AgentActionSchema _aspassToyToWorker = (jade.content.schema.AgentActionSchema) getSchema(passToyToWorker);
    _aspassToyToWorker.add(passToyToWorker_currentToy, (jade.content.schema.ConceptSchema) getSchema(BaseToy));
    
    	jade.content.schema.AgentActionSchema _asaskForHelp = (jade.content.schema.AgentActionSchema) getSchema(askForHelp);
    _asaskForHelp.add(askForHelp_currentToy, (jade.content.schema.ConceptSchema) getSchema(BaseToy));
    
    	jade.content.schema.AgentActionSchema _asdeliverToyPart = (jade.content.schema.AgentActionSchema) getSchema(deliverToyPart);
    _asdeliverToyPart.add(deliverToyPart_NewToyPart, (jade.content.schema.ConceptSchema) getSchema(ToyParts));
    
    	jade.content.schema.AgentActionSchema _asComplaintReport = (jade.content.schema.AgentActionSchema) getSchema(ComplaintReport);
    _asComplaintReport.add(ComplaintReport_Supplier, (jade.content.schema.ConceptSchema) getSchema(jade.content.lang.sl.SL0Vocabulary.AID));
    
    	jade.content.schema.PredicateSchema _psdeliverWorkingReport = (jade.content.schema.PredicateSchema) getSchema(deliverWorkingReport);
    _psdeliverWorkingReport.add(deliverWorkingReport_numberOfWorkerRequest, (jade.content.schema.PrimitiveSchema) getSchema(jade.content.onto.BasicOntology.INTEGER));
    _psdeliverWorkingReport.add(deliverWorkingReport_UnUsedToyParts, (jade.content.schema.PrimitiveSchema) getSchema(jade.content.onto.BasicOntology.INTEGER));
    _psdeliverWorkingReport.add(deliverWorkingReport_numberOfSupplierRequest, (jade.content.schema.PrimitiveSchema) getSchema(jade.content.onto.BasicOntology.INTEGER));
    _psdeliverWorkingReport.add(deliverWorkingReport_numberOfFinishedToys, (jade.content.schema.PrimitiveSchema) getSchema(jade.content.onto.BasicOntology.INTEGER));
    _psdeliverWorkingReport.add(deliverWorkingReport_numberOfPartsPassed, (jade.content.schema.PrimitiveSchema) getSchema(jade.content.onto.BasicOntology.INTEGER));
    _psdeliverWorkingReport.add(deliverWorkingReport_numberOfToyPassed, (jade.content.schema.PrimitiveSchema) getSchema(jade.content.onto.BasicOntology.INTEGER));
    _psdeliverWorkingReport.add(deliverWorkingReport_workerID, (jade.content.schema.ConceptSchema) getSchema(jade.content.lang.sl.SL0Vocabulary.AID));
    
    } catch (jade.content.onto.OntologyException e) {
    	e.printStackTrace();
    }
  }
}
