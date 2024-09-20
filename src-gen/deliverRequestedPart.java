import jade.content.ContentManager;
import jade.content.lang.Codec;
import jadescript.content.onto.Ontology;
import jadescript.core.behaviours.OneShotBehaviour;
import jadescript.core.exception.ExceptionThrower;
import jadescript.core.exception.JadescriptException;
import jadescript.java.AgentEnv;
import jadescript.java.SideEffectsFlag;

@SuppressWarnings("all")
public class deliverRequestedPart extends OneShotBehaviour<Supplier> {
  private Supplier __theAgent = (Supplier)/*Used as metadata*/null;

  private AgentEnv<Supplier, SideEffectsFlag.AnySideEffectFlag> _agentEnv = null;

  public static deliverRequestedPart __createEmpty(final AgentEnv<? extends Supplier, ? extends SideEffectsFlag.WithSideEffects> _agentEnv) {
    return new deliverRequestedPart(_agentEnv, new Request());
  }

  private Boolean __ignoreMessageHandlers = false;

  public void doAction(final int _tickCount) {
    this.__ignoreMessageHandlers = false;
    super.doAction(_tickCount);
    __event2.run();
    if(!this.__ignoreMessageHandlers) {
    	this.__noMessageHandled();
    }
    if ( true  && !__event2.__eventFired) __awaitForEvents();
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

  protected Request request_ = null;

  public void setRequest_(final Request request_) {
    this.request_ = request_;
  }

  public Request getRequest_() {
    return this.request_;
  }

  public deliverRequestedPart(final AgentEnv<? extends Supplier, ? extends SideEffectsFlag.WithSideEffects> _agentEnv, final Request request_) {
    super(_agentEnv);
    __initializeAgentEnv();
    __initializeProperties();
    try {
    	/* 
    	 * Compiled from source statement at line 168
    	 * request_ of this = request_
    	 */
    	
    	deliverRequestedPart.this.setRequest_(request_);
    }
    catch(jadescript.core.exception.JadescriptException __throwable) {
    	__handleJadescriptException(__throwable);
    }
    catch(java.lang.Throwable __throwable) {
    	__handleJadescriptException(jadescript.core.exception.JadescriptException.wrap(__throwable));
    }
  }

  private class __Event2 {
    Boolean __eventFired = true;

    public void run() {
      try {
      	/* 
      	 * Compiled from source statement from line 172 to line 204
      	 * if not stopWorking do
      	 * 	            emptyQueue of agent = false
      	 * 	            
      	 * 	            # If Supplier isn't waiting for assistance for technical issues deliver request ToyPart
      	 * 	            if waitForAssistence = false do
      	 * 	            
      	 * 	                # If there is still color resources to use, deliver new ToyPart to Worker
      	 * 		            if areThereColors do
      	 * 		            
      	 *                         # Supplier choose the actual piece that is going to be sent to the Worker
      	 * 			            request_ = processRequest(request_)
      	 * 			            send message request deliverNewToyParts(toyPart of request_) to sender of request_
      	 * 			            log "= SUPPLIER : DELIVER "+ toyPart of request_ + " to " + name of sender of request_
      	 * 			            
      	 * 			            # Send message to other Supplier to update color resources
      	 * 			            send message request deliverNewToyParts(toyPart of request_) to CoSupplier of agent
      	 * 		            
      	 * 		                # If there's still requests in queue deliver next worker request
      	 * 			            if hasAnyItems(queueRequest of agent) ≠ 0 do
      	 * 			                activate deliverRequestedPart(queueRequest[0]) after deliveryTime
      	 * 			                remove queueRequest[0] from queueRequest of agent
      	 * 		                
      	 * 		                # Otherwise the queue is empty 
      	 * 			            else do
      	 * 			                emptyQueue of agent = true
      	 * 	                
      	 * 	                # Otherwise if there's no paint the ToyParts cannot be delivered
      	 * 		            else do
      	 * 		                log "= SUPPLIER : NO PAINT AVAILABLE"
      	 * 	            
      	 * 	            # Otherwise try again until the technical issues is resolved     
      	 * 	            else do
      	 * 	                activate deliverRequestedPart(request_)
      	 */
      	
      	if( ! deliverRequestedPart.this._agentEnv.getAgent().getStopWorking()) {
      		/* 
      		 * Compiled from source statement at line 173
      		 * emptyQueue of agent = false
      		 */
      		
      		deliverRequestedPart.this.getJadescriptAgent().setEmptyQueue(false);
      		
      		/* 
      		 * Compiled from source statement from line 176 to line 204
      		 * if waitForAssistence = false do
      		 * 	            
      		 * 	                # If there is still color resources to use, deliver new ToyPart to Worker
      		 * 		            if areThereColors do
      		 * 		            
      		 *                         # Supplier choose the actual piece that is going to be sent to the Worker
      		 * 			            request_ = processRequest(request_)
      		 * 			            send message request deliverNewToyParts(toyPart of request_) to sender of request_
      		 * 			            log "= SUPPLIER : DELIVER "+ toyPart of request_ + " to " + name of sender of request_
      		 * 			            
      		 * 			            # Send message to other Supplier to update color resources
      		 * 			            send message request deliverNewToyParts(toyPart of request_) to CoSupplier of agent
      		 * 		            
      		 * 		                # If there's still requests in queue deliver next worker request
      		 * 			            if hasAnyItems(queueRequest of agent) ≠ 0 do
      		 * 			                activate deliverRequestedPart(queueRequest[0]) after deliveryTime
      		 * 			                remove queueRequest[0] from queueRequest of agent
      		 * 		                
      		 * 		                # Otherwise the queue is empty 
      		 * 			            else do
      		 * 			                emptyQueue of agent = true
      		 * 	                
      		 * 	                # Otherwise if there's no paint the ToyParts cannot be delivered
      		 * 		            else do
      		 * 		                log "= SUPPLIER : NO PAINT AVAILABLE"
      		 * 	            
      		 * 	            # Otherwise try again until the technical issues is resolved     
      		 * 	            else do
      		 * 	                activate deliverRequestedPart(request_)
      		 */
      		
      		if(java.util.Objects.equals(deliverRequestedPart.this._agentEnv.getAgent().getWaitForAssistence(), false)) {
      			/* 
      			 * Compiled from source statement from line 179 to line 200
      			 * if areThereColors do
      			 * 		            
      			 *                         # Supplier choose the actual piece that is going to be sent to the Worker
      			 * 			            request_ = processRequest(request_)
      			 * 			            send message request deliverNewToyParts(toyPart of request_) to sender of request_
      			 * 			            log "= SUPPLIER : DELIVER "+ toyPart of request_ + " to " + name of sender of request_
      			 * 			            
      			 * 			            # Send message to other Supplier to update color resources
      			 * 			            send message request deliverNewToyParts(toyPart of request_) to CoSupplier of agent
      			 * 		            
      			 * 		                # If there's still requests in queue deliver next worker request
      			 * 			            if hasAnyItems(queueRequest of agent) ≠ 0 do
      			 * 			                activate deliverRequestedPart(queueRequest[0]) after deliveryTime
      			 * 			                remove queueRequest[0] from queueRequest of agent
      			 * 		                
      			 * 		                # Otherwise the queue is empty 
      			 * 			            else do
      			 * 			                emptyQueue of agent = true
      			 * 	                
      			 * 	                # Otherwise if there's no paint the ToyParts cannot be delivered
      			 * 		            else do
      			 * 		                log "= SUPPLIER : NO PAINT AVAILABLE"
      			 */
      			
      			if(deliverRequestedPart.this._agentEnv.getAgent().areThereColors(_agentEnv.getAgent().toEnv())) {
      				/* 
      				 * Compiled from source statement at line 182
      				 * request_ = processRequest(request_)
      				 */
      				
      				deliverRequestedPart.this.setRequest_(deliverRequestedPart.this._agentEnv.getAgent().processRequest(_agentEnv.getAgent().toEnv() ,deliverRequestedPart.this.getRequest_()));
      				
      				/* 
      				 * Compiled from source statement at line 183
      				 * send message request deliverNewToyParts(toyPart of request_) to sender of request_
      				 */
      				
      				try {
      					jadescript.util.SendMessageUtils.validatePerformative("request");
      					
      					java.lang.Object _contentToBeSent1670678461 = WorkOntology.deliverNewToyParts(deliverRequestedPart.this.getRequest_().getToyPart());
      					
      					jadescript.core.message.Message _synthesizedMessage1670678461 = new jadescript.core.message.Message(jadescript.core.message.Message.REQUEST);
      					
      					_synthesizedMessage1670678461.setOntology(jadescript.util.SendMessageUtils.getDeclaringOntology(_contentToBeSent1670678461,WorkOntology.getInstance(),jadescript.content.onto.Ontology.getInstance()).getName());;
      					
      					_synthesizedMessage1670678461.setLanguage(__codec.getName());;
      					
      					_synthesizedMessage1670678461.addReceiver(deliverRequestedPart.this.getRequest_().getSender());
      					
      					_agentEnv.getAgent().getContentManager().fillContent(_synthesizedMessage1670678461, jadescript.content.onto.MessageContent.prepareContent((jade.content.ContentElement) _contentToBeSent1670678461, "request"));
      					
      					_agentEnv.getAgent().send(_synthesizedMessage1670678461);
      				}
      				catch(java.lang.Throwable _t) {
      					throw jadescript.core.exception.JadescriptException.wrap(_t);
      				}
      				
      				/* 
      				 * Compiled from source statement at line 184
      				 * log "= SUPPLIER : DELIVER "+ toyPart of request_ + " to " + name of sender of request_
      				 */
      				
      				jadescript.core.Agent.doLog(jade.util.Logger.INFO, deliverRequestedPart.this.getClass().getName(), deliverRequestedPart.this, "on execute", java.lang.String.valueOf(java.lang.String.valueOf(java.lang.String.valueOf(java.lang.String.valueOf("= SUPPLIER : DELIVER ") + java.lang.String.valueOf(deliverRequestedPart.this.getRequest_().getToyPart())) + java.lang.String.valueOf(" to ")) + java.lang.String.valueOf(deliverRequestedPart.this.getRequest_().getSender().getName())));
      				
      				/* 
      				 * Compiled from source statement at line 187
      				 * send message request deliverNewToyParts(toyPart of request_) to CoSupplier of agent
      				 */
      				
      				try {
      					jadescript.util.SendMessageUtils.validatePerformative("request");
      					
      					java.lang.Object _contentToBeSent1907158752 = WorkOntology.deliverNewToyParts(deliverRequestedPart.this.getRequest_().getToyPart());
      					
      					jadescript.core.message.Message _synthesizedMessage1907158752 = new jadescript.core.message.Message(jadescript.core.message.Message.REQUEST);
      					
      					_synthesizedMessage1907158752.setOntology(jadescript.util.SendMessageUtils.getDeclaringOntology(_contentToBeSent1907158752,WorkOntology.getInstance(),jadescript.content.onto.Ontology.getInstance()).getName());;
      					
      					_synthesizedMessage1907158752.setLanguage(__codec.getName());;
      					
      					_synthesizedMessage1907158752.addReceiver(deliverRequestedPart.this.getJadescriptAgent().getCoSupplier());
      					
      					_agentEnv.getAgent().getContentManager().fillContent(_synthesizedMessage1907158752, jadescript.content.onto.MessageContent.prepareContent((jade.content.ContentElement) _contentToBeSent1907158752, "request"));
      					
      					_agentEnv.getAgent().send(_synthesizedMessage1907158752);
      				}
      				catch(java.lang.Throwable _t) {
      					throw jadescript.core.exception.JadescriptException.wrap(_t);
      				}
      				
      				/* 
      				 * Compiled from source statement from line 190 to line 196
      				 * if hasAnyItems(queueRequest of agent) ≠ 0 do
      				 * 			                activate deliverRequestedPart(queueRequest[0]) after deliveryTime
      				 * 			                remove queueRequest[0] from queueRequest of agent
      				 * 		                
      				 * 		                # Otherwise the queue is empty 
      				 * 			            else do
      				 * 			                emptyQueue of agent = true
      				 */
      				
      				if(!java.util.Objects.equals(deliverRequestedPart.this._agentEnv.getAgent().hasAnyItems(_agentEnv.getAgent().toEnv() ,deliverRequestedPart.this.getJadescriptAgent().getQueueRequest()), 0)) {
      					/* 
      					 * Compiled from source statement at line 191
      					 * activate deliverRequestedPart(queueRequest[0]) after deliveryTime
      					 */
      					
      					new deliverRequestedPart(_agentEnv.getAgent().toEnv() ,deliverRequestedPart.this._agentEnv.getAgent().getQueueRequest().get(0)).activate_after(_agentEnv.getAgent(), deliverRequestedPart.this._agentEnv.getAgent().getDeliveryTime());
      					
      					/* 
      					 * Compiled from source statement at line 192
      					 * remove queueRequest[0] from queueRequest of agent
      					 */
      					
      					deliverRequestedPart.this.getJadescriptAgent().getQueueRequest().remove(deliverRequestedPart.this._agentEnv.getAgent().getQueueRequest().get(0));
      				}
      				else {
      					/* 
      					 * Compiled from source statement at line 196
      					 * emptyQueue of agent = true
      					 */
      					
      					deliverRequestedPart.this.getJadescriptAgent().setEmptyQueue(true);
      				}
      			}
      			else {
      				/* 
      				 * Compiled from source statement at line 200
      				 * log "= SUPPLIER : NO PAINT AVAILABLE"
      				 */
      				
      				jadescript.core.Agent.doLog(jade.util.Logger.INFO, deliverRequestedPart.this.getClass().getName(), deliverRequestedPart.this, "on execute", java.lang.String.valueOf("= SUPPLIER : NO PAINT AVAILABLE"));
      			}
      		}
      		else {
      			/* 
      			 * Compiled from source statement at line 204
      			 * activate deliverRequestedPart(request_)
      			 */
      			
      			new deliverRequestedPart(_agentEnv.getAgent().toEnv() ,deliverRequestedPart.this.getRequest_()).activate(_agentEnv.getAgent());
      		}
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

  private deliverRequestedPart.__Event2 __event2 =  new deliverRequestedPart.__Event2();

  private ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__DEFAULT_THROWER;

  public void __handleJadescriptException(final JadescriptException __exc) {
    jadescript.core.exception.ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__getExceptionEscalator(deliverRequestedPart.this);
    boolean __handled = false;
    if(!__handled) {
    	__thrower.__throwJadescriptException(__exc);
    }
  }

  private void __initializeProperties() {
    // Initializing properties and event handlers:
    {
    	deliverRequestedPart.this.request_ = new Request();
    }
  }
}
