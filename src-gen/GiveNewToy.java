import jade.content.ContentManager;
import jade.content.lang.Codec;
import jadescript.content.onto.Ontology;
import jadescript.core.behaviours.CyclicBehaviour;
import jadescript.core.exception.ExceptionThrower;
import jadescript.core.exception.JadescriptException;
import jadescript.java.AgentEnv;
import jadescript.java.SideEffectsFlag;

@SuppressWarnings("all")
public class GiveNewToy extends CyclicBehaviour<Supervisor> {
  private Supervisor __theAgent = (Supervisor)/*Used as metadata*/null;

  private AgentEnv<Supervisor, SideEffectsFlag.AnySideEffectFlag> _agentEnv = null;

  public GiveNewToy(final AgentEnv<? extends Supervisor, ? extends SideEffectsFlag.WithSideEffects> _agentEnv) {
    super(_agentEnv);
    __initializeAgentEnv();
    __initializeProperties();
  }

  public static GiveNewToy __createEmpty(final AgentEnv<? extends Supervisor, ? extends SideEffectsFlag.WithSideEffects> _agentEnv) {
    return new GiveNewToy(_agentEnv);
  }

  private Boolean __ignoreMessageHandlers = false;

  public void doAction(final int _tickCount) {
    this.__ignoreMessageHandlers = false;
    super.doAction(_tickCount);
    __event0.run();
    __event1.run();
    if(!this.__ignoreMessageHandlers) {
    	this.__noMessageHandled();
    }
    if ( true  && !__event0.__eventFired && !__event1.__eventFired) __awaitForEvents();
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
      if(GiveNewToy.this.__ignoreMessageHandlers) {
      	this.__eventFired = false;
      	
      	return ;
      }
       class __PatternMatcher1740824587 {
      	public jade.core.AID worker;
      	
      	private final __PatternMatcher1740824587 __PatternMatcher1740824587_obj =  this;
      	
      	public boolean headerMatch_structterm0(java.lang.Object __objx) {
      		jade.core.AID __x;
      		
      		try {
      			if(__objx instanceof jade.core.AID) {
      				__x = (jade.core.AID) __objx;
      			}
      			else {
      				return false;
      			}
      		}
      		catch(java.lang.ClassCastException ignored) {
      			return false;
      		}
      		
      		worker = __x;
      		
      		return true;
      	}
      	
      	public boolean headerMatch(java.lang.Object __objx) {
      		askToy __x;
      		
      		try {
      			if(__objx instanceof askToy) {
      				__x = (askToy) __objx;
      			}
      			else {
      				return false;
      			}
      		}
      		catch(java.lang.ClassCastException ignored) {
      			return false;
      		}
      		
      		return true && headerMatch_structterm0(__x.getSender());
      	}
      }
      __PatternMatcher1740824587 __PatternMatcher1740824587_obj = new __PatternMatcher1740824587();
      jade.lang.acl.MessageTemplate __mt = jade.lang.acl.MessageTemplate.and(jade.lang.acl.MessageTemplate.and(jade.lang.acl.MessageTemplate.and(new jade.lang.acl.MessageTemplate(new jadescript.lang.acl.CustomMessageTemplate(((java.util.function.Predicate<jade.lang.acl.ACLMessage>) (__ignored) -> {{
      	return true;
      }
      }))), jade.lang.acl.MessageTemplate.MatchPerformative(jadescript.core.message.Message.REQUEST)), jadescript.core.nativeevent.NotNativeEventTemplate.MatchNotNative(_agentEnv.getAgent().getContentManager())), new jade.lang.acl.MessageTemplate(new jadescript.lang.acl.CustomMessageTemplate(((java.util.function.Predicate<jade.lang.acl.ACLMessage>) (__templMsg) -> {{
      	jadescript.core.message.Message __receivedMessage = jadescript.core.message.Message.wrap(__templMsg);
      	
      	try {
      		return __PatternMatcher1740824587_obj.headerMatch(__receivedMessage.getContent(_agentEnv.getAgent().getContentManager()));
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
      	GiveNewToy.this.__ignoreMessageHandlers = true;
      	
      	_agentEnv.getAgent().__cleanIgnoredFlagForMessage(__receivedMessage);
      	
      	this.__eventFired = true;
      	
      	try {
      		try {
      			/* 
      			 * Compiled from source statement from line 82 to line 95
      			 * if not stopWork do
      			 * 	            log "+ SUPERVISOR: REQUESTED TOY FROM " + name of sender of message #+ " availableTotalToys: " + availableTotalToys of agent
      			 * 
      			 *                 #If there are still new toys to give
      			 * 	            if (availableTotalToys > 0) do
      			 * 		            availableTotalToys of agent = availableTotalToys of agent - 1
      			 *                     
      			 *                     # Deliver new toy to Worker and update CoSupervisor that a new toy has been given
      			 * 		            send message request deliverNewToy(emptyToy) to CoSupervisor
      			 * 	                send message request deliverNewToy(emptyToy) to sender of message
      			 *                 
      			 *                 # Otherwise if there are no toys available
      			 * 	            else do
      			 * 	                log "+ SUPERVISOR : DENIED NO TOY IN INVENTORY [REQUEST FROM "+ name of sender of message +"] "
      			 */
      			
      			if( ! GiveNewToy.this._agentEnv.getAgent().getStopWork()) {
      				/* 
      				 * Compiled from source statement at line 83
      				 * log "+ SUPERVISOR: REQUESTED TOY FROM " + name of sender of message
      				 */
      				
      				jadescript.core.Agent.doLog(jade.util.Logger.INFO, GiveNewToy.this.getClass().getName(), GiveNewToy.this, "on request", java.lang.String.valueOf(java.lang.String.valueOf("+ SUPERVISOR: REQUESTED TOY FROM ") + java.lang.String.valueOf(((jadescript.core.message.RequestMessage<askToy>) __receivedMessage).getSender().getName())));
      				
      				/* 
      				 * Compiled from source statement from line 86 to line 95
      				 * if (availableTotalToys > 0) do
      				 * 		            availableTotalToys of agent = availableTotalToys of agent - 1
      				 *                     
      				 *                     # Deliver new toy to Worker and update CoSupervisor that a new toy has been given
      				 * 		            send message request deliverNewToy(emptyToy) to CoSupervisor
      				 * 	                send message request deliverNewToy(emptyToy) to sender of message
      				 *                 
      				 *                 # Otherwise if there are no toys available
      				 * 	            else do
      				 * 	                log "+ SUPERVISOR : DENIED NO TOY IN INVENTORY [REQUEST FROM "+ name of sender of message +"] "
      				 */
      				
      				if((GiveNewToy.this._agentEnv.getAgent().getAvailableTotalToys() > 0)) {
      					/* 
      					 * Compiled from source statement at line 87
      					 * availableTotalToys of agent = availableTotalToys of agent - 1
      					 */
      					
      					GiveNewToy.this.getJadescriptAgent().setAvailableTotalToys(GiveNewToy.this.getJadescriptAgent().getAvailableTotalToys() - 1);
      					
      					/* 
      					 * Compiled from source statement at line 90
      					 * send message request deliverNewToy(emptyToy) to CoSupervisor
      					 */
      					
      					try {
      						jadescript.util.SendMessageUtils.validatePerformative("request");
      						
      						java.lang.Object _contentToBeSent1858583843 = WorkOntology.deliverNewToy(GiveNewToy.this._agentEnv.getAgent().getEmptyToy());
      						
      						jadescript.core.message.Message _synthesizedMessage1858583843 = new jadescript.core.message.Message(jadescript.core.message.Message.REQUEST);
      						
      						_synthesizedMessage1858583843.setOntology(jadescript.util.SendMessageUtils.getDeclaringOntology(_contentToBeSent1858583843,WorkOntology.getInstance(),jadescript.content.onto.Ontology.getInstance()).getName());;
      						
      						_synthesizedMessage1858583843.setLanguage(__codec.getName());;
      						
      						_synthesizedMessage1858583843.addReceiver(GiveNewToy.this._agentEnv.getAgent().getCoSupervisor());
      						
      						_agentEnv.getAgent().getContentManager().fillContent(_synthesizedMessage1858583843, jadescript.content.onto.MessageContent.prepareContent((jade.content.ContentElement) _contentToBeSent1858583843, "request"));
      						
      						_agentEnv.getAgent().send(_synthesizedMessage1858583843);
      					}
      					catch(java.lang.Throwable _t) {
      						throw jadescript.core.exception.JadescriptException.wrap(_t);
      					}
      					
      					/* 
      					 * Compiled from source statement at line 91
      					 * send message request deliverNewToy(emptyToy) to sender of message
      					 */
      					
      					try {
      						jadescript.util.SendMessageUtils.validatePerformative("request");
      						
      						java.lang.Object _contentToBeSent36779199 = WorkOntology.deliverNewToy(GiveNewToy.this._agentEnv.getAgent().getEmptyToy());
      						
      						jadescript.core.message.Message _synthesizedMessage36779199 = new jadescript.core.message.Message(jadescript.core.message.Message.REQUEST);
      						
      						_synthesizedMessage36779199.setOntology(jadescript.util.SendMessageUtils.getDeclaringOntology(_contentToBeSent36779199,WorkOntology.getInstance(),jadescript.content.onto.Ontology.getInstance()).getName());;
      						
      						_synthesizedMessage36779199.setLanguage(__codec.getName());;
      						
      						_synthesizedMessage36779199.addReceiver(((jadescript.core.message.RequestMessage<askToy>) __receivedMessage).getSender());
      						
      						_agentEnv.getAgent().getContentManager().fillContent(_synthesizedMessage36779199, jadescript.content.onto.MessageContent.prepareContent((jade.content.ContentElement) _contentToBeSent36779199, "request"));
      						
      						_agentEnv.getAgent().send(_synthesizedMessage36779199);
      					}
      					catch(java.lang.Throwable _t) {
      						throw jadescript.core.exception.JadescriptException.wrap(_t);
      					}
      				}
      				else {
      					/* 
      					 * Compiled from source statement at line 95
      					 * log "+ SUPERVISOR : DENIED NO TOY IN INVENTORY [REQUEST FROM "+ name of sender of message +"] "
      					 */
      					
      					jadescript.core.Agent.doLog(jade.util.Logger.INFO, GiveNewToy.this.getClass().getName(), GiveNewToy.this, "on request", java.lang.String.valueOf(java.lang.String.valueOf(java.lang.String.valueOf("+ SUPERVISOR : DENIED NO TOY IN INVENTORY [REQUEST FROM ") + java.lang.String.valueOf(((jadescript.core.message.RequestMessage<askToy>) __receivedMessage).getSender().getName())) + java.lang.String.valueOf("] ")));
      				}
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

  private GiveNewToy.__Event0 __event0 = null;

  private class __Event1 {
    Boolean __eventFired = false;

    public void run() {
      if(GiveNewToy.this.__ignoreMessageHandlers) {
      	this.__eventFired = false;
      	
      	return ;
      }
       class __PatternMatcher1435501177 {
      	public BaseToy newToy;
      	
      	private final __PatternMatcher1435501177 __PatternMatcher1435501177_obj =  this;
      	
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
      		
      		newToy = __x;
      		
      		return true;
      	}
      	
      	public boolean headerMatch(java.lang.Object __objx) {
      		passToyToWorker __x;
      		
      		try {
      			if(__objx instanceof passToyToWorker) {
      				__x = (passToyToWorker) __objx;
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
      __PatternMatcher1435501177 __PatternMatcher1435501177_obj = new __PatternMatcher1435501177();
      jade.lang.acl.MessageTemplate __mt = jade.lang.acl.MessageTemplate.and(jade.lang.acl.MessageTemplate.and(jade.lang.acl.MessageTemplate.and(new jade.lang.acl.MessageTemplate(new jadescript.lang.acl.CustomMessageTemplate(((java.util.function.Predicate<jade.lang.acl.ACLMessage>) (__ignored) -> {{
      	return true;
      }
      }))), jade.lang.acl.MessageTemplate.MatchPerformative(jadescript.core.message.Message.REQUEST)), jadescript.core.nativeevent.NotNativeEventTemplate.MatchNotNative(_agentEnv.getAgent().getContentManager())), new jade.lang.acl.MessageTemplate(new jadescript.lang.acl.CustomMessageTemplate(((java.util.function.Predicate<jade.lang.acl.ACLMessage>) (__templMsg) -> {{
      	jadescript.core.message.Message __receivedMessage = jadescript.core.message.Message.wrap(__templMsg);
      	
      	try {
      		return __PatternMatcher1435501177_obj.headerMatch(__receivedMessage.getContent(_agentEnv.getAgent().getContentManager()));
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
      	GiveNewToy.this.__ignoreMessageHandlers = true;
      	
      	_agentEnv.getAgent().__cleanIgnoredFlagForMessage(__receivedMessage);
      	
      	this.__eventFired = true;
      	
      	try {
      		try {
      			/* 
      			 * Compiled from source statement at line 99
      			 * log "+ SUPERVISOR: REQUESTED TOY SENT BACK FROM "+ name of sender of message
      			 */
      			
      			jadescript.core.Agent.doLog(jade.util.Logger.INFO, GiveNewToy.this.getClass().getName(), GiveNewToy.this, "on request", java.lang.String.valueOf(java.lang.String.valueOf("+ SUPERVISOR: REQUESTED TOY SENT BACK FROM ") + java.lang.String.valueOf(((jadescript.core.message.RequestMessage<passToyToWorker>) __receivedMessage).getSender().getName())));
      			
      			/* 
      			 * Compiled from source statement at line 100
      			 * availableTotalToys of agent = availableTotalToys of agent + 1
      			 */
      			
      			GiveNewToy.this.getJadescriptAgent().setAvailableTotalToys(GiveNewToy.this.getJadescriptAgent().getAvailableTotalToys() + 1);
      			
      			/* 
      			 * Compiled from source statement from line 103 to line 104
      			 * if sender of message ≠ name of CoSupervisor do
      			 *                 send message request passToyToWorker(emptyToy) to CoSupervisor
      			 */
      			
      			if(!java.util.Objects.equals(((jadescript.core.message.RequestMessage<passToyToWorker>) __receivedMessage).getSender(), GiveNewToy.this._agentEnv.getAgent().getCoSupervisor().getName())) {
      				/* 
      				 * Compiled from source statement at line 104
      				 * send message request passToyToWorker(emptyToy) to CoSupervisor
      				 */
      				
      				try {
      					jadescript.util.SendMessageUtils.validatePerformative("request");
      					
      					java.lang.Object _contentToBeSent1675786505 = WorkOntology.passToyToWorker(GiveNewToy.this._agentEnv.getAgent().getEmptyToy());
      					
      					jadescript.core.message.Message _synthesizedMessage1675786505 = new jadescript.core.message.Message(jadescript.core.message.Message.REQUEST);
      					
      					_synthesizedMessage1675786505.setOntology(jadescript.util.SendMessageUtils.getDeclaringOntology(_contentToBeSent1675786505,WorkOntology.getInstance(),jadescript.content.onto.Ontology.getInstance()).getName());;
      					
      					_synthesizedMessage1675786505.setLanguage(__codec.getName());;
      					
      					_synthesizedMessage1675786505.addReceiver(GiveNewToy.this._agentEnv.getAgent().getCoSupervisor());
      					
      					_agentEnv.getAgent().getContentManager().fillContent(_synthesizedMessage1675786505, jadescript.content.onto.MessageContent.prepareContent((jade.content.ContentElement) _contentToBeSent1675786505, "request"));
      					
      					_agentEnv.getAgent().send(_synthesizedMessage1675786505);
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

  private GiveNewToy.__Event1 __event1 = null;

  private ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__DEFAULT_THROWER;

  public void __handleJadescriptException(final JadescriptException __exc) {
    jadescript.core.exception.ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__getExceptionEscalator(GiveNewToy.this);
    boolean __handled = false;
    if(!__handled) {
    	__thrower.__throwJadescriptException(__exc);
    }
  }

  private void __initializeProperties() {
    // Initializing properties and event handlers:
    {
    	__event0 = new GiveNewToy.__Event0();
    	
    	__event1 = new GiveNewToy.__Event1();
    }
  }
}
