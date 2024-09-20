import jade.content.ContentManager;
import jade.content.lang.Codec;
import jadescript.content.onto.Ontology;
import jadescript.core.behaviours.CyclicBehaviour;
import jadescript.core.exception.ExceptionThrower;
import jadescript.core.exception.JadescriptException;
import jadescript.java.AgentEnv;
import jadescript.java.SideEffectsFlag;

@SuppressWarnings("all")
public class waitForSupervisor extends CyclicBehaviour<Supplier> {
  private Supplier __theAgent = (Supplier)/*Used as metadata*/null;

  private AgentEnv<Supplier, SideEffectsFlag.AnySideEffectFlag> _agentEnv = null;

  public waitForSupervisor(final AgentEnv<? extends Supplier, ? extends SideEffectsFlag.WithSideEffects> _agentEnv) {
    super(_agentEnv);
    __initializeAgentEnv();
    __initializeProperties();
  }

  public static waitForSupervisor __createEmpty(final AgentEnv<? extends Supplier, ? extends SideEffectsFlag.WithSideEffects> _agentEnv) {
    return new waitForSupervisor(_agentEnv);
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
      if(waitForSupervisor.this.__ignoreMessageHandlers) {
      	this.__eventFired = false;
      	
      	return ;
      }
       class __PatternMatcher628131134 {
      	private final __PatternMatcher628131134 __PatternMatcher628131134_obj =  this;
      	
      	public boolean headerMatch(java.lang.Object __objx) {
      		resolveTechnicalIssues __x;
      		
      		try {
      			if(__objx instanceof resolveTechnicalIssues) {
      				__x = (resolveTechnicalIssues) __objx;
      			}
      			else {
      				return false;
      			}
      		}
      		catch(java.lang.ClassCastException ignored) {
      			return false;
      		}
      		
      		return java.util.Objects.equals(__x,WorkOntology.resolveTechnicalIssues());
      	}
      }
      __PatternMatcher628131134 __PatternMatcher628131134_obj = new __PatternMatcher628131134();
      jade.lang.acl.MessageTemplate __mt = jade.lang.acl.MessageTemplate.and(jade.lang.acl.MessageTemplate.and(jade.lang.acl.MessageTemplate.and(new jade.lang.acl.MessageTemplate(new jadescript.lang.acl.CustomMessageTemplate(((java.util.function.Predicate<jade.lang.acl.ACLMessage>) (__ignored) -> {{
      	return true;
      }
      }))), jade.lang.acl.MessageTemplate.MatchPerformative(jadescript.core.message.Message.INFORM)), jadescript.core.nativeevent.NotNativeEventTemplate.MatchNotNative(_agentEnv.getAgent().getContentManager())), new jade.lang.acl.MessageTemplate(new jadescript.lang.acl.CustomMessageTemplate(((java.util.function.Predicate<jade.lang.acl.ACLMessage>) (__templMsg) -> {{
      	jadescript.core.message.Message __receivedMessage = jadescript.core.message.Message.wrap(__templMsg);
      	
      	try {
      		return __PatternMatcher628131134_obj.headerMatch(__receivedMessage.getContent(_agentEnv.getAgent().getContentManager()));
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
      	waitForSupervisor.this.__ignoreMessageHandlers = true;
      	
      	_agentEnv.getAgent().__cleanIgnoredFlagForMessage(__receivedMessage);
      	
      	this.__eventFired = true;
      	
      	try {
      		try {
      			/* 
      			 * Compiled from source statement from line 225 to line 230
      			 * if not stopWorking do
      			 * 	            log "= SUPPLIER : TECHNICAL ISSUE RESOLVED"
      			 * 	            waitForAssistence of agent = false
      			 * 	            if not stopWorking do
      			 * 	                activate technicalIssues after breakingTime
      			 * 	            destroy this
      			 */
      			
      			if( ! waitForSupervisor.this._agentEnv.getAgent().getStopWorking()) {
      				/* 
      				 * Compiled from source statement at line 226
      				 * log "= SUPPLIER : TECHNICAL ISSUE RESOLVED"
      				 */
      				
      				jadescript.core.Agent.doLog(jade.util.Logger.INFO, waitForSupervisor.this.getClass().getName(), waitForSupervisor.this, "on inform", java.lang.String.valueOf("= SUPPLIER : TECHNICAL ISSUE RESOLVED"));
      				
      				/* 
      				 * Compiled from source statement at line 227
      				 * waitForAssistence of agent = false
      				 */
      				
      				waitForSupervisor.this.getJadescriptAgent().setWaitForAssistence(false);
      				
      				/* 
      				 * Compiled from source statement from line 228 to line 229
      				 * if not stopWorking do
      				 * 	                activate technicalIssues after breakingTime
      				 */
      				
      				if( ! waitForSupervisor.this._agentEnv.getAgent().getStopWorking()) {
      					/* 
      					 * Compiled from source statement at line 229
      					 * activate technicalIssues after breakingTime
      					 */
      					
      					new technicalIssues(_agentEnv.getAgent().toEnv()).activate_after(_agentEnv.getAgent(), waitForSupervisor.this._agentEnv.getAgent().getBreakingTime());
      				}
      				
      				/* 
      				 * Compiled from source statement at line 230
      				 * 
      				 * 	            destroy this
      				 */
      				
      				waitForSupervisor.this.destroy();
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

  private waitForSupervisor.__Event0 __event0 = null;

  private ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__DEFAULT_THROWER;

  public void __handleJadescriptException(final JadescriptException __exc) {
    jadescript.core.exception.ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__getExceptionEscalator(waitForSupervisor.this);
    boolean __handled = false;
    if(!__handled) {
    	__thrower.__throwJadescriptException(__exc);
    }
  }

  private void __initializeProperties() {
    // Initializing properties and event handlers:
    {
    	__event0 = new waitForSupervisor.__Event0();
    }
  }
}
