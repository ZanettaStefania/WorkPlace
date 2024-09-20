import jade.content.ContentManager;
import jade.content.lang.Codec;
import jadescript.content.onto.Ontology;
import jadescript.core.behaviours.OneShotBehaviour;
import jadescript.core.exception.ExceptionThrower;
import jadescript.core.exception.JadescriptException;
import jadescript.java.AgentEnv;
import jadescript.java.SideEffectsFlag;

@SuppressWarnings("all")
public class AddPieceBehavior extends OneShotBehaviour<Worker> {
  private Worker __theAgent = (Worker)/*Used as metadata*/null;

  private AgentEnv<Worker, SideEffectsFlag.AnySideEffectFlag> _agentEnv = null;

  public AddPieceBehavior(final AgentEnv<? extends Worker, ? extends SideEffectsFlag.WithSideEffects> _agentEnv) {
    super(_agentEnv);
    __initializeAgentEnv();
    __initializeProperties();
  }

  public static AddPieceBehavior __createEmpty(final AgentEnv<? extends Worker, ? extends SideEffectsFlag.WithSideEffects> _agentEnv) {
    return new AddPieceBehavior(_agentEnv);
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
    Boolean __eventFired = true;

    public void run() {
      try {
      	/* 
      	 * Compiled from source statement from line 403 to line 501
      	 * if not stopWorking do
      	 *             
      	 * 	            #Add Pieces only if Worker has a Toy
      	 * 	            if (hasToy of agent = true) do
      	 * 	            
      	 * 		            #If currentToy doesn't need more parts stop
      	 * 		            if (isToyFinished(currentToy of agent) and waiting_Supervisor of agent = false) do
      	 * 		                log "- WORKER " + name of agent + " : FINISHED TOY " + currentToy of agent
      	 * 		                waiting_Supervisor of agent = true
      	 * 		                send message request deliverFinishedToy(currentToy of agent) to Supervisor of agent
      	 * 		                activate confirmDelivery
      	 * 		            
      	 * 		            # Else try to add other ToyParts
      	 * 		            else do
      	 * 		                
      	 * 		                # Add piece only if waiting for Supplier or if you're just currently working on Toy
      	 * 			            if (currentTask of agent = "WaitingForPiece" or currentTask of agent = "WorkOnToy") do
      	 * 	                      
      	 * 				            # Check if there are ToyParts in inventory
      	 * 				            if (hasAnyItems(myInventory of agent) ≠ 0) do
      	 * 				                
      	 * 				                # Check if there are any piece that can be added to the currentToy
      	 * 				                if (anyCompatiblePiece(myInventory of agent, currentToy of agent)) do 
      	 * 				                    
      	 * 				                    for item_ in myInventory do
      	 * 					                    if (canAddPiece(item_, currentToy of agent)) do
      	 * 					                        log "- WORKER " + name of agent + " : ADDING PIECE " + item of item_ + " & UPDATED INVENTORY " + addPieceToToy(item_)
      	 * 					                        #UsedToyParts of agent = UsedToyParts + 1 
      	 * 					                        activate AddPieceBehavior
      	 * 					                        break
      	 * 					
      	 * 					            # If there are no piece that can be added to currentToy, ask for piece          
      	 * 				                else do
      	 * 	
      	 * 	                                currentTask of agent = "WaitingForPiece"
      	 * 
      	 * 	                                # If inventory isn't full, request ToyParts to Supplier                            
      	 * 	                                if (hasAnyItems(myInventory of agent) < 3) do
      	 * 	                                
      	 * 	                                     # If Worker isn't waiting for the Supplier request another ToyPart
      	 * 	                                     if (waiting_Supplier of agent = false) do
      	 * 	                                        log "- WORKER " + name of agent + " : REQUEST SENT TO SUPPLIER ... Toy Status : " + currentToy of agent
      	 * 	                                        activate AskForNewToyParts_toSupplier
      	 * 	                                        
      	 *                                          # Else if request already sent ask other Workers
      	 * 	                                     else do
      	 * 	                                     
      	 * 	                                        # Ask for Help only if worker isn't waiting for Coworkers replies
      	 * 	                                        if hasAnyFriendWorkers and (waiting_CoWorkers of agent = false) do
      	 * 		                                        log "- WORKER " + name of agent + " : Asking for other workers help"
      	 * 		                                        send message request askForHelp(currentToy of agent) to nearbyWorkers of agent
      	 * 		                                        numberOfWorkerRequest of agent = numberOfWorkerRequest + 1
      	 * 		                                        activate listenReplyOfCoworkers
      	 * 		                                        waiting_CoWorkers of agent = true
      	 * 		                            
      	 * 		                            # If inventory is full ask for help of Workers
      	 * 	                                else do
      	 * 	                                
      	 * 	                                    # Ask for Help only if worker isn't waiting for Coworkers replies
      	 * 	                                    if hasAnyFriendWorkers and (waiting_CoWorkers of agent = false) do
      	 * 	                                        log "- WORKER " + name of agent + " : Asking for other workers help"
      	 * 	                                        send message request askForHelp(currentToy of agent) to nearbyWorkers of agent
      	 * 	                                        numberOfWorkerRequest of agent = numberOfWorkerRequest + 1
      	 * 	                                        activate listenReplyOfCoworkers
      	 * 	                                        waiting_CoWorkers of agent = true
      	 * 	                                
      	 * 		                    
      	 * 		                    # If Worker has no ToyParts in inventory
      	 * 				            else do
      	 * 				            
      	 * 				                currentTask of agent = "WaitingForPiece"
      	 * 				                
      	 * 				                # If Worker isn't waiting for the Supplier request another ToyPart
      	 * 				                if (waiting_Supplier of agent = false) do
      	 * 		                           log "- WORKER " + name of agent + " : REQUEST SENT TO SUPPLIER ... Toy Status : " + currentToy of agent 
      	 * 		                           activate AskForNewToyParts_toSupplier after "PT5S" as duration
      	 * 		                           
      	 * 	                            # Otherwise ask for help only if worker isn't waiting for Coworkers replies
      	 * 	                            else do
      	 * 	                            
      	 * 	                                if hasAnyFriendWorkers and (waiting_CoWorkers of agent = false) do 
      	 * 		                                log "- WORKER " + name of agent + " : Asking for other workers help"
      	 * 		                                send message request askForHelp(currentToy of agent) to nearbyWorkers of agent
      	 * 		                                numberOfWorkerRequest of agent = numberOfWorkerRequest + 1
      	 * 		                                activate listenReplyOfCoworkers
      	 * 		                                waiting_CoWorkers of agent = true
      	 * 
      	 * 	                    # If Worker is occupied
      	 * 			            else do
      	 * 			                log "- WORKER " + name of agent + " : WAITING.."
      	 * 			                
      	 * 			    # If Worker has no Toy            
      	 * 			    else do
      	 * 			       log "- WORKER " + name of agent + " : NO TOY ... AVAILABLE FOR COMUNICATION"       
      	 * 			            
      	 * 			       # Worker can ask for new Toy only if he is authorized to do so
      	 * 			       if WorkerManager do
      	 * 			          send message request askToy(aid) to Supervisor of agent        
      	 * 		                
      	 */
      	
      	if( ! AddPieceBehavior.this._agentEnv.getAgent().getStopWorking()) {
      		/* 
      		 * Compiled from source statement from line 406 to line 501
      		 * if (hasToy of agent = true) do
      		 * 	            
      		 * 		            #If currentToy doesn't need more parts stop
      		 * 		            if (isToyFinished(currentToy of agent) and waiting_Supervisor of agent = false) do
      		 * 		                log "- WORKER " + name of agent + " : FINISHED TOY " + currentToy of agent
      		 * 		                waiting_Supervisor of agent = true
      		 * 		                send message request deliverFinishedToy(currentToy of agent) to Supervisor of agent
      		 * 		                activate confirmDelivery
      		 * 		            
      		 * 		            # Else try to add other ToyParts
      		 * 		            else do
      		 * 		                
      		 * 		                # Add piece only if waiting for Supplier or if you're just currently working on Toy
      		 * 			            if (currentTask of agent = "WaitingForPiece" or currentTask of agent = "WorkOnToy") do
      		 * 	                      
      		 * 				            # Check if there are ToyParts in inventory
      		 * 				            if (hasAnyItems(myInventory of agent) ≠ 0) do
      		 * 				                
      		 * 				                # Check if there are any piece that can be added to the currentToy
      		 * 				                if (anyCompatiblePiece(myInventory of agent, currentToy of agent)) do 
      		 * 				                    
      		 * 				                    for item_ in myInventory do
      		 * 					                    if (canAddPiece(item_, currentToy of agent)) do
      		 * 					                        log "- WORKER " + name of agent + " : ADDING PIECE " + item of item_ + " & UPDATED INVENTORY " + addPieceToToy(item_)
      		 * 					                        #UsedToyParts of agent = UsedToyParts + 1 
      		 * 					                        activate AddPieceBehavior
      		 * 					                        break
      		 * 					
      		 * 					            # If there are no piece that can be added to currentToy, ask for piece          
      		 * 				                else do
      		 * 	
      		 * 	                                currentTask of agent = "WaitingForPiece"
      		 * 
      		 * 	                                # If inventory isn't full, request ToyParts to Supplier                            
      		 * 	                                if (hasAnyItems(myInventory of agent) < 3) do
      		 * 	                                
      		 * 	                                     # If Worker isn't waiting for the Supplier request another ToyPart
      		 * 	                                     if (waiting_Supplier of agent = false) do
      		 * 	                                        log "- WORKER " + name of agent + " : REQUEST SENT TO SUPPLIER ... Toy Status : " + currentToy of agent
      		 * 	                                        activate AskForNewToyParts_toSupplier
      		 * 	                                        
      		 *                                          # Else if request already sent ask other Workers
      		 * 	                                     else do
      		 * 	                                     
      		 * 	                                        # Ask for Help only if worker isn't waiting for Coworkers replies
      		 * 	                                        if hasAnyFriendWorkers and (waiting_CoWorkers of agent = false) do
      		 * 		                                        log "- WORKER " + name of agent + " : Asking for other workers help"
      		 * 		                                        send message request askForHelp(currentToy of agent) to nearbyWorkers of agent
      		 * 		                                        numberOfWorkerRequest of agent = numberOfWorkerRequest + 1
      		 * 		                                        activate listenReplyOfCoworkers
      		 * 		                                        waiting_CoWorkers of agent = true
      		 * 		                            
      		 * 		                            # If inventory is full ask for help of Workers
      		 * 	                                else do
      		 * 	                                
      		 * 	                                    # Ask for Help only if worker isn't waiting for Coworkers replies
      		 * 	                                    if hasAnyFriendWorkers and (waiting_CoWorkers of agent = false) do
      		 * 	                                        log "- WORKER " + name of agent + " : Asking for other workers help"
      		 * 	                                        send message request askForHelp(currentToy of agent) to nearbyWorkers of agent
      		 * 	                                        numberOfWorkerRequest of agent = numberOfWorkerRequest + 1
      		 * 	                                        activate listenReplyOfCoworkers
      		 * 	                                        waiting_CoWorkers of agent = true
      		 * 	                                
      		 * 		                    
      		 * 		                    # If Worker has no ToyParts in inventory
      		 * 				            else do
      		 * 				            
      		 * 				                currentTask of agent = "WaitingForPiece"
      		 * 				                
      		 * 				                # If Worker isn't waiting for the Supplier request another ToyPart
      		 * 				                if (waiting_Supplier of agent = false) do
      		 * 		                           log "- WORKER " + name of agent + " : REQUEST SENT TO SUPPLIER ... Toy Status : " + currentToy of agent 
      		 * 		                           activate AskForNewToyParts_toSupplier after "PT5S" as duration
      		 * 		                           
      		 * 	                            # Otherwise ask for help only if worker isn't waiting for Coworkers replies
      		 * 	                            else do
      		 * 	                            
      		 * 	                                if hasAnyFriendWorkers and (waiting_CoWorkers of agent = false) do 
      		 * 		                                log "- WORKER " + name of agent + " : Asking for other workers help"
      		 * 		                                send message request askForHelp(currentToy of agent) to nearbyWorkers of agent
      		 * 		                                numberOfWorkerRequest of agent = numberOfWorkerRequest + 1
      		 * 		                                activate listenReplyOfCoworkers
      		 * 		                                waiting_CoWorkers of agent = true
      		 * 
      		 * 	                    # If Worker is occupied
      		 * 			            else do
      		 * 			                log "- WORKER " + name of agent + " : WAITING.."
      		 * 			                
      		 * 			    # If Worker has no Toy            
      		 * 			    else do
      		 * 			       log "- WORKER " + name of agent + " : NO TOY ... AVAILABLE FOR COMUNICATION"       
      		 * 			            
      		 * 			       # Worker can ask for new Toy only if he is authorized to do so
      		 * 			       if WorkerManager do
      		 * 			          send message request askToy(aid) to Supervisor of agent        
      		 * 		                
      		 */
      		
      		if((java.util.Objects.equals(AddPieceBehavior.this.getJadescriptAgent().getHasToy(), true))) {
      			/* 
      			 * Compiled from source statement from line 409 to line 492
      			 * if (isToyFinished(currentToy of agent) and waiting_Supervisor of agent = false) do
      			 * 		                log "- WORKER " + name of agent + " : FINISHED TOY " + currentToy of agent
      			 * 		                waiting_Supervisor of agent = true
      			 * 		                send message request deliverFinishedToy(currentToy of agent) to Supervisor of agent
      			 * 		                activate confirmDelivery
      			 * 		            
      			 * 		            # Else try to add other ToyParts
      			 * 		            else do
      			 * 		                
      			 * 		                # Add piece only if waiting for Supplier or if you're just currently working on Toy
      			 * 			            if (currentTask of agent = "WaitingForPiece" or currentTask of agent = "WorkOnToy") do
      			 * 	                      
      			 * 				            # Check if there are ToyParts in inventory
      			 * 				            if (hasAnyItems(myInventory of agent) ≠ 0) do
      			 * 				                
      			 * 				                # Check if there are any piece that can be added to the currentToy
      			 * 				                if (anyCompatiblePiece(myInventory of agent, currentToy of agent)) do 
      			 * 				                    
      			 * 				                    for item_ in myInventory do
      			 * 					                    if (canAddPiece(item_, currentToy of agent)) do
      			 * 					                        log "- WORKER " + name of agent + " : ADDING PIECE " + item of item_ + " & UPDATED INVENTORY " + addPieceToToy(item_)
      			 * 					                        #UsedToyParts of agent = UsedToyParts + 1 
      			 * 					                        activate AddPieceBehavior
      			 * 					                        break
      			 * 					
      			 * 					            # If there are no piece that can be added to currentToy, ask for piece          
      			 * 				                else do
      			 * 	
      			 * 	                                currentTask of agent = "WaitingForPiece"
      			 * 
      			 * 	                                # If inventory isn't full, request ToyParts to Supplier                            
      			 * 	                                if (hasAnyItems(myInventory of agent) < 3) do
      			 * 	                                
      			 * 	                                     # If Worker isn't waiting for the Supplier request another ToyPart
      			 * 	                                     if (waiting_Supplier of agent = false) do
      			 * 	                                        log "- WORKER " + name of agent + " : REQUEST SENT TO SUPPLIER ... Toy Status : " + currentToy of agent
      			 * 	                                        activate AskForNewToyParts_toSupplier
      			 * 	                                        
      			 *                                          # Else if request already sent ask other Workers
      			 * 	                                     else do
      			 * 	                                     
      			 * 	                                        # Ask for Help only if worker isn't waiting for Coworkers replies
      			 * 	                                        if hasAnyFriendWorkers and (waiting_CoWorkers of agent = false) do
      			 * 		                                        log "- WORKER " + name of agent + " : Asking for other workers help"
      			 * 		                                        send message request askForHelp(currentToy of agent) to nearbyWorkers of agent
      			 * 		                                        numberOfWorkerRequest of agent = numberOfWorkerRequest + 1
      			 * 		                                        activate listenReplyOfCoworkers
      			 * 		                                        waiting_CoWorkers of agent = true
      			 * 		                            
      			 * 		                            # If inventory is full ask for help of Workers
      			 * 	                                else do
      			 * 	                                
      			 * 	                                    # Ask for Help only if worker isn't waiting for Coworkers replies
      			 * 	                                    if hasAnyFriendWorkers and (waiting_CoWorkers of agent = false) do
      			 * 	                                        log "- WORKER " + name of agent + " : Asking for other workers help"
      			 * 	                                        send message request askForHelp(currentToy of agent) to nearbyWorkers of agent
      			 * 	                                        numberOfWorkerRequest of agent = numberOfWorkerRequest + 1
      			 * 	                                        activate listenReplyOfCoworkers
      			 * 	                                        waiting_CoWorkers of agent = true
      			 * 	                                
      			 * 		                    
      			 * 		                    # If Worker has no ToyParts in inventory
      			 * 				            else do
      			 * 				            
      			 * 				                currentTask of agent = "WaitingForPiece"
      			 * 				                
      			 * 				                # If Worker isn't waiting for the Supplier request another ToyPart
      			 * 				                if (waiting_Supplier of agent = false) do
      			 * 		                           log "- WORKER " + name of agent + " : REQUEST SENT TO SUPPLIER ... Toy Status : " + currentToy of agent 
      			 * 		                           activate AskForNewToyParts_toSupplier after "PT5S" as duration
      			 * 		                           
      			 * 	                            # Otherwise ask for help only if worker isn't waiting for Coworkers replies
      			 * 	                            else do
      			 * 	                            
      			 * 	                                if hasAnyFriendWorkers and (waiting_CoWorkers of agent = false) do 
      			 * 		                                log "- WORKER " + name of agent + " : Asking for other workers help"
      			 * 		                                send message request askForHelp(currentToy of agent) to nearbyWorkers of agent
      			 * 		                                numberOfWorkerRequest of agent = numberOfWorkerRequest + 1
      			 * 		                                activate listenReplyOfCoworkers
      			 * 		                                waiting_CoWorkers of agent = true
      			 * 
      			 * 	                    # If Worker is occupied
      			 * 			            else do
      			 * 			                log "- WORKER " + name of agent + " : WAITING.."
      			 */
      			
      			if((AddPieceBehavior.this._agentEnv.getAgent().isToyFinished(_agentEnv.getAgent().toEnv() ,AddPieceBehavior.this.getJadescriptAgent().getCurrentToy()) && java.util.Objects.equals(AddPieceBehavior.this.getJadescriptAgent().getWaiting_Supervisor(), false))) {
      				/* 
      				 * Compiled from source statement at line 410
      				 * log "- WORKER " + name of agent + " : FINISHED TOY " + currentToy of agent
      				 */
      				
      				jadescript.core.Agent.doLog(jade.util.Logger.INFO, AddPieceBehavior.this.getClass().getName(), AddPieceBehavior.this, "on execute", java.lang.String.valueOf(java.lang.String.valueOf(java.lang.String.valueOf(java.lang.String.valueOf("- WORKER ") + java.lang.String.valueOf(AddPieceBehavior.this.getJadescriptAgent().getName())) + java.lang.String.valueOf(" : FINISHED TOY ")) + java.lang.String.valueOf(AddPieceBehavior.this.getJadescriptAgent().getCurrentToy())));
      				
      				/* 
      				 * Compiled from source statement at line 411
      				 * waiting_Supervisor of agent = true
      				 */
      				
      				AddPieceBehavior.this.getJadescriptAgent().setWaiting_Supervisor(true);
      				
      				/* 
      				 * Compiled from source statement at line 412
      				 * send message request deliverFinishedToy(currentToy of agent) to Supervisor of agent
      				 */
      				
      				try {
      					jadescript.util.SendMessageUtils.validatePerformative("request");
      					
      					java.lang.Object _contentToBeSent15531849 = WorkOntology.deliverFinishedToy(AddPieceBehavior.this.getJadescriptAgent().getCurrentToy());
      					
      					jadescript.core.message.Message _synthesizedMessage15531849 = new jadescript.core.message.Message(jadescript.core.message.Message.REQUEST);
      					
      					_synthesizedMessage15531849.setOntology(jadescript.util.SendMessageUtils.getDeclaringOntology(_contentToBeSent15531849,WorkOntology.getInstance(),jadescript.content.onto.Ontology.getInstance()).getName());;
      					
      					_synthesizedMessage15531849.setLanguage(__codec.getName());;
      					
      					_synthesizedMessage15531849.addReceiver(AddPieceBehavior.this.getJadescriptAgent().getSupervisor());
      					
      					_agentEnv.getAgent().getContentManager().fillContent(_synthesizedMessage15531849, jadescript.content.onto.MessageContent.prepareContent((jade.content.ContentElement) _contentToBeSent15531849, "request"));
      					
      					_agentEnv.getAgent().send(_synthesizedMessage15531849);
      				}
      				catch(java.lang.Throwable _t) {
      					throw jadescript.core.exception.JadescriptException.wrap(_t);
      				}
      				
      				/* 
      				 * Compiled from source statement at line 413
      				 * activate confirmDelivery
      				 */
      				
      				new confirmDelivery(_agentEnv.getAgent().toEnv()).activate(_agentEnv.getAgent());
      			}
      			else {
      				/* 
      				 * Compiled from source statement from line 419 to line 492
      				 * if (currentTask of agent = "WaitingForPiece" or currentTask of agent = "WorkOnToy") do
      				 * 	                      
      				 * 				            # Check if there are ToyParts in inventory
      				 * 				            if (hasAnyItems(myInventory of agent) ≠ 0) do
      				 * 				                
      				 * 				                # Check if there are any piece that can be added to the currentToy
      				 * 				                if (anyCompatiblePiece(myInventory of agent, currentToy of agent)) do 
      				 * 				                    
      				 * 				                    for item_ in myInventory do
      				 * 					                    if (canAddPiece(item_, currentToy of agent)) do
      				 * 					                        log "- WORKER " + name of agent + " : ADDING PIECE " + item of item_ + " & UPDATED INVENTORY " + addPieceToToy(item_)
      				 * 					                        #UsedToyParts of agent = UsedToyParts + 1 
      				 * 					                        activate AddPieceBehavior
      				 * 					                        break
      				 * 					
      				 * 					            # If there are no piece that can be added to currentToy, ask for piece          
      				 * 				                else do
      				 * 	
      				 * 	                                currentTask of agent = "WaitingForPiece"
      				 * 
      				 * 	                                # If inventory isn't full, request ToyParts to Supplier                            
      				 * 	                                if (hasAnyItems(myInventory of agent) < 3) do
      				 * 	                                
      				 * 	                                     # If Worker isn't waiting for the Supplier request another ToyPart
      				 * 	                                     if (waiting_Supplier of agent = false) do
      				 * 	                                        log "- WORKER " + name of agent + " : REQUEST SENT TO SUPPLIER ... Toy Status : " + currentToy of agent
      				 * 	                                        activate AskForNewToyParts_toSupplier
      				 * 	                                        
      				 *                                          # Else if request already sent ask other Workers
      				 * 	                                     else do
      				 * 	                                     
      				 * 	                                        # Ask for Help only if worker isn't waiting for Coworkers replies
      				 * 	                                        if hasAnyFriendWorkers and (waiting_CoWorkers of agent = false) do
      				 * 		                                        log "- WORKER " + name of agent + " : Asking for other workers help"
      				 * 		                                        send message request askForHelp(currentToy of agent) to nearbyWorkers of agent
      				 * 		                                        numberOfWorkerRequest of agent = numberOfWorkerRequest + 1
      				 * 		                                        activate listenReplyOfCoworkers
      				 * 		                                        waiting_CoWorkers of agent = true
      				 * 		                            
      				 * 		                            # If inventory is full ask for help of Workers
      				 * 	                                else do
      				 * 	                                
      				 * 	                                    # Ask for Help only if worker isn't waiting for Coworkers replies
      				 * 	                                    if hasAnyFriendWorkers and (waiting_CoWorkers of agent = false) do
      				 * 	                                        log "- WORKER " + name of agent + " : Asking for other workers help"
      				 * 	                                        send message request askForHelp(currentToy of agent) to nearbyWorkers of agent
      				 * 	                                        numberOfWorkerRequest of agent = numberOfWorkerRequest + 1
      				 * 	                                        activate listenReplyOfCoworkers
      				 * 	                                        waiting_CoWorkers of agent = true
      				 * 	                                
      				 * 		                    
      				 * 		                    # If Worker has no ToyParts in inventory
      				 * 				            else do
      				 * 				            
      				 * 				                currentTask of agent = "WaitingForPiece"
      				 * 				                
      				 * 				                # If Worker isn't waiting for the Supplier request another ToyPart
      				 * 				                if (waiting_Supplier of agent = false) do
      				 * 		                           log "- WORKER " + name of agent + " : REQUEST SENT TO SUPPLIER ... Toy Status : " + currentToy of agent 
      				 * 		                           activate AskForNewToyParts_toSupplier after "PT5S" as duration
      				 * 		                           
      				 * 	                            # Otherwise ask for help only if worker isn't waiting for Coworkers replies
      				 * 	                            else do
      				 * 	                            
      				 * 	                                if hasAnyFriendWorkers and (waiting_CoWorkers of agent = false) do 
      				 * 		                                log "- WORKER " + name of agent + " : Asking for other workers help"
      				 * 		                                send message request askForHelp(currentToy of agent) to nearbyWorkers of agent
      				 * 		                                numberOfWorkerRequest of agent = numberOfWorkerRequest + 1
      				 * 		                                activate listenReplyOfCoworkers
      				 * 		                                waiting_CoWorkers of agent = true
      				 * 
      				 * 	                    # If Worker is occupied
      				 * 			            else do
      				 * 			                log "- WORKER " + name of agent + " : WAITING.."
      				 */
      				
      				if((java.util.Objects.equals(AddPieceBehavior.this.getJadescriptAgent().getCurrentTask(), "WaitingForPiece") || java.util.Objects.equals(AddPieceBehavior.this.getJadescriptAgent().getCurrentTask(), "WorkOnToy"))) {
      					/* 
      					 * Compiled from source statement from line 422 to line 488
      					 * if (hasAnyItems(myInventory of agent) ≠ 0) do
      					 * 				                
      					 * 				                # Check if there are any piece that can be added to the currentToy
      					 * 				                if (anyCompatiblePiece(myInventory of agent, currentToy of agent)) do 
      					 * 				                    
      					 * 				                    for item_ in myInventory do
      					 * 					                    if (canAddPiece(item_, currentToy of agent)) do
      					 * 					                        log "- WORKER " + name of agent + " : ADDING PIECE " + item of item_ + " & UPDATED INVENTORY " + addPieceToToy(item_)
      					 * 					                        #UsedToyParts of agent = UsedToyParts + 1 
      					 * 					                        activate AddPieceBehavior
      					 * 					                        break
      					 * 					
      					 * 					            # If there are no piece that can be added to currentToy, ask for piece          
      					 * 				                else do
      					 * 	
      					 * 	                                currentTask of agent = "WaitingForPiece"
      					 * 
      					 * 	                                # If inventory isn't full, request ToyParts to Supplier                            
      					 * 	                                if (hasAnyItems(myInventory of agent) < 3) do
      					 * 	                                
      					 * 	                                     # If Worker isn't waiting for the Supplier request another ToyPart
      					 * 	                                     if (waiting_Supplier of agent = false) do
      					 * 	                                        log "- WORKER " + name of agent + " : REQUEST SENT TO SUPPLIER ... Toy Status : " + currentToy of agent
      					 * 	                                        activate AskForNewToyParts_toSupplier
      					 * 	                                        
      					 *                                          # Else if request already sent ask other Workers
      					 * 	                                     else do
      					 * 	                                     
      					 * 	                                        # Ask for Help only if worker isn't waiting for Coworkers replies
      					 * 	                                        if hasAnyFriendWorkers and (waiting_CoWorkers of agent = false) do
      					 * 		                                        log "- WORKER " + name of agent + " : Asking for other workers help"
      					 * 		                                        send message request askForHelp(currentToy of agent) to nearbyWorkers of agent
      					 * 		                                        numberOfWorkerRequest of agent = numberOfWorkerRequest + 1
      					 * 		                                        activate listenReplyOfCoworkers
      					 * 		                                        waiting_CoWorkers of agent = true
      					 * 		                            
      					 * 		                            # If inventory is full ask for help of Workers
      					 * 	                                else do
      					 * 	                                
      					 * 	                                    # Ask for Help only if worker isn't waiting for Coworkers replies
      					 * 	                                    if hasAnyFriendWorkers and (waiting_CoWorkers of agent = false) do
      					 * 	                                        log "- WORKER " + name of agent + " : Asking for other workers help"
      					 * 	                                        send message request askForHelp(currentToy of agent) to nearbyWorkers of agent
      					 * 	                                        numberOfWorkerRequest of agent = numberOfWorkerRequest + 1
      					 * 	                                        activate listenReplyOfCoworkers
      					 * 	                                        waiting_CoWorkers of agent = true
      					 * 	                                
      					 * 		                    
      					 * 		                    # If Worker has no ToyParts in inventory
      					 * 				            else do
      					 * 				            
      					 * 				                currentTask of agent = "WaitingForPiece"
      					 * 				                
      					 * 				                # If Worker isn't waiting for the Supplier request another ToyPart
      					 * 				                if (waiting_Supplier of agent = false) do
      					 * 		                           log "- WORKER " + name of agent + " : REQUEST SENT TO SUPPLIER ... Toy Status : " + currentToy of agent 
      					 * 		                           activate AskForNewToyParts_toSupplier after "PT5S" as duration
      					 * 		                           
      					 * 	                            # Otherwise ask for help only if worker isn't waiting for Coworkers replies
      					 * 	                            else do
      					 * 	                            
      					 * 	                                if hasAnyFriendWorkers and (waiting_CoWorkers of agent = false) do 
      					 * 		                                log "- WORKER " + name of agent + " : Asking for other workers help"
      					 * 		                                send message request askForHelp(currentToy of agent) to nearbyWorkers of agent
      					 * 		                                numberOfWorkerRequest of agent = numberOfWorkerRequest + 1
      					 * 		                                activate listenReplyOfCoworkers
      					 * 		                                waiting_CoWorkers of agent = true
      					 */
      					
      					if((!java.util.Objects.equals(AddPieceBehavior.this._agentEnv.getAgent().hasAnyItems(_agentEnv.getAgent().toEnv() ,AddPieceBehavior.this.getJadescriptAgent().getMyInventory()), 0))) {
      						/* 
      						 * Compiled from source statement from line 425 to line 467
      						 * if (anyCompatiblePiece(myInventory of agent, currentToy of agent)) do 
      						 * 				                    
      						 * 				                    for item_ in myInventory do
      						 * 					                    if (canAddPiece(item_, currentToy of agent)) do
      						 * 					                        log "- WORKER " + name of agent + " : ADDING PIECE " + item of item_ + " & UPDATED INVENTORY " + addPieceToToy(item_)
      						 * 					                        #UsedToyParts of agent = UsedToyParts + 1 
      						 * 					                        activate AddPieceBehavior
      						 * 					                        break
      						 * 					
      						 * 					            # If there are no piece that can be added to currentToy, ask for piece          
      						 * 				                else do
      						 * 	
      						 * 	                                currentTask of agent = "WaitingForPiece"
      						 * 
      						 * 	                                # If inventory isn't full, request ToyParts to Supplier                            
      						 * 	                                if (hasAnyItems(myInventory of agent) < 3) do
      						 * 	                                
      						 * 	                                     # If Worker isn't waiting for the Supplier request another ToyPart
      						 * 	                                     if (waiting_Supplier of agent = false) do
      						 * 	                                        log "- WORKER " + name of agent + " : REQUEST SENT TO SUPPLIER ... Toy Status : " + currentToy of agent
      						 * 	                                        activate AskForNewToyParts_toSupplier
      						 * 	                                        
      						 *                                          # Else if request already sent ask other Workers
      						 * 	                                     else do
      						 * 	                                     
      						 * 	                                        # Ask for Help only if worker isn't waiting for Coworkers replies
      						 * 	                                        if hasAnyFriendWorkers and (waiting_CoWorkers of agent = false) do
      						 * 		                                        log "- WORKER " + name of agent + " : Asking for other workers help"
      						 * 		                                        send message request askForHelp(currentToy of agent) to nearbyWorkers of agent
      						 * 		                                        numberOfWorkerRequest of agent = numberOfWorkerRequest + 1
      						 * 		                                        activate listenReplyOfCoworkers
      						 * 		                                        waiting_CoWorkers of agent = true
      						 * 		                            
      						 * 		                            # If inventory is full ask for help of Workers
      						 * 	                                else do
      						 * 	                                
      						 * 	                                    # Ask for Help only if worker isn't waiting for Coworkers replies
      						 * 	                                    if hasAnyFriendWorkers and (waiting_CoWorkers of agent = false) do
      						 * 	                                        log "- WORKER " + name of agent + " : Asking for other workers help"
      						 * 	                                        send message request askForHelp(currentToy of agent) to nearbyWorkers of agent
      						 * 	                                        numberOfWorkerRequest of agent = numberOfWorkerRequest + 1
      						 * 	                                        activate listenReplyOfCoworkers
      						 * 	                                        waiting_CoWorkers of agent = true
      						 */
      						
      						if((AddPieceBehavior.this._agentEnv.getAgent().anyCompatiblePiece(_agentEnv.getAgent().toEnv() ,AddPieceBehavior.this.getJadescriptAgent().getMyInventory() ,AddPieceBehavior.this.getJadescriptAgent().getCurrentToy()))) {
      							/* 
      							 * Compiled from source statement from line 427 to line 432
      							 * for item_ in myInventory do
      							 * 					                    if (canAddPiece(item_, currentToy of agent)) do
      							 * 					                        log "- WORKER " + name of agent + " : ADDING PIECE " + item of item_ + " & UPDATED INVENTORY " + addPieceToToy(item_)
      							 * 					                        #UsedToyParts of agent = UsedToyParts + 1 
      							 * 					                        activate AddPieceBehavior
      							 * 					                        break
      							 */
      							
      							for ( ToyParts item_ : AddPieceBehavior.this._agentEnv.getAgent().getMyInventory()) {
      								/* 
      								 * Compiled from source statement from line 428 to line 432
      								 * if (canAddPiece(item_, currentToy of agent)) do
      								 * 					                        log "- WORKER " + name of agent + " : ADDING PIECE " + item of item_ + " & UPDATED INVENTORY " + addPieceToToy(item_)
      								 * 					                        #UsedToyParts of agent = UsedToyParts + 1 
      								 * 					                        activate AddPieceBehavior
      								 * 					                        break
      								 */
      								
      								if((AddPieceBehavior.this._agentEnv.getAgent().canAddPiece(_agentEnv.getAgent().toEnv() ,item_ ,AddPieceBehavior.this.getJadescriptAgent().getCurrentToy()))) {
      									/* 
      									 * Compiled from source statement at line 429
      									 * log "- WORKER " + name of agent + " : ADDING PIECE " + item of item_ + " & UPDATED INVENTORY " + addPieceToToy(item_)
      									 */
      									
      									jadescript.core.Agent.doLog(jade.util.Logger.INFO, AddPieceBehavior.this.getClass().getName(), AddPieceBehavior.this, "on execute", java.lang.String.valueOf(java.lang.String.valueOf(java.lang.String.valueOf(java.lang.String.valueOf(java.lang.String.valueOf(java.lang.String.valueOf("- WORKER ") + java.lang.String.valueOf(AddPieceBehavior.this.getJadescriptAgent().getName())) + java.lang.String.valueOf(" : ADDING PIECE ")) + java.lang.String.valueOf(item_.getItem())) + java.lang.String.valueOf(" & UPDATED INVENTORY ")) + java.lang.String.valueOf(AddPieceBehavior.this._agentEnv.getAgent().addPieceToToy(_agentEnv.getAgent().toEnv() ,item_))));
      									
      									/* 
      									 * Compiled from source statement at line 431
      									 * activate AddPieceBehavior
      									 */
      									
      									new AddPieceBehavior(_agentEnv.getAgent().toEnv()).activate(_agentEnv.getAgent());
      									
      									/* 
      									 * Compiled from source statement at line 432
      									 * break
      									 */
      									
      									break;
      								}
      							}
      						}
      						else {
      							/* 
      							 * Compiled from source statement at line 437
      							 * currentTask of agent = "WaitingForPiece"
      							 */
      							
      							AddPieceBehavior.this.getJadescriptAgent().setCurrentTask("WaitingForPiece");
      							
      							/* 
      							 * Compiled from source statement from line 440 to line 467
      							 * if (hasAnyItems(myInventory of agent) < 3) do
      							 * 	                                
      							 * 	                                     # If Worker isn't waiting for the Supplier request another ToyPart
      							 * 	                                     if (waiting_Supplier of agent = false) do
      							 * 	                                        log "- WORKER " + name of agent + " : REQUEST SENT TO SUPPLIER ... Toy Status : " + currentToy of agent
      							 * 	                                        activate AskForNewToyParts_toSupplier
      							 * 	                                        
      							 *                                          # Else if request already sent ask other Workers
      							 * 	                                     else do
      							 * 	                                     
      							 * 	                                        # Ask for Help only if worker isn't waiting for Coworkers replies
      							 * 	                                        if hasAnyFriendWorkers and (waiting_CoWorkers of agent = false) do
      							 * 		                                        log "- WORKER " + name of agent + " : Asking for other workers help"
      							 * 		                                        send message request askForHelp(currentToy of agent) to nearbyWorkers of agent
      							 * 		                                        numberOfWorkerRequest of agent = numberOfWorkerRequest + 1
      							 * 		                                        activate listenReplyOfCoworkers
      							 * 		                                        waiting_CoWorkers of agent = true
      							 * 		                            
      							 * 		                            # If inventory is full ask for help of Workers
      							 * 	                                else do
      							 * 	                                
      							 * 	                                    # Ask for Help only if worker isn't waiting for Coworkers replies
      							 * 	                                    if hasAnyFriendWorkers and (waiting_CoWorkers of agent = false) do
      							 * 	                                        log "- WORKER " + name of agent + " : Asking for other workers help"
      							 * 	                                        send message request askForHelp(currentToy of agent) to nearbyWorkers of agent
      							 * 	                                        numberOfWorkerRequest of agent = numberOfWorkerRequest + 1
      							 * 	                                        activate listenReplyOfCoworkers
      							 * 	                                        waiting_CoWorkers of agent = true
      							 */
      							
      							if((AddPieceBehavior.this._agentEnv.getAgent().hasAnyItems(_agentEnv.getAgent().toEnv() ,AddPieceBehavior.this.getJadescriptAgent().getMyInventory()) < 3)) {
      								/* 
      								 * Compiled from source statement from line 443 to line 456
      								 * if (waiting_Supplier of agent = false) do
      								 * 	                                        log "- WORKER " + name of agent + " : REQUEST SENT TO SUPPLIER ... Toy Status : " + currentToy of agent
      								 * 	                                        activate AskForNewToyParts_toSupplier
      								 * 	                                        
      								 *                                          # Else if request already sent ask other Workers
      								 * 	                                     else do
      								 * 	                                     
      								 * 	                                        # Ask for Help only if worker isn't waiting for Coworkers replies
      								 * 	                                        if hasAnyFriendWorkers and (waiting_CoWorkers of agent = false) do
      								 * 		                                        log "- WORKER " + name of agent + " : Asking for other workers help"
      								 * 		                                        send message request askForHelp(currentToy of agent) to nearbyWorkers of agent
      								 * 		                                        numberOfWorkerRequest of agent = numberOfWorkerRequest + 1
      								 * 		                                        activate listenReplyOfCoworkers
      								 * 		                                        waiting_CoWorkers of agent = true
      								 */
      								
      								if((java.util.Objects.equals(AddPieceBehavior.this.getJadescriptAgent().getWaiting_Supplier(), false))) {
      									/* 
      									 * Compiled from source statement at line 444
      									 * log "- WORKER " + name of agent + " : REQUEST SENT TO SUPPLIER ... Toy Status : " + currentToy of agent
      									 */
      									
      									jadescript.core.Agent.doLog(jade.util.Logger.INFO, AddPieceBehavior.this.getClass().getName(), AddPieceBehavior.this, "on execute", java.lang.String.valueOf(java.lang.String.valueOf(java.lang.String.valueOf(java.lang.String.valueOf("- WORKER ") + java.lang.String.valueOf(AddPieceBehavior.this.getJadescriptAgent().getName())) + java.lang.String.valueOf(" : REQUEST SENT TO SUPPLIER ... Toy Status : ")) + java.lang.String.valueOf(AddPieceBehavior.this.getJadescriptAgent().getCurrentToy())));
      									
      									/* 
      									 * Compiled from source statement at line 445
      									 * activate AskForNewToyParts_toSupplier
      									 */
      									
      									new AskForNewToyParts_toSupplier(_agentEnv.getAgent().toEnv()).activate(_agentEnv.getAgent());
      								}
      								else {
      									/* 
      									 * Compiled from source statement from line 451 to line 456
      									 * if hasAnyFriendWorkers and (waiting_CoWorkers of agent = false) do
      									 * 		                                        log "- WORKER " + name of agent + " : Asking for other workers help"
      									 * 		                                        send message request askForHelp(currentToy of agent) to nearbyWorkers of agent
      									 * 		                                        numberOfWorkerRequest of agent = numberOfWorkerRequest + 1
      									 * 		                                        activate listenReplyOfCoworkers
      									 * 		                                        waiting_CoWorkers of agent = true
      									 */
      									
      									if(AddPieceBehavior.this._agentEnv.getAgent().getHasAnyFriendWorkers() && (java.util.Objects.equals(AddPieceBehavior.this.getJadescriptAgent().getWaiting_CoWorkers(), false))) {
      										/* 
      										 * Compiled from source statement at line 452
      										 * log "- WORKER " + name of agent + " : Asking for other workers help"
      										 */
      										
      										jadescript.core.Agent.doLog(jade.util.Logger.INFO, AddPieceBehavior.this.getClass().getName(), AddPieceBehavior.this, "on execute", java.lang.String.valueOf(java.lang.String.valueOf(java.lang.String.valueOf("- WORKER ") + java.lang.String.valueOf(AddPieceBehavior.this.getJadescriptAgent().getName())) + java.lang.String.valueOf(" : Asking for other workers help")));
      										
      										/* 
      										 * Compiled from source statement at line 453
      										 * send message request askForHelp(currentToy of agent) to nearbyWorkers of agent
      										 */
      										
      										try {
      											jadescript.util.SendMessageUtils.validatePerformative("request");
      											
      											java.lang.Object _contentToBeSent1995766982 = WorkOntology.askForHelp(AddPieceBehavior.this.getJadescriptAgent().getCurrentToy());
      											
      											jadescript.core.message.Message _synthesizedMessage1995766982 = new jadescript.core.message.Message(jadescript.core.message.Message.REQUEST);
      											
      											_synthesizedMessage1995766982.setOntology(jadescript.util.SendMessageUtils.getDeclaringOntology(_contentToBeSent1995766982,WorkOntology.getInstance(),jadescript.content.onto.Ontology.getInstance()).getName());;
      											
      											_synthesizedMessage1995766982.setLanguage(__codec.getName());;
      											
      											jadescript.util.JadescriptList<jade.core.AID> __receiversList1 = AddPieceBehavior.this.getJadescriptAgent().getNearbyWorkers();
      											
      											for ( jade.core.AID __receiver : __receiversList1) {
      												_synthesizedMessage1995766982.addReceiver(__receiver);
      											}
      											
      											_agentEnv.getAgent().getContentManager().fillContent(_synthesizedMessage1995766982, jadescript.content.onto.MessageContent.prepareContent((jade.content.ContentElement) _contentToBeSent1995766982, "request"));
      											
      											_agentEnv.getAgent().send(_synthesizedMessage1995766982);
      										}
      										catch(java.lang.Throwable _t) {
      											throw jadescript.core.exception.JadescriptException.wrap(_t);
      										}
      										
      										/* 
      										 * Compiled from source statement at line 454
      										 * numberOfWorkerRequest of agent = numberOfWorkerRequest + 1
      										 */
      										
      										AddPieceBehavior.this.getJadescriptAgent().setNumberOfWorkerRequest(AddPieceBehavior.this._agentEnv.getAgent().getNumberOfWorkerRequest() + 1);
      										
      										/* 
      										 * Compiled from source statement at line 455
      										 * activate listenReplyOfCoworkers
      										 */
      										
      										new listenReplyOfCoworkers(_agentEnv.getAgent().toEnv()).activate(_agentEnv.getAgent());
      										
      										/* 
      										 * Compiled from source statement at line 456
      										 * waiting_CoWorkers of agent = true
      										 */
      										
      										AddPieceBehavior.this.getJadescriptAgent().setWaiting_CoWorkers(true);
      									}
      								}
      							}
      							else {
      								/* 
      								 * Compiled from source statement from line 462 to line 467
      								 * if hasAnyFriendWorkers and (waiting_CoWorkers of agent = false) do
      								 * 	                                        log "- WORKER " + name of agent + " : Asking for other workers help"
      								 * 	                                        send message request askForHelp(currentToy of agent) to nearbyWorkers of agent
      								 * 	                                        numberOfWorkerRequest of agent = numberOfWorkerRequest + 1
      								 * 	                                        activate listenReplyOfCoworkers
      								 * 	                                        waiting_CoWorkers of agent = true
      								 */
      								
      								if(AddPieceBehavior.this._agentEnv.getAgent().getHasAnyFriendWorkers() && (java.util.Objects.equals(AddPieceBehavior.this.getJadescriptAgent().getWaiting_CoWorkers(), false))) {
      									/* 
      									 * Compiled from source statement at line 463
      									 * log "- WORKER " + name of agent + " : Asking for other workers help"
      									 */
      									
      									jadescript.core.Agent.doLog(jade.util.Logger.INFO, AddPieceBehavior.this.getClass().getName(), AddPieceBehavior.this, "on execute", java.lang.String.valueOf(java.lang.String.valueOf(java.lang.String.valueOf("- WORKER ") + java.lang.String.valueOf(AddPieceBehavior.this.getJadescriptAgent().getName())) + java.lang.String.valueOf(" : Asking for other workers help")));
      									
      									/* 
      									 * Compiled from source statement at line 464
      									 * send message request askForHelp(currentToy of agent) to nearbyWorkers of agent
      									 */
      									
      									try {
      										jadescript.util.SendMessageUtils.validatePerformative("request");
      										
      										java.lang.Object _contentToBeSent1213408551 = WorkOntology.askForHelp(AddPieceBehavior.this.getJadescriptAgent().getCurrentToy());
      										
      										jadescript.core.message.Message _synthesizedMessage1213408551 = new jadescript.core.message.Message(jadescript.core.message.Message.REQUEST);
      										
      										_synthesizedMessage1213408551.setOntology(jadescript.util.SendMessageUtils.getDeclaringOntology(_contentToBeSent1213408551,WorkOntology.getInstance(),jadescript.content.onto.Ontology.getInstance()).getName());;
      										
      										_synthesizedMessage1213408551.setLanguage(__codec.getName());;
      										
      										jadescript.util.JadescriptList<jade.core.AID> __receiversList1 = AddPieceBehavior.this.getJadescriptAgent().getNearbyWorkers();
      										
      										for ( jade.core.AID __receiver : __receiversList1) {
      											_synthesizedMessage1213408551.addReceiver(__receiver);
      										}
      										
      										_agentEnv.getAgent().getContentManager().fillContent(_synthesizedMessage1213408551, jadescript.content.onto.MessageContent.prepareContent((jade.content.ContentElement) _contentToBeSent1213408551, "request"));
      										
      										_agentEnv.getAgent().send(_synthesizedMessage1213408551);
      									}
      									catch(java.lang.Throwable _t) {
      										throw jadescript.core.exception.JadescriptException.wrap(_t);
      									}
      									
      									/* 
      									 * Compiled from source statement at line 465
      									 * numberOfWorkerRequest of agent = numberOfWorkerRequest + 1
      									 */
      									
      									AddPieceBehavior.this.getJadescriptAgent().setNumberOfWorkerRequest(AddPieceBehavior.this._agentEnv.getAgent().getNumberOfWorkerRequest() + 1);
      									
      									/* 
      									 * Compiled from source statement at line 466
      									 * activate listenReplyOfCoworkers
      									 */
      									
      									new listenReplyOfCoworkers(_agentEnv.getAgent().toEnv()).activate(_agentEnv.getAgent());
      									
      									/* 
      									 * Compiled from source statement at line 467
      									 * waiting_CoWorkers of agent = true
      									 */
      									
      									AddPieceBehavior.this.getJadescriptAgent().setWaiting_CoWorkers(true);
      								}
      							}
      						}
      					}
      					else {
      						/* 
      						 * Compiled from source statement at line 473
      						 * currentTask of agent = "WaitingForPiece"
      						 */
      						
      						AddPieceBehavior.this.getJadescriptAgent().setCurrentTask("WaitingForPiece");
      						
      						/* 
      						 * Compiled from source statement from line 476 to line 488
      						 * if (waiting_Supplier of agent = false) do
      						 * 		                           log "- WORKER " + name of agent + " : REQUEST SENT TO SUPPLIER ... Toy Status : " + currentToy of agent 
      						 * 		                           activate AskForNewToyParts_toSupplier after "PT5S" as duration
      						 * 		                           
      						 * 	                            # Otherwise ask for help only if worker isn't waiting for Coworkers replies
      						 * 	                            else do
      						 * 	                            
      						 * 	                                if hasAnyFriendWorkers and (waiting_CoWorkers of agent = false) do 
      						 * 		                                log "- WORKER " + name of agent + " : Asking for other workers help"
      						 * 		                                send message request askForHelp(currentToy of agent) to nearbyWorkers of agent
      						 * 		                                numberOfWorkerRequest of agent = numberOfWorkerRequest + 1
      						 * 		                                activate listenReplyOfCoworkers
      						 * 		                                waiting_CoWorkers of agent = true
      						 */
      						
      						if((java.util.Objects.equals(AddPieceBehavior.this.getJadescriptAgent().getWaiting_Supplier(), false))) {
      							/* 
      							 * Compiled from source statement at line 477
      							 * log "- WORKER " + name of agent + " : REQUEST SENT TO SUPPLIER ... Toy Status : " + currentToy of agent
      							 */
      							
      							jadescript.core.Agent.doLog(jade.util.Logger.INFO, AddPieceBehavior.this.getClass().getName(), AddPieceBehavior.this, "on execute", java.lang.String.valueOf(java.lang.String.valueOf(java.lang.String.valueOf(java.lang.String.valueOf("- WORKER ") + java.lang.String.valueOf(AddPieceBehavior.this.getJadescriptAgent().getName())) + java.lang.String.valueOf(" : REQUEST SENT TO SUPPLIER ... Toy Status : ")) + java.lang.String.valueOf(AddPieceBehavior.this.getJadescriptAgent().getCurrentToy())));
      							
      							/* 
      							 * Compiled from source statement at line 478
      							 * activate AskForNewToyParts_toSupplier after "PT5S" as duration
      							 */
      							
      							new AskForNewToyParts_toSupplier(_agentEnv.getAgent().toEnv()).activate_after(_agentEnv.getAgent(), ((jadescript.lang.Duration) jadescript.util.types.Converter.convert("PT5S", new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.TEXT), new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.DURATION))));
      						}
      						else {
      							/* 
      							 * Compiled from source statement from line 483 to line 488
      							 * if hasAnyFriendWorkers and (waiting_CoWorkers of agent = false) do 
      							 * 		                                log "- WORKER " + name of agent + " : Asking for other workers help"
      							 * 		                                send message request askForHelp(currentToy of agent) to nearbyWorkers of agent
      							 * 		                                numberOfWorkerRequest of agent = numberOfWorkerRequest + 1
      							 * 		                                activate listenReplyOfCoworkers
      							 * 		                                waiting_CoWorkers of agent = true
      							 */
      							
      							if(AddPieceBehavior.this._agentEnv.getAgent().getHasAnyFriendWorkers() && (java.util.Objects.equals(AddPieceBehavior.this.getJadescriptAgent().getWaiting_CoWorkers(), false))) {
      								/* 
      								 * Compiled from source statement at line 484
      								 * log "- WORKER " + name of agent + " : Asking for other workers help"
      								 */
      								
      								jadescript.core.Agent.doLog(jade.util.Logger.INFO, AddPieceBehavior.this.getClass().getName(), AddPieceBehavior.this, "on execute", java.lang.String.valueOf(java.lang.String.valueOf(java.lang.String.valueOf("- WORKER ") + java.lang.String.valueOf(AddPieceBehavior.this.getJadescriptAgent().getName())) + java.lang.String.valueOf(" : Asking for other workers help")));
      								
      								/* 
      								 * Compiled from source statement at line 485
      								 * send message request askForHelp(currentToy of agent) to nearbyWorkers of agent
      								 */
      								
      								try {
      									jadescript.util.SendMessageUtils.validatePerformative("request");
      									
      									java.lang.Object _contentToBeSent2014357455 = WorkOntology.askForHelp(AddPieceBehavior.this.getJadescriptAgent().getCurrentToy());
      									
      									jadescript.core.message.Message _synthesizedMessage2014357455 = new jadescript.core.message.Message(jadescript.core.message.Message.REQUEST);
      									
      									_synthesizedMessage2014357455.setOntology(jadescript.util.SendMessageUtils.getDeclaringOntology(_contentToBeSent2014357455,WorkOntology.getInstance(),jadescript.content.onto.Ontology.getInstance()).getName());;
      									
      									_synthesizedMessage2014357455.setLanguage(__codec.getName());;
      									
      									jadescript.util.JadescriptList<jade.core.AID> __receiversList1 = AddPieceBehavior.this.getJadescriptAgent().getNearbyWorkers();
      									
      									for ( jade.core.AID __receiver : __receiversList1) {
      										_synthesizedMessage2014357455.addReceiver(__receiver);
      									}
      									
      									_agentEnv.getAgent().getContentManager().fillContent(_synthesizedMessage2014357455, jadescript.content.onto.MessageContent.prepareContent((jade.content.ContentElement) _contentToBeSent2014357455, "request"));
      									
      									_agentEnv.getAgent().send(_synthesizedMessage2014357455);
      								}
      								catch(java.lang.Throwable _t) {
      									throw jadescript.core.exception.JadescriptException.wrap(_t);
      								}
      								
      								/* 
      								 * Compiled from source statement at line 486
      								 * numberOfWorkerRequest of agent = numberOfWorkerRequest + 1
      								 */
      								
      								AddPieceBehavior.this.getJadescriptAgent().setNumberOfWorkerRequest(AddPieceBehavior.this._agentEnv.getAgent().getNumberOfWorkerRequest() + 1);
      								
      								/* 
      								 * Compiled from source statement at line 487
      								 * activate listenReplyOfCoworkers
      								 */
      								
      								new listenReplyOfCoworkers(_agentEnv.getAgent().toEnv()).activate(_agentEnv.getAgent());
      								
      								/* 
      								 * Compiled from source statement at line 488
      								 * waiting_CoWorkers of agent = true
      								 */
      								
      								AddPieceBehavior.this.getJadescriptAgent().setWaiting_CoWorkers(true);
      							}
      						}
      					}
      				}
      				else {
      					/* 
      					 * Compiled from source statement at line 492
      					 * log "- WORKER " + name of agent + " : WAITING.."
      					 */
      					
      					jadescript.core.Agent.doLog(jade.util.Logger.INFO, AddPieceBehavior.this.getClass().getName(), AddPieceBehavior.this, "on execute", java.lang.String.valueOf(java.lang.String.valueOf(java.lang.String.valueOf("- WORKER ") + java.lang.String.valueOf(AddPieceBehavior.this.getJadescriptAgent().getName())) + java.lang.String.valueOf(" : WAITING..")));
      				}
      			}
      		}
      		else {
      			/* 
      			 * Compiled from source statement at line 496
      			 * log "- WORKER " + name of agent + " : NO TOY ... AVAILABLE FOR COMUNICATION"
      			 */
      			
      			jadescript.core.Agent.doLog(jade.util.Logger.INFO, AddPieceBehavior.this.getClass().getName(), AddPieceBehavior.this, "on execute", java.lang.String.valueOf(java.lang.String.valueOf(java.lang.String.valueOf("- WORKER ") + java.lang.String.valueOf(AddPieceBehavior.this.getJadescriptAgent().getName())) + java.lang.String.valueOf(" : NO TOY ... AVAILABLE FOR COMUNICATION")));
      			
      			/* 
      			 * Compiled from source statement from line 499 to line 501
      			 * if WorkerManager do
      			 * 			          send message request askToy(aid) to Supervisor of agent        
      			 * 		                
      			 */
      			
      			if(AddPieceBehavior.this._agentEnv.getAgent().getWorkerManager()) {
      				/* 
      				 * Compiled from source statement at line 500
      				 * send message request askToy(aid) to Supervisor of agent
      				 */
      				
      				try {
      					jadescript.util.SendMessageUtils.validatePerformative("request");
      					
      					java.lang.Object _contentToBeSent519953421 = WorkOntology.askToy(AddPieceBehavior.this._agentEnv.getAgent().getAID());
      					
      					jadescript.core.message.Message _synthesizedMessage519953421 = new jadescript.core.message.Message(jadescript.core.message.Message.REQUEST);
      					
      					_synthesizedMessage519953421.setOntology(jadescript.util.SendMessageUtils.getDeclaringOntology(_contentToBeSent519953421,WorkOntology.getInstance(),jadescript.content.onto.Ontology.getInstance()).getName());;
      					
      					_synthesizedMessage519953421.setLanguage(__codec.getName());;
      					
      					_synthesizedMessage519953421.addReceiver(AddPieceBehavior.this.getJadescriptAgent().getSupervisor());
      					
      					_agentEnv.getAgent().getContentManager().fillContent(_synthesizedMessage519953421, jadescript.content.onto.MessageContent.prepareContent((jade.content.ContentElement) _contentToBeSent519953421, "request"));
      					
      					_agentEnv.getAgent().send(_synthesizedMessage519953421);
      				}
      				catch(java.lang.Throwable _t) {
      					throw jadescript.core.exception.JadescriptException.wrap(_t);
      				}
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
    }
  }

  private AddPieceBehavior.__Event0 __event0 =  new AddPieceBehavior.__Event0();

  private ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__DEFAULT_THROWER;

  public void __handleJadescriptException(final JadescriptException __exc) {
    jadescript.core.exception.ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__getExceptionEscalator(AddPieceBehavior.this);
    boolean __handled = false;
    if(!__handled) {
    	__thrower.__throwJadescriptException(__exc);
    }
  }

  private void __initializeProperties() {
    // Initializing properties and event handlers:
    {
    }
  }
}
