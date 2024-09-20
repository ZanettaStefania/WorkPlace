import jade.content.ContentManager;
import jade.content.lang.Codec;
import jadescript.content.onto.Ontology;
import jadescript.core.behaviours.OneShotBehaviour;
import jadescript.core.exception.ExceptionThrower;
import jadescript.core.exception.JadescriptException;
import jadescript.java.AgentEnv;
import jadescript.java.SideEffectsFlag;

@SuppressWarnings("all")
public class noMoreToys extends OneShotBehaviour<Supervisor> {
  private Supervisor __theAgent = (Supervisor)/*Used as metadata*/null;

  private AgentEnv<Supervisor, SideEffectsFlag.AnySideEffectFlag> _agentEnv = null;

  public noMoreToys(final AgentEnv<? extends Supervisor, ? extends SideEffectsFlag.WithSideEffects> _agentEnv) {
    super(_agentEnv);
    __initializeAgentEnv();
    __initializeProperties();
  }

  public static noMoreToys __createEmpty(final AgentEnv<? extends Supervisor, ? extends SideEffectsFlag.WithSideEffects> _agentEnv) {
    return new noMoreToys(_agentEnv);
  }

  private Boolean __ignoreMessageHandlers = false;

  public void doAction(final int _tickCount) {
    this.__ignoreMessageHandlers = false;
    super.doAction(_tickCount);
    __event0.run();
    if(!this.__ignoreMessageHandlers) {
    	this.__noMessageHandled();
    }
    if ( true  && !__event0.__eventFired) __awaitForEvents();
  }

  public Boolean __hasStaleMessageHandler() {
    return false;
  }

  private void __initializeAgentEnv() {
    this._agentEnv = jadescript.java.AgentEnv.agentEnv(__theAgent());
  }

  public Ontology __ontology__jadescript_content_onto_Ontology = (jadescript.content.onto.Ontology) jadescript.content.onto.Ontology.getInstance();

  public void __registerOntologies(final ContentManager cm) {
    super.__registerOntologies(cm);
    cm.registerOntology(jadescript.content.onto.Ontology.getInstance());
  }

  public Codec __codec = new jade.content.lang.leap.LEAPCodec();

  private class __Event0 {
    Boolean __eventFired = true;

    public void run() {
      try {
      	/* 
      	 * Compiled from source statement at line 142
      	 * stopWork of agent = true
      	 */
      	
      	noMoreToys.this.getJadescriptAgent().setStopWork(true);
      	
      	/* 
      	 * Compiled from source statement at line 143
      	 * destroy TakeFinishedToy
      	 */
      	
      	new TakeFinishedToy(_agentEnv.getAgent().toEnv()).destroy();
      	
      	/* 
      	 * Compiled from source statement at line 144
      	 * destroy GiveNewToy
      	 */
      	
      	new GiveNewToy(_agentEnv.getAgent().toEnv()).destroy();
      	
      	/* 
      	 * Compiled from source statement at line 145
      	 * destroy UpdateCountFinisheTotalToys
      	 */
      	
      	new UpdateCountFinisheTotalToys(_agentEnv.getAgent().toEnv()).destroy();
      	
      	/* 
      	 * Compiled from source statement at line 146
      	 * destroy AssistanceNeeded
      	 */
      	
      	new AssistanceNeeded(_agentEnv.getAgent().toEnv()).destroy();
      	
      	/* 
      	 * Compiled from source statement at line 147
      	 * destroy gatherActiveWorkers
      	 */
      	
      	new gatherActiveWorkers(_agentEnv.getAgent().toEnv()).destroy();
      	
      	/* 
      	 * Compiled from source statement at line 149
      	 * log "+ SUPERVISOR : END OF SHIFT!"
      	 */
      	
      	jadescript.core.Agent.doLog(jade.util.Logger.INFO, noMoreToys.this.getClass().getName(), noMoreToys.this, "on execute", java.lang.String.valueOf("+ SUPERVISOR : END OF SHIFT!"));
      	
      	/* 
      	 * Compiled from source statement at line 150
      	 * activate processWorkingReports
      	 */
      	
      	new processWorkingReports(_agentEnv.getAgent().toEnv()).activate(_agentEnv.getAgent());
      	
      	/* 
      	 * Compiled from source statement from line 153 to line 154
      	 * for worker_ in listOfWorkers do
      	 *                 send message inform sendWorkingReport to worker_
      	 */
      	
      	for ( jade.core.AID worker_ : noMoreToys.this._agentEnv.getAgent().getListOfWorkers()) {
      		/* 
      		 * Compiled from source statement at line 154
      		 * send message inform sendWorkingReport to worker_
      		 */
      		
      		try {
      			jadescript.util.SendMessageUtils.validatePerformative("inform");
      			
      			java.lang.Object _contentToBeSent517244878 = WorkOntology.sendWorkingReport();
      			
      			jadescript.core.message.Message _synthesizedMessage517244878 = new jadescript.core.message.Message(jadescript.core.message.Message.INFORM);
      			
      			_synthesizedMessage517244878.setOntology(jadescript.util.SendMessageUtils.getDeclaringOntology(_contentToBeSent517244878,WorkOntology.getInstance(),jadescript.content.onto.Ontology.getInstance()).getName());;
      			
      			_synthesizedMessage517244878.setLanguage(__codec.getName());;
      			
      			_synthesizedMessage517244878.addReceiver(worker_);
      			
      			_agentEnv.getAgent().getContentManager().fillContent(_synthesizedMessage517244878, jadescript.content.onto.MessageContent.prepareContent((jade.content.ContentElement) _contentToBeSent517244878, "inform"));
      			
      			_agentEnv.getAgent().send(_synthesizedMessage517244878);
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
  }

  private noMoreToys.__Event0 __event0 =  new noMoreToys.__Event0();

  private ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__DEFAULT_THROWER;

  public void __handleJadescriptException(final JadescriptException __exc) {
    jadescript.core.exception.ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__getExceptionEscalator(noMoreToys.this);
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
}
