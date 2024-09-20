import jade.content.ContentManager;
import jade.content.lang.Codec;
import jade.core.AID;
import jadescript.content.onto.Ontology;
import jadescript.core.behaviours.CyclicBehaviour;
import jadescript.core.exception.ExceptionThrower;
import jadescript.core.exception.JadescriptException;
import jadescript.java.AgentEnv;
import jadescript.java.SideEffectsFlag;

@SuppressWarnings("all")
public class processWorkingReports extends CyclicBehaviour<Supervisor> {
  private Supervisor __theAgent = (Supervisor)/*Used as metadata*/null;

  private AgentEnv<Supervisor, SideEffectsFlag.AnySideEffectFlag> _agentEnv = null;

  public processWorkingReports(final AgentEnv<? extends Supervisor, ? extends SideEffectsFlag.WithSideEffects> _agentEnv) {
    super(_agentEnv);
    __initializeAgentEnv();
    __initializeProperties();
  }

  public static processWorkingReports __createEmpty(final AgentEnv<? extends Supervisor, ? extends SideEffectsFlag.WithSideEffects> _agentEnv) {
    return new processWorkingReports(_agentEnv);
  }

  private Boolean __ignoreMessageHandlers = false;

  public void doAction(final int _tickCount) {
    this.__ignoreMessageHandlers = false;
    super.doAction(_tickCount);
    __event13.run();
    if(!this.__ignoreMessageHandlers) {
    	this.__noMessageHandled();
    }
    if ( true  && !__event13.__eventFired) __awaitForEvents();
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

  protected Integer n_worker = null;

  public void setN_worker(final Integer n_worker) {
    this.n_worker = n_worker;
  }

  public Integer getN_worker() {
    return this.n_worker;
  }

  protected Integer total_sum_help = null;

  public void setTotal_sum_help(final Integer total_sum_help) {
    this.total_sum_help = total_sum_help;
  }

  public Integer getTotal_sum_help() {
    return this.total_sum_help;
  }

  protected Integer total_sum_unused = null;

  public void setTotal_sum_unused(final Integer total_sum_unused) {
    this.total_sum_unused = total_sum_unused;
  }

  public Integer getTotal_sum_unused() {
    return this.total_sum_unused;
  }

  protected Integer total_requests = null;

  public void setTotal_requests(final Integer total_requests) {
    this.total_requests = total_requests;
  }

  public Integer getTotal_requests() {
    return this.total_requests;
  }

  protected Integer total_passed_parts = null;

  public void setTotal_passed_parts(final Integer total_passed_parts) {
    this.total_passed_parts = total_passed_parts;
  }

  public Integer getTotal_passed_parts() {
    return this.total_passed_parts;
  }

  protected Integer total_passed_toy = null;

  public void setTotal_passed_toy(final Integer total_passed_toy) {
    this.total_passed_toy = total_passed_toy;
  }

  public Integer getTotal_passed_toy() {
    return this.total_passed_toy;
  }

  protected Integer finished = null;

  public void setFinished(final Integer finished) {
    this.finished = finished;
  }

  public Integer getFinished() {
    return this.finished;
  }

  protected Integer maxDeliveredToys = null;

  public void setMaxDeliveredToys(final Integer maxDeliveredToys) {
    this.maxDeliveredToys = maxDeliveredToys;
  }

  public Integer getMaxDeliveredToys() {
    return this.maxDeliveredToys;
  }

  protected AID maxDeliveredToys_worker = null;

  public void setMaxDeliveredToys_worker(final AID maxDeliveredToys_worker) {
    this.maxDeliveredToys_worker = maxDeliveredToys_worker;
  }

  public AID getMaxDeliveredToys_worker() {
    return this.maxDeliveredToys_worker;
  }

  protected Integer maxHelpedWorkers = null;

  public void setMaxHelpedWorkers(final Integer maxHelpedWorkers) {
    this.maxHelpedWorkers = maxHelpedWorkers;
  }

  public Integer getMaxHelpedWorkers() {
    return this.maxHelpedWorkers;
  }

  protected AID maxHelpedToWorkers_worker = null;

  public void setMaxHelpedToWorkers_worker(final AID maxHelpedToWorkers_worker) {
    this.maxHelpedToWorkers_worker = maxHelpedToWorkers_worker;
  }

  public AID getMaxHelpedToWorkers_worker() {
    return this.maxHelpedToWorkers_worker;
  }

  protected Integer maxRequestWorkers = null;

  public void setMaxRequestWorkers(final Integer maxRequestWorkers) {
    this.maxRequestWorkers = maxRequestWorkers;
  }

  public Integer getMaxRequestWorkers() {
    return this.maxRequestWorkers;
  }

  protected AID maxRequestToWorkers_worker = null;

  public void setMaxRequestToWorkers_worker(final AID maxRequestToWorkers_worker) {
    this.maxRequestToWorkers_worker = maxRequestToWorkers_worker;
  }

  public AID getMaxRequestToWorkers_worker() {
    return this.maxRequestToWorkers_worker;
  }

  private class __Event13 {
    Boolean __eventFired = false;

    public void run() {
      if(processWorkingReports.this.__ignoreMessageHandlers) {
      	this.__eventFired = false;
      	
      	return ;
      }
       class __PatternMatcher841312597 {
      	public java.lang.Integer numberOfWorkerRequest;
      	
      	public java.lang.Integer UnUsedToyParts;
      	
      	public java.lang.Integer numberOfSupplierRequest;
      	
      	public java.lang.Integer numberOfFinishedToys;
      	
      	public java.lang.Integer numberOfPartsPassed;
      	
      	public java.lang.Integer numberOfToyPassed;
      	
      	public jade.core.AID workerID;
      	
      	private final __PatternMatcher841312597 __PatternMatcher841312597_obj =  this;
      	
      	public boolean headerMatch_structterm0(java.lang.Object __objx) {
      		java.lang.Integer __x;
      		
      		try {
      			if(__objx instanceof java.lang.Integer) {
      				__x = (java.lang.Integer) __objx;
      			}
      			else {
      				return false;
      			}
      		}
      		catch(java.lang.ClassCastException ignored) {
      			return false;
      		}
      		
      		numberOfWorkerRequest = __x;
      		
      		return true;
      	}
      	
      	public boolean headerMatch_structterm1(java.lang.Object __objx) {
      		java.lang.Integer __x;
      		
      		try {
      			if(__objx instanceof java.lang.Integer) {
      				__x = (java.lang.Integer) __objx;
      			}
      			else {
      				return false;
      			}
      		}
      		catch(java.lang.ClassCastException ignored) {
      			return false;
      		}
      		
      		UnUsedToyParts = __x;
      		
      		return true;
      	}
      	
      	public boolean headerMatch_structterm2(java.lang.Object __objx) {
      		java.lang.Integer __x;
      		
      		try {
      			if(__objx instanceof java.lang.Integer) {
      				__x = (java.lang.Integer) __objx;
      			}
      			else {
      				return false;
      			}
      		}
      		catch(java.lang.ClassCastException ignored) {
      			return false;
      		}
      		
      		numberOfSupplierRequest = __x;
      		
      		return true;
      	}
      	
      	public boolean headerMatch_structterm3(java.lang.Object __objx) {
      		java.lang.Integer __x;
      		
      		try {
      			if(__objx instanceof java.lang.Integer) {
      				__x = (java.lang.Integer) __objx;
      			}
      			else {
      				return false;
      			}
      		}
      		catch(java.lang.ClassCastException ignored) {
      			return false;
      		}
      		
      		numberOfFinishedToys = __x;
      		
      		return true;
      	}
      	
      	public boolean headerMatch_structterm4(java.lang.Object __objx) {
      		java.lang.Integer __x;
      		
      		try {
      			if(__objx instanceof java.lang.Integer) {
      				__x = (java.lang.Integer) __objx;
      			}
      			else {
      				return false;
      			}
      		}
      		catch(java.lang.ClassCastException ignored) {
      			return false;
      		}
      		
      		numberOfPartsPassed = __x;
      		
      		return true;
      	}
      	
      	public boolean headerMatch_structterm5(java.lang.Object __objx) {
      		java.lang.Integer __x;
      		
      		try {
      			if(__objx instanceof java.lang.Integer) {
      				__x = (java.lang.Integer) __objx;
      			}
      			else {
      				return false;
      			}
      		}
      		catch(java.lang.ClassCastException ignored) {
      			return false;
      		}
      		
      		numberOfToyPassed = __x;
      		
      		return true;
      	}
      	
      	public boolean headerMatch_structterm6(java.lang.Object __objx) {
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
      		
      		workerID = __x;
      		
      		return true;
      	}
      	
      	public boolean headerMatch(java.lang.Object __objx) {
      		deliverWorkingReport __x;
      		
      		try {
      			if(__objx instanceof deliverWorkingReport) {
      				__x = (deliverWorkingReport) __objx;
      			}
      			else {
      				return false;
      			}
      		}
      		catch(java.lang.ClassCastException ignored) {
      			return false;
      		}
      		
      		return true && headerMatch_structterm0(__x.getNumberOfWorkerRequest()) && headerMatch_structterm1(__x.getUnUsedToyParts()) && headerMatch_structterm2(__x.getNumberOfSupplierRequest()) && headerMatch_structterm3(__x.getNumberOfFinishedToys()) && headerMatch_structterm4(__x.getNumberOfPartsPassed()) && headerMatch_structterm5(__x.getNumberOfToyPassed()) && headerMatch_structterm6(__x.getWorkerID());
      	}
      }
      __PatternMatcher841312597 __PatternMatcher841312597_obj = new __PatternMatcher841312597();
      jade.lang.acl.MessageTemplate __mt = jade.lang.acl.MessageTemplate.and(jade.lang.acl.MessageTemplate.and(jade.lang.acl.MessageTemplate.and(new jade.lang.acl.MessageTemplate(new jadescript.lang.acl.CustomMessageTemplate(((java.util.function.Predicate<jade.lang.acl.ACLMessage>) (__ignored) -> {{
      	return true;
      }
      }))), jade.lang.acl.MessageTemplate.MatchPerformative(jadescript.core.message.Message.INFORM)), jadescript.core.nativeevent.NotNativeEventTemplate.MatchNotNative(_agentEnv.getAgent().getContentManager())), new jade.lang.acl.MessageTemplate(new jadescript.lang.acl.CustomMessageTemplate(((java.util.function.Predicate<jade.lang.acl.ACLMessage>) (__templMsg) -> {{
      	jadescript.core.message.Message __receivedMessage = jadescript.core.message.Message.wrap(__templMsg);
      	
      	try {
      		return __PatternMatcher841312597_obj.headerMatch(__receivedMessage.getContent(_agentEnv.getAgent().getContentManager()));
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
      	processWorkingReports.this.__ignoreMessageHandlers = true;
      	
      	_agentEnv.getAgent().__cleanIgnoredFlagForMessage(__receivedMessage);
      	
      	this.__eventFired = true;
      	
      	try {
      		try {
      			/* 
      			 * Compiled from source statement from line 179 to line 216
      			 * if name of agent ≠ name of "Supervisor1" as aid do
      			 *                 send message inform deliverWorkingReport(numberOfWorkerRequest, UnUsedToyParts, numberOfSupplierRequest, numberOfFinishedToys, numberOfPartsPassed, numberOfToyPassed, workerID) to CoSupervisor
      			 *             
      			 *             else do
      			 *                 log "+ SUPERVISOR: Report of " + name of workerID + " received."
      			 *                 if maxRequestWorkers < numberOfWorkerRequest do
      			 *                     maxRequestWorkers = numberOfWorkerRequest
      			 *                     maxRequestToWorkers_worker = workerID
      			 *                 
      			 *                 if maxDeliveredToys < numberOfFinishedToys do
      			 *                     maxDeliveredToys = numberOfFinishedToys
      			 *                     maxDeliveredToys_worker = workerID
      			 *                 
      			 *                 if maxHelpedWorkers < numberOfPartsPassed + numberOfToyPassed do
      			 *                     maxHelpedWorkers = numberOfPartsPassed + numberOfToyPassed
      			 *                     maxHelpedToWorkers_worker = workerID
      			 *                 
      			 * 			    total_sum_help = total_sum_help + numberOfWorkerRequest
      			 * 			    
      			 * 			    total_sum_unused = total_sum_unused + UnUsedToyParts
      			 * 			    
      			 * 			    total_requests = total_requests + numberOfSupplierRequest
      			 * 			    total_passed_parts = total_passed_parts + numberOfPartsPassed
      			 * 			    total_passed_toy = total_passed_toy + numberOfToyPassed
      			 * 			    
      			 * 			    finished = finished + numberOfFinishedToys
      			 * 
      			 * 			    n_worker = n_worker + 1
      			 * 			    if n_worker = numTotalWorker and aid of agent = "Supervisor1" as aid do 
      			 * 			         log " -------------------------------------------------------------------------------------------"
      			 * 			         log " - Total Amount Of Finished Toys : " +finished + "                    - Total Times Toys Were Passed : " + total_passed_toy
      			 * 			         log " - Total Amount Of Help Request To Workers : " +total_sum_help + "         - Total Amount Of Toy Parts Requested To Supplier : " + total_requests        
      			 * 			         log " - Total Amount Of Toy Parts Unused : " + total_sum_unused + "                - Total Amount Of Toy Parts Were Passed : " + total_passed_parts
      			 * 			         log " -------------------------------------------------------------------------------------------"
      			 * 			         log " - Worker With More Toy Finished : " +name of maxDeliveredToys_worker + "           - How Many Toys Has Finished : " +maxDeliveredToys
      			 * 			         log " - Most Helpful Worker : " +name of maxHelpedToWorkers_worker + "                     - How Many Times Has Helped : " +maxHelpedWorkers
      			 * 			         log " - Worker With More Help Requests : " +name of maxRequestToWorkers_worker + "          - How Many Requests Of Helped : " +maxRequestWorkers
      			 * 			         log " -------------------------------------------------------------------------------------------"
      			 */
      			
      			if(!java.util.Objects.equals(processWorkingReports.this.getJadescriptAgent().getName(), ((jade.core.AID) jadescript.util.types.Converter.convert("Supervisor1", new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.TEXT), new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.AID))).getName())) {
      				/* 
      				 * Compiled from source statement at line 180
      				 * send message inform deliverWorkingReport(numberOfWorkerRequest, UnUsedToyParts, numberOfSupplierRequest, numberOfFinishedToys, numberOfPartsPassed, numberOfToyPassed, workerID) to CoSupervisor
      				 */
      				
      				try {
      					jadescript.util.SendMessageUtils.validatePerformative("inform");
      					
      					java.lang.Object _contentToBeSent1681646045 = WorkOntology.deliverWorkingReport(__PatternMatcher841312597_obj.numberOfWorkerRequest ,__PatternMatcher841312597_obj.UnUsedToyParts ,__PatternMatcher841312597_obj.numberOfSupplierRequest ,__PatternMatcher841312597_obj.numberOfFinishedToys ,__PatternMatcher841312597_obj.numberOfPartsPassed ,__PatternMatcher841312597_obj.numberOfToyPassed ,__PatternMatcher841312597_obj.workerID);
      					
      					jadescript.core.message.Message _synthesizedMessage1681646045 = new jadescript.core.message.Message(jadescript.core.message.Message.INFORM);
      					
      					_synthesizedMessage1681646045.setOntology(jadescript.util.SendMessageUtils.getDeclaringOntology(_contentToBeSent1681646045,WorkOntology.getInstance(),jadescript.content.onto.Ontology.getInstance()).getName());;
      					
      					_synthesizedMessage1681646045.setLanguage(__codec.getName());;
      					
      					_synthesizedMessage1681646045.addReceiver(processWorkingReports.this._agentEnv.getAgent().getCoSupervisor());
      					
      					_agentEnv.getAgent().getContentManager().fillContent(_synthesizedMessage1681646045, jadescript.content.onto.MessageContent.prepareContent((jade.content.ContentElement) _contentToBeSent1681646045, "inform"));
      					
      					_agentEnv.getAgent().send(_synthesizedMessage1681646045);
      				}
      				catch(java.lang.Throwable _t) {
      					throw jadescript.core.exception.JadescriptException.wrap(_t);
      				}
      			}
      			else {
      				/* 
      				 * Compiled from source statement at line 183
      				 * log "+ SUPERVISOR: Report of " + name of workerID + " received."
      				 */
      				
      				jadescript.core.Agent.doLog(jade.util.Logger.INFO, processWorkingReports.this.getClass().getName(), processWorkingReports.this, "on inform", java.lang.String.valueOf(java.lang.String.valueOf(java.lang.String.valueOf("+ SUPERVISOR: Report of ") + java.lang.String.valueOf(__PatternMatcher841312597_obj.workerID.getName())) + java.lang.String.valueOf(" received.")));
      				
      				/* 
      				 * Compiled from source statement from line 184 to line 186
      				 * if maxRequestWorkers < numberOfWorkerRequest do
      				 *                     maxRequestWorkers = numberOfWorkerRequest
      				 *                     maxRequestToWorkers_worker = workerID
      				 */
      				
      				if(processWorkingReports.this.getMaxRequestWorkers() < __PatternMatcher841312597_obj.numberOfWorkerRequest) {
      					/* 
      					 * Compiled from source statement at line 185
      					 * maxRequestWorkers = numberOfWorkerRequest
      					 */
      					
      					processWorkingReports.this.setMaxRequestWorkers(__PatternMatcher841312597_obj.numberOfWorkerRequest);
      					
      					/* 
      					 * Compiled from source statement at line 186
      					 * maxRequestToWorkers_worker = workerID
      					 */
      					
      					processWorkingReports.this.setMaxRequestToWorkers_worker(__PatternMatcher841312597_obj.workerID);
      				}
      				
      				/* 
      				 * Compiled from source statement from line 188 to line 190
      				 * 
      				 *                 
      				 *                 if maxDeliveredToys < numberOfFinishedToys do
      				 *                     maxDeliveredToys = numberOfFinishedToys
      				 *                     maxDeliveredToys_worker = workerID
      				 */
      				
      				if(processWorkingReports.this.getMaxDeliveredToys() < __PatternMatcher841312597_obj.numberOfFinishedToys) {
      					/* 
      					 * Compiled from source statement at line 189
      					 * maxDeliveredToys = numberOfFinishedToys
      					 */
      					
      					processWorkingReports.this.setMaxDeliveredToys(__PatternMatcher841312597_obj.numberOfFinishedToys);
      					
      					/* 
      					 * Compiled from source statement at line 190
      					 * maxDeliveredToys_worker = workerID
      					 */
      					
      					processWorkingReports.this.setMaxDeliveredToys_worker(__PatternMatcher841312597_obj.workerID);
      				}
      				
      				/* 
      				 * Compiled from source statement from line 192 to line 194
      				 * 
      				 *                 
      				 *                 if maxHelpedWorkers < numberOfPartsPassed + numberOfToyPassed do
      				 *                     maxHelpedWorkers = numberOfPartsPassed + numberOfToyPassed
      				 *                     maxHelpedToWorkers_worker = workerID
      				 */
      				
      				if(processWorkingReports.this.getMaxHelpedWorkers() < __PatternMatcher841312597_obj.numberOfPartsPassed + __PatternMatcher841312597_obj.numberOfToyPassed) {
      					/* 
      					 * Compiled from source statement at line 193
      					 * maxHelpedWorkers = numberOfPartsPassed + numberOfToyPassed
      					 */
      					
      					processWorkingReports.this.setMaxHelpedWorkers(__PatternMatcher841312597_obj.numberOfPartsPassed + __PatternMatcher841312597_obj.numberOfToyPassed);
      					
      					/* 
      					 * Compiled from source statement at line 194
      					 * maxHelpedToWorkers_worker = workerID
      					 */
      					
      					processWorkingReports.this.setMaxHelpedToWorkers_worker(__PatternMatcher841312597_obj.workerID);
      				}
      				
      				/* 
      				 * Compiled from source statement at line 196
      				 * 
      				 *                 
      				 * 			    total_sum_help = total_sum_help + numberOfWorkerRequest
      				 */
      				
      				processWorkingReports.this.setTotal_sum_help(processWorkingReports.this.getTotal_sum_help() + __PatternMatcher841312597_obj.numberOfWorkerRequest);
      				
      				/* 
      				 * Compiled from source statement at line 198
      				 * total_sum_unused = total_sum_unused + UnUsedToyParts
      				 */
      				
      				processWorkingReports.this.setTotal_sum_unused(processWorkingReports.this.getTotal_sum_unused() + __PatternMatcher841312597_obj.UnUsedToyParts);
      				
      				/* 
      				 * Compiled from source statement at line 200
      				 * total_requests = total_requests + numberOfSupplierRequest
      				 */
      				
      				processWorkingReports.this.setTotal_requests(processWorkingReports.this.getTotal_requests() + __PatternMatcher841312597_obj.numberOfSupplierRequest);
      				
      				/* 
      				 * Compiled from source statement at line 201
      				 * total_passed_parts = total_passed_parts + numberOfPartsPassed
      				 */
      				
      				processWorkingReports.this.setTotal_passed_parts(processWorkingReports.this.getTotal_passed_parts() + __PatternMatcher841312597_obj.numberOfPartsPassed);
      				
      				/* 
      				 * Compiled from source statement at line 202
      				 * total_passed_toy = total_passed_toy + numberOfToyPassed
      				 */
      				
      				processWorkingReports.this.setTotal_passed_toy(processWorkingReports.this.getTotal_passed_toy() + __PatternMatcher841312597_obj.numberOfToyPassed);
      				
      				/* 
      				 * Compiled from source statement at line 204
      				 * finished = finished + numberOfFinishedToys
      				 */
      				
      				processWorkingReports.this.setFinished(processWorkingReports.this.getFinished() + __PatternMatcher841312597_obj.numberOfFinishedToys);
      				
      				/* 
      				 * Compiled from source statement at line 206
      				 * n_worker = n_worker + 1
      				 */
      				
      				processWorkingReports.this.setN_worker(processWorkingReports.this.getN_worker() + 1);
      				
      				/* 
      				 * Compiled from source statement from line 207 to line 216
      				 * if n_worker = numTotalWorker and aid of agent = "Supervisor1" as aid do 
      				 * 			         log " -------------------------------------------------------------------------------------------"
      				 * 			         log " - Total Amount Of Finished Toys : " +finished + "                    - Total Times Toys Were Passed : " + total_passed_toy
      				 * 			         log " - Total Amount Of Help Request To Workers : " +total_sum_help + "         - Total Amount Of Toy Parts Requested To Supplier : " + total_requests        
      				 * 			         log " - Total Amount Of Toy Parts Unused : " + total_sum_unused + "                - Total Amount Of Toy Parts Were Passed : " + total_passed_parts
      				 * 			         log " -------------------------------------------------------------------------------------------"
      				 * 			         log " - Worker With More Toy Finished : " +name of maxDeliveredToys_worker + "           - How Many Toys Has Finished : " +maxDeliveredToys
      				 * 			         log " - Most Helpful Worker : " +name of maxHelpedToWorkers_worker + "                     - How Many Times Has Helped : " +maxHelpedWorkers
      				 * 			         log " - Worker With More Help Requests : " +name of maxRequestToWorkers_worker + "          - How Many Requests Of Helped : " +maxRequestWorkers
      				 * 			         log " -------------------------------------------------------------------------------------------"
      				 */
      				
      				if(java.util.Objects.equals(processWorkingReports.this.getN_worker(), processWorkingReports.this._agentEnv.getAgent().getNumTotalWorker()) && java.util.Objects.equals(processWorkingReports.this.getJadescriptAgent().getAID(), ((jade.core.AID) jadescript.util.types.Converter.convert("Supervisor1", new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.TEXT), new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.AID))))) {
      					/* 
      					 * Compiled from source statement at line 208
      					 * log " -------------------------------------------------------------------------------------------"
      					 */
      					
      					jadescript.core.Agent.doLog(jade.util.Logger.INFO, processWorkingReports.this.getClass().getName(), processWorkingReports.this, "on inform", java.lang.String.valueOf(" -------------------------------------------------------------------------------------------"));
      					
      					/* 
      					 * Compiled from source statement at line 209
      					 * log " - Total Amount Of Finished Toys : " +finished + "                    - Total Times Toys Were Passed : " + total_passed_toy
      					 */
      					
      					jadescript.core.Agent.doLog(jade.util.Logger.INFO, processWorkingReports.this.getClass().getName(), processWorkingReports.this, "on inform", java.lang.String.valueOf(java.lang.String.valueOf(java.lang.String.valueOf(java.lang.String.valueOf(" - Total Amount Of Finished Toys : ") + java.lang.String.valueOf(processWorkingReports.this.getFinished())) + java.lang.String.valueOf("                    - Total Times Toys Were Passed : ")) + java.lang.String.valueOf(processWorkingReports.this.getTotal_passed_toy())));
      					
      					/* 
      					 * Compiled from source statement at line 210
      					 * log " - Total Amount Of Help Request To Workers : " +total_sum_help + "         - Total Amount Of Toy Parts Requested To Supplier : " + total_requests
      					 */
      					
      					jadescript.core.Agent.doLog(jade.util.Logger.INFO, processWorkingReports.this.getClass().getName(), processWorkingReports.this, "on inform", java.lang.String.valueOf(java.lang.String.valueOf(java.lang.String.valueOf(java.lang.String.valueOf(" - Total Amount Of Help Request To Workers : ") + java.lang.String.valueOf(processWorkingReports.this.getTotal_sum_help())) + java.lang.String.valueOf("         - Total Amount Of Toy Parts Requested To Supplier : ")) + java.lang.String.valueOf(processWorkingReports.this.getTotal_requests())));
      					
      					/* 
      					 * Compiled from source statement at line 211
      					 * log " - Total Amount Of Toy Parts Unused : " + total_sum_unused + "                - Total Amount Of Toy Parts Were Passed : " + total_passed_parts
      					 */
      					
      					jadescript.core.Agent.doLog(jade.util.Logger.INFO, processWorkingReports.this.getClass().getName(), processWorkingReports.this, "on inform", java.lang.String.valueOf(java.lang.String.valueOf(java.lang.String.valueOf(java.lang.String.valueOf(" - Total Amount Of Toy Parts Unused : ") + java.lang.String.valueOf(processWorkingReports.this.getTotal_sum_unused())) + java.lang.String.valueOf("                - Total Amount Of Toy Parts Were Passed : ")) + java.lang.String.valueOf(processWorkingReports.this.getTotal_passed_parts())));
      					
      					/* 
      					 * Compiled from source statement at line 212
      					 * log " -------------------------------------------------------------------------------------------"
      					 */
      					
      					jadescript.core.Agent.doLog(jade.util.Logger.INFO, processWorkingReports.this.getClass().getName(), processWorkingReports.this, "on inform", java.lang.String.valueOf(" -------------------------------------------------------------------------------------------"));
      					
      					/* 
      					 * Compiled from source statement at line 213
      					 * log " - Worker With More Toy Finished : " +name of maxDeliveredToys_worker + "           - How Many Toys Has Finished : " +maxDeliveredToys
      					 */
      					
      					jadescript.core.Agent.doLog(jade.util.Logger.INFO, processWorkingReports.this.getClass().getName(), processWorkingReports.this, "on inform", java.lang.String.valueOf(java.lang.String.valueOf(java.lang.String.valueOf(java.lang.String.valueOf(" - Worker With More Toy Finished : ") + java.lang.String.valueOf(processWorkingReports.this.getMaxDeliveredToys_worker().getName())) + java.lang.String.valueOf("           - How Many Toys Has Finished : ")) + java.lang.String.valueOf(processWorkingReports.this.getMaxDeliveredToys())));
      					
      					/* 
      					 * Compiled from source statement at line 214
      					 * log " - Most Helpful Worker : " +name of maxHelpedToWorkers_worker + "                     - How Many Times Has Helped : " +maxHelpedWorkers
      					 */
      					
      					jadescript.core.Agent.doLog(jade.util.Logger.INFO, processWorkingReports.this.getClass().getName(), processWorkingReports.this, "on inform", java.lang.String.valueOf(java.lang.String.valueOf(java.lang.String.valueOf(java.lang.String.valueOf(" - Most Helpful Worker : ") + java.lang.String.valueOf(processWorkingReports.this.getMaxHelpedToWorkers_worker().getName())) + java.lang.String.valueOf("                     - How Many Times Has Helped : ")) + java.lang.String.valueOf(processWorkingReports.this.getMaxHelpedWorkers())));
      					
      					/* 
      					 * Compiled from source statement at line 215
      					 * log " - Worker With More Help Requests : " +name of maxRequestToWorkers_worker + "          - How Many Requests Of Helped : " +maxRequestWorkers
      					 */
      					
      					jadescript.core.Agent.doLog(jade.util.Logger.INFO, processWorkingReports.this.getClass().getName(), processWorkingReports.this, "on inform", java.lang.String.valueOf(java.lang.String.valueOf(java.lang.String.valueOf(java.lang.String.valueOf(" - Worker With More Help Requests : ") + java.lang.String.valueOf(processWorkingReports.this.getMaxRequestToWorkers_worker().getName())) + java.lang.String.valueOf("          - How Many Requests Of Helped : ")) + java.lang.String.valueOf(processWorkingReports.this.getMaxRequestWorkers())));
      					
      					/* 
      					 * Compiled from source statement at line 216
      					 * log " -------------------------------------------------------------------------------------------"
      					 */
      					
      					jadescript.core.Agent.doLog(jade.util.Logger.INFO, processWorkingReports.this.getClass().getName(), processWorkingReports.this, "on inform", java.lang.String.valueOf(" -------------------------------------------------------------------------------------------"));
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

  private processWorkingReports.__Event13 __event13 = null;

  private ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__DEFAULT_THROWER;

  public void __handleJadescriptException(final JadescriptException __exc) {
    jadescript.core.exception.ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__getExceptionEscalator(processWorkingReports.this);
    boolean __handled = false;
    if(!__handled) {
    	__thrower.__throwJadescriptException(__exc);
    }
  }

  private void __initializeProperties() {
    // Initializing properties and event handlers:
    {
    	processWorkingReports.this.n_worker = ((java.lang.Integer) jadescript.util.types.Converter.convert(0, new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.INTEGER), new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.INTEGER)));
    	
    	processWorkingReports.this.total_sum_help = ((java.lang.Integer) jadescript.util.types.Converter.convert(0, new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.INTEGER), new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.INTEGER)));
    	
    	processWorkingReports.this.total_sum_unused = ((java.lang.Integer) jadescript.util.types.Converter.convert(0, new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.INTEGER), new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.INTEGER)));
    	
    	processWorkingReports.this.total_requests = ((java.lang.Integer) jadescript.util.types.Converter.convert(0, new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.INTEGER), new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.INTEGER)));
    	
    	processWorkingReports.this.total_passed_parts = ((java.lang.Integer) jadescript.util.types.Converter.convert(0, new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.INTEGER), new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.INTEGER)));
    	
    	processWorkingReports.this.total_passed_toy = ((java.lang.Integer) jadescript.util.types.Converter.convert(0, new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.INTEGER), new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.INTEGER)));
    	
    	processWorkingReports.this.finished = ((java.lang.Integer) jadescript.util.types.Converter.convert(0, new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.INTEGER), new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.INTEGER)));
    	
    	processWorkingReports.this.maxDeliveredToys = ((java.lang.Integer) jadescript.util.types.Converter.convert(0, new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.INTEGER), new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.INTEGER)));
    	
    	processWorkingReports.this.maxDeliveredToys_worker = new jade.core.AID();
    	
    	processWorkingReports.this.maxHelpedWorkers = ((java.lang.Integer) jadescript.util.types.Converter.convert(0, new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.INTEGER), new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.INTEGER)));
    	
    	processWorkingReports.this.maxHelpedToWorkers_worker = new jade.core.AID();
    	
    	processWorkingReports.this.maxRequestWorkers = ((java.lang.Integer) jadescript.util.types.Converter.convert(0, new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.INTEGER), new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.INTEGER)));
    	
    	processWorkingReports.this.maxRequestToWorkers_worker = new jade.core.AID();
    	
    	__event13 = new processWorkingReports.__Event13();
    }
  }
}
