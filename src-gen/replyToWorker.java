import jade.content.ContentManager;
import jade.content.lang.Codec;
import jadescript.content.onto.Ontology;
import jadescript.core.behaviours.OneShotBehaviour;
import jadescript.core.exception.ExceptionThrower;
import jadescript.core.exception.JadescriptException;
import jadescript.java.AgentEnv;
import jadescript.java.SideEffectsFlag;

@SuppressWarnings("all")
public class replyToWorker extends OneShotBehaviour<Worker> {
  private Worker __theAgent = (Worker)/*Used as metadata*/null;

  private AgentEnv<Worker, SideEffectsFlag.AnySideEffectFlag> _agentEnv = null;

  public static replyToWorker __createEmpty(final AgentEnv<? extends Worker, ? extends SideEffectsFlag.WithSideEffects> _agentEnv) {
    return new replyToWorker(_agentEnv, new WorkerStatus());
  }

  private Boolean __ignoreMessageHandlers = false;

  public void doAction(final int _tickCount) {
    this.__ignoreMessageHandlers = false;
    super.doAction(_tickCount);
    __event2.run();
    if(!this.__ignoreMessageHandlers) {
    	this.__noMessageHandled();
    }
    if ( true  && !__event2.__eventFired) __awaitForEvents();
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

  protected WorkerStatus worker = null;

  public void setWorker(final WorkerStatus worker) {
    this.worker = worker;
  }

  public WorkerStatus getWorker() {
    return this.worker;
  }

  public replyToWorker(final AgentEnv<? extends Worker, ? extends SideEffectsFlag.WithSideEffects> _agentEnv, final WorkerStatus worker_) {
    super(_agentEnv);
    __initializeAgentEnv();
    __initializeProperties();
    try {
    	/* 
    	 * Compiled from source statement at line 295
    	 * worker of this = worker_
    	 */
    	
    	replyToWorker.this.setWorker(worker_);
    }
    catch(jadescript.core.exception.JadescriptException __throwable) {
    	__handleJadescriptException(__throwable);
    }
    catch(java.lang.Throwable __throwable) {
    	__handleJadescriptException(jadescript.core.exception.JadescriptException.wrap(__throwable));
    }
  }

  private class __Event2 {
    Boolean __eventFired = true;

    public void run() {
      try {
      	/* 
      	 * Compiled from source statement at line 298
      	 * send message request replyToCoWorkers(Availability of worker, HasMissingPieces of worker) to sender of worker
      	 */
      	
      	try {
      		jadescript.util.SendMessageUtils.validatePerformative("request");
      		
      		java.lang.Object _contentToBeSent1577594110 = WorkOntology.replyToCoWorkers(replyToWorker.this.getWorker().getAvailability() ,replyToWorker.this.getWorker().getHasMissingPieces());
      		
      		jadescript.core.message.Message _synthesizedMessage1577594110 = new jadescript.core.message.Message(jadescript.core.message.Message.REQUEST);
      		
      		_synthesizedMessage1577594110.setOntology(jadescript.util.SendMessageUtils.getDeclaringOntology(_contentToBeSent1577594110,WorkOntology.getInstance(),jadescript.content.onto.Ontology.getInstance()).getName());;
      		
      		_synthesizedMessage1577594110.setLanguage(__codec.getName());;
      		
      		_synthesizedMessage1577594110.addReceiver(replyToWorker.this.getWorker().getSender());
      		
      		_agentEnv.getAgent().getContentManager().fillContent(_synthesizedMessage1577594110, jadescript.content.onto.MessageContent.prepareContent((jade.content.ContentElement) _contentToBeSent1577594110, "request"));
      		
      		_agentEnv.getAgent().send(_synthesizedMessage1577594110);
      	}
      	catch(java.lang.Throwable _t) {
      		throw jadescript.core.exception.JadescriptException.wrap(_t);
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

  private replyToWorker.__Event2 __event2 =  new replyToWorker.__Event2();

  private ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__DEFAULT_THROWER;

  public void __handleJadescriptException(final JadescriptException __exc) {
    jadescript.core.exception.ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__getExceptionEscalator(replyToWorker.this);
    boolean __handled = false;
    if(!__handled) {
    	__thrower.__throwJadescriptException(__exc);
    }
  }

  private void __initializeProperties() {
    // Initializing properties and event handlers:
    {
    	replyToWorker.this.worker = new WorkerStatus();
    }
  }
}
