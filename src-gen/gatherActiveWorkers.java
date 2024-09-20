import jade.content.ContentManager;
import jade.content.lang.Codec;
import jadescript.content.onto.Ontology;
import jadescript.core.behaviours.CyclicBehaviour;
import jadescript.core.exception.ExceptionThrower;
import jadescript.core.exception.JadescriptException;
import jadescript.java.AgentEnv;
import jadescript.java.SideEffectsFlag;

@SuppressWarnings("all")
public class gatherActiveWorkers extends CyclicBehaviour<Supervisor> {
  private Supervisor __theAgent = (Supervisor)/*Used as metadata*/null;

  private AgentEnv<Supervisor, SideEffectsFlag.AnySideEffectFlag> _agentEnv = null;

  public gatherActiveWorkers(final AgentEnv<? extends Supervisor, ? extends SideEffectsFlag.WithSideEffects> _agentEnv) {
    super(_agentEnv);
    __initializeAgentEnv();
    __initializeProperties();
  }

  public static gatherActiveWorkers __createEmpty(final AgentEnv<? extends Supervisor, ? extends SideEffectsFlag.WithSideEffects> _agentEnv) {
    return new gatherActiveWorkers(_agentEnv);
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
      if(gatherActiveWorkers.this.__ignoreMessageHandlers) {
      	this.__eventFired = false;
      	
      	return ;
      }
       class __PatternMatcher1597218763 {
      	private final __PatternMatcher1597218763 __PatternMatcher1597218763_obj =  this;
      	
      	public boolean headerMatch(java.lang.Object __objx) {
      		notifySupervisor __x;
      		
      		try {
      			if(__objx instanceof notifySupervisor) {
      				__x = (notifySupervisor) __objx;
      			}
      			else {
      				return false;
      			}
      		}
      		catch(java.lang.ClassCastException ignored) {
      			return false;
      		}
      		
      		return java.util.Objects.equals(__x,WorkOntology.notifySupervisor());
      	}
      }
      __PatternMatcher1597218763 __PatternMatcher1597218763_obj = new __PatternMatcher1597218763();
      jade.lang.acl.MessageTemplate __mt = jade.lang.acl.MessageTemplate.and(jade.lang.acl.MessageTemplate.and(jade.lang.acl.MessageTemplate.and(new jade.lang.acl.MessageTemplate(new jadescript.lang.acl.CustomMessageTemplate(((java.util.function.Predicate<jade.lang.acl.ACLMessage>) (__ignored) -> {{
      	return true;
      }
      }))), jade.lang.acl.MessageTemplate.MatchPerformative(jadescript.core.message.Message.INFORM)), jadescript.core.nativeevent.NotNativeEventTemplate.MatchNotNative(_agentEnv.getAgent().getContentManager())), new jade.lang.acl.MessageTemplate(new jadescript.lang.acl.CustomMessageTemplate(((java.util.function.Predicate<jade.lang.acl.ACLMessage>) (__templMsg) -> {{
      	jadescript.core.message.Message __receivedMessage = jadescript.core.message.Message.wrap(__templMsg);
      	
      	try {
      		return __PatternMatcher1597218763_obj.headerMatch(__receivedMessage.getContent(_agentEnv.getAgent().getContentManager()));
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
      	gatherActiveWorkers.this.__ignoreMessageHandlers = true;
      	
      	_agentEnv.getAgent().__cleanIgnoredFlagForMessage(__receivedMessage);
      	
      	this.__eventFired = true;
      	
      	try {
      		try {
      			/* 
      			 * Compiled from source statement from line 46 to line 59
      			 * if ((name of sender of message) as text) = ((name of CoSupervisor) as text) do
      			 *                 numTotalWorker of agent = numTotalWorker+1
      			 *                 #log "numTotalWorker "+ numTotalWorker + " sender: "+ name of sender of message
      			 *                 
      			 *             
      			 *             # Else if the sender isn't a Supervisor, add them to the list of individuals under Supervisor responsibility
      			 *             else do
      			 * 	            add sender of message to listOfWorkers of agent
      			 * 	            log "+ SUPERVISOR : " + name of sender of message + " WORKS UNDER SUPERVISION OF "+ name of agent + " : " + listOfWorkers of agent
      			 * 	            
      			 * 	            # If it's a Worker add to number of Workers and notify CoSupervisor of their presence
      			 * 	            if ((name of sender of message) as text)[0] = "W" do
      			 * 		            numTotalWorker of agent = numTotalWorker+1
      			 * 		            send message inform notifySupervisor to CoSupervisor
      			 */
      			
      			if(java.util.Objects.equals((((java.lang.String) jadescript.util.types.Converter.convert((((jadescript.core.message.InformMessage<notifySupervisor>) __receivedMessage).getSender().getName()), new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.TEXT), new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.TEXT)))), (((java.lang.String) jadescript.util.types.Converter.convert((gatherActiveWorkers.this._agentEnv.getAgent().getCoSupervisor().getName()), new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.TEXT), new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.TEXT)))))) {
      				/* 
      				 * Compiled from source statement at line 47
      				 * numTotalWorker of agent = numTotalWorker+1
      				 */
      				
      				gatherActiveWorkers.this.getJadescriptAgent().setNumTotalWorker(gatherActiveWorkers.this._agentEnv.getAgent().getNumTotalWorker() + 1);
      			}
      			else {
      				/* 
      				 * Compiled from source statement at line 53
      				 * add sender of message to listOfWorkers of agent
      				 */
      				
      				gatherActiveWorkers.this.getJadescriptAgent().getListOfWorkers().add(((jadescript.core.message.InformMessage<notifySupervisor>) __receivedMessage).getSender());
      				
      				/* 
      				 * Compiled from source statement at line 54
      				 * log "+ SUPERVISOR : " + name of sender of message + " WORKS UNDER SUPERVISION OF "+ name of agent + " : " + listOfWorkers of agent
      				 */
      				
      				jadescript.core.Agent.doLog(jade.util.Logger.INFO, gatherActiveWorkers.this.getClass().getName(), gatherActiveWorkers.this, "on inform", java.lang.String.valueOf(java.lang.String.valueOf(java.lang.String.valueOf(java.lang.String.valueOf(java.lang.String.valueOf(java.lang.String.valueOf("+ SUPERVISOR : ") + java.lang.String.valueOf(((jadescript.core.message.InformMessage<notifySupervisor>) __receivedMessage).getSender().getName())) + java.lang.String.valueOf(" WORKS UNDER SUPERVISION OF ")) + java.lang.String.valueOf(gatherActiveWorkers.this.getJadescriptAgent().getName())) + java.lang.String.valueOf(" : ")) + java.lang.String.valueOf(gatherActiveWorkers.this.getJadescriptAgent().getListOfWorkers())));
      				
      				/* 
      				 * Compiled from source statement from line 57 to line 59
      				 * if ((name of sender of message) as text)[0] = "W" do
      				 * 		            numTotalWorker of agent = numTotalWorker+1
      				 * 		            send message inform notifySupervisor to CoSupervisor
      				 */
      				
      				if(java.util.Objects.equals((""+(((java.lang.String) jadescript.util.types.Converter.convert((((jadescript.core.message.InformMessage<notifySupervisor>) __receivedMessage).getSender().getName()), new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.TEXT), new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.TEXT)))).charAt(0)), "W")) {
      					/* 
      					 * Compiled from source statement at line 58
      					 * numTotalWorker of agent = numTotalWorker+1
      					 */
      					
      					gatherActiveWorkers.this.getJadescriptAgent().setNumTotalWorker(gatherActiveWorkers.this._agentEnv.getAgent().getNumTotalWorker() + 1);
      					
      					/* 
      					 * Compiled from source statement at line 59
      					 * send message inform notifySupervisor to CoSupervisor
      					 */
      					
      					try {
      						jadescript.util.SendMessageUtils.validatePerformative("inform");
      						
      						java.lang.Object _contentToBeSent1828629424 = WorkOntology.notifySupervisor();
      						
      						jadescript.core.message.Message _synthesizedMessage1828629424 = new jadescript.core.message.Message(jadescript.core.message.Message.INFORM);
      						
      						_synthesizedMessage1828629424.setOntology(jadescript.util.SendMessageUtils.getDeclaringOntology(_contentToBeSent1828629424,WorkOntology.getInstance(),jadescript.content.onto.Ontology.getInstance()).getName());;
      						
      						_synthesizedMessage1828629424.setLanguage(__codec.getName());;
      						
      						_synthesizedMessage1828629424.addReceiver(gatherActiveWorkers.this._agentEnv.getAgent().getCoSupervisor());
      						
      						_agentEnv.getAgent().getContentManager().fillContent(_synthesizedMessage1828629424, jadescript.content.onto.MessageContent.prepareContent((jade.content.ContentElement) _contentToBeSent1828629424, "inform"));
      						
      						_agentEnv.getAgent().send(_synthesizedMessage1828629424);
      					}
      					catch(java.lang.Throwable _t) {
      						throw jadescript.core.exception.JadescriptException.wrap(_t);
      					}
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

  private gatherActiveWorkers.__Event0 __event0 = null;

  private ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__DEFAULT_THROWER;

  public void __handleJadescriptException(final JadescriptException __exc) {
    jadescript.core.exception.ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__getExceptionEscalator(gatherActiveWorkers.this);
    boolean __handled = false;
    if(!__handled) {
    	__thrower.__throwJadescriptException(__exc);
    }
  }

  private void __initializeProperties() {
    // Initializing properties and event handlers:
    {
    	__event0 = new gatherActiveWorkers.__Event0();
    }
  }
}
