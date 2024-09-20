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
public class Supervisor extends Agent {
  private Supervisor __theAgent = (Supervisor)/*Used as metadata*/null;

  private AgentEnv<Supervisor, SideEffectsFlag.AnySideEffectFlag> _agentEnv = null;

  public WorkOntology __ontology__WorkOntology = (WorkOntology) WorkOntology.getInstance();

  public void __registerOntologies(final ContentManager cm) {
    super.__registerOntologies(cm);
    cm.registerOntology(WorkOntology.getInstance());
  }

  public Codec __codec = new jade.content.lang.leap.LEAPCodec();

  protected JadescriptList<BaseToy> listFinishedToys = null;

  public void setListFinishedToys(final JadescriptList<BaseToy> listFinishedToys) {
    this.listFinishedToys = listFinishedToys;
  }

  public JadescriptList<BaseToy> getListFinishedToys() {
    return this.listFinishedToys;
  }

  protected Integer availableTotalToys = null;

  public void setAvailableTotalToys(final Integer availableTotalToys) {
    this.availableTotalToys = availableTotalToys;
  }

  public Integer getAvailableTotalToys() {
    return this.availableTotalToys;
  }

  protected BaseToy emptyToy = null;

  public void setEmptyToy(final BaseToy emptyToy) {
    this.emptyToy = emptyToy;
  }

  public BaseToy getEmptyToy() {
    return this.emptyToy;
  }

  protected Integer totalToys = null;

  public void setTotalToys(final Integer totalToys) {
    this.totalToys = totalToys;
  }

  public Integer getTotalToys() {
    return this.totalToys;
  }

  protected AID CoSupervisor = null;

  public void setCoSupervisor(final AID CoSupervisor) {
    this.CoSupervisor = CoSupervisor;
  }

  public AID getCoSupervisor() {
    return this.CoSupervisor;
  }

  protected JadescriptList<AID> listOfManagerWorkers = null;

  public void setListOfManagerWorkers(final JadescriptList<AID> listOfManagerWorkers) {
    this.listOfManagerWorkers = listOfManagerWorkers;
  }

  public JadescriptList<AID> getListOfManagerWorkers() {
    return this.listOfManagerWorkers;
  }

  protected JadescriptList<AID> listOfWorkers = null;

  public void setListOfWorkers(final JadescriptList<AID> listOfWorkers) {
    this.listOfWorkers = listOfWorkers;
  }

  public JadescriptList<AID> getListOfWorkers() {
    return this.listOfWorkers;
  }

  protected Integer numTotalWorker = null;

  public void setNumTotalWorker(final Integer numTotalWorker) {
    this.numTotalWorker = numTotalWorker;
  }

  public Integer getNumTotalWorker() {
    return this.numTotalWorker;
  }

  protected Boolean stopWork = null;

  public void setStopWork(final Boolean stopWork) {
    this.stopWork = stopWork;
  }

  public Boolean getStopWork() {
    return this.stopWork;
  }

  private void __onCreate() {
    jade.core.AID args = jadescript.util.types.JadescriptValueAdapter.adapt(this.getArguments()[0], new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.AID));
    try {
    	/* 
    	 * Compiled from source statement at line 17
    	 * log "Agent 'Supervisor' created with arguments: "+args
    	 */
    	
    	jadescript.core.Agent.doLog(jade.util.Logger.INFO, Supervisor.this.getClass().getName(), Supervisor.this, "on create", java.lang.String.valueOf(java.lang.String.valueOf("Agent 'Supervisor' created with arguments: ") + java.lang.String.valueOf(args)));
    	
    	/* 
    	 * Compiled from source statement at line 19
    	 * CoSupervisor of agent = args
    	 */
    	
    	_agentEnv.getAgent().setCoSupervisor(args);
    	
    	/* 
    	 * Compiled from source statement at line 21
    	 * availableTotalToys of agent = 4
    	 */
    	
    	_agentEnv.getAgent().setAvailableTotalToys(4);
    	
    	/* 
    	 * Compiled from source statement at line 22
    	 * totalToys of agent = availableTotalToys of agent
    	 */
    	
    	_agentEnv.getAgent().setTotalToys(_agentEnv.getAgent().getAvailableTotalToys());
    	
    	/* 
    	 * Compiled from source statement at line 24
    	 * activate TakeFinishedToy
    	 */
    	
    	new TakeFinishedToy(_agentEnv.getAgent().toEnv()).activate(_agentEnv.getAgent());
    	
    	/* 
    	 * Compiled from source statement at line 25
    	 * activate GiveNewToy
    	 */
    	
    	new GiveNewToy(_agentEnv.getAgent().toEnv()).activate(_agentEnv.getAgent());
    	
    	/* 
    	 * Compiled from source statement at line 26
    	 * activate UpdateCountFinisheTotalToys
    	 */
    	
    	new UpdateCountFinisheTotalToys(_agentEnv.getAgent().toEnv()).activate(_agentEnv.getAgent());
    	
    	/* 
    	 * Compiled from source statement at line 27
    	 * activate AssistanceNeeded
    	 */
    	
    	new AssistanceNeeded(_agentEnv.getAgent().toEnv()).activate(_agentEnv.getAgent());
    	
    	/* 
    	 * Compiled from source statement at line 28
    	 * activate gatherActiveWorkers
    	 */
    	
    	new gatherActiveWorkers(_agentEnv.getAgent().toEnv()).activate(_agentEnv.getAgent());
    }
    catch(jadescript.core.exception.JadescriptException __throwable) {
    	__handleJadescriptException(__throwable);
    }
    catch(java.lang.Throwable __throwable) {
    	__handleJadescriptException(jadescript.core.exception.JadescriptException.wrap(__throwable));
    }
  }

  public Integer hasAnyItems(final AgentEnv<? extends Supervisor, ? extends SideEffectsFlag.WithSideEffects> _agentEnv, final JadescriptList<BaseToy> availableParts) {
    {
    	/* 
    	 * Compiled from source statement at line 33
    	 * countItem = 0
    	 */
    	
    	java.lang.Integer countItem = 0;
    	
    	/* 
    	 * Compiled from source statement at line 34
    	 * tempInv_ = [] of BaseToy
    	 */
    	
    	jadescript.util.JadescriptList<BaseToy> tempInv_ = new jadescript.util.JadescriptList<BaseToy>();
    	
    	/* 
    	 * Compiled from source statement from line 36 to line 37
    	 * for item in availableParts do
    	 *             countItem = countItem + 1
    	 */
    	
    	for ( BaseToy item : availableParts) {
    		/* 
    		 * Compiled from source statement at line 37
    		 * countItem = countItem + 1
    		 */
    		
    		countItem = countItem + 1;
    	}
    	
    	/* 
    	 * Compiled from source statement at line 39
    	 *             
    	 * 
    	 *         return countItem
    	 */
    	
    	return countItem;
    }
  }

  private ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__DEFAULT_THROWER;

  public void __handleJadescriptException(final JadescriptException __exc) {
    jadescript.core.exception.ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__getExceptionEscalator(Supervisor.this);
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
    	Supervisor.this.listFinishedToys = new jadescript.util.JadescriptList<BaseToy>();
    	
    	Supervisor.this.availableTotalToys = 0;
    	
    	Supervisor.this.emptyToy = ((BaseToy) jadescript.util.types.Converter.convert(WorkOntology.BaseToy(WorkOntology.ToyParts("head" ,"empty") ,WorkOntology.ToyParts("arms" ,"empty") ,WorkOntology.ToyParts("legs" ,"empty")), new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.CONCEPT), new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.CONCEPT)));
    	
    	Supervisor.this.totalToys = ((java.lang.Integer) jadescript.util.types.Converter.convert(0, new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.INTEGER), new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.INTEGER)));
    	
    	Supervisor.this.CoSupervisor = new jade.core.AID();
    	
    	Supervisor.this.listOfManagerWorkers = new jadescript.util.JadescriptList<jade.core.AID>();
    	
    	Supervisor.this.listOfWorkers = new jadescript.util.JadescriptList<jade.core.AID>();
    	
    	Supervisor.this.numTotalWorker = ((java.lang.Integer) jadescript.util.types.Converter.convert(0, new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.INTEGER), new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.INTEGER)));
    	
    	Supervisor.this.stopWork = ((java.lang.Boolean) jadescript.util.types.Converter.convert(false, new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.BOOLEAN), new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.BOOLEAN)));
    }
  }

  private void __initializeAgentEnv() {
    this._agentEnv = jadescript.java.AgentEnv.agentEnv(__theAgent());
  }

  public Supervisor __theAgent() {
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

  public static JadescriptAgentController create(final ContainerController _container, final String _agentName, final AID args) throws StaleProxyException {
    return jadescript.java.JadescriptAgentController.createRaw(_container, _agentName, Supervisor.class, args);
  }
}
