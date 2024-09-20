import jade.content.ContentManager;
import jade.content.lang.Codec;
import jadescript.content.onto.Ontology;
import jadescript.core.behaviours.OneShotBehaviour;
import jadescript.core.exception.ExceptionThrower;
import jadescript.core.exception.JadescriptException;
import jadescript.java.AgentEnv;
import jadescript.java.SideEffectsFlag;

@SuppressWarnings("all")
public class technicalIssues extends OneShotBehaviour<Supplier> {
  private Supplier __theAgent = (Supplier)/*Used as metadata*/null;

  private AgentEnv<Supplier, SideEffectsFlag.AnySideEffectFlag> _agentEnv = null;

  public technicalIssues(final AgentEnv<? extends Supplier, ? extends SideEffectsFlag.WithSideEffects> _agentEnv) {
    super(_agentEnv);
    __initializeAgentEnv();
    __initializeProperties();
  }

  public static technicalIssues __createEmpty(final AgentEnv<? extends Supplier, ? extends SideEffectsFlag.WithSideEffects> _agentEnv) {
    return new technicalIssues(_agentEnv);
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
      	 * Compiled from source statement from line 215 to line 219
      	 * if not stopWorking do
      	 * 	            log "= SUPPLIER : TECHNICAL ISSUE ENCONTERED REQUEST ASSISTANCE TO " + name of Supervisor
      	 * 	            send message inform requestAssistance to Supervisor
      	 * 	            waitForAssistence of agent = true
      	 * 	            activate waitForSupervisor
      	 */
      	
      	if( ! technicalIssues.this._agentEnv.getAgent().getStopWorking()) {
      		/* 
      		 * Compiled from source statement at line 216
      		 * log "= SUPPLIER : TECHNICAL ISSUE ENCONTERED REQUEST ASSISTANCE TO " + name of Supervisor
      		 */
      		
      		jadescript.core.Agent.doLog(jade.util.Logger.INFO, technicalIssues.this.getClass().getName(), technicalIssues.this, "on execute", java.lang.String.valueOf(java.lang.String.valueOf("= SUPPLIER : TECHNICAL ISSUE ENCONTERED REQUEST ASSISTANCE TO ") + java.lang.String.valueOf(technicalIssues.this._agentEnv.getAgent().getSupervisor().getName())));
      		
      		/* 
      		 * Compiled from source statement at line 217
      		 * send message inform requestAssistance to Supervisor
      		 */
      		
      		try {
      			jadescript.util.SendMessageUtils.validatePerformative("inform");
      			
      			java.lang.Object _contentToBeSent1292375655 = WorkOntology.requestAssistance();
      			
      			jadescript.core.message.Message _synthesizedMessage1292375655 = new jadescript.core.message.Message(jadescript.core.message.Message.INFORM);
      			
      			_synthesizedMessage1292375655.setOntology(jadescript.util.SendMessageUtils.getDeclaringOntology(_contentToBeSent1292375655,WorkOntology.getInstance(),jadescript.content.onto.Ontology.getInstance()).getName());;
      			
      			_synthesizedMessage1292375655.setLanguage(__codec.getName());;
      			
      			_synthesizedMessage1292375655.addReceiver(technicalIssues.this._agentEnv.getAgent().getSupervisor());
      			
      			_agentEnv.getAgent().getContentManager().fillContent(_synthesizedMessage1292375655, jadescript.content.onto.MessageContent.prepareContent((jade.content.ContentElement) _contentToBeSent1292375655, "inform"));
      			
      			_agentEnv.getAgent().send(_synthesizedMessage1292375655);
      		}
      		catch(java.lang.Throwable _t) {
      			throw jadescript.core.exception.JadescriptException.wrap(_t);
      		}
      		
      		/* 
      		 * Compiled from source statement at line 218
      		 * waitForAssistence of agent = true
      		 */
      		
      		technicalIssues.this.getJadescriptAgent().setWaitForAssistence(true);
      		
      		/* 
      		 * Compiled from source statement at line 219
      		 * activate waitForSupervisor
      		 */
      		
      		new waitForSupervisor(_agentEnv.getAgent().toEnv()).activate(_agentEnv.getAgent());
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

  private technicalIssues.__Event0 __event0 =  new technicalIssues.__Event0();

  private ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__DEFAULT_THROWER;

  public void __handleJadescriptException(final JadescriptException __exc) {
    jadescript.core.exception.ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__getExceptionEscalator(technicalIssues.this);
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
