import jade.content.ContentManager;
import jade.content.lang.Codec;
import jadescript.content.onto.Ontology;
import jadescript.core.behaviours.CyclicBehaviour;
import jadescript.core.exception.ExceptionThrower;
import jadescript.core.exception.JadescriptException;
import jadescript.java.AgentEnv;
import jadescript.java.SideEffectsFlag;

@SuppressWarnings("all")
public class UpdateCountFinisheTotalToys extends CyclicBehaviour<Supervisor> {
  private Supervisor __theAgent = (Supervisor)/*Used as metadata*/null;

  private AgentEnv<Supervisor, SideEffectsFlag.AnySideEffectFlag> _agentEnv = null;

  public UpdateCountFinisheTotalToys(final AgentEnv<? extends Supervisor, ? extends SideEffectsFlag.WithSideEffects> _agentEnv) {
    super(_agentEnv);
    __initializeAgentEnv();
    __initializeProperties();
  }

  public static UpdateCountFinisheTotalToys __createEmpty(final AgentEnv<? extends Supervisor, ? extends SideEffectsFlag.WithSideEffects> _agentEnv) {
    return new UpdateCountFinisheTotalToys(_agentEnv);
  }

  private Boolean __ignoreMessageHandlers = false;

  public void doAction(final int _tickCount) {
    this.__ignoreMessageHandlers = false;
    super.doAction(_tickCount);
    __event0.run();
    __event1.run();
    __event2.run();
    if(!this.__ignoreMessageHandlers) {
    	this.__noMessageHandled();
    }
    if ( true  && !__event0.__eventFired && !__event1.__eventFired && !__event2.__eventFired) __awaitForEvents();
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
      if(UpdateCountFinisheTotalToys.this.__ignoreMessageHandlers) {
      	this.__eventFired = false;
      	
      	return ;
      }
       class __PatternMatcher1235706533 {
      	public BaseToy finishedToy;
      	
      	private final __PatternMatcher1235706533 __PatternMatcher1235706533_obj =  this;
      	
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
      		
      		finishedToy = __x;
      		
      		return true;
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
      __PatternMatcher1235706533 __PatternMatcher1235706533_obj = new __PatternMatcher1235706533();
      jade.lang.acl.MessageTemplate __mt = jade.lang.acl.MessageTemplate.and(jade.lang.acl.MessageTemplate.and(jade.lang.acl.MessageTemplate.and(new jade.lang.acl.MessageTemplate(new jadescript.lang.acl.CustomMessageTemplate(((java.util.function.Predicate<jade.lang.acl.ACLMessage>) (__ignored) -> {{
      	return true;
      }
      }))), jade.lang.acl.MessageTemplate.MatchPerformative(jadescript.core.message.Message.REQUEST)), jadescript.core.nativeevent.NotNativeEventTemplate.MatchNotNative(_agentEnv.getAgent().getContentManager())), new jade.lang.acl.MessageTemplate(new jadescript.lang.acl.CustomMessageTemplate(((java.util.function.Predicate<jade.lang.acl.ACLMessage>) (__templMsg) -> {{
      	jadescript.core.message.Message __receivedMessage = jadescript.core.message.Message.wrap(__templMsg);
      	
      	try {
      		return __PatternMatcher1235706533_obj.headerMatch(__receivedMessage.getContent(_agentEnv.getAgent().getContentManager()));
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
      	UpdateCountFinisheTotalToys.this.__ignoreMessageHandlers = true;
      	
      	_agentEnv.getAgent().__cleanIgnoredFlagForMessage(__receivedMessage);
      	
      	this.__eventFired = true;
      	
      	try {
      		try {
      			/* 
      			 * Compiled from source statement at line 110
      			 * totalToys of agent = totalToys - 1
      			 */
      			
      			UpdateCountFinisheTotalToys.this.getJadescriptAgent().setTotalToys(UpdateCountFinisheTotalToys.this._agentEnv.getAgent().getTotalToys() - 1);
      			
      			/* 
      			 * Compiled from source statement from line 112 to line 113
      			 * if totalToys = 0 do
      			 *                 activate noMoreToys
      			 */
      			
      			if(java.util.Objects.equals(UpdateCountFinisheTotalToys.this._agentEnv.getAgent().getTotalToys(), 0)) {
      				/* 
      				 * Compiled from source statement at line 113
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

  private UpdateCountFinisheTotalToys.__Event0 __event0 = null;

  private class __Event1 {
    Boolean __eventFired = false;

    public void run() {
      if(UpdateCountFinisheTotalToys.this.__ignoreMessageHandlers) {
      	this.__eventFired = false;
      	
      	return ;
      }
       class __PatternMatcher174463065 {
      	public BaseToy finishedToy;
      	
      	private final __PatternMatcher174463065 __PatternMatcher174463065_obj =  this;
      	
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
      		
      		finishedToy = __x;
      		
      		return true;
      	}
      	
      	public boolean headerMatch(java.lang.Object __objx) {
      		deliverNewToy __x;
      		
      		try {
      			if(__objx instanceof deliverNewToy) {
      				__x = (deliverNewToy) __objx;
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
      __PatternMatcher174463065 __PatternMatcher174463065_obj = new __PatternMatcher174463065();
      jade.lang.acl.MessageTemplate __mt = jade.lang.acl.MessageTemplate.and(jade.lang.acl.MessageTemplate.and(jade.lang.acl.MessageTemplate.and(new jade.lang.acl.MessageTemplate(new jadescript.lang.acl.CustomMessageTemplate(((java.util.function.Predicate<jade.lang.acl.ACLMessage>) (__ignored) -> {{
      	return true;
      }
      }))), jade.lang.acl.MessageTemplate.MatchPerformative(jadescript.core.message.Message.REQUEST)), jadescript.core.nativeevent.NotNativeEventTemplate.MatchNotNative(_agentEnv.getAgent().getContentManager())), new jade.lang.acl.MessageTemplate(new jadescript.lang.acl.CustomMessageTemplate(((java.util.function.Predicate<jade.lang.acl.ACLMessage>) (__templMsg) -> {{
      	jadescript.core.message.Message __receivedMessage = jadescript.core.message.Message.wrap(__templMsg);
      	
      	try {
      		return __PatternMatcher174463065_obj.headerMatch(__receivedMessage.getContent(_agentEnv.getAgent().getContentManager()));
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
      	UpdateCountFinisheTotalToys.this.__ignoreMessageHandlers = true;
      	
      	_agentEnv.getAgent().__cleanIgnoredFlagForMessage(__receivedMessage);
      	
      	this.__eventFired = true;
      	
      	try {
      		try {
      			/* 
      			 * Compiled from source statement at line 116
      			 * availableTotalToys of agent = availableTotalToys of agent - 1
      			 */
      			
      			UpdateCountFinisheTotalToys.this.getJadescriptAgent().setAvailableTotalToys(UpdateCountFinisheTotalToys.this.getJadescriptAgent().getAvailableTotalToys() - 1);
      			
      			/* 
      			 * Compiled from source statement at line 117
      			 * log "+ SUPERVISOR -> SUPERVISOR : UPDATE AVAILABLE BASETOYS"
      			 */
      			
      			jadescript.core.Agent.doLog(jade.util.Logger.INFO, UpdateCountFinisheTotalToys.this.getClass().getName(), UpdateCountFinisheTotalToys.this, "on request", java.lang.String.valueOf("+ SUPERVISOR -> SUPERVISOR : UPDATE AVAILABLE BASETOYS"));
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

  private UpdateCountFinisheTotalToys.__Event1 __event1 = null;

  private class __Event2 {
    Boolean __eventFired = false;

    public void run() {
      if(UpdateCountFinisheTotalToys.this.__ignoreMessageHandlers) {
      	this.__eventFired = false;
      	
      	return ;
      }
       class __PatternMatcher798742895 {
      	private final __PatternMatcher798742895 __PatternMatcher798742895_obj =  this;
      	
      	public boolean headerMatch(java.lang.Object __objx) {
      		informOnInitialToy __x;
      		
      		try {
      			if(__objx instanceof informOnInitialToy) {
      				__x = (informOnInitialToy) __objx;
      			}
      			else {
      				return false;
      			}
      		}
      		catch(java.lang.ClassCastException ignored) {
      			return false;
      		}
      		
      		return java.util.Objects.equals(__x,WorkOntology.informOnInitialToy());
      	}
      }
      __PatternMatcher798742895 __PatternMatcher798742895_obj = new __PatternMatcher798742895();
      jade.lang.acl.MessageTemplate __mt = jade.lang.acl.MessageTemplate.and(jade.lang.acl.MessageTemplate.and(jade.lang.acl.MessageTemplate.and(new jade.lang.acl.MessageTemplate(new jadescript.lang.acl.CustomMessageTemplate(((java.util.function.Predicate<jade.lang.acl.ACLMessage>) (__ignored) -> {{
      	return true;
      }
      }))), jade.lang.acl.MessageTemplate.MatchPerformative(jadescript.core.message.Message.INFORM)), jadescript.core.nativeevent.NotNativeEventTemplate.MatchNotNative(_agentEnv.getAgent().getContentManager())), new jade.lang.acl.MessageTemplate(new jadescript.lang.acl.CustomMessageTemplate(((java.util.function.Predicate<jade.lang.acl.ACLMessage>) (__templMsg) -> {{
      	jadescript.core.message.Message __receivedMessage = jadescript.core.message.Message.wrap(__templMsg);
      	
      	try {
      		return __PatternMatcher798742895_obj.headerMatch(__receivedMessage.getContent(_agentEnv.getAgent().getContentManager()));
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
      	UpdateCountFinisheTotalToys.this.__ignoreMessageHandlers = true;
      	
      	_agentEnv.getAgent().__cleanIgnoredFlagForMessage(__receivedMessage);
      	
      	this.__eventFired = true;
      	
      	try {
      		try {
      			/* 
      			 * Compiled from source statement at line 120
      			 * totalToys of agent = totalToys + 1
      			 */
      			
      			UpdateCountFinisheTotalToys.this.getJadescriptAgent().setTotalToys(UpdateCountFinisheTotalToys.this._agentEnv.getAgent().getTotalToys() + 1);
      			
      			/* 
      			 * Compiled from source statement from line 123 to line 126
      			 * if name of sender of message ≠ name of CoSupervisor do
      			 *                 log "+ SUPERVISOR : "+ name of sender of message + " DECLARED POSSETION OF A TOY "
      			 *                 send message inform informOnInitialToy to CoSupervisor of agent
      			 *                 add sender of message to listOfManagerWorkers
      			 */
      			
      			if(!java.util.Objects.equals(((jadescript.core.message.InformMessage<informOnInitialToy>) __receivedMessage).getSender().getName(), UpdateCountFinisheTotalToys.this._agentEnv.getAgent().getCoSupervisor().getName())) {
      				/* 
      				 * Compiled from source statement at line 124
      				 * log "+ SUPERVISOR : "+ name of sender of message + " DECLARED POSSETION OF A TOY "
      				 */
      				
      				jadescript.core.Agent.doLog(jade.util.Logger.INFO, UpdateCountFinisheTotalToys.this.getClass().getName(), UpdateCountFinisheTotalToys.this, "on inform", java.lang.String.valueOf(java.lang.String.valueOf(java.lang.String.valueOf("+ SUPERVISOR : ") + java.lang.String.valueOf(((jadescript.core.message.InformMessage<informOnInitialToy>) __receivedMessage).getSender().getName())) + java.lang.String.valueOf(" DECLARED POSSETION OF A TOY ")));
      				
      				/* 
      				 * Compiled from source statement at line 125
      				 * send message inform informOnInitialToy to CoSupervisor of agent
      				 */
      				
      				try {
      					jadescript.util.SendMessageUtils.validatePerformative("inform");
      					
      					java.lang.Object _contentToBeSent525836182 = WorkOntology.informOnInitialToy();
      					
      					jadescript.core.message.Message _synthesizedMessage525836182 = new jadescript.core.message.Message(jadescript.core.message.Message.INFORM);
      					
      					_synthesizedMessage525836182.setOntology(jadescript.util.SendMessageUtils.getDeclaringOntology(_contentToBeSent525836182,WorkOntology.getInstance(),jadescript.content.onto.Ontology.getInstance()).getName());;
      					
      					_synthesizedMessage525836182.setLanguage(__codec.getName());;
      					
      					_synthesizedMessage525836182.addReceiver(UpdateCountFinisheTotalToys.this.getJadescriptAgent().getCoSupervisor());
      					
      					_agentEnv.getAgent().getContentManager().fillContent(_synthesizedMessage525836182, jadescript.content.onto.MessageContent.prepareContent((jade.content.ContentElement) _contentToBeSent525836182, "inform"));
      					
      					_agentEnv.getAgent().send(_synthesizedMessage525836182);
      				}
      				catch(java.lang.Throwable _t) {
      					throw jadescript.core.exception.JadescriptException.wrap(_t);
      				}
      				
      				/* 
      				 * Compiled from source statement at line 126
      				 * add sender of message to listOfManagerWorkers
      				 */
      				
      				UpdateCountFinisheTotalToys.this._agentEnv.getAgent().getListOfManagerWorkers().add(((jadescript.core.message.InformMessage<informOnInitialToy>) __receivedMessage).getSender());
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

  private UpdateCountFinisheTotalToys.__Event2 __event2 = null;

  private ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__DEFAULT_THROWER;

  public void __handleJadescriptException(final JadescriptException __exc) {
    jadescript.core.exception.ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__getExceptionEscalator(UpdateCountFinisheTotalToys.this);
    boolean __handled = false;
    if(!__handled) {
    	__thrower.__throwJadescriptException(__exc);
    }
  }

  private void __initializeProperties() {
    // Initializing properties and event handlers:
    {
    	__event0 = new UpdateCountFinisheTotalToys.__Event0();
    	
    	__event1 = new UpdateCountFinisheTotalToys.__Event1();
    	
    	__event2 = new UpdateCountFinisheTotalToys.__Event2();
    }
  }
}
