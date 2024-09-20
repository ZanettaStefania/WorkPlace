import jade.content.ContentManager;
import jade.content.lang.Codec;
import jade.core.AID;
import jade.wrapper.ContainerController;
import jade.wrapper.StaleProxyException;
import jadescript.content.JadescriptProposition;
import jadescript.core.Agent;
import jadescript.core.exception.ExceptionThrower;
import jadescript.core.exception.JadescriptException;
import jadescript.java.AgentEnv;
import jadescript.java.JadescriptAgentController;
import jadescript.java.SideEffectsFlag;
import jadescript.util.JadescriptList;

@SuppressWarnings("all")
public class Worker extends Agent {
  private Worker __theAgent = (Worker)/*Used as metadata*/null;

  private AgentEnv<Worker, SideEffectsFlag.AnySideEffectFlag> _agentEnv = null;

  public WorkOntology __ontology__WorkOntology = (WorkOntology) WorkOntology.getInstance();

  public void __registerOntologies(final ContentManager cm) {
    super.__registerOntologies(cm);
    cm.registerOntology(WorkOntology.getInstance());
  }

  public Codec __codec = new jade.content.lang.leap.LEAPCodec();

  protected String favoriteColor = null;

  public void setFavoriteColor(final String favoriteColor) {
    this.favoriteColor = favoriteColor;
  }

  public String getFavoriteColor() {
    return this.favoriteColor;
  }

  protected JadescriptList<ToyParts> favoriteToyParts = null;

  public void setFavoriteToyParts(final JadescriptList<ToyParts> favoriteToyParts) {
    this.favoriteToyParts = favoriteToyParts;
  }

  public JadescriptList<ToyParts> getFavoriteToyParts() {
    return this.favoriteToyParts;
  }

  protected JadescriptList<AID> nearbyWorkers = null;

  public void setNearbyWorkers(final JadescriptList<AID> nearbyWorkers) {
    this.nearbyWorkers = nearbyWorkers;
  }

  public JadescriptList<AID> getNearbyWorkers() {
    return this.nearbyWorkers;
  }

  protected String currentTask = null;

  public void setCurrentTask(final String currentTask) {
    this.currentTask = currentTask;
  }

  public String getCurrentTask() {
    return this.currentTask;
  }

  protected JadescriptList<ToyParts> myInventory = null;

  public void setMyInventory(final JadescriptList<ToyParts> myInventory) {
    this.myInventory = myInventory;
  }

  public JadescriptList<ToyParts> getMyInventory() {
    return this.myInventory;
  }

  protected Boolean hasToy = null;

  public void setHasToy(final Boolean hasToy) {
    this.hasToy = hasToy;
  }

  public Boolean getHasToy() {
    return this.hasToy;
  }

  protected BaseToy currentToy = null;

  public void setCurrentToy(final BaseToy currentToy) {
    this.currentToy = currentToy;
  }

  public BaseToy getCurrentToy() {
    return this.currentToy;
  }

  protected Boolean hasAnyFriendWorkers = null;

  public void setHasAnyFriendWorkers(final Boolean hasAnyFriendWorkers) {
    this.hasAnyFriendWorkers = hasAnyFriendWorkers;
  }

  public Boolean getHasAnyFriendWorkers() {
    return this.hasAnyFriendWorkers;
  }

  protected AID Supervisor = null;

  public void setSupervisor(final AID Supervisor) {
    this.Supervisor = Supervisor;
  }

  public AID getSupervisor() {
    return this.Supervisor;
  }

  protected AID Supplier = null;

  public void setSupplier(final AID Supplier) {
    this.Supplier = Supplier;
  }

  public AID getSupplier() {
    return this.Supplier;
  }

  protected Boolean waiting_Supplier = null;

  public void setWaiting_Supplier(final Boolean waiting_Supplier) {
    this.waiting_Supplier = waiting_Supplier;
  }

  public Boolean getWaiting_Supplier() {
    return this.waiting_Supplier;
  }

  protected Boolean waiting_CoWorkers = null;

  public void setWaiting_CoWorkers(final Boolean waiting_CoWorkers) {
    this.waiting_CoWorkers = waiting_CoWorkers;
  }

  public Boolean getWaiting_CoWorkers() {
    return this.waiting_CoWorkers;
  }

  protected Boolean waiting_Supervisor = null;

  public void setWaiting_Supervisor(final Boolean waiting_Supervisor) {
    this.waiting_Supervisor = waiting_Supervisor;
  }

  public Boolean getWaiting_Supervisor() {
    return this.waiting_Supervisor;
  }

  protected Integer numberNeighbours = null;

  public void setNumberNeighbours(final Integer numberNeighbours) {
    this.numberNeighbours = numberNeighbours;
  }

  public Integer getNumberNeighbours() {
    return this.numberNeighbours;
  }

  protected Boolean WorkerManager = null;

  public void setWorkerManager(final Boolean WorkerManager) {
    this.WorkerManager = WorkerManager;
  }

  public Boolean getWorkerManager() {
    return this.WorkerManager;
  }

  protected Integer numberOfWorkerRequest = null;

  public void setNumberOfWorkerRequest(final Integer numberOfWorkerRequest) {
    this.numberOfWorkerRequest = numberOfWorkerRequest;
  }

  public Integer getNumberOfWorkerRequest() {
    return this.numberOfWorkerRequest;
  }

  protected Integer numberOfSupplierRequest = null;

  public void setNumberOfSupplierRequest(final Integer numberOfSupplierRequest) {
    this.numberOfSupplierRequest = numberOfSupplierRequest;
  }

  public Integer getNumberOfSupplierRequest() {
    return this.numberOfSupplierRequest;
  }

  protected Integer numberOfFinishedToys = null;

  public void setNumberOfFinishedToys(final Integer numberOfFinishedToys) {
    this.numberOfFinishedToys = numberOfFinishedToys;
  }

  public Integer getNumberOfFinishedToys() {
    return this.numberOfFinishedToys;
  }

  protected Integer numberOfPartsPassed = null;

  public void setNumberOfPartsPassed(final Integer numberOfPartsPassed) {
    this.numberOfPartsPassed = numberOfPartsPassed;
  }

  public Integer getNumberOfPartsPassed() {
    return this.numberOfPartsPassed;
  }

  protected Integer numberOfToyPassed = null;

  public void setNumberOfToyPassed(final Integer numberOfToyPassed) {
    this.numberOfToyPassed = numberOfToyPassed;
  }

  public Integer getNumberOfToyPassed() {
    return this.numberOfToyPassed;
  }

  protected Boolean stopWorking = null;

  public void setStopWorking(final Boolean stopWorking) {
    this.stopWorking = stopWorking;
  }

  public Boolean getStopWorking() {
    return this.stopWorking;
  }

  private void __onCreate() {
    jadescript.util.JadescriptList<java.lang.String> args = new jadescript.util.JadescriptList<String>();
    if(this.getArguments() != null) {
    	for ( java.lang.Object o : this.getArguments()) {
    		args.add((String) o);
    	}
    }
    try {
    	/* 
    	 * Compiled from source statement at line 32
    	 * hasToy of agent = false
    	 */
    	
    	_agentEnv.getAgent().setHasToy(false);
    	
    	/* 
    	 * Compiled from source statement at line 33
    	 * WorkerManager of agent = false
    	 */
    	
    	_agentEnv.getAgent().setWorkerManager(false);
    	
    	/* 
    	 * Compiled from source statement at line 34
    	 * waiting_Supervisor of agent = false
    	 */
    	
    	_agentEnv.getAgent().setWaiting_Supervisor(false);
    	
    	/* 
    	 * Compiled from source statement at line 35
    	 * waiting_Supplier of agent = false
    	 */
    	
    	_agentEnv.getAgent().setWaiting_Supplier(false);
    	
    	/* 
    	 * Compiled from source statement at line 36
    	 * waiting_CoWorkers of agent = false
    	 */
    	
    	_agentEnv.getAgent().setWaiting_CoWorkers(false);
    	
    	/* 
    	 * Compiled from source statement at line 38
    	 * initializeWorker(args)
    	 */
    	
    	Worker.this.initializeWorker(_agentEnv.getAgent().toEnv() ,args);
    	
    	/* 
    	 * Compiled from source statement at line 39
    	 * log "Agent 'Worker' created with arguments: "+ args + " + " + myInventory of agent
    	 */
    	
    	jadescript.core.Agent.doLog(jade.util.Logger.INFO, Worker.this.getClass().getName(), Worker.this, "on create", java.lang.String.valueOf(java.lang.String.valueOf(java.lang.String.valueOf(java.lang.String.valueOf("Agent 'Worker' created with arguments: ") + java.lang.String.valueOf(args)) + java.lang.String.valueOf(" + ")) + java.lang.String.valueOf(_agentEnv.getAgent().getMyInventory())));
    	
    	/* 
    	 * Compiled from source statement at line 40
    	 * favoriteToyParts of agent = [ToyParts("head", favoriteColor of agent), ToyParts("arms", favoriteColor of agent), ToyParts("legs", favoriteColor of agent)]
    	 */
    	
    	_agentEnv.getAgent().setFavoriteToyParts(jadescript.util.JadescriptCollections.createList(java.util.List.of(WorkOntology.ToyParts("head" ,_agentEnv.getAgent().getFavoriteColor()), WorkOntology.ToyParts("arms" ,_agentEnv.getAgent().getFavoriteColor()), WorkOntology.ToyParts("legs" ,_agentEnv.getAgent().getFavoriteColor()))));
    	
    	/* 
    	 * Compiled from source statement at line 42
    	 * currentTask of agent = "WorkOnToy"
    	 */
    	
    	_agentEnv.getAgent().setCurrentTask("WorkOnToy");
    	
    	/* 
    	 * Compiled from source statement at line 43
    	 * activate AddPieceBehavior
    	 */
    	
    	new AddPieceBehavior(_agentEnv.getAgent().toEnv()).activate(_agentEnv.getAgent());
    	
    	/* 
    	 * Compiled from source statement at line 44
    	 * activate listenWorkers
    	 */
    	
    	new listenWorkers(_agentEnv.getAgent().toEnv()).activate(_agentEnv.getAgent());
    	
    	/* 
    	 * Compiled from source statement at line 45
    	 * activate notifyWorkerToSupervisor
    	 */
    	
    	new notifyWorkerToSupervisor(_agentEnv.getAgent().toEnv()).activate(_agentEnv.getAgent());
    	
    	/* 
    	 * Compiled from source statement at line 46
    	 * activate EndOfShift
    	 */
    	
    	new EndOfShift(_agentEnv.getAgent().toEnv()).activate(_agentEnv.getAgent());
    	
    	/* 
    	 * Compiled from source statement from line 48 to line 49
    	 * if hasToy do
    	 *             send message inform informOnInitialToy to Supervisor
    	 */
    	
    	if(Worker.this.getHasToy()) {
    		/* 
    		 * Compiled from source statement at line 49
    		 * send message inform informOnInitialToy to Supervisor
    		 */
    		
    		try {
    			jadescript.util.SendMessageUtils.validatePerformative("inform");
    			
    			java.lang.Object _contentToBeSent786617826 = WorkOntology.informOnInitialToy();
    			
    			jadescript.core.message.Message _synthesizedMessage786617826 = new jadescript.core.message.Message(jadescript.core.message.Message.INFORM);
    			
    			_synthesizedMessage786617826.setOntology(jadescript.util.SendMessageUtils.getDeclaringOntology(_contentToBeSent786617826,WorkOntology.getInstance(),WorkOntology.getInstance()).getName());;
    			
    			_synthesizedMessage786617826.setLanguage(__codec.getName());;
    			
    			_synthesizedMessage786617826.addReceiver(Worker.this.getSupervisor());
    			
    			_agentEnv.getAgent().getContentManager().fillContent(_synthesizedMessage786617826, jadescript.content.onto.MessageContent.prepareContent((jade.content.ContentElement) _contentToBeSent786617826, "inform"));
    			
    			_agentEnv.getAgent().send(_synthesizedMessage786617826);
    		}
    		catch(java.lang.Throwable _t) {
    			throw jadescript.core.exception.JadescriptException.wrap(_t);
    		}
    	}
    }
    catch(jadescript.core.exception.JadescriptException __throwable) {
    	__handleJadescriptException(__throwable);
    }
    catch(java.lang.Throwable __throwable) {
    	__handleJadescriptException(jadescript.core.exception.JadescriptException.wrap(__throwable));
    }
  }

  /**
   * Worker on destroy
   */
  protected void __onDestroy() {
    super.__onDestroy();
    getContentManager().registerLanguage(__codec);
    
    try {
    	/* 
    	 * Compiled from source statement at line 53
    	 * log "- WORKER " + name of agent + " : INVENTORY " + myInventory of agent
    	 */
    	
    	jadescript.core.Agent.doLog(jade.util.Logger.INFO, Worker.this.getClass().getName(), Worker.this, "on destroy", java.lang.String.valueOf(java.lang.String.valueOf(java.lang.String.valueOf(java.lang.String.valueOf("- WORKER ") + java.lang.String.valueOf(_agentEnv.getAgent().getName())) + java.lang.String.valueOf(" : INVENTORY ")) + java.lang.String.valueOf(_agentEnv.getAgent().getMyInventory())));
    	
    	/* 
    	 * Compiled from source statement from line 54 to line 55
    	 * if hasToy do
    	 *             log "- WORKER " + name of agent + " : TOY " + currentToy of agent
    	 */
    	
    	if(Worker.this.getHasToy()) {
    		/* 
    		 * Compiled from source statement at line 55
    		 * log "- WORKER " + name of agent + " : TOY " + currentToy of agent
    		 */
    		
    		jadescript.core.Agent.doLog(jade.util.Logger.INFO, Worker.this.getClass().getName(), Worker.this, "on destroy", java.lang.String.valueOf(java.lang.String.valueOf(java.lang.String.valueOf(java.lang.String.valueOf("- WORKER ") + java.lang.String.valueOf(_agentEnv.getAgent().getName())) + java.lang.String.valueOf(" : TOY ")) + java.lang.String.valueOf(_agentEnv.getAgent().getCurrentToy())));
    	}
    	
    	/* 
    	 * Compiled from source statement at line 56
    	 * 
    	 *         log "- WORKER " + name of agent + " : STATUS " + currentTask of agent
    	 */
    	
    	jadescript.core.Agent.doLog(jade.util.Logger.INFO, Worker.this.getClass().getName(), Worker.this, "on destroy", java.lang.String.valueOf(java.lang.String.valueOf(java.lang.String.valueOf(java.lang.String.valueOf("- WORKER ") + java.lang.String.valueOf(_agentEnv.getAgent().getName())) + java.lang.String.valueOf(" : STATUS ")) + java.lang.String.valueOf(_agentEnv.getAgent().getCurrentTask())));
    }
    catch(jadescript.core.exception.JadescriptException __throwable) {
    	__handleJadescriptException(__throwable);
    }
    catch(java.lang.Throwable __throwable) {
    	__handleJadescriptException(jadescript.core.exception.JadescriptException.wrap(__throwable));
    }
  }

  public Boolean initializeWorker(final AgentEnv<? extends Worker, ? extends SideEffectsFlag.WithSideEffects> _agentEnv, final JadescriptList<String> arg_list) {
    {
    	/* 
    	 * Compiled from source statement at line 60
    	 * numberNeighbours of agent = 0
    	 */
    	
    	_agentEnv.getAgent().setNumberNeighbours(0);
    	
    	/* 
    	 * Compiled from source statement from line 61 to line 92
    	 * for item_ in arg_list do
    	 *             
    	 *             if item_ = "true" do
    	 *                 currentToy of agent = BaseToy(ToyParts("head", "empty"), ToyParts("arms", "empty"), ToyParts("legs", "empty"))
    	 *                 hasToy of agent = true
    	 *                 WorkerManager of agent = true
    	 *                 continue
    	 *             
    	 *             if item_[0] = "i" do
    	 *                 if item_[3] = "1" do
    	 *                     myInventory of agent = [ToyParts("head", "red"), ToyParts("head", "blu"), ToyParts("head", "yellow")] of ToyParts
    	 *                 if item_[3] = "2" do
    	 *                     myInventory of agent = [ToyParts("arms", "red"), ToyParts("arms", "blu"), ToyParts("arms", "yellow")] of ToyParts
    	 *                 if item_[3] ="3" do
    	 *                     myInventory of agent = [ToyParts("legs", "red"), ToyParts("legs", "blu"), ToyParts("legs", "yellow")] of ToyParts
    	 *                 continue
    	 * 
    	 *             if item_[0] = "b" or item_[0] = "r" or item_[0] = "y" do
    	 *                 favoriteColor of agent = item_
    	 *                 continue
    	 *             
    	 *             if item_[0] = "W" do
    	 *                 hasAnyFriendWorkers of agent = true
    	 *                 add item_ as aid to nearbyWorkers of agent
    	 *                 numberNeighbours of agent = numberNeighbours + 1
    	 * 
    	 *             else do
    	 *                 temp = item_[0]+item_[1]+item_[2]+item_[3]
    	 *                 if temp = "Supe" do
    	 *                     Supervisor of agent = item_ as aid
    	 *                 if temp = "Supp" do
    	 *                     Supplier of agent = item_ as aid
    	 */
    	
    	for ( java.lang.String item_ : arg_list) {
    		/* 
    		 * Compiled from source statement from line 63 to line 67
    		 * if item_ = "true" do
    		 *                 currentToy of agent = BaseToy(ToyParts("head", "empty"), ToyParts("arms", "empty"), ToyParts("legs", "empty"))
    		 *                 hasToy of agent = true
    		 *                 WorkerManager of agent = true
    		 *                 continue
    		 */
    		
    		if(java.util.Objects.equals(item_, "true")) {
    			/* 
    			 * Compiled from source statement at line 64
    			 * currentToy of agent = BaseToy(ToyParts("head", "empty"), ToyParts("arms", "empty"), ToyParts("legs", "empty"))
    			 */
    			
    			_agentEnv.getAgent().setCurrentToy(WorkOntology.BaseToy(WorkOntology.ToyParts("head" ,"empty") ,WorkOntology.ToyParts("arms" ,"empty") ,WorkOntology.ToyParts("legs" ,"empty")));
    			
    			/* 
    			 * Compiled from source statement at line 65
    			 * hasToy of agent = true
    			 */
    			
    			_agentEnv.getAgent().setHasToy(true);
    			
    			/* 
    			 * Compiled from source statement at line 66
    			 * WorkerManager of agent = true
    			 */
    			
    			_agentEnv.getAgent().setWorkerManager(true);
    			
    			/* 
    			 * Compiled from source statement at line 67
    			 * continue
    			 */
    			
    			continue;
    		}
    		
    		/* 
    		 * Compiled from source statement from line 69 to line 76
    		 * 
    		 *             
    		 *             if item_[0] = "i" do
    		 *                 if item_[3] = "1" do
    		 *                     myInventory of agent = [ToyParts("head", "red"), ToyParts("head", "blu"), ToyParts("head", "yellow")] of ToyParts
    		 *                 if item_[3] = "2" do
    		 *                     myInventory of agent = [ToyParts("arms", "red"), ToyParts("arms", "blu"), ToyParts("arms", "yellow")] of ToyParts
    		 *                 if item_[3] ="3" do
    		 *                     myInventory of agent = [ToyParts("legs", "red"), ToyParts("legs", "blu"), ToyParts("legs", "yellow")] of ToyParts
    		 *                 continue
    		 */
    		
    		if(java.util.Objects.equals((""+item_.charAt(0)), "i")) {
    			/* 
    			 * Compiled from source statement from line 70 to line 71
    			 * if item_[3] = "1" do
    			 *                     myInventory of agent = [ToyParts("head", "red"), ToyParts("head", "blu"), ToyParts("head", "yellow")] of ToyParts
    			 */
    			
    			if(java.util.Objects.equals((""+item_.charAt(3)), "1")) {
    				/* 
    				 * Compiled from source statement at line 71
    				 * myInventory of agent = [ToyParts("head", "red"), ToyParts("head", "blu"), ToyParts("head", "yellow")] of ToyParts
    				 */
    				
    				_agentEnv.getAgent().setMyInventory(jadescript.util.JadescriptCollections.createList(java.util.List.of(WorkOntology.ToyParts("head" ,"red"), WorkOntology.ToyParts("head" ,"blu"), WorkOntology.ToyParts("head" ,"yellow"))));
    			}
    			
    			/* 
    			 * Compiled from source statement from line 72 to line 73
    			 * 
    			 *                 if item_[3] = "2" do
    			 *                     myInventory of agent = [ToyParts("arms", "red"), ToyParts("arms", "blu"), ToyParts("arms", "yellow")] of ToyParts
    			 */
    			
    			if(java.util.Objects.equals((""+item_.charAt(3)), "2")) {
    				/* 
    				 * Compiled from source statement at line 73
    				 * myInventory of agent = [ToyParts("arms", "red"), ToyParts("arms", "blu"), ToyParts("arms", "yellow")] of ToyParts
    				 */
    				
    				_agentEnv.getAgent().setMyInventory(jadescript.util.JadescriptCollections.createList(java.util.List.of(WorkOntology.ToyParts("arms" ,"red"), WorkOntology.ToyParts("arms" ,"blu"), WorkOntology.ToyParts("arms" ,"yellow"))));
    			}
    			
    			/* 
    			 * Compiled from source statement from line 74 to line 75
    			 * 
    			 *                 if item_[3] ="3" do
    			 *                     myInventory of agent = [ToyParts("legs", "red"), ToyParts("legs", "blu"), ToyParts("legs", "yellow")] of ToyParts
    			 */
    			
    			if(java.util.Objects.equals((""+item_.charAt(3)), "3")) {
    				/* 
    				 * Compiled from source statement at line 75
    				 * myInventory of agent = [ToyParts("legs", "red"), ToyParts("legs", "blu"), ToyParts("legs", "yellow")] of ToyParts
    				 */
    				
    				_agentEnv.getAgent().setMyInventory(jadescript.util.JadescriptCollections.createList(java.util.List.of(WorkOntology.ToyParts("legs" ,"red"), WorkOntology.ToyParts("legs" ,"blu"), WorkOntology.ToyParts("legs" ,"yellow"))));
    			}
    			
    			/* 
    			 * Compiled from source statement at line 76
    			 * 
    			 *                 continue
    			 */
    			
    			continue;
    		}
    		
    		/* 
    		 * Compiled from source statement from line 78 to line 80
    		 * 
    		 * 
    		 *             if item_[0] = "b" or item_[0] = "r" or item_[0] = "y" do
    		 *                 favoriteColor of agent = item_
    		 *                 continue
    		 */
    		
    		if(java.util.Objects.equals((""+item_.charAt(0)), "b") || java.util.Objects.equals((""+item_.charAt(0)), "r") || java.util.Objects.equals((""+item_.charAt(0)), "y")) {
    			/* 
    			 * Compiled from source statement at line 79
    			 * favoriteColor of agent = item_
    			 */
    			
    			_agentEnv.getAgent().setFavoriteColor(item_);
    			
    			/* 
    			 * Compiled from source statement at line 80
    			 * continue
    			 */
    			
    			continue;
    		}
    		
    		/* 
    		 * Compiled from source statement from line 82 to line 92
    		 * 
    		 *             
    		 *             if item_[0] = "W" do
    		 *                 hasAnyFriendWorkers of agent = true
    		 *                 add item_ as aid to nearbyWorkers of agent
    		 *                 numberNeighbours of agent = numberNeighbours + 1
    		 * 
    		 *             else do
    		 *                 temp = item_[0]+item_[1]+item_[2]+item_[3]
    		 *                 if temp = "Supe" do
    		 *                     Supervisor of agent = item_ as aid
    		 *                 if temp = "Supp" do
    		 *                     Supplier of agent = item_ as aid
    		 */
    		
    		if(java.util.Objects.equals((""+item_.charAt(0)), "W")) {
    			/* 
    			 * Compiled from source statement at line 83
    			 * hasAnyFriendWorkers of agent = true
    			 */
    			
    			_agentEnv.getAgent().setHasAnyFriendWorkers(true);
    			
    			/* 
    			 * Compiled from source statement at line 84
    			 * add item_ as aid to nearbyWorkers of agent
    			 */
    			
    			_agentEnv.getAgent().getNearbyWorkers().add(((jade.core.AID) jadescript.util.types.Converter.convert(item_, new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.TEXT), new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.AID))));
    			
    			/* 
    			 * Compiled from source statement at line 85
    			 * numberNeighbours of agent = numberNeighbours + 1
    			 */
    			
    			_agentEnv.getAgent().setNumberNeighbours(Worker.this.getNumberNeighbours() + 1);
    		}
    		else {
    			/* 
    			 * Compiled from source statement at line 88
    			 * temp = item_[0]+item_[1]+item_[2]+item_[3]
    			 */
    			
    			java.lang.String temp = java.lang.String.valueOf(java.lang.String.valueOf(java.lang.String.valueOf((""+item_.charAt(0))) + java.lang.String.valueOf((""+item_.charAt(1)))) + java.lang.String.valueOf((""+item_.charAt(2)))) + java.lang.String.valueOf((""+item_.charAt(3)));
    			
    			/* 
    			 * Compiled from source statement from line 89 to line 90
    			 * if temp = "Supe" do
    			 *                     Supervisor of agent = item_ as aid
    			 */
    			
    			if(java.util.Objects.equals(temp, "Supe")) {
    				/* 
    				 * Compiled from source statement at line 90
    				 * Supervisor of agent = item_ as aid
    				 */
    				
    				_agentEnv.getAgent().setSupervisor(((jade.core.AID) jadescript.util.types.Converter.convert(item_, new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.TEXT), new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.AID))));
    			}
    			
    			/* 
    			 * Compiled from source statement from line 91 to line 92
    			 * 
    			 *                 if temp = "Supp" do
    			 *                     Supplier of agent = item_ as aid
    			 */
    			
    			if(java.util.Objects.equals(temp, "Supp")) {
    				/* 
    				 * Compiled from source statement at line 92
    				 * Supplier of agent = item_ as aid
    				 */
    				
    				_agentEnv.getAgent().setSupplier(((jade.core.AID) jadescript.util.types.Converter.convert(item_, new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.TEXT), new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.AID))));
    			}
    		}
    	}
    	
    	/* 
    	 * Compiled from source statement at line 94
    	 * 
    	 *         
    	 *         return false
    	 */
    	
    	return false;
    }
  }

  public Boolean isToyFinished(final AgentEnv<? extends Worker, ? extends SideEffectsFlag.WithSideEffects> _agentEnv, final BaseToy curToy) {
    {
    	/* 
    	 * Compiled from source statement from line 98 to line 99
    	 * if ("empty" = color of (head of curToy)) do 
    	 *             return false
    	 */
    	
    	if((java.util.Objects.equals("empty", (curToy.getHead()).getColor()))) {
    		/* 
    		 * Compiled from source statement at line 99
    		 * return false
    		 */
    		
    		return false;
    	}
    	
    	/* 
    	 * Compiled from source statement from line 101 to line 102
    	 *  
    	 *          
    	 *         if ( "empty" = color of (arms of curToy)) do
    	 *             return false
    	 */
    	
    	if((java.util.Objects.equals("empty", (curToy.getArms()).getColor()))) {
    		/* 
    		 * Compiled from source statement at line 102
    		 * return false
    		 */
    		
    		return false;
    	}
    	
    	/* 
    	 * Compiled from source statement from line 104 to line 105
    	 *  
    	 *             
    	 *         if ( "empty" = color of (legs of curToy)) do
    	 *             return false
    	 */
    	
    	if((java.util.Objects.equals("empty", (curToy.getLegs()).getColor()))) {
    		/* 
    		 * Compiled from source statement at line 105
    		 * return false
    		 */
    		
    		return false;
    	}
    	
    	/* 
    	 * Compiled from source statement at line 107
    	 *  
    	 *             
    	 *         return true
    	 */
    	
    	return true;
    }
  }

  public Boolean anyCompatiblePiece(final AgentEnv<? extends Worker, ? extends SideEffectsFlag.WithSideEffects> _agentEnv, final JadescriptList<ToyParts> availableParts, final BaseToy curToy) {
    {
    	/* 
    	 * Compiled from source statement at line 111
    	 * missingPieces = [false, false, false]
    	 */
    	
    	jadescript.util.JadescriptList<java.lang.Boolean> missingPieces = jadescript.util.JadescriptCollections.createList(java.util.List.of(false, false, false));
    	
    	/* 
    	 * Compiled from source statement at line 112
    	 * available = [false, false, false]
    	 */
    	
    	jadescript.util.JadescriptList<java.lang.Boolean> available = jadescript.util.JadescriptCollections.createList(java.util.List.of(false, false, false));
    	
    	/* 
    	 * Compiled from source statement from line 113 to line 114
    	 * if ("empty" = color of (head of curToy)) do 
    	 *             missingPieces[0] = true
    	 */
    	
    	if((java.util.Objects.equals("empty", (curToy.getHead()).getColor()))) {
    		/* 
    		 * Compiled from source statement at line 114
    		 * missingPieces[0] = true
    		 */
    		
    		missingPieces.set(0, true);
    	}
    	
    	/* 
    	 * Compiled from source statement from line 116 to line 117
    	 * 
    	 *          
    	 *         if ( "empty" = color of (arms of curToy)) do
    	 *             missingPieces[1] = true
    	 */
    	
    	if((java.util.Objects.equals("empty", (curToy.getArms()).getColor()))) {
    		/* 
    		 * Compiled from source statement at line 117
    		 * missingPieces[1] = true
    		 */
    		
    		missingPieces.set(1, true);
    	}
    	
    	/* 
    	 * Compiled from source statement from line 119 to line 120
    	 * 
    	 *             
    	 *         if ( "empty" = color of (legs of curToy)) do
    	 *             missingPieces[2] = true
    	 */
    	
    	if((java.util.Objects.equals("empty", (curToy.getLegs()).getColor()))) {
    		/* 
    		 * Compiled from source statement at line 120
    		 * missingPieces[2] = true
    		 */
    		
    		missingPieces.set(2, true);
    	}
    	
    	/* 
    	 * Compiled from source statement from line 122 to line 130
    	 * 
    	 *             
    	 *         for part_ in availableParts do
    	 *             if (("head" = item of part_) and missingPieces[0] ) do
    	 *                 return true
    	 *                 
    	 *             if (("arms" = item of part_) and missingPieces[1] ) do
    	 *                 return true
    	 *                 
    	 *             if (("legs" = item of part_) and missingPieces[2] ) do
    	 *                 return true
    	 */
    	
    	for ( ToyParts part_ : availableParts) {
    		/* 
    		 * Compiled from source statement from line 123 to line 124
    		 * if (("head" = item of part_) and missingPieces[0] ) do
    		 *                 return true
    		 */
    		
    		if(((java.util.Objects.equals("head", part_.getItem())) && missingPieces.get(0))) {
    			/* 
    			 * Compiled from source statement at line 124
    			 * return true
    			 */
    			
    			return true;
    		}
    		
    		/* 
    		 * Compiled from source statement from line 126 to line 127
    		 * 
    		 *                 
    		 *             if (("arms" = item of part_) and missingPieces[1] ) do
    		 *                 return true
    		 */
    		
    		if(((java.util.Objects.equals("arms", part_.getItem())) && missingPieces.get(1))) {
    			/* 
    			 * Compiled from source statement at line 127
    			 * return true
    			 */
    			
    			return true;
    		}
    		
    		/* 
    		 * Compiled from source statement from line 129 to line 130
    		 * 
    		 *                 
    		 *             if (("legs" = item of part_) and missingPieces[2] ) do
    		 *                 return true
    		 */
    		
    		if(((java.util.Objects.equals("legs", part_.getItem())) && missingPieces.get(2))) {
    			/* 
    			 * Compiled from source statement at line 130
    			 * return true
    			 */
    			
    			return true;
    		}
    	}
    	
    	/* 
    	 * Compiled from source statement at line 132
    	 * 
    	 *         
    	 *         return false
    	 */
    	
    	return false;
    }
  }

  public Boolean canAddPiece(final AgentEnv<? extends Worker, ? extends SideEffectsFlag.WithSideEffects> _agentEnv, final ToyParts availablePiece, final BaseToy curToy) {
    {
    	/* 
    	 * Compiled from source statement at line 136
    	 * missingPieces = [false, false, false]
    	 */
    	
    	jadescript.util.JadescriptList<java.lang.Boolean> missingPieces = jadescript.util.JadescriptCollections.createList(java.util.List.of(false, false, false));
    	
    	/* 
    	 * Compiled from source statement at line 137
    	 * available = [false, false, false]
    	 */
    	
    	jadescript.util.JadescriptList<java.lang.Boolean> available = jadescript.util.JadescriptCollections.createList(java.util.List.of(false, false, false));
    	
    	/* 
    	 * Compiled from source statement from line 138 to line 139
    	 * if ("empty" = color of (head of curToy)) do 
    	 *             missingPieces[0] = true
    	 */
    	
    	if((java.util.Objects.equals("empty", (curToy.getHead()).getColor()))) {
    		/* 
    		 * Compiled from source statement at line 139
    		 * missingPieces[0] = true
    		 */
    		
    		missingPieces.set(0, true);
    	}
    	
    	/* 
    	 * Compiled from source statement from line 141 to line 142
    	 * 
    	 *          
    	 *         if ( "empty" = color of (arms of curToy)) do
    	 *             missingPieces[1] = true
    	 */
    	
    	if((java.util.Objects.equals("empty", (curToy.getArms()).getColor()))) {
    		/* 
    		 * Compiled from source statement at line 142
    		 * missingPieces[1] = true
    		 */
    		
    		missingPieces.set(1, true);
    	}
    	
    	/* 
    	 * Compiled from source statement from line 144 to line 145
    	 * 
    	 *             
    	 *         if ( "empty" = color of (legs of curToy)) do
    	 *             missingPieces[2] = true
    	 */
    	
    	if((java.util.Objects.equals("empty", (curToy.getLegs()).getColor()))) {
    		/* 
    		 * Compiled from source statement at line 145
    		 * missingPieces[2] = true
    		 */
    		
    		missingPieces.set(2, true);
    	}
    	
    	/* 
    	 * Compiled from source statement from line 147 to line 148
    	 * 
    	 *             
    	 *         if (("head" = item of availablePiece) and missingPieces[0] ) do
    	 *             return true
    	 */
    	
    	if(((java.util.Objects.equals("head", availablePiece.getItem())) && missingPieces.get(0))) {
    		/* 
    		 * Compiled from source statement at line 148
    		 * return true
    		 */
    		
    		return true;
    	}
    	
    	/* 
    	 * Compiled from source statement from line 150 to line 151
    	 * 
    	 *             
    	 *         if (("arms" = item of availablePiece) and missingPieces[1] ) do
    	 *             return true
    	 */
    	
    	if(((java.util.Objects.equals("arms", availablePiece.getItem())) && missingPieces.get(1))) {
    		/* 
    		 * Compiled from source statement at line 151
    		 * return true
    		 */
    		
    		return true;
    	}
    	
    	/* 
    	 * Compiled from source statement from line 153 to line 154
    	 * 
    	 *             
    	 *         if (("legs" = item of availablePiece) and missingPieces[2] ) do
    	 *             return true
    	 */
    	
    	if(((java.util.Objects.equals("legs", availablePiece.getItem())) && missingPieces.get(2))) {
    		/* 
    		 * Compiled from source statement at line 154
    		 * return true
    		 */
    		
    		return true;
    	}
    	
    	/* 
    	 * Compiled from source statement at line 156
    	 * 
    	 *         
    	 *         return false
    	 */
    	
    	return false;
    }
  }

  public Integer hasAnyItems(final AgentEnv<? extends Worker, ? extends SideEffectsFlag.WithSideEffects> _agentEnv, final JadescriptList<ToyParts> availableParts) {
    {
    	/* 
    	 * Compiled from source statement at line 160
    	 * countItem = 0
    	 */
    	
    	java.lang.Integer countItem = 0;
    	
    	/* 
    	 * Compiled from source statement at line 161
    	 * tempInv_ = [] of ToyParts
    	 */
    	
    	jadescript.util.JadescriptList<ToyParts> tempInv_ = new jadescript.util.JadescriptList<ToyParts>();
    	
    	/* 
    	 * Compiled from source statement from line 163 to line 164
    	 * for item in availableParts do
    	 *             countItem = countItem + 1
    	 */
    	
    	for ( ToyParts item : availableParts) {
    		/* 
    		 * Compiled from source statement at line 164
    		 * countItem = countItem + 1
    		 */
    		
    		countItem = countItem + 1;
    	}
    	
    	/* 
    	 * Compiled from source statement at line 165
    	 *             
    	 *         return countItem
    	 */
    	
    	return countItem;
    }
  }

  public JadescriptList<ToyParts> addPieceToToy(final AgentEnv<? extends Worker, ? extends SideEffectsFlag.WithSideEffects> _agentEnv, final ToyParts toyPart) {
    {
    	/* 
    	 * Compiled from source statement at line 169
    	 * tempToy = BaseToy(ToyParts("head", "empty"), ToyParts("arms", "empty"), ToyParts("legs", "empty")) as BaseToy
    	 */
    	
    	BaseToy tempToy = ((BaseToy) jadescript.util.types.Converter.convert(WorkOntology.BaseToy(WorkOntology.ToyParts("head" ,"empty") ,WorkOntology.ToyParts("arms" ,"empty") ,WorkOntology.ToyParts("legs" ,"empty")), new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.CONCEPT), new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.CONCEPT)));
    	
    	/* 
    	 * Compiled from source statement from line 171 to line 174
    	 * if (item of toyPart = item of (head of currentToy of agent) ) do
    	 *             tempToy = BaseToy(toyPart, arms of currentToy of agent, legs of currentToy of agent)
    	 *             currentToy of agent = tempToy
    	 *             remove toyPart from myInventory of agent
    	 */
    	
    	if((java.util.Objects.equals(toyPart.getItem(), (_agentEnv.getAgent().getCurrentToy().getHead()).getItem()))) {
    		/* 
    		 * Compiled from source statement at line 172
    		 * tempToy = BaseToy(toyPart, arms of currentToy of agent, legs of currentToy of agent)
    		 */
    		
    		tempToy = WorkOntology.BaseToy(toyPart ,_agentEnv.getAgent().getCurrentToy().getArms() ,_agentEnv.getAgent().getCurrentToy().getLegs());
    		
    		/* 
    		 * Compiled from source statement at line 173
    		 * currentToy of agent = tempToy
    		 */
    		
    		_agentEnv.getAgent().setCurrentToy(tempToy);
    		
    		/* 
    		 * Compiled from source statement at line 174
    		 * remove toyPart from myInventory of agent
    		 */
    		
    		_agentEnv.getAgent().getMyInventory().remove(toyPart);
    	}
    	
    	/* 
    	 * Compiled from source statement from line 176 to line 179
    	 * 
    	 *                 
    	 *        if (item of toyPart = item of (arms of currentToy of agent) ) do
    	 *             tempToy = BaseToy(head of currentToy of agent, toyPart,  legs of currentToy of agent)
    	 *             currentToy of agent = tempToy
    	 *             remove toyPart from myInventory of agent
    	 */
    	
    	if((java.util.Objects.equals(toyPart.getItem(), (_agentEnv.getAgent().getCurrentToy().getArms()).getItem()))) {
    		/* 
    		 * Compiled from source statement at line 177
    		 * tempToy = BaseToy(head of currentToy of agent, toyPart,  legs of currentToy of agent)
    		 */
    		
    		tempToy = WorkOntology.BaseToy(_agentEnv.getAgent().getCurrentToy().getHead() ,toyPart ,_agentEnv.getAgent().getCurrentToy().getLegs());
    		
    		/* 
    		 * Compiled from source statement at line 178
    		 * currentToy of agent = tempToy
    		 */
    		
    		_agentEnv.getAgent().setCurrentToy(tempToy);
    		
    		/* 
    		 * Compiled from source statement at line 179
    		 * remove toyPart from myInventory of agent
    		 */
    		
    		_agentEnv.getAgent().getMyInventory().remove(toyPart);
    	}
    	
    	/* 
    	 * Compiled from source statement from line 181 to line 184
    	 * 
    	 *             
    	 *        if (item of toyPart = item of (legs of currentToy of agent) ) do
    	 *             tempToy = BaseToy(head of currentToy of agent, arms of currentToy of agent, toyPart)
    	 *             currentToy of agent = tempToy
    	 *             remove toyPart from myInventory of agent
    	 */
    	
    	if((java.util.Objects.equals(toyPart.getItem(), (_agentEnv.getAgent().getCurrentToy().getLegs()).getItem()))) {
    		/* 
    		 * Compiled from source statement at line 182
    		 * tempToy = BaseToy(head of currentToy of agent, arms of currentToy of agent, toyPart)
    		 */
    		
    		tempToy = WorkOntology.BaseToy(_agentEnv.getAgent().getCurrentToy().getHead() ,_agentEnv.getAgent().getCurrentToy().getArms() ,toyPart);
    		
    		/* 
    		 * Compiled from source statement at line 183
    		 * currentToy of agent = tempToy
    		 */
    		
    		_agentEnv.getAgent().setCurrentToy(tempToy);
    		
    		/* 
    		 * Compiled from source statement at line 184
    		 * remove toyPart from myInventory of agent
    		 */
    		
    		_agentEnv.getAgent().getMyInventory().remove(toyPart);
    	}
    	
    	/* 
    	 * Compiled from source statement at line 186
    	 * 
    	 *     
    	 *        return myInventory of agent
    	 */
    	
    	return _agentEnv.getAgent().getMyInventory();
    }
  }

  public Boolean lookAtReplies(final AgentEnv<? extends Worker, ? extends SideEffectsFlag.WithSideEffects> _agentEnv, final JadescriptList<WorkerStatus> list_replies) {
    {
    	/* 
    	 * Compiled from source statement at line 190
    	 * available_ = "Empty" as aid
    	 */
    	
    	jade.core.AID available_ = ((jade.core.AID) jadescript.util.types.Converter.convert("Empty", new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.TEXT), new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.AID)));
    	
    	/* 
    	 * Compiled from source statement at line 191
    	 * hasPiece_ = "Empty" as aid
    	 */
    	
    	jade.core.AID hasPiece_ = ((jade.core.AID) jadescript.util.types.Converter.convert("Empty", new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.TEXT), new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.AID)));
    	
    	/* 
    	 * Compiled from source statement at line 192
    	 * cur = BaseToy(ToyParts("head", "empty"), ToyParts("arms", "empty"), ToyParts("legs", "empty"))
    	 */
    	
    	BaseToy cur = WorkOntology.BaseToy(WorkOntology.ToyParts("head" ,"empty") ,WorkOntology.ToyParts("arms" ,"empty") ,WorkOntology.ToyParts("legs" ,"empty"));
    	
    	/* 
    	 * Compiled from source statement from line 194 to line 211
    	 * for Worker in list_replies do
    	 *         
    	 *             if Availability of Worker and HasMissingPieces of Worker do
    	 *             
    	 *                 log "- WORKER " + name of agent + " POSITIVE + AVAILABLE : GIVE TOY TO " + name of sender of Worker
    	 *                 if not (isToyFinished(currentToy of agent)) do
    	 * 	                send message request passToyToWorker(currentToy) to sender of Worker
    	 * 	                hasToy of agent = false
    	 * 	                currentToy of agent = BaseToy(ToyParts("head", "empty"), ToyParts("arms", "empty"), ToyParts("legs", "empty")) as BaseToy
    	 *                 else do
    	 *                     log "- WORKER " + name of agent + " : TOY FINISHED WHILE WAITING WORKERS REPLIES."
    	 *                 return true
    	 *                 
    	 *             else if Availability of Worker and available_ = "Empty" as aid do
    	 *                 available_ = sender of Worker
    	 *                 
    	 *             else if HasMissingPieces of Worker and hasPiece_ = "Empty" as aid do
    	 *                 hasPiece_ = sender of Worker
    	 */
    	
    	for ( WorkerStatus Worker : list_replies) {
    		/* 
    		 * Compiled from source statement from line 196 to line 211
    		 * if Availability of Worker and HasMissingPieces of Worker do
    		 *             
    		 *                 log "- WORKER " + name of agent + " POSITIVE + AVAILABLE : GIVE TOY TO " + name of sender of Worker
    		 *                 if not (isToyFinished(currentToy of agent)) do
    		 * 	                send message request passToyToWorker(currentToy) to sender of Worker
    		 * 	                hasToy of agent = false
    		 * 	                currentToy of agent = BaseToy(ToyParts("head", "empty"), ToyParts("arms", "empty"), ToyParts("legs", "empty")) as BaseToy
    		 *                 else do
    		 *                     log "- WORKER " + name of agent + " : TOY FINISHED WHILE WAITING WORKERS REPLIES."
    		 *                 return true
    		 *                 
    		 *             else if Availability of Worker and available_ = "Empty" as aid do
    		 *                 available_ = sender of Worker
    		 *                 
    		 *             else if HasMissingPieces of Worker and hasPiece_ = "Empty" as aid do
    		 *                 hasPiece_ = sender of Worker
    		 */
    		
    		if(Worker.getAvailability() && Worker.getHasMissingPieces()) {
    			/* 
    			 * Compiled from source statement at line 198
    			 * log "- WORKER " + name of agent + " POSITIVE + AVAILABLE : GIVE TOY TO " + name of sender of Worker
    			 */
    			
    			jadescript.core.Agent.doLog(jade.util.Logger.INFO, Worker.this.getClass().getName(), Worker.this, "lookAtReplies", java.lang.String.valueOf(java.lang.String.valueOf(java.lang.String.valueOf(java.lang.String.valueOf("- WORKER ") + java.lang.String.valueOf(_agentEnv.getAgent().getName())) + java.lang.String.valueOf(" POSITIVE + AVAILABLE : GIVE TOY TO ")) + java.lang.String.valueOf(Worker.getSender().getName())));
    			
    			/* 
    			 * Compiled from source statement from line 199 to line 204
    			 * if not (isToyFinished(currentToy of agent)) do
    			 * 	                send message request passToyToWorker(currentToy) to sender of Worker
    			 * 	                hasToy of agent = false
    			 * 	                currentToy of agent = BaseToy(ToyParts("head", "empty"), ToyParts("arms", "empty"), ToyParts("legs", "empty")) as BaseToy
    			 *                 else do
    			 *                     log "- WORKER " + name of agent + " : TOY FINISHED WHILE WAITING WORKERS REPLIES."
    			 */
    			
    			if( ! (Worker.this.isToyFinished(_agentEnv.getAgent().toEnv() ,_agentEnv.getAgent().getCurrentToy()))) {
    				/* 
    				 * Compiled from source statement at line 200
    				 * send message request passToyToWorker(currentToy) to sender of Worker
    				 */
    				
    				try {
    					jadescript.util.SendMessageUtils.validatePerformative("request");
    					
    					java.lang.Object _contentToBeSent1414193196 = WorkOntology.passToyToWorker(Worker.this.getCurrentToy());
    					
    					jadescript.core.message.Message _synthesizedMessage1414193196 = new jadescript.core.message.Message(jadescript.core.message.Message.REQUEST);
    					
    					_synthesizedMessage1414193196.setOntology(jadescript.util.SendMessageUtils.getDeclaringOntology(_contentToBeSent1414193196,WorkOntology.getInstance(),WorkOntology.getInstance()).getName());;
    					
    					_synthesizedMessage1414193196.setLanguage(__codec.getName());;
    					
    					_synthesizedMessage1414193196.addReceiver(Worker.getSender());
    					
    					_agentEnv.getAgent().getContentManager().fillContent(_synthesizedMessage1414193196, jadescript.content.onto.MessageContent.prepareContent((jade.content.ContentElement) _contentToBeSent1414193196, "request"));
    					
    					_agentEnv.getAgent().send(_synthesizedMessage1414193196);
    				}
    				catch(java.lang.Throwable _t) {
    					throw jadescript.core.exception.JadescriptException.wrap(_t);
    				}
    				
    				/* 
    				 * Compiled from source statement at line 201
    				 * hasToy of agent = false
    				 */
    				
    				_agentEnv.getAgent().setHasToy(false);
    				
    				/* 
    				 * Compiled from source statement at line 202
    				 * currentToy of agent = BaseToy(ToyParts("head", "empty"), ToyParts("arms", "empty"), ToyParts("legs", "empty")) as BaseToy
    				 */
    				
    				_agentEnv.getAgent().setCurrentToy(((BaseToy) jadescript.util.types.Converter.convert(WorkOntology.BaseToy(WorkOntology.ToyParts("head" ,"empty") ,WorkOntology.ToyParts("arms" ,"empty") ,WorkOntology.ToyParts("legs" ,"empty")), new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.CONCEPT), new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.CONCEPT))));
    			}
    			else {
    				/* 
    				 * Compiled from source statement at line 204
    				 * log "- WORKER " + name of agent + " : TOY FINISHED WHILE WAITING WORKERS REPLIES."
    				 */
    				
    				jadescript.core.Agent.doLog(jade.util.Logger.INFO, Worker.this.getClass().getName(), Worker.this, "lookAtReplies", java.lang.String.valueOf(java.lang.String.valueOf(java.lang.String.valueOf("- WORKER ") + java.lang.String.valueOf(_agentEnv.getAgent().getName())) + java.lang.String.valueOf(" : TOY FINISHED WHILE WAITING WORKERS REPLIES.")));
    			}
    			
    			/* 
    			 * Compiled from source statement at line 205
    			 * 
    			 *                 return true
    			 */
    			
    			return true;
    		}
    		else if(Worker.getAvailability() && java.util.Objects.equals(available_, ((jade.core.AID) jadescript.util.types.Converter.convert("Empty", new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.TEXT), new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.AID))))) {
    			/* 
    			 * Compiled from source statement at line 208
    			 * available_ = sender of Worker
    			 */
    			
    			available_ = Worker.getSender();
    		}
    		else if(Worker.getHasMissingPieces() && java.util.Objects.equals(hasPiece_, ((jade.core.AID) jadescript.util.types.Converter.convert("Empty", new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.TEXT), new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.AID))))) {
    			/* 
    			 * Compiled from source statement at line 211
    			 * hasPiece_ = sender of Worker
    			 */
    			
    			hasPiece_ = Worker.getSender();
    		}
    	}
    	
    	/* 
    	 * Compiled from source statement from line 214 to line 217
    	 * 
    	 *         
    	 *         # There's a Worker with the needed Piece but is occupied with an other Toy
    	 *         if hasPiece_ ≠ "Empty" as aid do
    	 *             log "- WORKER " + name of agent + " POSITIVE + NOT AVAILABLE : GIVE ME PART TO " + name of hasPiece_
    	 *             send message request passNeededToyPart(currentToy) to hasPiece_
    	 *             return true
    	 */
    	
    	if(!java.util.Objects.equals(hasPiece_, ((jade.core.AID) jadescript.util.types.Converter.convert("Empty", new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.TEXT), new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.AID))))) {
    		/* 
    		 * Compiled from source statement at line 215
    		 * log "- WORKER " + name of agent + " POSITIVE + NOT AVAILABLE : GIVE ME PART TO " + name of hasPiece_
    		 */
    		
    		jadescript.core.Agent.doLog(jade.util.Logger.INFO, Worker.this.getClass().getName(), Worker.this, "lookAtReplies", java.lang.String.valueOf(java.lang.String.valueOf(java.lang.String.valueOf(java.lang.String.valueOf("- WORKER ") + java.lang.String.valueOf(_agentEnv.getAgent().getName())) + java.lang.String.valueOf(" POSITIVE + NOT AVAILABLE : GIVE ME PART TO ")) + java.lang.String.valueOf(hasPiece_.getName())));
    		
    		/* 
    		 * Compiled from source statement at line 216
    		 * send message request passNeededToyPart(currentToy) to hasPiece_
    		 */
    		
    		try {
    			jadescript.util.SendMessageUtils.validatePerformative("request");
    			
    			java.lang.Object _contentToBeSent976783227 = WorkOntology.passNeededToyPart(Worker.this.getCurrentToy());
    			
    			jadescript.core.message.Message _synthesizedMessage976783227 = new jadescript.core.message.Message(jadescript.core.message.Message.REQUEST);
    			
    			_synthesizedMessage976783227.setOntology(jadescript.util.SendMessageUtils.getDeclaringOntology(_contentToBeSent976783227,WorkOntology.getInstance(),WorkOntology.getInstance()).getName());;
    			
    			_synthesizedMessage976783227.setLanguage(__codec.getName());;
    			
    			_synthesizedMessage976783227.addReceiver(hasPiece_);
    			
    			_agentEnv.getAgent().getContentManager().fillContent(_synthesizedMessage976783227, jadescript.content.onto.MessageContent.prepareContent((jade.content.ContentElement) _contentToBeSent976783227, "request"));
    			
    			_agentEnv.getAgent().send(_synthesizedMessage976783227);
    		}
    		catch(java.lang.Throwable _t) {
    			throw jadescript.core.exception.JadescriptException.wrap(_t);
    		}
    		
    		/* 
    		 * Compiled from source statement at line 217
    		 * return true
    		 */
    		
    		return true;
    	}
    	
    	/* 
    	 * Compiled from source statement from line 220 to line 225
    	 * 
    	 *             
    	 *         # No Worker with needed piece, but there's a Worker who's available to take the Toy
    	 *         if available_ ≠ "Empty" as aid do
    	 *             log "- WORKER " + name of agent + " NEGATIVE + AVAILABLE : GIVE TOY TO " + name of available_
    	 *             send message request passToyToWorker(currentToy) to available_
    	 *             hasToy of agent = false
    	 *             currentToy of agent = BaseToy(ToyParts("head", "empty"), ToyParts("arms", "empty"), ToyParts("legs", "empty")) as BaseToy
    	 *             return true
    	 */
    	
    	if(!java.util.Objects.equals(available_, ((jade.core.AID) jadescript.util.types.Converter.convert("Empty", new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.TEXT), new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.AID))))) {
    		/* 
    		 * Compiled from source statement at line 221
    		 * log "- WORKER " + name of agent + " NEGATIVE + AVAILABLE : GIVE TOY TO " + name of available_
    		 */
    		
    		jadescript.core.Agent.doLog(jade.util.Logger.INFO, Worker.this.getClass().getName(), Worker.this, "lookAtReplies", java.lang.String.valueOf(java.lang.String.valueOf(java.lang.String.valueOf(java.lang.String.valueOf("- WORKER ") + java.lang.String.valueOf(_agentEnv.getAgent().getName())) + java.lang.String.valueOf(" NEGATIVE + AVAILABLE : GIVE TOY TO ")) + java.lang.String.valueOf(available_.getName())));
    		
    		/* 
    		 * Compiled from source statement at line 222
    		 * send message request passToyToWorker(currentToy) to available_
    		 */
    		
    		try {
    			jadescript.util.SendMessageUtils.validatePerformative("request");
    			
    			java.lang.Object _contentToBeSent803596801 = WorkOntology.passToyToWorker(Worker.this.getCurrentToy());
    			
    			jadescript.core.message.Message _synthesizedMessage803596801 = new jadescript.core.message.Message(jadescript.core.message.Message.REQUEST);
    			
    			_synthesizedMessage803596801.setOntology(jadescript.util.SendMessageUtils.getDeclaringOntology(_contentToBeSent803596801,WorkOntology.getInstance(),WorkOntology.getInstance()).getName());;
    			
    			_synthesizedMessage803596801.setLanguage(__codec.getName());;
    			
    			_synthesizedMessage803596801.addReceiver(available_);
    			
    			_agentEnv.getAgent().getContentManager().fillContent(_synthesizedMessage803596801, jadescript.content.onto.MessageContent.prepareContent((jade.content.ContentElement) _contentToBeSent803596801, "request"));
    			
    			_agentEnv.getAgent().send(_synthesizedMessage803596801);
    		}
    		catch(java.lang.Throwable _t) {
    			throw jadescript.core.exception.JadescriptException.wrap(_t);
    		}
    		
    		/* 
    		 * Compiled from source statement at line 223
    		 * hasToy of agent = false
    		 */
    		
    		_agentEnv.getAgent().setHasToy(false);
    		
    		/* 
    		 * Compiled from source statement at line 224
    		 * currentToy of agent = BaseToy(ToyParts("head", "empty"), ToyParts("arms", "empty"), ToyParts("legs", "empty")) as BaseToy
    		 */
    		
    		_agentEnv.getAgent().setCurrentToy(((BaseToy) jadescript.util.types.Converter.convert(WorkOntology.BaseToy(WorkOntology.ToyParts("head" ,"empty") ,WorkOntology.ToyParts("arms" ,"empty") ,WorkOntology.ToyParts("legs" ,"empty")), new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.CONCEPT), new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.CONCEPT))));
    		
    		/* 
    		 * Compiled from source statement at line 225
    		 * return true
    		 */
    		
    		return true;
    	}
    	
    	/* 
    	 * Compiled from source statement at line 227
    	 * 
    	 *         
    	 *         return false
    	 */
    	
    	return false;
    }
  }

  private ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__DEFAULT_THROWER;

  public void __handleJadescriptException(final JadescriptException __exc) {
    jadescript.core.exception.ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__getExceptionEscalator(Worker.this);
    boolean __handled = false;
    if(!__handled) {
    	__thrower.__throwJadescriptException(__exc);
    }
  }

  public void __handleBehaviourFailure(final jadescript.core.behaviours.Behaviour<?> __behaviour, final JadescriptProposition __reason) {
    boolean __handled = false;
    if(!__handled) {
    	jadescript.core.Agent.doLog(java.util.logging.Level.INFO, this.getClass().getName(), this, "<behaviour failure dispatcher>", "Behaviour " + __behaviour + " failed with reason: " + __reason);
    }
  }

  private void __initializeProperties() {
    // Initializing properties and event handlers:
    {
    	Worker.this.favoriteColor = "";
    	
    	Worker.this.favoriteToyParts = new jadescript.util.JadescriptList<ToyParts>();
    	
    	Worker.this.nearbyWorkers = new jadescript.util.JadescriptList<jade.core.AID>();
    	
    	Worker.this.currentTask = "";
    	
    	Worker.this.myInventory = new jadescript.util.JadescriptList<ToyParts>();
    	
    	Worker.this.hasToy = false;
    	
    	Worker.this.currentToy = new BaseToy();
    	
    	Worker.this.hasAnyFriendWorkers = ((java.lang.Boolean) jadescript.util.types.Converter.convert(false, new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.BOOLEAN), new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.BOOLEAN)));
    	
    	Worker.this.Supervisor = new jade.core.AID();
    	
    	Worker.this.Supplier = new jade.core.AID();
    	
    	Worker.this.waiting_Supplier = false;
    	
    	Worker.this.waiting_CoWorkers = false;
    	
    	Worker.this.waiting_Supervisor = false;
    	
    	Worker.this.numberNeighbours = 0;
    	
    	Worker.this.WorkerManager = false;
    	
    	Worker.this.numberOfWorkerRequest = ((java.lang.Integer) jadescript.util.types.Converter.convert(0, new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.INTEGER), new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.INTEGER)));
    	
    	Worker.this.numberOfSupplierRequest = ((java.lang.Integer) jadescript.util.types.Converter.convert(0, new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.INTEGER), new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.INTEGER)));
    	
    	Worker.this.numberOfFinishedToys = ((java.lang.Integer) jadescript.util.types.Converter.convert(0, new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.INTEGER), new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.INTEGER)));
    	
    	Worker.this.numberOfPartsPassed = ((java.lang.Integer) jadescript.util.types.Converter.convert(0, new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.INTEGER), new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.INTEGER)));
    	
    	Worker.this.numberOfToyPassed = ((java.lang.Integer) jadescript.util.types.Converter.convert(0, new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.INTEGER), new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.INTEGER)));
    	
    	Worker.this.stopWorking = ((java.lang.Boolean) jadescript.util.types.Converter.convert(false, new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.BOOLEAN), new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.BOOLEAN)));
    }
  }

  private void __initializeAgentEnv() {
    this._agentEnv = jadescript.java.AgentEnv.agentEnv(__theAgent());
  }

  public Worker __theAgent() {
    return this;
  }

  protected void setup() {
    super.setup();
    __initializeAgentEnv();
    __initializeProperties();
    this.__onCreate();
  }

  protected void __registerCodecs(final ContentManager cm) {
    super.__registerCodecs(cm);
    cm.registerLanguage(__codec);
  }

  public static JadescriptAgentController create(final ContainerController _container, final String _agentName, final JadescriptList<String> args) throws StaleProxyException {
    return jadescript.java.JadescriptAgentController.createRaw(_container, _agentName, Worker.class, args);
  }
}
