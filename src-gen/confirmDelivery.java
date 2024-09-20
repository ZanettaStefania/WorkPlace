import jade.content.ContentManager;
import jade.content.lang.Codec;
import jadescript.content.onto.Ontology;
import jadescript.core.behaviours.CyclicBehaviour;
import jadescript.core.exception.ExceptionThrower;
import jadescript.core.exception.JadescriptException;
import jadescript.java.AgentEnv;
import jadescript.java.SideEffectsFlag;

@SuppressWarnings("all")
public class confirmDelivery extends CyclicBehaviour<Worker> {
  private Worker __theAgent = (Worker)/*Used as metadata*/null;

  private AgentEnv<Worker, SideEffectsFlag.AnySideEffectFlag> _agentEnv = null;

  public confirmDelivery(final AgentEnv<? extends Worker, ? extends SideEffectsFlag.WithSideEffects> _agentEnv) {
    super(_agentEnv);
    __initializeAgentEnv();
    __initializeProperties();
  }

  public static confirmDelivery __createEmpty(final AgentEnv<? extends Worker, ? extends SideEffectsFlag.WithSideEffects> _agentEnv) {
    return new confirmDelivery(_agentEnv);
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
    Boolean __eventFired = false;

    public void run() {
      if(confirmDelivery.this.__ignoreMessageHandlers) {
      	this.__eventFired = false;
      	
      	return ;
      }
       class __PatternMatcher1219482648 {
      	public BaseToy finishedToy;
      	
      	private final __PatternMatcher1219482648 __PatternMatcher1219482648_obj =  this;
      	
      	public boolean headerMatch_structterm0_typecast0(java.lang.Object __objx) {
      		BaseToy __x;
      		
      		try {
      			if(__objx instanceof BaseToy) {
      				__x = (BaseToy) __objx;
      			}
      			else {
      				return false;
      			}
      		}
      		catch(java.lang.ClassCastException ignored) {
      			return false;
      		}
      		
      		finishedToy = __x;
      		
      		return true;
      	}
      	
      	public boolean headerMatch_structterm0(java.lang.Object __objx) {
      		BaseToy __x;
      		
      		try {
      			if(__objx instanceof BaseToy) {
      				__x = (BaseToy) __objx;
      			}
      			else {
      				return false;
      			}
      		}
      		catch(java.lang.ClassCastException ignored) {
      			return false;
      		}
      		
      		return true && headerMatch_structterm0_typecast0(__x);
      	}
      	
      	public boolean headerMatch(java.lang.Object __objx) {
      		confirmFinishedToy __x;
      		
      		try {
      			if(__objx instanceof confirmFinishedToy) {
      				__x = (confirmFinishedToy) __objx;
      			}
      			else {
      				return false;
      			}
      		}
      		catch(java.lang.ClassCastException ignored) {
      			return false;
      		}
      		
      		return true && headerMatch_structterm0(__x.getCurrentToy());
      	}
      }
      __PatternMatcher1219482648 __PatternMatcher1219482648_obj = new __PatternMatcher1219482648();
      jade.lang.acl.MessageTemplate __mt = jade.lang.acl.MessageTemplate.and(jade.lang.acl.MessageTemplate.and(jade.lang.acl.MessageTemplate.and(new jade.lang.acl.MessageTemplate(new jadescript.lang.acl.CustomMessageTemplate(((java.util.function.Predicate<jade.lang.acl.ACLMessage>) (__ignored) -> {{
      	return true;
      }
      }))), jade.lang.acl.MessageTemplate.MatchPerformative(jadescript.core.message.Message.REQUEST)), jadescript.core.nativeevent.NotNativeEventTemplate.MatchNotNative(_agentEnv.getAgent().getContentManager())), new jade.lang.acl.MessageTemplate(new jadescript.lang.acl.CustomMessageTemplate(((java.util.function.Predicate<jade.lang.acl.ACLMessage>) (__templMsg) -> {{
      	jadescript.core.message.Message __receivedMessage = jadescript.core.message.Message.wrap(__templMsg);
      	
      	try {
      		return __PatternMatcher1219482648_obj.headerMatch(__receivedMessage.getContent(_agentEnv.getAgent().getContentManager()));
      	}
      	catch(java.lang.Throwable _e) {
      		_e.printStackTrace();
      		
      		return false;
      	}
      }
      }))));
      jadescript.core.message.Message __receivedMessage = null;
      if(myAgent!=null) {
      	__receivedMessage = jadescript.core.message.Message.wrap(myAgent.receive(__mt));
      }
      if(__receivedMessage != null) {
      	confirmDelivery.this.__ignoreMessageHandlers = true;
      	
      	_agentEnv.getAgent().__cleanIgnoredFlagForMessage(__receivedMessage);
      	
      	this.__eventFired = true;
      	
      	try {
      		try {
      			/* 
      			 * Compiled from source statement at line 238
      			 * log "- WORKER " + name of agent + " : DELIVERED FINISHED TOY " + finishedToy
      			 */
      			
      			jadescript.core.Agent.doLog(jade.util.Logger.INFO, confirmDelivery.this.getClass().getName(), confirmDelivery.this, "on request", java.lang.String.valueOf(java.lang.String.valueOf(java.lang.String.valueOf(java.lang.String.valueOf("- WORKER ") + java.lang.String.valueOf(confirmDelivery.this.getJadescriptAgent().getName())) + java.lang.String.valueOf(" : DELIVERED FINISHED TOY ")) + java.lang.String.valueOf(__PatternMatcher1219482648_obj.finishedToy)));
      			
      			/* 
      			 * Compiled from source statement at line 239
      			 * hasToy of agent = false
      			 */
      			
      			confirmDelivery.this.getJadescriptAgent().setHasToy(false);
      			
      			/* 
      			 * Compiled from source statement at line 240
      			 * currentToy of agent = BaseToy(ToyParts("head", "empty"), ToyParts("arms", "empty"), ToyParts("legs", "empty"))
      			 */
      			
      			confirmDelivery.this.getJadescriptAgent().setCurrentToy(WorkOntology.BaseToy(WorkOntology.ToyParts("head" ,"empty") ,WorkOntology.ToyParts("arms" ,"empty") ,WorkOntology.ToyParts("legs" ,"empty")));
      			
      			/* 
      			 * Compiled from source statement at line 242
      			 * waiting_Supervisor of agent = false
      			 */
      			
      			confirmDelivery.this.getJadescriptAgent().setWaiting_Supervisor(false);
      			
      			/* 
      			 * Compiled from source statement at line 243
      			 * numberOfFinishedToys of agent = numberOfFinishedToys + 1
      			 */
      			
      			confirmDelivery.this.getJadescriptAgent().setNumberOfFinishedToys(confirmDelivery.this._agentEnv.getAgent().getNumberOfFinishedToys() + 1);
      			
      			/* 
      			 * Compiled from source statement from line 245 to line 247
      			 * if WorkerManager do
      			 *                 log "- WORKER " + name of agent + " : REQUEST NEW TOY NEW TOY"
      			 *                 send message request askToy(aid) to Supervisor of agent
      			 */
      			
      			if(confirmDelivery.this._agentEnv.getAgent().getWorkerManager()) {
      				/* 
      				 * Compiled from source statement at line 246
      				 * log "- WORKER " + name of agent + " : REQUEST NEW TOY NEW TOY"
      				 */
      				
      				jadescript.core.Agent.doLog(jade.util.Logger.INFO, confirmDelivery.this.getClass().getName(), confirmDelivery.this, "on request", java.lang.String.valueOf(java.lang.String.valueOf(java.lang.String.valueOf("- WORKER ") + java.lang.String.valueOf(confirmDelivery.this.getJadescriptAgent().getName())) + java.lang.String.valueOf(" : REQUEST NEW TOY NEW TOY")));
      				
      				/* 
      				 * Compiled from source statement at line 247
      				 * send message request askToy(aid) to Supervisor of agent
      				 */
      				
      				try {
      					jadescript.util.SendMessageUtils.validatePerformative("request");
      					
      					java.lang.Object _contentToBeSent729797230 = WorkOntology.askToy(confirmDelivery.this._agentEnv.getAgent().getAID());
      					
      					jadescript.core.message.Message _synthesizedMessage729797230 = new jadescript.core.message.Message(jadescript.core.message.Message.REQUEST);
      					
      					_synthesizedMessage729797230.setOntology(jadescript.util.SendMessageUtils.getDeclaringOntology(_contentToBeSent729797230,WorkOntology.getInstance(),jadescript.content.onto.Ontology.getInstance()).getName());;
      					
      					_synthesizedMessage729797230.setLanguage(__codec.getName());;
      					
      					_synthesizedMessage729797230.addReceiver(confirmDelivery.this.getJadescriptAgent().getSupervisor());
      					
      					_agentEnv.getAgent().getContentManager().fillContent(_synthesizedMessage729797230, jadescript.content.onto.MessageContent.prepareContent((jade.content.ContentElement) _contentToBeSent729797230, "request"));
      					
      					_agentEnv.getAgent().send(_synthesizedMessage729797230);
      				}
      				catch(java.lang.Throwable _t) {
      					throw jadescript.core.exception.JadescriptException.wrap(_t);
      				}
      			}
      			
      			/* 
      			 * Compiled from source statement at line 249
      			 * 
      			 * 
      			 *             activate AddPieceBehavior
      			 */
      			
      			new AddPieceBehavior(_agentEnv.getAgent().toEnv()).activate(_agentEnv.getAgent());
      			
      			/* 
      			 * Compiled from source statement at line 250
      			 * destroy this
      			 */
      			
      			confirmDelivery.this.destroy();
      		}
      		catch(jadescript.core.exception.JadescriptException __throwable) {
      			__handleJadescriptException(__throwable);
      		}
      		catch(java.lang.Throwable __throwable) {
      			__handleJadescriptException(jadescript.core.exception.JadescriptException.wrap(__throwable));
      		}
      		
      		__receivedMessage = null;
      	}
      	catch(Exception _e) {
      		_e.printStackTrace();
      	}
      }
      else {
      	this.__eventFired = false;
      }
    }
  }

  private confirmDelivery.__Event0 __event0 = null;

  private ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__DEFAULT_THROWER;

  public void __handleJadescriptException(final JadescriptException __exc) {
    jadescript.core.exception.ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__getExceptionEscalator(confirmDelivery.this);
    boolean __handled = false;
    if(!__handled) {
    	__thrower.__throwJadescriptException(__exc);
    }
  }

  private void __initializeProperties() {
    // Initializing properties and event handlers:
    {
    	__event0 = new confirmDelivery.__Event0();
    }
  }
}
