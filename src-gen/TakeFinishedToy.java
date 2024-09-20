import jade.content.ContentManager;
import jade.content.lang.Codec;
import jadescript.content.onto.Ontology;
import jadescript.core.behaviours.CyclicBehaviour;
import jadescript.core.exception.ExceptionThrower;
import jadescript.core.exception.JadescriptException;
import jadescript.java.AgentEnv;
import jadescript.java.SideEffectsFlag;

@SuppressWarnings("all")
public class TakeFinishedToy extends CyclicBehaviour<Supervisor> {
  private Supervisor __theAgent = (Supervisor)/*Used as metadata*/null;

  private AgentEnv<Supervisor, SideEffectsFlag.AnySideEffectFlag> _agentEnv = null;

  public TakeFinishedToy(final AgentEnv<? extends Supervisor, ? extends SideEffectsFlag.WithSideEffects> _agentEnv) {
    super(_agentEnv);
    __initializeAgentEnv();
    __initializeProperties();
  }

  public static TakeFinishedToy __createEmpty(final AgentEnv<? extends Supervisor, ? extends SideEffectsFlag.WithSideEffects> _agentEnv) {
    return new TakeFinishedToy(_agentEnv);
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
      if(TakeFinishedToy.this.__ignoreMessageHandlers) {
      	this.__eventFired = false;
      	
      	return ;
      }
       class __PatternMatcher555990452 {
      	public BaseToy finishedToy;
      	
      	private final __PatternMatcher555990452 __PatternMatcher555990452_obj =  this;
      	
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
      		deliverFinishedToy __x;
      		
      		try {
      			if(__objx instanceof deliverFinishedToy) {
      				__x = (deliverFinishedToy) __objx;
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
      __PatternMatcher555990452 __PatternMatcher555990452_obj = new __PatternMatcher555990452();
      jade.lang.acl.MessageTemplate __mt = jade.lang.acl.MessageTemplate.and(jade.lang.acl.MessageTemplate.and(jade.lang.acl.MessageTemplate.and(new jade.lang.acl.MessageTemplate(new jadescript.lang.acl.CustomMessageTemplate(((java.util.function.Predicate<jade.lang.acl.ACLMessage>) (__ignored) -> {{
      	return true;
      }
      }))), jade.lang.acl.MessageTemplate.MatchPerformative(jadescript.core.message.Message.REQUEST)), jadescript.core.nativeevent.NotNativeEventTemplate.MatchNotNative(_agentEnv.getAgent().getContentManager())), new jade.lang.acl.MessageTemplate(new jadescript.lang.acl.CustomMessageTemplate(((java.util.function.Predicate<jade.lang.acl.ACLMessage>) (__templMsg) -> {{
      	jadescript.core.message.Message __receivedMessage = jadescript.core.message.Message.wrap(__templMsg);
      	
      	try {
      		return __PatternMatcher555990452_obj.headerMatch(__receivedMessage.getContent(_agentEnv.getAgent().getContentManager()));
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
      	TakeFinishedToy.this.__ignoreMessageHandlers = true;
      	
      	_agentEnv.getAgent().__cleanIgnoredFlagForMessage(__receivedMessage);
      	
      	this.__eventFired = true;
      	
      	try {
      		try {
      			/* 
      			 * Compiled from source statement at line 65
      			 * log "+ SUPERVISOR : I RECIVED FINISHED TOY " + finishedToy + " OF " + name of sender of message
      			 */
      			
      			jadescript.core.Agent.doLog(jade.util.Logger.INFO, TakeFinishedToy.this.getClass().getName(), TakeFinishedToy.this, "on request", java.lang.String.valueOf(java.lang.String.valueOf(java.lang.String.valueOf(java.lang.String.valueOf("+ SUPERVISOR : I RECIVED FINISHED TOY ") + java.lang.String.valueOf(__PatternMatcher555990452_obj.finishedToy)) + java.lang.String.valueOf(" OF ")) + java.lang.String.valueOf(((jadescript.core.message.RequestMessage<deliverFinishedToy>) __receivedMessage).getSender().getName())));
      			
      			/* 
      			 * Compiled from source statement at line 66
      			 * add finishedToy to listFinishedToys of agent
      			 */
      			
      			TakeFinishedToy.this.getJadescriptAgent().getListFinishedToys().add(__PatternMatcher555990452_obj.finishedToy);
      			
      			/* 
      			 * Compiled from source statement at line 69
      			 * send message request confirmFinishedToy(finishedToy) to sender of message
      			 */
      			
      			try {
      				jadescript.util.SendMessageUtils.validatePerformative("request");
      				
      				java.lang.Object _contentToBeSent1032054822 = WorkOntology.confirmFinishedToy(__PatternMatcher555990452_obj.finishedToy);
      				
      				jadescript.core.message.Message _synthesizedMessage1032054822 = new jadescript.core.message.Message(jadescript.core.message.Message.REQUEST);
      				
      				_synthesizedMessage1032054822.setOntology(jadescript.util.SendMessageUtils.getDeclaringOntology(_contentToBeSent1032054822,WorkOntology.getInstance(),jadescript.content.onto.Ontology.getInstance()).getName());;
      				
      				_synthesizedMessage1032054822.setLanguage(__codec.getName());;
      				
      				_synthesizedMessage1032054822.addReceiver(((jadescript.core.message.RequestMessage<deliverFinishedToy>) __receivedMessage).getSender());
      				
      				_agentEnv.getAgent().getContentManager().fillContent(_synthesizedMessage1032054822, jadescript.content.onto.MessageContent.prepareContent((jade.content.ContentElement) _contentToBeSent1032054822, "request"));
      				
      				_agentEnv.getAgent().send(_synthesizedMessage1032054822);
      			}
      			catch(java.lang.Throwable _t) {
      				throw jadescript.core.exception.JadescriptException.wrap(_t);
      			}
      			
      			/* 
      			 * Compiled from source statement at line 70
      			 * send message request confirmFinishedToy(finishedToy) to CoSupervisor
      			 */
      			
      			try {
      				jadescript.util.SendMessageUtils.validatePerformative("request");
      				
      				java.lang.Object _contentToBeSent2011501482 = WorkOntology.confirmFinishedToy(__PatternMatcher555990452_obj.finishedToy);
      				
      				jadescript.core.message.Message _synthesizedMessage2011501482 = new jadescript.core.message.Message(jadescript.core.message.Message.REQUEST);
      				
      				_synthesizedMessage2011501482.setOntology(jadescript.util.SendMessageUtils.getDeclaringOntology(_contentToBeSent2011501482,WorkOntology.getInstance(),jadescript.content.onto.Ontology.getInstance()).getName());;
      				
      				_synthesizedMessage2011501482.setLanguage(__codec.getName());;
      				
      				_synthesizedMessage2011501482.addReceiver(TakeFinishedToy.this._agentEnv.getAgent().getCoSupervisor());
      				
      				_agentEnv.getAgent().getContentManager().fillContent(_synthesizedMessage2011501482, jadescript.content.onto.MessageContent.prepareContent((jade.content.ContentElement) _contentToBeSent2011501482, "request"));
      				
      				_agentEnv.getAgent().send(_synthesizedMessage2011501482);
      			}
      			catch(java.lang.Throwable _t) {
      				throw jadescript.core.exception.JadescriptException.wrap(_t);
      			}
      			
      			/* 
      			 * Compiled from source statement at line 71
      			 * totalToys of agent = totalToys - 1
      			 */
      			
      			TakeFinishedToy.this.getJadescriptAgent().setTotalToys(TakeFinishedToy.this._agentEnv.getAgent().getTotalToys() - 1);
      			
      			/* 
      			 * Compiled from source statement from line 74 to line 75
      			 * if totalToys = 0 do
      			 *                 activate noMoreToys
      			 */
      			
      			if(java.util.Objects.equals(TakeFinishedToy.this._agentEnv.getAgent().getTotalToys(), 0)) {
      				/* 
      				 * Compiled from source statement at line 75
      				 * activate noMoreToys
      				 */
      				
      				new noMoreToys(_agentEnv.getAgent().toEnv()).activate(_agentEnv.getAgent());
      			}
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

  private TakeFinishedToy.__Event0 __event0 = null;

  private ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__DEFAULT_THROWER;

  public void __handleJadescriptException(final JadescriptException __exc) {
    jadescript.core.exception.ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__getExceptionEscalator(TakeFinishedToy.this);
    boolean __handled = false;
    if(!__handled) {
    	__thrower.__throwJadescriptException(__exc);
    }
  }

  private void __initializeProperties() {
    // Initializing properties and event handlers:
    {
    	__event0 = new TakeFinishedToy.__Event0();
    }
  }
}
