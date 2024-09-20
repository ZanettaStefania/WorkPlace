import jade.content.ContentManager;
import jade.content.lang.Codec;
import jadescript.content.onto.Ontology;
import jadescript.core.behaviours.CyclicBehaviour;
import jadescript.core.exception.ExceptionThrower;
import jadescript.core.exception.JadescriptException;
import jadescript.java.AgentEnv;
import jadescript.java.SideEffectsFlag;

@SuppressWarnings("all")
public class GiveNewToyParts extends CyclicBehaviour<Supplier> {
  private Supplier __theAgent = (Supplier)/*Used as metadata*/null;

  private AgentEnv<Supplier, SideEffectsFlag.AnySideEffectFlag> _agentEnv = null;

  public GiveNewToyParts(final AgentEnv<? extends Supplier, ? extends SideEffectsFlag.WithSideEffects> _agentEnv) {
    super(_agentEnv);
    __initializeAgentEnv();
    __initializeProperties();
  }

  public static GiveNewToyParts __createEmpty(final AgentEnv<? extends Supplier, ? extends SideEffectsFlag.WithSideEffects> _agentEnv) {
    return new GiveNewToyParts(_agentEnv);
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
      if(GiveNewToyParts.this.__ignoreMessageHandlers) {
      	this.__eventFired = false;
      	
      	return ;
      }
       class __PatternMatcher1146274927 {
      	public ToyParts PreferedPart;
      	
      	private final __PatternMatcher1146274927 __PatternMatcher1146274927_obj =  this;
      	
      	public boolean headerMatch_structterm0(java.lang.Object __objx) {
      		ToyParts __x;
      		
      		try {
      			if(__objx instanceof ToyParts) {
      				__x = (ToyParts) __objx;
      			}
      			else {
      				return false;
      			}
      		}
      		catch(java.lang.ClassCastException ignored) {
      			return false;
      		}
      		
      		PreferedPart = __x;
      		
      		return true;
      	}
      	
      	public boolean headerMatch(java.lang.Object __objx) {
      		askToyParts __x;
      		
      		try {
      			if(__objx instanceof askToyParts) {
      				__x = (askToyParts) __objx;
      			}
      			else {
      				return false;
      			}
      		}
      		catch(java.lang.ClassCastException ignored) {
      			return false;
      		}
      		
      		return true && headerMatch_structterm0(__x.getPreferedPart());
      	}
      }
      __PatternMatcher1146274927 __PatternMatcher1146274927_obj = new __PatternMatcher1146274927();
      jade.lang.acl.MessageTemplate __mt = jade.lang.acl.MessageTemplate.and(jade.lang.acl.MessageTemplate.and(jade.lang.acl.MessageTemplate.and(new jade.lang.acl.MessageTemplate(new jadescript.lang.acl.CustomMessageTemplate(((java.util.function.Predicate<jade.lang.acl.ACLMessage>) (__ignored) -> {{
      	return true;
      }
      }))), jade.lang.acl.MessageTemplate.MatchPerformative(jadescript.core.message.Message.REQUEST)), jadescript.core.nativeevent.NotNativeEventTemplate.MatchNotNative(_agentEnv.getAgent().getContentManager())), new jade.lang.acl.MessageTemplate(new jadescript.lang.acl.CustomMessageTemplate(((java.util.function.Predicate<jade.lang.acl.ACLMessage>) (__templMsg) -> {{
      	jadescript.core.message.Message __receivedMessage = jadescript.core.message.Message.wrap(__templMsg);
      	
      	try {
      		return __PatternMatcher1146274927_obj.headerMatch(__receivedMessage.getContent(_agentEnv.getAgent().getContentManager()));
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
      	GiveNewToyParts.this.__ignoreMessageHandlers = true;
      	
      	_agentEnv.getAgent().__cleanIgnoredFlagForMessage(__receivedMessage);
      	
      	this.__eventFired = true;
      	
      	try {
      		try {
      			/* 
      			 * Compiled from source statement from line 137 to line 145
      			 * if not stopWorking do
      			 * 	            log "= SUPPLIER : I RECEIVED REQUEST FOR " + PreferedPart + " FROM "+ name of sender of message
      			 * 	            
      			 * 	            # If there are no other Request on queue deliver Request piece, otherwise add it to the queue list
      			 * 	            if emptyQueue of agent do
      			 * 	                emptyQueue of agent = false
      			 * 	                activate deliverRequestedPart(Request(sender of message, PreferedPart)) after deliveryTime
      			 * 	            else do
      			 * 	                add Request(sender of message, PreferedPart) to queueRequest of agent
      			 */
      			
      			if( ! GiveNewToyParts.this._agentEnv.getAgent().getStopWorking()) {
      				/* 
      				 * Compiled from source statement at line 138
      				 * log "= SUPPLIER : I RECEIVED REQUEST FOR " + PreferedPart + " FROM "+ name of sender of message
      				 */
      				
      				jadescript.core.Agent.doLog(jade.util.Logger.INFO, GiveNewToyParts.this.getClass().getName(), GiveNewToyParts.this, "on request", java.lang.String.valueOf(java.lang.String.valueOf(java.lang.String.valueOf(java.lang.String.valueOf("= SUPPLIER : I RECEIVED REQUEST FOR ") + java.lang.String.valueOf(__PatternMatcher1146274927_obj.PreferedPart)) + java.lang.String.valueOf(" FROM ")) + java.lang.String.valueOf(((jadescript.core.message.RequestMessage<askToyParts>) __receivedMessage).getSender().getName())));
      				
      				/* 
      				 * Compiled from source statement from line 141 to line 145
      				 * if emptyQueue of agent do
      				 * 	                emptyQueue of agent = false
      				 * 	                activate deliverRequestedPart(Request(sender of message, PreferedPart)) after deliveryTime
      				 * 	            else do
      				 * 	                add Request(sender of message, PreferedPart) to queueRequest of agent
      				 */
      				
      				if(GiveNewToyParts.this.getJadescriptAgent().getEmptyQueue()) {
      					/* 
      					 * Compiled from source statement at line 142
      					 * emptyQueue of agent = false
      					 */
      					
      					GiveNewToyParts.this.getJadescriptAgent().setEmptyQueue(false);
      					
      					/* 
      					 * Compiled from source statement at line 143
      					 * activate deliverRequestedPart(Request(sender of message, PreferedPart)) after deliveryTime
      					 */
      					
      					new deliverRequestedPart(_agentEnv.getAgent().toEnv() ,WorkOntology.Request(((jadescript.core.message.RequestMessage<askToyParts>) __receivedMessage).getSender() ,__PatternMatcher1146274927_obj.PreferedPart)).activate_after(_agentEnv.getAgent(), GiveNewToyParts.this._agentEnv.getAgent().getDeliveryTime());
      				}
      				else {
      					/* 
      					 * Compiled from source statement at line 145
      					 * add Request(sender of message, PreferedPart) to queueRequest of agent
      					 */
      					
      					GiveNewToyParts.this.getJadescriptAgent().getQueueRequest().add(WorkOntology.Request(((jadescript.core.message.RequestMessage<askToyParts>) __receivedMessage).getSender() ,__PatternMatcher1146274927_obj.PreferedPart));
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

  private GiveNewToyParts.__Event0 __event0 = null;

  private class __Event1 {
    Boolean __eventFired = false;

    public void run() {
      if(GiveNewToyParts.this.__ignoreMessageHandlers) {
      	this.__eventFired = false;
      	
      	return ;
      }
       class __PatternMatcher502159150 {
      	public jade.core.AID Supplier;
      	
      	private final __PatternMatcher502159150 __PatternMatcher502159150_obj =  this;
      	
      	public boolean headerMatch_structterm0_typecast0(java.lang.Object __objx) {
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
      		
      		Supplier = __x;
      		
      		return true;
      	}
      	
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
      		
      		return true && headerMatch_structterm0_typecast0(__x);
      	}
      	
      	public boolean headerMatch(java.lang.Object __objx) {
      		ComplaintReport __x;
      		
      		try {
      			if(__objx instanceof ComplaintReport) {
      				__x = (ComplaintReport) __objx;
      			}
      			else {
      				return false;
      			}
      		}
      		catch(java.lang.ClassCastException ignored) {
      			return false;
      		}
      		
      		return true && headerMatch_structterm0(__x.getSupplier());
      	}
      }
      __PatternMatcher502159150 __PatternMatcher502159150_obj = new __PatternMatcher502159150();
      jade.lang.acl.MessageTemplate __mt = jade.lang.acl.MessageTemplate.and(jade.lang.acl.MessageTemplate.and(jade.lang.acl.MessageTemplate.and(new jade.lang.acl.MessageTemplate(new jadescript.lang.acl.CustomMessageTemplate(((java.util.function.Predicate<jade.lang.acl.ACLMessage>) (__ignored) -> {{
      	return true;
      }
      }))), jade.lang.acl.MessageTemplate.MatchPerformative(jadescript.core.message.Message.REQUEST)), jadescript.core.nativeevent.NotNativeEventTemplate.MatchNotNative(_agentEnv.getAgent().getContentManager())), new jade.lang.acl.MessageTemplate(new jadescript.lang.acl.CustomMessageTemplate(((java.util.function.Predicate<jade.lang.acl.ACLMessage>) (__templMsg) -> {{
      	jadescript.core.message.Message __receivedMessage = jadescript.core.message.Message.wrap(__templMsg);
      	
      	try {
      		return __PatternMatcher502159150_obj.headerMatch(__receivedMessage.getContent(_agentEnv.getAgent().getContentManager()));
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
      	GiveNewToyParts.this.__ignoreMessageHandlers = true;
      	
      	_agentEnv.getAgent().__cleanIgnoredFlagForMessage(__receivedMessage);
      	
      	this.__eventFired = true;
      	
      	try {
      		try {
      			/* 
      			 * Compiled from source statement at line 149
      			 * log "= SUPPLIER : RECEIVED COMPLAINT REPORT FROM " + name of sender of message
      			 */
      			
      			jadescript.core.Agent.doLog(jade.util.Logger.INFO, GiveNewToyParts.this.getClass().getName(), GiveNewToyParts.this, "on request", java.lang.String.valueOf(java.lang.String.valueOf("= SUPPLIER : RECEIVED COMPLAINT REPORT FROM ") + java.lang.String.valueOf(((jadescript.core.message.RequestMessage<ComplaintReport>) __receivedMessage).getSender().getName())));
      			
      			/* 
      			 * Compiled from source statement at line 150
      			 * deliveryTime of agent = "PT1S" as duration
      			 */
      			
      			GiveNewToyParts.this.getJadescriptAgent().setDeliveryTime(((jadescript.lang.Duration) jadescript.util.types.Converter.convert("PT1S", new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.TEXT), new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.DURATION))));
      			
      			/* 
      			 * Compiled from source statement at line 151
      			 * activate resetDeliveryTime after "PT5S" as duration
      			 */
      			
      			new resetDeliveryTime(_agentEnv.getAgent().toEnv()).activate_after(_agentEnv.getAgent(), ((jadescript.lang.Duration) jadescript.util.types.Converter.convert("PT5S", new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.TEXT), new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.DURATION))));
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

  private GiveNewToyParts.__Event1 __event1 = null;

  private class __Event2 {
    Boolean __eventFired = false;

    public void run() {
      if(GiveNewToyParts.this.__ignoreMessageHandlers) {
      	this.__eventFired = false;
      	
      	return ;
      }
       class __PatternMatcher2019679980 {
      	public ToyParts NewToyPart;
      	
      	private final __PatternMatcher2019679980 __PatternMatcher2019679980_obj =  this;
      	
      	public boolean headerMatch_structterm0(java.lang.Object __objx) {
      		ToyParts __x;
      		
      		try {
      			if(__objx instanceof ToyParts) {
      				__x = (ToyParts) __objx;
      			}
      			else {
      				return false;
      			}
      		}
      		catch(java.lang.ClassCastException ignored) {
      			return false;
      		}
      		
      		NewToyPart = __x;
      		
      		return true;
      	}
      	
      	public boolean headerMatch(java.lang.Object __objx) {
      		deliverNewToyParts __x;
      		
      		try {
      			if(__objx instanceof deliverNewToyParts) {
      				__x = (deliverNewToyParts) __objx;
      			}
      			else {
      				return false;
      			}
      		}
      		catch(java.lang.ClassCastException ignored) {
      			return false;
      		}
      		
      		return true && headerMatch_structterm0(__x.getNewToyPart());
      	}
      }
      __PatternMatcher2019679980 __PatternMatcher2019679980_obj = new __PatternMatcher2019679980();
      jade.lang.acl.MessageTemplate __mt = jade.lang.acl.MessageTemplate.and(jade.lang.acl.MessageTemplate.and(jade.lang.acl.MessageTemplate.and(new jade.lang.acl.MessageTemplate(new jadescript.lang.acl.CustomMessageTemplate(((java.util.function.Predicate<jade.lang.acl.ACLMessage>) (__ignored) -> {{
      	return true;
      }
      }))), jade.lang.acl.MessageTemplate.MatchPerformative(jadescript.core.message.Message.REQUEST)), jadescript.core.nativeevent.NotNativeEventTemplate.MatchNotNative(_agentEnv.getAgent().getContentManager())), new jade.lang.acl.MessageTemplate(new jadescript.lang.acl.CustomMessageTemplate(((java.util.function.Predicate<jade.lang.acl.ACLMessage>) (__templMsg) -> {{
      	jadescript.core.message.Message __receivedMessage = jadescript.core.message.Message.wrap(__templMsg);
      	
      	try {
      		return __PatternMatcher2019679980_obj.headerMatch(__receivedMessage.getContent(_agentEnv.getAgent().getContentManager()));
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
      	GiveNewToyParts.this.__ignoreMessageHandlers = true;
      	
      	_agentEnv.getAgent().__cleanIgnoredFlagForMessage(__receivedMessage);
      	
      	this.__eventFired = true;
      	
      	try {
      		try {
      			/* 
      			 * Compiled from source statement from line 155 to line 161
      			 * if not stopWorking do
      			 * 	            if color of NewToyPart = "yellow" do
      			 * 	                yellowPaint = yellowPaint - 1
      			 * 	            else if color of NewToyPart = "red" do
      			 * 	                redPaint = redPaint - 1
      			 * 	            else do
      			 * 	                bluePaint = bluePaint - 1
      			 */
      			
      			if( ! GiveNewToyParts.this._agentEnv.getAgent().getStopWorking()) {
      				/* 
      				 * Compiled from source statement from line 156 to line 161
      				 * if color of NewToyPart = "yellow" do
      				 * 	                yellowPaint = yellowPaint - 1
      				 * 	            else if color of NewToyPart = "red" do
      				 * 	                redPaint = redPaint - 1
      				 * 	            else do
      				 * 	                bluePaint = bluePaint - 1
      				 */
      				
      				if(java.util.Objects.equals(__PatternMatcher2019679980_obj.NewToyPart.getColor(), "yellow")) {
      					/* 
      					 * Compiled from source statement at line 157
      					 * yellowPaint = yellowPaint - 1
      					 */
      					
      					GiveNewToyParts.this._agentEnv.getAgent().setYellowPaint(GiveNewToyParts.this._agentEnv.getAgent().getYellowPaint() - 1);
      				}
      				else if(java.util.Objects.equals(__PatternMatcher2019679980_obj.NewToyPart.getColor(), "red")) {
      					/* 
      					 * Compiled from source statement at line 159
      					 * redPaint = redPaint - 1
      					 */
      					
      					GiveNewToyParts.this._agentEnv.getAgent().setRedPaint(GiveNewToyParts.this._agentEnv.getAgent().getRedPaint() - 1);
      				}
      				else {
      					/* 
      					 * Compiled from source statement at line 161
      					 * bluePaint = bluePaint - 1
      					 */
      					
      					GiveNewToyParts.this._agentEnv.getAgent().setBluePaint(GiveNewToyParts.this._agentEnv.getAgent().getBluePaint() - 1);
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

  private GiveNewToyParts.__Event2 __event2 = null;

  private ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__DEFAULT_THROWER;

  public void __handleJadescriptException(final JadescriptException __exc) {
    jadescript.core.exception.ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__getExceptionEscalator(GiveNewToyParts.this);
    boolean __handled = false;
    if(!__handled) {
    	__thrower.__throwJadescriptException(__exc);
    }
  }

  private void __initializeProperties() {
    // Initializing properties and event handlers:
    {
    	__event0 = new GiveNewToyParts.__Event0();
    	
    	__event1 = new GiveNewToyParts.__Event1();
    	
    	__event2 = new GiveNewToyParts.__Event2();
    }
  }
}
