import jade.content.ContentManager;
import jade.content.lang.Codec;
import jadescript.content.onto.Ontology;
import jadescript.core.behaviours.CyclicBehaviour;
import jadescript.core.exception.ExceptionThrower;
import jadescript.core.exception.JadescriptException;
import jadescript.java.AgentEnv;
import jadescript.java.SideEffectsFlag;

@SuppressWarnings("all")
public class listenWorkers extends CyclicBehaviour<Worker> {
  private Worker __theAgent = (Worker)/*Used as metadata*/null;

  private AgentEnv<Worker, SideEffectsFlag.AnySideEffectFlag> _agentEnv = null;

  public listenWorkers(final AgentEnv<? extends Worker, ? extends SideEffectsFlag.WithSideEffects> _agentEnv) {
    super(_agentEnv);
    __initializeAgentEnv();
    __initializeProperties();
  }

  public static listenWorkers __createEmpty(final AgentEnv<? extends Worker, ? extends SideEffectsFlag.WithSideEffects> _agentEnv) {
    return new listenWorkers(_agentEnv);
  }

  private Boolean __ignoreMessageHandlers = false;

  public void doAction(final int _tickCount) {
    this.__ignoreMessageHandlers = false;
    super.doAction(_tickCount);
    __event2.run();
    __event3.run();
    __event4.run();
    __event5.run();
    __event6.run();
    if(!this.__ignoreMessageHandlers) {
    	this.__noMessageHandled();
    }
    if ( true  && !__event2.__eventFired && !__event3.__eventFired && !__event4.__eventFired && !__event5.__eventFired && !__event6.__eventFired) __awaitForEvents();
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

  protected Boolean Availability = null;

  public void setAvailability(final Boolean Availability) {
    this.Availability = Availability;
  }

  public Boolean getAvailability() {
    return this.Availability;
  }

  protected Boolean HasMissingPieces = null;

  public void setHasMissingPieces(final Boolean HasMissingPieces) {
    this.HasMissingPieces = HasMissingPieces;
  }

  public Boolean getHasMissingPieces() {
    return this.HasMissingPieces;
  }

  private class __Event2 {
    Boolean __eventFired = false;

    public void run() {
      if(listenWorkers.this.__ignoreMessageHandlers) {
      	this.__eventFired = false;
      	
      	return ;
      }
       class __PatternMatcher2044864672 {
      	public BaseToy Toy;
      	
      	private final __PatternMatcher2044864672 __PatternMatcher2044864672_obj =  this;
      	
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
      		
      		Toy = __x;
      		
      		return true;
      	}
      	
      	public boolean headerMatch(java.lang.Object __objx) {
      		askForHelp __x;
      		
      		try {
      			if(__objx instanceof askForHelp) {
      				__x = (askForHelp) __objx;
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
      __PatternMatcher2044864672 __PatternMatcher2044864672_obj = new __PatternMatcher2044864672();
      jade.lang.acl.MessageTemplate __mt = jade.lang.acl.MessageTemplate.and(jade.lang.acl.MessageTemplate.and(jade.lang.acl.MessageTemplate.and(new jade.lang.acl.MessageTemplate(new jadescript.lang.acl.CustomMessageTemplate(((java.util.function.Predicate<jade.lang.acl.ACLMessage>) (__ignored) -> {{
      	return true;
      }
      }))), jade.lang.acl.MessageTemplate.MatchPerformative(jadescript.core.message.Message.REQUEST)), jadescript.core.nativeevent.NotNativeEventTemplate.MatchNotNative(_agentEnv.getAgent().getContentManager())), new jade.lang.acl.MessageTemplate(new jadescript.lang.acl.CustomMessageTemplate(((java.util.function.Predicate<jade.lang.acl.ACLMessage>) (__templMsg) -> {{
      	jadescript.core.message.Message __receivedMessage = jadescript.core.message.Message.wrap(__templMsg);
      	
      	try {
      		return __PatternMatcher2044864672_obj.headerMatch(__receivedMessage.getContent(_agentEnv.getAgent().getContentManager()));
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
      	listenWorkers.this.__ignoreMessageHandlers = true;
      	
      	_agentEnv.getAgent().__cleanIgnoredFlagForMessage(__receivedMessage);
      	
      	this.__eventFired = true;
      	
      	try {
      		try {
      			/* 
      			 * Compiled from source statement at line 319
      			 * log "- WORKER " + name of agent + " I received a request from " + name of sender of message
      			 */
      			
      			jadescript.core.Agent.doLog(jade.util.Logger.INFO, listenWorkers.this.getClass().getName(), listenWorkers.this, "on request", java.lang.String.valueOf(java.lang.String.valueOf(java.lang.String.valueOf(java.lang.String.valueOf("- WORKER ") + java.lang.String.valueOf(listenWorkers.this.getJadescriptAgent().getName())) + java.lang.String.valueOf(" I received a request from ")) + java.lang.String.valueOf(((jadescript.core.message.RequestMessage<askForHelp>) __receivedMessage).getSender().getName())));
      			
      			/* 
      			 * Compiled from source statement at line 320
      			 * Availability = (hasToy of agent = false)
      			 */
      			
      			listenWorkers.this.setAvailability((java.util.Objects.equals(listenWorkers.this.getJadescriptAgent().getHasToy(), false)));
      			
      			/* 
      			 * Compiled from source statement at line 321
      			 * HasMissingPieces  = (anyCompatiblePiece(myInventory of agent, Toy))
      			 */
      			
      			listenWorkers.this.setHasMissingPieces((listenWorkers.this._agentEnv.getAgent().anyCompatiblePiece(_agentEnv.getAgent().toEnv() ,listenWorkers.this.getJadescriptAgent().getMyInventory() ,__PatternMatcher2044864672_obj.Toy)));
      			
      			/* 
      			 * Compiled from source statement at line 322
      			 * activate replyToWorker(WorkerStatus(sender of message, Availability as boolean, HasMissingPieces as boolean)) after "PT1S" as duration
      			 */
      			
      			new replyToWorker(_agentEnv.getAgent().toEnv() ,WorkOntology.WorkerStatus(((jadescript.core.message.RequestMessage<askForHelp>) __receivedMessage).getSender() ,((java.lang.Boolean) jadescript.util.types.Converter.convert(listenWorkers.this.getAvailability(), new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.BOOLEAN), new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.BOOLEAN))) ,((java.lang.Boolean) jadescript.util.types.Converter.convert(listenWorkers.this.getHasMissingPieces(), new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.BOOLEAN), new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.BOOLEAN))))).activate_after(_agentEnv.getAgent(), ((jadescript.lang.Duration) jadescript.util.types.Converter.convert("PT1S", new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.TEXT), new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.DURATION))));
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

  private listenWorkers.__Event2 __event2 = null;

  private class __Event3 {
    Boolean __eventFired = false;

    public void run() {
      if(listenWorkers.this.__ignoreMessageHandlers) {
      	this.__eventFired = false;
      	
      	return ;
      }
       class __PatternMatcher1201736691 {
      	public BaseToy Toy;
      	
      	private final __PatternMatcher1201736691 __PatternMatcher1201736691_obj =  this;
      	
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
      		
      		Toy = __x;
      		
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
      __PatternMatcher1201736691 __PatternMatcher1201736691_obj = new __PatternMatcher1201736691();
      jade.lang.acl.MessageTemplate __mt = jade.lang.acl.MessageTemplate.and(jade.lang.acl.MessageTemplate.and(jade.lang.acl.MessageTemplate.and(new jade.lang.acl.MessageTemplate(new jadescript.lang.acl.CustomMessageTemplate(((java.util.function.Predicate<jade.lang.acl.ACLMessage>) (__ignored) -> {{
      	return true;
      }
      }))), jade.lang.acl.MessageTemplate.MatchPerformative(jadescript.core.message.Message.REQUEST)), jadescript.core.nativeevent.NotNativeEventTemplate.MatchNotNative(_agentEnv.getAgent().getContentManager())), new jade.lang.acl.MessageTemplate(new jadescript.lang.acl.CustomMessageTemplate(((java.util.function.Predicate<jade.lang.acl.ACLMessage>) (__templMsg) -> {{
      	jadescript.core.message.Message __receivedMessage = jadescript.core.message.Message.wrap(__templMsg);
      	
      	try {
      		return __PatternMatcher1201736691_obj.headerMatch(__receivedMessage.getContent(_agentEnv.getAgent().getContentManager()));
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
      	listenWorkers.this.__ignoreMessageHandlers = true;
      	
      	_agentEnv.getAgent().__cleanIgnoredFlagForMessage(__receivedMessage);
      	
      	this.__eventFired = true;
      	
      	try {
      		try {
      			/* 
      			 * Compiled from source statement from line 326 to line 339
      			 * if hasToy of agent = false do
      			 * 	            log "- WORKER " + name of agent + " TOY GIVEN BY " + name of sender of message
      			 * 	            numberOfToyPassed of agent = numberOfToyPassed + 1
      			 * 	            hasToy of agent = true
      			 * 	            currentToy of agent = Toy
      			 * 	            currentTask of agent = "WorkOnToy"
      			 * 	            activate AddPieceBehavior
      			 * 	            
      			 *             # If the Worker now has a Toy give back the Toy sent by the other Worker
      			 *             else do
      			 *                 log "- WORKER " + name of agent + " : AVAILABILITY CHANGED GIVE BACK TOY TO " + name of sender of message
      			 *                 send message request passToyToWorker(Toy) to sender of message
      			 *                 numberOfToyPassed of agent = numberOfToyPassed + 1
      			 *                 activate AddPieceBehavior
      			 */
      			
      			if(java.util.Objects.equals(listenWorkers.this.getJadescriptAgent().getHasToy(), false)) {
      				/* 
      				 * Compiled from source statement at line 327
      				 * log "- WORKER " + name of agent + " TOY GIVEN BY " + name of sender of message
      				 */
      				
      				jadescript.core.Agent.doLog(jade.util.Logger.INFO, listenWorkers.this.getClass().getName(), listenWorkers.this, "on request", java.lang.String.valueOf(java.lang.String.valueOf(java.lang.String.valueOf(java.lang.String.valueOf("- WORKER ") + java.lang.String.valueOf(listenWorkers.this.getJadescriptAgent().getName())) + java.lang.String.valueOf(" TOY GIVEN BY ")) + java.lang.String.valueOf(((jadescript.core.message.RequestMessage<passToyToWorker>) __receivedMessage).getSender().getName())));
      				
      				/* 
      				 * Compiled from source statement at line 328
      				 * numberOfToyPassed of agent = numberOfToyPassed + 1
      				 */
      				
      				listenWorkers.this.getJadescriptAgent().setNumberOfToyPassed(listenWorkers.this._agentEnv.getAgent().getNumberOfToyPassed() + 1);
      				
      				/* 
      				 * Compiled from source statement at line 329
      				 * hasToy of agent = true
      				 */
      				
      				listenWorkers.this.getJadescriptAgent().setHasToy(true);
      				
      				/* 
      				 * Compiled from source statement at line 330
      				 * currentToy of agent = Toy
      				 */
      				
      				listenWorkers.this.getJadescriptAgent().setCurrentToy(__PatternMatcher1201736691_obj.Toy);
      				
      				/* 
      				 * Compiled from source statement at line 331
      				 * currentTask of agent = "WorkOnToy"
      				 */
      				
      				listenWorkers.this.getJadescriptAgent().setCurrentTask("WorkOnToy");
      				
      				/* 
      				 * Compiled from source statement at line 332
      				 * activate AddPieceBehavior
      				 */
      				
      				new AddPieceBehavior(_agentEnv.getAgent().toEnv()).activate(_agentEnv.getAgent());
      			}
      			else {
      				/* 
      				 * Compiled from source statement at line 336
      				 * log "- WORKER " + name of agent + " : AVAILABILITY CHANGED GIVE BACK TOY TO " + name of sender of message
      				 */
      				
      				jadescript.core.Agent.doLog(jade.util.Logger.INFO, listenWorkers.this.getClass().getName(), listenWorkers.this, "on request", java.lang.String.valueOf(java.lang.String.valueOf(java.lang.String.valueOf(java.lang.String.valueOf("- WORKER ") + java.lang.String.valueOf(listenWorkers.this.getJadescriptAgent().getName())) + java.lang.String.valueOf(" : AVAILABILITY CHANGED GIVE BACK TOY TO ")) + java.lang.String.valueOf(((jadescript.core.message.RequestMessage<passToyToWorker>) __receivedMessage).getSender().getName())));
      				
      				/* 
      				 * Compiled from source statement at line 337
      				 * send message request passToyToWorker(Toy) to sender of message
      				 */
      				
      				try {
      					jadescript.util.SendMessageUtils.validatePerformative("request");
      					
      					java.lang.Object _contentToBeSent316967767 = WorkOntology.passToyToWorker(__PatternMatcher1201736691_obj.Toy);
      					
      					jadescript.core.message.Message _synthesizedMessage316967767 = new jadescript.core.message.Message(jadescript.core.message.Message.REQUEST);
      					
      					_synthesizedMessage316967767.setOntology(jadescript.util.SendMessageUtils.getDeclaringOntology(_contentToBeSent316967767,WorkOntology.getInstance(),jadescript.content.onto.Ontology.getInstance()).getName());;
      					
      					_synthesizedMessage316967767.setLanguage(__codec.getName());;
      					
      					_synthesizedMessage316967767.addReceiver(((jadescript.core.message.RequestMessage<passToyToWorker>) __receivedMessage).getSender());
      					
      					_agentEnv.getAgent().getContentManager().fillContent(_synthesizedMessage316967767, jadescript.content.onto.MessageContent.prepareContent((jade.content.ContentElement) _contentToBeSent316967767, "request"));
      					
      					_agentEnv.getAgent().send(_synthesizedMessage316967767);
      				}
      				catch(java.lang.Throwable _t) {
      					throw jadescript.core.exception.JadescriptException.wrap(_t);
      				}
      				
      				/* 
      				 * Compiled from source statement at line 338
      				 * numberOfToyPassed of agent = numberOfToyPassed + 1
      				 */
      				
      				listenWorkers.this.getJadescriptAgent().setNumberOfToyPassed(listenWorkers.this._agentEnv.getAgent().getNumberOfToyPassed() + 1);
      				
      				/* 
      				 * Compiled from source statement at line 339
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

  private listenWorkers.__Event3 __event3 = null;

  private class __Event4 {
    Boolean __eventFired = false;

    public void run() {
      if(listenWorkers.this.__ignoreMessageHandlers) {
      	this.__eventFired = false;
      	
      	return ;
      }
       class __PatternMatcher234439043 {
      	public BaseToy Toy;
      	
      	private final __PatternMatcher234439043 __PatternMatcher234439043_obj =  this;
      	
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
      		
      		Toy = __x;
      		
      		return true;
      	}
      	
      	public boolean headerMatch(java.lang.Object __objx) {
      		passNeededToyPart __x;
      		
      		try {
      			if(__objx instanceof passNeededToyPart) {
      				__x = (passNeededToyPart) __objx;
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
      __PatternMatcher234439043 __PatternMatcher234439043_obj = new __PatternMatcher234439043();
      jade.lang.acl.MessageTemplate __mt = jade.lang.acl.MessageTemplate.and(jade.lang.acl.MessageTemplate.and(jade.lang.acl.MessageTemplate.and(new jade.lang.acl.MessageTemplate(new jadescript.lang.acl.CustomMessageTemplate(((java.util.function.Predicate<jade.lang.acl.ACLMessage>) (__ignored) -> {{
      	return true;
      }
      }))), jade.lang.acl.MessageTemplate.MatchPerformative(jadescript.core.message.Message.REQUEST)), jadescript.core.nativeevent.NotNativeEventTemplate.MatchNotNative(_agentEnv.getAgent().getContentManager())), new jade.lang.acl.MessageTemplate(new jadescript.lang.acl.CustomMessageTemplate(((java.util.function.Predicate<jade.lang.acl.ACLMessage>) (__templMsg) -> {{
      	jadescript.core.message.Message __receivedMessage = jadescript.core.message.Message.wrap(__templMsg);
      	
      	try {
      		return __PatternMatcher234439043_obj.headerMatch(__receivedMessage.getContent(_agentEnv.getAgent().getContentManager()));
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
      	listenWorkers.this.__ignoreMessageHandlers = true;
      	
      	_agentEnv.getAgent().__cleanIgnoredFlagForMessage(__receivedMessage);
      	
      	this.__eventFired = true;
      	
      	try {
      		try {
      			/* 
      			 * Compiled from source statement at line 343
      			 * log "- WORKER " + name of agent + " PASS TOY PART TO " + name of sender of message
      			 */
      			
      			jadescript.core.Agent.doLog(jade.util.Logger.INFO, listenWorkers.this.getClass().getName(), listenWorkers.this, "on request", java.lang.String.valueOf(java.lang.String.valueOf(java.lang.String.valueOf(java.lang.String.valueOf("- WORKER ") + java.lang.String.valueOf(listenWorkers.this.getJadescriptAgent().getName())) + java.lang.String.valueOf(" PASS TOY PART TO ")) + java.lang.String.valueOf(((jadescript.core.message.RequestMessage<passNeededToyPart>) __receivedMessage).getSender().getName())));
      			
      			/* 
      			 * Compiled from source statement from line 344 to line 349
      			 * for item_ in myInventory do
      			 *                 if (canAddPiece(item_, Toy)) do
      			 *                     send message request deliverToyPart(item_) to sender of message
      			 *                     numberOfPartsPassed of agent = numberOfPartsPassed + 1
      			 *                     remove item_ from myInventory of agent
      			 *                     break
      			 */
      			
      			for ( ToyParts item_ : listenWorkers.this._agentEnv.getAgent().getMyInventory()) {
      				/* 
      				 * Compiled from source statement from line 345 to line 349
      				 * if (canAddPiece(item_, Toy)) do
      				 *                     send message request deliverToyPart(item_) to sender of message
      				 *                     numberOfPartsPassed of agent = numberOfPartsPassed + 1
      				 *                     remove item_ from myInventory of agent
      				 *                     break
      				 */
      				
      				if((listenWorkers.this._agentEnv.getAgent().canAddPiece(_agentEnv.getAgent().toEnv() ,item_ ,__PatternMatcher234439043_obj.Toy))) {
      					/* 
      					 * Compiled from source statement at line 346
      					 * send message request deliverToyPart(item_) to sender of message
      					 */
      					
      					try {
      						jadescript.util.SendMessageUtils.validatePerformative("request");
      						
      						java.lang.Object _contentToBeSent1768060526 = WorkOntology.deliverToyPart(item_);
      						
      						jadescript.core.message.Message _synthesizedMessage1768060526 = new jadescript.core.message.Message(jadescript.core.message.Message.REQUEST);
      						
      						_synthesizedMessage1768060526.setOntology(jadescript.util.SendMessageUtils.getDeclaringOntology(_contentToBeSent1768060526,WorkOntology.getInstance(),jadescript.content.onto.Ontology.getInstance()).getName());;
      						
      						_synthesizedMessage1768060526.setLanguage(__codec.getName());;
      						
      						_synthesizedMessage1768060526.addReceiver(((jadescript.core.message.RequestMessage<passNeededToyPart>) __receivedMessage).getSender());
      						
      						_agentEnv.getAgent().getContentManager().fillContent(_synthesizedMessage1768060526, jadescript.content.onto.MessageContent.prepareContent((jade.content.ContentElement) _contentToBeSent1768060526, "request"));
      						
      						_agentEnv.getAgent().send(_synthesizedMessage1768060526);
      					}
      					catch(java.lang.Throwable _t) {
      						throw jadescript.core.exception.JadescriptException.wrap(_t);
      					}
      					
      					/* 
      					 * Compiled from source statement at line 347
      					 * numberOfPartsPassed of agent = numberOfPartsPassed + 1
      					 */
      					
      					listenWorkers.this.getJadescriptAgent().setNumberOfPartsPassed(listenWorkers.this._agentEnv.getAgent().getNumberOfPartsPassed() + 1);
      					
      					/* 
      					 * Compiled from source statement at line 348
      					 * remove item_ from myInventory of agent
      					 */
      					
      					listenWorkers.this.getJadescriptAgent().getMyInventory().remove(item_);
      					
      					/* 
      					 * Compiled from source statement at line 349
      					 * break
      					 */
      					
      					break;
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

  private listenWorkers.__Event4 __event4 = null;

  private class __Event5 {
    Boolean __eventFired = false;

    public void run() {
      if(listenWorkers.this.__ignoreMessageHandlers) {
      	this.__eventFired = false;
      	
      	return ;
      }
       class __PatternMatcher590639568 {
      	public ToyParts ToyPart;
      	
      	private final __PatternMatcher590639568 __PatternMatcher590639568_obj =  this;
      	
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
      		
      		ToyPart = __x;
      		
      		return true;
      	}
      	
      	public boolean headerMatch(java.lang.Object __objx) {
      		deliverToyPart __x;
      		
      		try {
      			if(__objx instanceof deliverToyPart) {
      				__x = (deliverToyPart) __objx;
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
      __PatternMatcher590639568 __PatternMatcher590639568_obj = new __PatternMatcher590639568();
      jade.lang.acl.MessageTemplate __mt = jade.lang.acl.MessageTemplate.and(jade.lang.acl.MessageTemplate.and(jade.lang.acl.MessageTemplate.and(new jade.lang.acl.MessageTemplate(new jadescript.lang.acl.CustomMessageTemplate(((java.util.function.Predicate<jade.lang.acl.ACLMessage>) (__ignored) -> {{
      	return true;
      }
      }))), jade.lang.acl.MessageTemplate.MatchPerformative(jadescript.core.message.Message.REQUEST)), jadescript.core.nativeevent.NotNativeEventTemplate.MatchNotNative(_agentEnv.getAgent().getContentManager())), new jade.lang.acl.MessageTemplate(new jadescript.lang.acl.CustomMessageTemplate(((java.util.function.Predicate<jade.lang.acl.ACLMessage>) (__templMsg) -> {{
      	jadescript.core.message.Message __receivedMessage = jadescript.core.message.Message.wrap(__templMsg);
      	
      	try {
      		return __PatternMatcher590639568_obj.headerMatch(__receivedMessage.getContent(_agentEnv.getAgent().getContentManager()));
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
      	listenWorkers.this.__ignoreMessageHandlers = true;
      	
      	_agentEnv.getAgent().__cleanIgnoredFlagForMessage(__receivedMessage);
      	
      	this.__eventFired = true;
      	
      	try {
      		try {
      			/* 
      			 * Compiled from source statement at line 353
      			 * log "- WORKER " + name of agent + " TOY PART GIVEN BY " + name of sender of message
      			 */
      			
      			jadescript.core.Agent.doLog(jade.util.Logger.INFO, listenWorkers.this.getClass().getName(), listenWorkers.this, "on request", java.lang.String.valueOf(java.lang.String.valueOf(java.lang.String.valueOf(java.lang.String.valueOf("- WORKER ") + java.lang.String.valueOf(listenWorkers.this.getJadescriptAgent().getName())) + java.lang.String.valueOf(" TOY PART GIVEN BY ")) + java.lang.String.valueOf(((jadescript.core.message.RequestMessage<deliverToyPart>) __receivedMessage).getSender().getName())));
      			
      			/* 
      			 * Compiled from source statement at line 354
      			 * add ToyPart to myInventory of agent
      			 */
      			
      			listenWorkers.this.getJadescriptAgent().getMyInventory().add(__PatternMatcher590639568_obj.ToyPart);
      			
      			/* 
      			 * Compiled from source statement at line 355
      			 * activate AddPieceBehavior
      			 */
      			
      			new AddPieceBehavior(_agentEnv.getAgent().toEnv()).activate(_agentEnv.getAgent());
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

  private listenWorkers.__Event5 __event5 = null;

  private class __Event6 {
    Boolean __eventFired = false;

    public void run() {
      if(listenWorkers.this.__ignoreMessageHandlers) {
      	this.__eventFired = false;
      	
      	return ;
      }
       class __PatternMatcher1350408553 {
      	public BaseToy newToy;
      	
      	private final __PatternMatcher1350408553 __PatternMatcher1350408553_obj =  this;
      	
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
      __PatternMatcher1350408553 __PatternMatcher1350408553_obj = new __PatternMatcher1350408553();
      jade.lang.acl.MessageTemplate __mt = jade.lang.acl.MessageTemplate.and(jade.lang.acl.MessageTemplate.and(jade.lang.acl.MessageTemplate.and(new jade.lang.acl.MessageTemplate(new jadescript.lang.acl.CustomMessageTemplate(((java.util.function.Predicate<jade.lang.acl.ACLMessage>) (__ignored) -> {{
      	return true;
      }
      }))), jade.lang.acl.MessageTemplate.MatchPerformative(jadescript.core.message.Message.REQUEST)), jadescript.core.nativeevent.NotNativeEventTemplate.MatchNotNative(_agentEnv.getAgent().getContentManager())), new jade.lang.acl.MessageTemplate(new jadescript.lang.acl.CustomMessageTemplate(((java.util.function.Predicate<jade.lang.acl.ACLMessage>) (__templMsg) -> {{
      	jadescript.core.message.Message __receivedMessage = jadescript.core.message.Message.wrap(__templMsg);
      	
      	try {
      		return __PatternMatcher1350408553_obj.headerMatch(__receivedMessage.getContent(_agentEnv.getAgent().getContentManager()));
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
      	listenWorkers.this.__ignoreMessageHandlers = true;
      	
      	_agentEnv.getAgent().__cleanIgnoredFlagForMessage(__receivedMessage);
      	
      	this.__eventFired = true;
      	
      	try {
      		try {
      			/* 
      			 * Compiled from source statement from line 359 to line 369
      			 * if hasToy of agent = false do
      			 * 	            log "- WORKER " + name of agent + " : I HAVE A NEW TOY"
      			 * 	            currentToy of agent = newToy
      			 * 	            hasToy of agent = true
      			 * 	            currentTask of agent = "WorkOnToy"
      			 * 	            activate AddPieceBehavior
      			 * 	            
      			 *             # in case another Worker gives you a Toy while waiting send back New Toy to Supervisor
      			 *             else do
      			 *                 log "- WORKER " + name of agent + " : I RECEIVED TOY WHILE WAITING GIVE BACK TO SUPERVISOR"
      			 *                 send message request passToyToWorker(newToy) to sender of message
      			 */
      			
      			if(java.util.Objects.equals(listenWorkers.this.getJadescriptAgent().getHasToy(), false)) {
      				/* 
      				 * Compiled from source statement at line 360
      				 * log "- WORKER " + name of agent + " : I HAVE A NEW TOY"
      				 */
      				
      				jadescript.core.Agent.doLog(jade.util.Logger.INFO, listenWorkers.this.getClass().getName(), listenWorkers.this, "on request", java.lang.String.valueOf(java.lang.String.valueOf(java.lang.String.valueOf("- WORKER ") + java.lang.String.valueOf(listenWorkers.this.getJadescriptAgent().getName())) + java.lang.String.valueOf(" : I HAVE A NEW TOY")));
      				
      				/* 
      				 * Compiled from source statement at line 361
      				 * currentToy of agent = newToy
      				 */
      				
      				listenWorkers.this.getJadescriptAgent().setCurrentToy(__PatternMatcher1350408553_obj.newToy);
      				
      				/* 
      				 * Compiled from source statement at line 362
      				 * hasToy of agent = true
      				 */
      				
      				listenWorkers.this.getJadescriptAgent().setHasToy(true);
      				
      				/* 
      				 * Compiled from source statement at line 363
      				 * currentTask of agent = "WorkOnToy"
      				 */
      				
      				listenWorkers.this.getJadescriptAgent().setCurrentTask("WorkOnToy");
      				
      				/* 
      				 * Compiled from source statement at line 364
      				 * activate AddPieceBehavior
      				 */
      				
      				new AddPieceBehavior(_agentEnv.getAgent().toEnv()).activate(_agentEnv.getAgent());
      			}
      			else {
      				/* 
      				 * Compiled from source statement at line 368
      				 * log "- WORKER " + name of agent + " : I RECEIVED TOY WHILE WAITING GIVE BACK TO SUPERVISOR"
      				 */
      				
      				jadescript.core.Agent.doLog(jade.util.Logger.INFO, listenWorkers.this.getClass().getName(), listenWorkers.this, "on request", java.lang.String.valueOf(java.lang.String.valueOf(java.lang.String.valueOf("- WORKER ") + java.lang.String.valueOf(listenWorkers.this.getJadescriptAgent().getName())) + java.lang.String.valueOf(" : I RECEIVED TOY WHILE WAITING GIVE BACK TO SUPERVISOR")));
      				
      				/* 
      				 * Compiled from source statement at line 369
      				 * send message request passToyToWorker(newToy) to sender of message
      				 */
      				
      				try {
      					jadescript.util.SendMessageUtils.validatePerformative("request");
      					
      					java.lang.Object _contentToBeSent720331401 = WorkOntology.passToyToWorker(__PatternMatcher1350408553_obj.newToy);
      					
      					jadescript.core.message.Message _synthesizedMessage720331401 = new jadescript.core.message.Message(jadescript.core.message.Message.REQUEST);
      					
      					_synthesizedMessage720331401.setOntology(jadescript.util.SendMessageUtils.getDeclaringOntology(_contentToBeSent720331401,WorkOntology.getInstance(),jadescript.content.onto.Ontology.getInstance()).getName());;
      					
      					_synthesizedMessage720331401.setLanguage(__codec.getName());;
      					
      					_synthesizedMessage720331401.addReceiver(((jadescript.core.message.RequestMessage<deliverNewToy>) __receivedMessage).getSender());
      					
      					_agentEnv.getAgent().getContentManager().fillContent(_synthesizedMessage720331401, jadescript.content.onto.MessageContent.prepareContent((jade.content.ContentElement) _contentToBeSent720331401, "request"));
      					
      					_agentEnv.getAgent().send(_synthesizedMessage720331401);
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

  private listenWorkers.__Event6 __event6 = null;

  private ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__DEFAULT_THROWER;

  public void __handleJadescriptException(final JadescriptException __exc) {
    jadescript.core.exception.ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__getExceptionEscalator(listenWorkers.this);
    boolean __handled = false;
    if(!__handled) {
    	__thrower.__throwJadescriptException(__exc);
    }
  }

  private void __initializeProperties() {
    // Initializing properties and event handlers:
    {
    	listenWorkers.this.Availability = false;
    	
    	listenWorkers.this.HasMissingPieces = false;
    	
    	__event2 = new listenWorkers.__Event2();
    	
    	__event3 = new listenWorkers.__Event3();
    	
    	__event4 = new listenWorkers.__Event4();
    	
    	__event5 = new listenWorkers.__Event5();
    	
    	__event6 = new listenWorkers.__Event6();
    }
  }
}
