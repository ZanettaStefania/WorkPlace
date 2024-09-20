import jadescript.content.onto.Ontology_Vocabulary;

@SuppressWarnings("all")
public interface WorkOntology_Vocabulary extends Ontology_Vocabulary {
  public static final String Price = "Price";

  public static final String Price_item = "item";

  public static final String Price_price = "price";

  public static final String ToyParts = "ToyParts";

  public static final String ToyParts_item = "item";

  public static final String ToyParts_color = "color";

  public static final String BaseToy = "BaseToy";

  public static final String BaseToy_head = "head";

  public static final String BaseToy_arms = "arms";

  public static final String BaseToy_legs = "legs";

  public static final String Request = "Request";

  public static final String Request_sender = "sender";

  public static final String Request_toyPart = "toyPart";

  public static final String WorkerStatus = "WorkerStatus";

  public static final String WorkerStatus_sender = "sender";

  public static final String WorkerStatus_Availability = "Availability";

  public static final String WorkerStatus_HasMissingPieces = "HasMissingPieces";

  public static final String deliverFinishedToy = "deliverFinishedToy";

  public static final String deliverFinishedToy_currentToy = "currentToy";

  public static final String confirmFinishedToy = "confirmFinishedToy";

  public static final String confirmFinishedToy_currentToy = "currentToy";

  public static final String askToy = "askToy";

  public static final String askToy_sender = "sender";

  public static final String deliverNewToy = "deliverNewToy";

  public static final String deliverNewToy_currentToy = "currentToy";

  public static final String askToyParts = "askToyParts";

  public static final String askToyParts_PreferedPart = "PreferedPart";

  public static final String deliverNewToyParts = "deliverNewToyParts";

  public static final String deliverNewToyParts_NewToyPart = "NewToyPart";

  public static final String replyToCoWorkers = "replyToCoWorkers";

  public static final String replyToCoWorkers_Availability = "Availability";

  public static final String replyToCoWorkers_HasMissingPieces = "HasMissingPieces";

  public static final String passNeededToyPart = "passNeededToyPart";

  public static final String passNeededToyPart_currentToy = "currentToy";

  public static final String passToyToWorker = "passToyToWorker";

  public static final String passToyToWorker_currentToy = "currentToy";

  public static final String askForHelp = "askForHelp";

  public static final String askForHelp_currentToy = "currentToy";

  public static final String deliverToyPart = "deliverToyPart";

  public static final String deliverToyPart_NewToyPart = "NewToyPart";

  public static final String ComplaintReport = "ComplaintReport";

  public static final String ComplaintReport_Supplier = "Supplier";

  public static final String deliverWorkingReport = "deliverWorkingReport";

  public static final String deliverWorkingReport_numberOfWorkerRequest = "numberOfWorkerRequest";

  public static final String deliverWorkingReport_UnUsedToyParts = "UnUsedToyParts";

  public static final String deliverWorkingReport_numberOfSupplierRequest = "numberOfSupplierRequest";

  public static final String deliverWorkingReport_numberOfFinishedToys = "numberOfFinishedToys";

  public static final String deliverWorkingReport_numberOfPartsPassed = "numberOfPartsPassed";

  public static final String deliverWorkingReport_numberOfToyPassed = "numberOfToyPassed";

  public static final String deliverWorkingReport_workerID = "workerID";

  public static final String resolveTechnicalIssues = "resolveTechnicalIssues";

  public static final String informOnInitialToy = "informOnInitialToy";

  public static final String requestAssistance = "requestAssistance";

  public static final String sendWorkingReport = "sendWorkingReport";

  public static final String notifySupervisor = "notifySupervisor";
}
