import jade.content.ContentManager;
import jade.content.lang.Codec;
import jadescript.content.onto.Ontology;
import jadescript.core.behaviours.CyclicBehaviour;
import jadescript.core.exception.ExceptionThrower;
import jadescript.core.exception.JadescriptException;
import jadescript.java.AgentEnv;
import jadescript.java.SideEffectsFlag;

@SuppressWarnings("all")
public class AskForNewToyParts_toSupplier extends CyclicBehaviour<Worker> {
  private Worker __theAgent = (Worker)/*Used as metadata*/null;

  private AgentEnv<Worker, SideEffectsFlag.AnySideEffectFlag> _agentEnv = null;

  public static AskForNewToyParts_toSupplier __createEmpty(final AgentEnv<? extends Worker, ? extends SideEffectsFlag.WithSideEffects> _agentEnv) {
    return new AskForNewToyParts_toSupplier(_agentEnv);
  }

  private Boolean __ignoreMessageHandlers = false;

  public void doAction(final int _tickCount) {
    this.__ignoreMessageHandlers = false;
    super.doAction(_tickCount);
    __event3.run();
    __event4.run();
    if(!this.__ignoreMessageHandlers) {
    	this.__noMessageHandled();
    }
    if ( true  && !__event3.__eventFired && !__event4.__eventFired) __awaitForEvents();
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

  protected Boolean waitForNewToyPart = null;

  public void setWaitForNewToyPart(final Boolean waitForNewToyPart) {
    this.waitForNewToyPart = waitForNewToyPart;
  }

  public Boolean getWaitForNewToyPart() {
    return this.waitForNewToyPart;
  }

  protected Boolean sentRequest = null;

  public void setSentRequest(final Boolean sentRequest) {
    this.sentRequest = sentRequest;
  }

  public Boolean getSentRequest() {
    return this.sentRequest;
  }

  public AskForNewToyParts_toSupplier(final AgentEnv<? extends Worker, ? extends SideEffectsFlag.WithSideEffects> _agentEnv) {
    super(_agentEnv);
    __initializeAgentEnv();
    __initializeProperties();
    try {
    	/* 
    	 * Compiled from source statement at line 258
    	 * waitForNewToyPart of this = false
    	 */
    	
    	AskForNewToyParts_toSupplier.this.setWaitForNewToyPart(false);
    }
    catch(jadescript.core.exception.JadescriptException __throwable) {
    	__handleJadescriptException(__throwable);
    }
    catch(java.lang.Throwable __throwable) {
    	__handleJadescriptException(jadescript.core.exception.JadescriptException.wrap(__throwable));
    }
  }

  private class __Event3 {
    Boolean __eventFired = true;

    public void run() {
      try {
      	/* 
      	 * Compiled from source statement from line 262 to line 275
      	 * if (waitForNewToyPart of this = false) do
      	 *                 waiting_Supplier of agent = true
      	 *                 sentRequest = false
      	 * 
      	 *                 # Check which favoriteToyParts to request
      	 *                 for item_ in favoriteToyParts do
      	 * 	                if (canAddPiece(item_, currentToy) and sentRequest = false) do
      	 * 	                        send message request askToyParts(item_) to Supplier of agent
      	 * 	                        numberOfSupplierRequest of agent = numberOfSupplierRequest + 1
      	 * 	                        sentRequest = true
      	 *                         
      	 *                 waitForNewToyPart = true
      	 *                 waiting_Supplier of agent = true
      	 *                 activate AddPieceBehavior
      	 */
      	
      	if((java.util.Objects.equals(AskForNewToyParts_toSupplier.this.getWaitForNewToyPart(), false))) {
      		/* 
      		 * Compiled from source statement at line 263
      		 * waiting_Supplier of agent = true
      		 */
      		
      		AskForNewToyParts_toSupplier.this.getJadescriptAgent().setWaiting_Supplier(true);
      		
      		/* 
      		 * Compiled from source statement at line 264
      		 * sentRequest = false
      		 */
      		
      		AskForNewToyParts_toSupplier.this.setSentRequest(false);
      		
      		/* 
      		 * Compiled from source statement from line 267 to line 271
      		 * for item_ in favoriteToyParts do
      		 * 	                if (canAddPiece(item_, currentToy) and sentRequest = false) do
      		 * 	                        send message request askToyParts(item_) to Supplier of agent
      		 * 	                        numberOfSupplierRequest of agent = numberOfSupplierRequest + 1
      		 * 	                        sentRequest = true
      		 */
      		
      		for ( ToyParts item_ : AskForNewToyParts_toSupplier.this._agentEnv.getAgent().getFavoriteToyParts()) {
      			/* 
      			 * Compiled from source statement from line 268 to line 271
      			 * if (canAddPiece(item_, currentToy) and sentRequest = false) do
      			 * 	                        send message request askToyParts(item_) to Supplier of agent
      			 * 	                        numberOfSupplierRequest of agent = numberOfSupplierRequest + 1
      			 * 	                        sentRequest = true
      			 */
      			
      			if((AskForNewToyParts_toSupplier.this._agentEnv.getAgent().canAddPiece(_agentEnv.getAgent().toEnv() ,item_ ,AskForNewToyParts_toSupplier.this._agentEnv.getAgent().getCurrentToy()) && java.util.Objects.equals(AskForNewToyParts_toSupplier.this.getSentRequest(), false))) {
      				/* 
      				 * Compiled from source statement at line 269
      				 * send message request askToyParts(item_) to Supplier of agent
      				 */
      				
      				try {
      					jadescript.util.SendMessageUtils.validatePerformative("request");
      					
      					java.lang.Object _contentToBeSent1583513103 = WorkOntology.askToyParts(item_);
      					
      					jadescript.core.message.Message _synthesizedMessage1583513103 = new jadescript.core.message.Message(jadescript.core.message.Message.REQUEST);
      					
      					_synthesizedMessage1583513103.setOntology(jadescript.util.SendMessageUtils.getDeclaringOntology(_contentToBeSent1583513103,WorkOntology.getInstance(),jadescript.content.onto.Ontology.getInstance()).getName());;
      					
      					_synthesizedMessage1583513103.setLanguage(__codec.getName());;
      					
      					_synthesizedMessage1583513103.addReceiver(AskForNewToyParts_toSupplier.this.getJadescriptAgent().getSupplier());
      					
      					_agentEnv.getAgent().getContentManager().fillContent(_synthesizedMessage1583513103, jadescript.content.onto.MessageContent.prepareContent((jade.content.ContentElement) _contentToBeSent1583513103, "request"));
      					
      					_agentEnv.getAgent().send(_synthesizedMessage1583513103);
      				}
      				catch(java.lang.Throwable _t) {
      					throw jadescript.core.exception.JadescriptException.wrap(_t);
      				}
      				
      				/* 
      				 * Compiled from source statement at line 270
      				 * numberOfSupplierRequest of agent = numberOfSupplierRequest + 1
      				 */
      				
      				AskForNewToyParts_toSupplier.this.getJadescriptAgent().setNumberOfSupplierRequest(AskForNewToyParts_toSupplier.this._agentEnv.getAgent().getNumberOfSupplierRequest() + 1);
      				
      				/* 
      				 * Compiled from source statement at line 271
      				 * sentRequest = true
      				 */
      				
      				AskForNewToyParts_toSupplier.this.setSentRequest(true);
      			}
      		}
      		
      		/* 
      		 * Compiled from source statement at line 273
      		 * 
      		 *                         
      		 *                 waitForNewToyPart = true
      		 */
      		
      		AskForNewToyParts_toSupplier.this.setWaitForNewToyPart(true);
      		
      		/* 
      		 * Compiled from source statement at line 274
      		 * waiting_Supplier of agent = true
      		 */
      		
      		AskForNewToyParts_toSupplier.this.getJadescriptAgent().setWaiting_Supplier(true);
      		
      		/* 
      		 * Compiled from source statement at line 275
      		 * activate AddPieceBehavior
      		 */
      		
      		new AddPieceBehavior(_agentEnv.getAgent().toEnv()).activate(_agentEnv.getAgent());
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

  private AskForNewToyParts_toSupplier.__Event3 __event3 =  new AskForNewToyParts_toSupplier.__Event3();

  private class __Event4 {
    Boolean __eventFired = false;

    public void run() {
      if(AskForNewToyParts_toSupplier.this.__ignoreMessageHandlers) {
      	this.__eventFired = false;
      	
      	return ;
      }
       class __PatternMatcher873284085 {
      	public ToyParts NewToyPart;
      	
      	private final __PatternMatcher873284085 __PatternMatcher873284085_obj =  this;
      	
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
      __PatternMatcher873284085 __PatternMatcher873284085_obj = new __PatternMatcher873284085();
      jade.lang.acl.MessageTemplate __mt = jade.lang.acl.MessageTemplate.and(jade.lang.acl.MessageTemplate.and(jade.lang.acl.MessageTemplate.and(new jade.lang.acl.MessageTemplate(new jadescript.lang.acl.CustomMessageTemplate(((java.util.function.Predicate<jade.lang.acl.ACLMessage>) (__ignored) -> {{
      	return true;
      }
      }))), jade.lang.acl.MessageTemplate.MatchPerformative(jadescript.core.message.Message.REQUEST)), jadescript.core.nativeevent.NotNativeEventTemplate.MatchNotNative(_agentEnv.getAgent().getContentManager())), new jade.lang.acl.MessageTemplate(new jadescript.lang.acl.CustomMessageTemplate(((java.util.function.Predicate<jade.lang.acl.ACLMessage>) (__templMsg) -> {{
      	jadescript.core.message.Message __receivedMessage = jadescript.core.message.Message.wrap(__templMsg);
      	
      	try {
      		return __PatternMatcher873284085_obj.headerMatch(__receivedMessage.getContent(_agentEnv.getAgent().getContentManager()));
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
      	AskForNewToyParts_toSupplier.this.__ignoreMessageHandlers = true;
      	
      	_agentEnv.getAgent().__cleanIgnoredFlagForMessage(__receivedMessage);
      	
      	this.__eventFired = true;
      	
      	try {
      		try {
      			/* 
      			 * Compiled from source statement from line 279 to line 288
      			 * if not stopWorking do
      			 * 	            add NewToyPart to myInventory of agent
      			 * 	            waiting_Supplier of agent = false
      			 * 	            log "- WORKER " + name of agent + " : AFTER I RECEIVED A NEW TOY PART I HAVE " + myInventory of agent
      			 * 	            
      			 * 	            if (currentTask of agent ≠ "WorkOnToy") do
      			 * 	                currentTask of agent = "WorkOnToy"
      			 * 	                activate AddPieceBehavior
      			 * 	            
      			 * 	            deactivate AskForNewToyParts_toSupplier
      			 */
      			
      			if( ! AskForNewToyParts_toSupplier.this._agentEnv.getAgent().getStopWorking()) {
      				/* 
      				 * Compiled from source statement at line 280
      				 * add NewToyPart to myInventory of agent
      				 */
      				
      				AskForNewToyParts_toSupplier.this.getJadescriptAgent().getMyInventory().add(__PatternMatcher873284085_obj.NewToyPart);
      				
      				/* 
      				 * Compiled from source statement at line 281
      				 * waiting_Supplier of agent = false
      				 */
      				
      				AskForNewToyParts_toSupplier.this.getJadescriptAgent().setWaiting_Supplier(false);
      				
      				/* 
      				 * Compiled from source statement at line 282
      				 * log "- WORKER " + name of agent + " : AFTER I RECEIVED A NEW TOY PART I HAVE " + myInventory of agent
      				 */
      				
      				jadescript.core.Agent.doLog(jade.util.Logger.INFO, AskForNewToyParts_toSupplier.this.getClass().getName(), AskForNewToyParts_toSupplier.this, "on request", java.lang.String.valueOf(java.lang.String.valueOf(java.lang.String.valueOf(java.lang.String.valueOf("- WORKER ") + java.lang.String.valueOf(AskForNewToyParts_toSupplier.this.getJadescriptAgent().getName())) + java.lang.String.valueOf(" : AFTER I RECEIVED A NEW TOY PART I HAVE ")) + java.lang.String.valueOf(AskForNewToyParts_toSupplier.this.getJadescriptAgent().getMyInventory())));
      				
      				/* 
      				 * Compiled from source statement from line 284 to line 286
      				 * if (currentTask of agent ≠ "WorkOnToy") do
      				 * 	                currentTask of agent = "WorkOnToy"
      				 * 	                activate AddPieceBehavior
      				 */
      				
      				if((!java.util.Objects.equals(AskForNewToyParts_toSupplier.this.getJadescriptAgent().getCurrentTask(), "WorkOnToy"))) {
      					/* 
      					 * Compiled from source statement at line 285
      					 * currentTask of agent = "WorkOnToy"
      					 */
      					
      					AskForNewToyParts_toSupplier.this.getJadescriptAgent().setCurrentTask("WorkOnToy");
      					
      					/* 
      					 * Compiled from source statement at line 286
      					 * activate AddPieceBehavior
      					 */
      					
      					new AddPieceBehavior(_agentEnv.getAgent().toEnv()).activate(_agentEnv.getAgent());
      				}
      				
      				/* 
      				 * Compiled from source statement at line 288
      				 * 
      				 * 	            
      				 * 	            deactivate AskForNewToyParts_toSupplier
      				 */
      				
      				new AskForNewToyParts_toSupplier(_agentEnv.getAgent().toEnv()).deactivate();
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

  private AskForNewToyParts_toSupplier.__Event4 __event4 = null;

  private ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__DEFAULT_THROWER;

  public void __handleJadescriptException(final JadescriptException __exc) {
    jadescript.core.exception.ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__getExceptionEscalator(AskForNewToyParts_toSupplier.this);
    boolean __handled = false;
    if(!__handled) {
    	__thrower.__throwJadescriptException(__exc);
    }
  }

  private void __initializeProperties() {
    // Initializing properties and event handlers:
    {
    	AskForNewToyParts_toSupplier.this.waitForNewToyPart = false;
    	
    	AskForNewToyParts_toSupplier.this.sentRequest = false;
    	
    	__event4 = new AskForNewToyParts_toSupplier.__Event4();
    }
  }
}
