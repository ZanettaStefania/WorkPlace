import jade.content.ContentManager;
import jade.content.lang.Codec;
import jadescript.content.onto.Ontology;
import jadescript.core.behaviours.CyclicBehaviour;
import jadescript.core.exception.ExceptionThrower;
import jadescript.core.exception.JadescriptException;
import jadescript.java.AgentEnv;
import jadescript.java.SideEffectsFlag;
import jadescript.util.JadescriptList;

@SuppressWarnings("all")
public class listenReplyOfCoworkers extends CyclicBehaviour<Worker> {
  private Worker __theAgent = (Worker)/*Used as metadata*/null;

  private AgentEnv<Worker, SideEffectsFlag.AnySideEffectFlag> _agentEnv = null;

  public static listenReplyOfCoworkers __createEmpty(final AgentEnv<? extends Worker, ? extends SideEffectsFlag.WithSideEffects> _agentEnv) {
    return new listenReplyOfCoworkers(_agentEnv);
  }

  private Boolean __ignoreMessageHandlers = false;

  public void doAction(final int _tickCount) {
    this.__ignoreMessageHandlers = false;
    super.doAction(_tickCount);
    __event4.run();
    if(!this.__ignoreMessageHandlers) {
    	this.__noMessageHandled();
    }
    if ( true  && !__event4.__eventFired) __awaitForEvents();
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

  protected Integer number_CoWorkers = null;

  public void setNumber_CoWorkers(final Integer number_CoWorkers) {
    this.number_CoWorkers = number_CoWorkers;
  }

  public Integer getNumber_CoWorkers() {
    return this.number_CoWorkers;
  }

  protected JadescriptList<WorkerStatus> repliesOfNearbyWorkers = null;

  public void setRepliesOfNearbyWorkers(final JadescriptList<WorkerStatus> repliesOfNearbyWorkers) {
    this.repliesOfNearbyWorkers = repliesOfNearbyWorkers;
  }

  public JadescriptList<WorkerStatus> getRepliesOfNearbyWorkers() {
    return this.repliesOfNearbyWorkers;
  }

  protected Boolean Replies = null;

  public void setReplies(final Boolean Replies) {
    this.Replies = Replies;
  }

  public Boolean getReplies() {
    return this.Replies;
  }

  public listenReplyOfCoworkers(final AgentEnv<? extends Worker, ? extends SideEffectsFlag.WithSideEffects> _agentEnv) {
    super(_agentEnv);
    __initializeAgentEnv();
    __initializeProperties();
    try {
    	/* 
    	 * Compiled from source statement at line 378
    	 * number_CoWorkers of this = 0
    	 */
    	
    	listenReplyOfCoworkers.this.setNumber_CoWorkers(0);
    }
    catch(jadescript.core.exception.JadescriptException __throwable) {
    	__handleJadescriptException(__throwable);
    }
    catch(java.lang.Throwable __throwable) {
    	__handleJadescriptException(jadescript.core.exception.JadescriptException.wrap(__throwable));
    }
  }

  private class __Event4 {
    Boolean __eventFired = false;

    public void run() {
      if(listenReplyOfCoworkers.this.__ignoreMessageHandlers) {
      	this.__eventFired = false;
      	
      	return ;
      }
       class __PatternMatcher897764463 {
      	public java.lang.Boolean Availability;
      	
      	public java.lang.Boolean HasMissingPieces;
      	
      	private final __PatternMatcher897764463 __PatternMatcher897764463_obj =  this;
      	
      	public boolean headerMatch_structterm0(java.lang.Object __objx) {
      		java.lang.Boolean __x;
      		
      		try {
      			if(__objx instanceof java.lang.Boolean) {
      				__x = (java.lang.Boolean) __objx;
      			}
      			else {
      				return false;
      			}
      		}
      		catch(java.lang.ClassCastException ignored) {
      			return false;
      		}
      		
      		Availability = __x;
      		
      		return true;
      	}
      	
      	public boolean headerMatch_structterm1(java.lang.Object __objx) {
      		java.lang.Boolean __x;
      		
      		try {
      			if(__objx instanceof java.lang.Boolean) {
      				__x = (java.lang.Boolean) __objx;
      			}
      			else {
      				return false;
      			}
      		}
      		catch(java.lang.ClassCastException ignored) {
      			return false;
      		}
      		
      		HasMissingPieces = __x;
      		
      		return true;
      	}
      	
      	public boolean headerMatch(java.lang.Object __objx) {
      		replyToCoWorkers __x;
      		
      		try {
      			if(__objx instanceof replyToCoWorkers) {
      				__x = (replyToCoWorkers) __objx;
      			}
      			else {
      				return false;
      			}
      		}
      		catch(java.lang.ClassCastException ignored) {
      			return false;
      		}
      		
      		return true && headerMatch_structterm0(__x.getAvailability()) && headerMatch_structterm1(__x.getHasMissingPieces());
      	}
      }
      __PatternMatcher897764463 __PatternMatcher897764463_obj = new __PatternMatcher897764463();
      jade.lang.acl.MessageTemplate __mt = jade.lang.acl.MessageTemplate.and(jade.lang.acl.MessageTemplate.and(jade.lang.acl.MessageTemplate.and(new jade.lang.acl.MessageTemplate(new jadescript.lang.acl.CustomMessageTemplate(((java.util.function.Predicate<jade.lang.acl.ACLMessage>) (__ignored) -> {{
      	return true;
      }
      }))), jade.lang.acl.MessageTemplate.MatchPerformative(jadescript.core.message.Message.REQUEST)), jadescript.core.nativeevent.NotNativeEventTemplate.MatchNotNative(_agentEnv.getAgent().getContentManager())), new jade.lang.acl.MessageTemplate(new jadescript.lang.acl.CustomMessageTemplate(((java.util.function.Predicate<jade.lang.acl.ACLMessage>) (__templMsg) -> {{
      	jadescript.core.message.Message __receivedMessage = jadescript.core.message.Message.wrap(__templMsg);
      	
      	try {
      		return __PatternMatcher897764463_obj.headerMatch(__receivedMessage.getContent(_agentEnv.getAgent().getContentManager()));
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
      	listenReplyOfCoworkers.this.__ignoreMessageHandlers = true;
      	
      	_agentEnv.getAgent().__cleanIgnoredFlagForMessage(__receivedMessage);
      	
      	this.__eventFired = true;
      	
      	try {
      		try {
      			/* 
      			 * Compiled from source statement from line 381 to line 396
      			 * if not stopWorking do
      			 * 	            log "- WORKER " + name of agent + " : I RECEIVED REPLIES FROM " + name of sender of message + " Availability : " + Availability + " HasMissingPieces : " + HasMissingPieces
      			 * 	            number_CoWorkers of this = number_CoWorkers of this + 1
      			 * 	            add WorkerStatus(sender of message, Availability as boolean, HasMissingPieces as boolean) to repliesOfNearbyWorkers of this
      			 * 	
      			 * 	            # When Worker received all replies check them
      			 * 	            if number_CoWorkers = numberNeighbours of agent do
      			 * 	                Replies = lookAtReplies(repliesOfNearbyWorkers)
      			 * 	                
      			 * 	                if Replies = false do
      			 * 	                    send message request ComplaintReport(Supplier) to Supplier
      			 * 	                    
      			 * 	                waiting_CoWorkers of agent = false
      			 * 	                number_CoWorkers of this = 0
      			 * 	                repliesOfNearbyWorkers = [] of WorkerStatus
      			 * 	                destroy this
      			 */
      			
      			if( ! listenReplyOfCoworkers.this._agentEnv.getAgent().getStopWorking()) {
      				/* 
      				 * Compiled from source statement at line 382
      				 * log "- WORKER " + name of agent + " : I RECEIVED REPLIES FROM " + name of sender of message + " Availability : " + Availability + " HasMissingPieces : " + HasMissingPieces
      				 */
      				
      				jadescript.core.Agent.doLog(jade.util.Logger.INFO, listenReplyOfCoworkers.this.getClass().getName(), listenReplyOfCoworkers.this, "on request", java.lang.String.valueOf(java.lang.String.valueOf(java.lang.String.valueOf(java.lang.String.valueOf(java.lang.String.valueOf(java.lang.String.valueOf(java.lang.String.valueOf(java.lang.String.valueOf("- WORKER ") + java.lang.String.valueOf(listenReplyOfCoworkers.this.getJadescriptAgent().getName())) + java.lang.String.valueOf(" : I RECEIVED REPLIES FROM ")) + java.lang.String.valueOf(((jadescript.core.message.RequestMessage<replyToCoWorkers>) __receivedMessage).getSender().getName())) + java.lang.String.valueOf(" Availability : ")) + java.lang.String.valueOf(__PatternMatcher897764463_obj.Availability)) + java.lang.String.valueOf(" HasMissingPieces : ")) + java.lang.String.valueOf(__PatternMatcher897764463_obj.HasMissingPieces)));
      				
      				/* 
      				 * Compiled from source statement at line 383
      				 * number_CoWorkers of this = number_CoWorkers of this + 1
      				 */
      				
      				listenReplyOfCoworkers.this.setNumber_CoWorkers(listenReplyOfCoworkers.this.getNumber_CoWorkers() + 1);
      				
      				/* 
      				 * Compiled from source statement at line 384
      				 * add WorkerStatus(sender of message, Availability as boolean, HasMissingPieces as boolean) to repliesOfNearbyWorkers of this
      				 */
      				
      				listenReplyOfCoworkers.this.getRepliesOfNearbyWorkers().add(WorkOntology.WorkerStatus(((jadescript.core.message.RequestMessage<replyToCoWorkers>) __receivedMessage).getSender() ,((java.lang.Boolean) jadescript.util.types.Converter.convert(__PatternMatcher897764463_obj.Availability, new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.BOOLEAN), new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.BOOLEAN))) ,((java.lang.Boolean) jadescript.util.types.Converter.convert(__PatternMatcher897764463_obj.HasMissingPieces, new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.BOOLEAN), new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.BOOLEAN)))));
      				
      				/* 
      				 * Compiled from source statement from line 387 to line 396
      				 * if number_CoWorkers = numberNeighbours of agent do
      				 * 	                Replies = lookAtReplies(repliesOfNearbyWorkers)
      				 * 	                
      				 * 	                if Replies = false do
      				 * 	                    send message request ComplaintReport(Supplier) to Supplier
      				 * 	                    
      				 * 	                waiting_CoWorkers of agent = false
      				 * 	                number_CoWorkers of this = 0
      				 * 	                repliesOfNearbyWorkers = [] of WorkerStatus
      				 * 	                destroy this
      				 */
      				
      				if(java.util.Objects.equals(listenReplyOfCoworkers.this.getNumber_CoWorkers(), listenReplyOfCoworkers.this.getJadescriptAgent().getNumberNeighbours())) {
      					/* 
      					 * Compiled from source statement at line 388
      					 * Replies = lookAtReplies(repliesOfNearbyWorkers)
      					 */
      					
      					listenReplyOfCoworkers.this.setReplies(listenReplyOfCoworkers.this._agentEnv.getAgent().lookAtReplies(_agentEnv.getAgent().toEnv() ,listenReplyOfCoworkers.this.getRepliesOfNearbyWorkers()));
      					
      					/* 
      					 * Compiled from source statement from line 390 to line 391
      					 * if Replies = false do
      					 * 	                    send message request ComplaintReport(Supplier) to Supplier
      					 */
      					
      					if(java.util.Objects.equals(listenReplyOfCoworkers.this.getReplies(), false)) {
      						/* 
      						 * Compiled from source statement at line 391
      						 * send message request ComplaintReport(Supplier) to Supplier
      						 */
      						
      						try {
      							jadescript.util.SendMessageUtils.validatePerformative("request");
      							
      							java.lang.Object _contentToBeSent677089965 = WorkOntology.ComplaintReport(listenReplyOfCoworkers.this._agentEnv.getAgent().getSupplier());
      							
      							jadescript.core.message.Message _synthesizedMessage677089965 = new jadescript.core.message.Message(jadescript.core.message.Message.REQUEST);
      							
      							_synthesizedMessage677089965.setOntology(jadescript.util.SendMessageUtils.getDeclaringOntology(_contentToBeSent677089965,WorkOntology.getInstance(),jadescript.content.onto.Ontology.getInstance()).getName());;
      							
      							_synthesizedMessage677089965.setLanguage(__codec.getName());;
      							
      							_synthesizedMessage677089965.addReceiver(listenReplyOfCoworkers.this._agentEnv.getAgent().getSupplier());
      							
      							_agentEnv.getAgent().getContentManager().fillContent(_synthesizedMessage677089965, jadescript.content.onto.MessageContent.prepareContent((jade.content.ContentElement) _contentToBeSent677089965, "request"));
      							
      							_agentEnv.getAgent().send(_synthesizedMessage677089965);
      						}
      						catch(java.lang.Throwable _t) {
      							throw jadescript.core.exception.JadescriptException.wrap(_t);
      						}
      					}
      					
      					/* 
      					 * Compiled from source statement at line 393
      					 * 
      					 * 	                    
      					 * 	                waiting_CoWorkers of agent = false
      					 */
      					
      					listenReplyOfCoworkers.this.getJadescriptAgent().setWaiting_CoWorkers(false);
      					
      					/* 
      					 * Compiled from source statement at line 394
      					 * number_CoWorkers of this = 0
      					 */
      					
      					listenReplyOfCoworkers.this.setNumber_CoWorkers(0);
      					
      					/* 
      					 * Compiled from source statement at line 395
      					 * repliesOfNearbyWorkers = [] of WorkerStatus
      					 */
      					
      					listenReplyOfCoworkers.this.setRepliesOfNearbyWorkers(new jadescript.util.JadescriptList<WorkerStatus>());
      					
      					/* 
      					 * Compiled from source statement at line 396
      					 * destroy this
      					 */
      					
      					listenReplyOfCoworkers.this.destroy();
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

  private listenReplyOfCoworkers.__Event4 __event4 = null;

  private ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__DEFAULT_THROWER;

  public void __handleJadescriptException(final JadescriptException __exc) {
    jadescript.core.exception.ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__getExceptionEscalator(listenReplyOfCoworkers.this);
    boolean __handled = false;
    if(!__handled) {
    	__thrower.__throwJadescriptException(__exc);
    }
  }

  private void __initializeProperties() {
    // Initializing properties and event handlers:
    {
    	listenReplyOfCoworkers.this.number_CoWorkers = 0;
    	
    	listenReplyOfCoworkers.this.repliesOfNearbyWorkers = new jadescript.util.JadescriptList<WorkerStatus>();
    	
    	listenReplyOfCoworkers.this.Replies = false;
    	
    	__event4 = new listenReplyOfCoworkers.__Event4();
    }
  }
}
