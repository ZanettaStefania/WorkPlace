import jade.content.ContentManager;
import jade.content.lang.Codec;
import jadescript.content.onto.Ontology;
import jadescript.core.behaviours.CyclicBehaviour;
import jadescript.core.exception.ExceptionThrower;
import jadescript.core.exception.JadescriptException;
import jadescript.java.AgentEnv;
import jadescript.java.SideEffectsFlag;

@SuppressWarnings("all")
public class EndOfShift extends CyclicBehaviour<Worker> {
  private Worker __theAgent = (Worker)/*Used as metadata*/null;

  private AgentEnv<Worker, SideEffectsFlag.AnySideEffectFlag> _agentEnv = null;

  public EndOfShift(final AgentEnv<? extends Worker, ? extends SideEffectsFlag.WithSideEffects> _agentEnv) {
    super(_agentEnv);
    __initializeAgentEnv();
    __initializeProperties();
  }

  public static EndOfShift __createEmpty(final AgentEnv<? extends Worker, ? extends SideEffectsFlag.WithSideEffects> _agentEnv) {
    return new EndOfShift(_agentEnv);
  }

  private Boolean __ignoreMessageHandlers = false;

  public void doAction(final int _tickCount) {
    this.__ignoreMessageHandlers = false;
    super.doAction(_tickCount);
    __event1.run();
    if(!this.__ignoreMessageHandlers) {
    	this.__noMessageHandled();
    }
    if ( true  && !__event1.__eventFired) __awaitForEvents();
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

  protected Integer UnUsedToyParts = null;

  public void setUnUsedToyParts(final Integer UnUsedToyParts) {
    this.UnUsedToyParts = UnUsedToyParts;
  }

  public Integer getUnUsedToyParts() {
    return this.UnUsedToyParts;
  }

  private class __Event1 {
    Boolean __eventFired = false;

    public void run() {
      if(EndOfShift.this.__ignoreMessageHandlers) {
      	this.__eventFired = false;
      	
      	return ;
      }
       class __PatternMatcher1047975461 {
      	private final __PatternMatcher1047975461 __PatternMatcher1047975461_obj =  this;
      	
      	public boolean headerMatch(java.lang.Object __objx) {
      		sendWorkingReport __x;
      		
      		try {
      			if(__objx instanceof sendWorkingReport) {
      				__x = (sendWorkingReport) __objx;
      			}
      			else {
      				return false;
      			}
      		}
      		catch(java.lang.ClassCastException ignored) {
      			return false;
      		}
      		
      		return java.util.Objects.equals(__x,WorkOntology.sendWorkingReport());
      	}
      }
      __PatternMatcher1047975461 __PatternMatcher1047975461_obj = new __PatternMatcher1047975461();
      jade.lang.acl.MessageTemplate __mt = jade.lang.acl.MessageTemplate.and(jade.lang.acl.MessageTemplate.and(jade.lang.acl.MessageTemplate.and(new jade.lang.acl.MessageTemplate(new jadescript.lang.acl.CustomMessageTemplate(((java.util.function.Predicate<jade.lang.acl.ACLMessage>) (__ignored) -> {{
      	return true;
      }
      }))), jade.lang.acl.MessageTemplate.MatchPerformative(jadescript.core.message.Message.INFORM)), jadescript.core.nativeevent.NotNativeEventTemplate.MatchNotNative(_agentEnv.getAgent().getContentManager())), new jade.lang.acl.MessageTemplate(new jadescript.lang.acl.CustomMessageTemplate(((java.util.function.Predicate<jade.lang.acl.ACLMessage>) (__templMsg) -> {{
      	jadescript.core.message.Message __receivedMessage = jadescript.core.message.Message.wrap(__templMsg);
      	
      	try {
      		return __PatternMatcher1047975461_obj.headerMatch(__receivedMessage.getContent(_agentEnv.getAgent().getContentManager()));
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
      	EndOfShift.this.__ignoreMessageHandlers = true;
      	
      	_agentEnv.getAgent().__cleanIgnoredFlagForMessage(__receivedMessage);
      	
      	this.__eventFired = true;
      	
      	try {
      		try {
      			/* 
      			 * Compiled from source statement at line 305
      			 * stopWorking of agent = true
      			 */
      			
      			EndOfShift.this.getJadescriptAgent().setStopWorking(true);
      			
      			/* 
      			 * Compiled from source statement at line 306
      			 * UnUsedToyParts = hasAnyItems(myInventory of agent)
      			 */
      			
      			EndOfShift.this.setUnUsedToyParts(EndOfShift.this._agentEnv.getAgent().hasAnyItems(_agentEnv.getAgent().toEnv() ,EndOfShift.this.getJadescriptAgent().getMyInventory()));
      			
      			/* 
      			 * Compiled from source statement at line 307
      			 * send message inform deliverWorkingReport(numberOfWorkerRequest, UnUsedToyParts, numberOfSupplierRequest, numberOfFinishedToys, numberOfPartsPassed, numberOfToyPassed, aid of agent) to sender of message
      			 */
      			
      			try {
      				jadescript.util.SendMessageUtils.validatePerformative("inform");
      				
      				java.lang.Object _contentToBeSent2089946868 = WorkOntology.deliverWorkingReport(EndOfShift.this._agentEnv.getAgent().getNumberOfWorkerRequest() ,EndOfShift.this.getUnUsedToyParts() ,EndOfShift.this._agentEnv.getAgent().getNumberOfSupplierRequest() ,EndOfShift.this._agentEnv.getAgent().getNumberOfFinishedToys() ,EndOfShift.this._agentEnv.getAgent().getNumberOfPartsPassed() ,EndOfShift.this._agentEnv.getAgent().getNumberOfToyPassed() ,EndOfShift.this.getJadescriptAgent().getAID());
      				
      				jadescript.core.message.Message _synthesizedMessage2089946868 = new jadescript.core.message.Message(jadescript.core.message.Message.INFORM);
      				
      				_synthesizedMessage2089946868.setOntology(jadescript.util.SendMessageUtils.getDeclaringOntology(_contentToBeSent2089946868,WorkOntology.getInstance(),jadescript.content.onto.Ontology.getInstance()).getName());;
      				
      				_synthesizedMessage2089946868.setLanguage(__codec.getName());;
      				
      				_synthesizedMessage2089946868.addReceiver(((jadescript.core.message.InformMessage<sendWorkingReport>) __receivedMessage).getSender());
      				
      				_agentEnv.getAgent().getContentManager().fillContent(_synthesizedMessage2089946868, jadescript.content.onto.MessageContent.prepareContent((jade.content.ContentElement) _contentToBeSent2089946868, "inform"));
      				
      				_agentEnv.getAgent().send(_synthesizedMessage2089946868);
      			}
      			catch(java.lang.Throwable _t) {
      				throw jadescript.core.exception.JadescriptException.wrap(_t);
      			}
      			
      			/* 
      			 * Compiled from source statement at line 308
      			 * destroy AddPieceBehavior
      			 */
      			
      			new AddPieceBehavior(_agentEnv.getAgent().toEnv()).destroy();
      			
      			/* 
      			 * Compiled from source statement at line 309
      			 * destroy listenWorkers
      			 */
      			
      			new listenWorkers(_agentEnv.getAgent().toEnv()).destroy();
      			
      			/* 
      			 * Compiled from source statement at line 310
      			 * destroy AskForNewToyParts_toSupplier
      			 */
      			
      			new AskForNewToyParts_toSupplier(_agentEnv.getAgent().toEnv()).destroy();
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

  private EndOfShift.__Event1 __event1 = null;

  private ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__DEFAULT_THROWER;

  public void __handleJadescriptException(final JadescriptException __exc) {
    jadescript.core.exception.ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__getExceptionEscalator(EndOfShift.this);
    boolean __handled = false;
    if(!__handled) {
    	__thrower.__throwJadescriptException(__exc);
    }
  }

  private void __initializeProperties() {
    // Initializing properties and event handlers:
    {
    	EndOfShift.this.UnUsedToyParts = 0;
    	
    	__event1 = new EndOfShift.__Event1();
    }
  }
}
