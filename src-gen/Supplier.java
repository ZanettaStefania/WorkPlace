import jade.content.ContentManager;
import jade.content.lang.Codec;
import jade.core.AID;
import jade.wrapper.ContainerController;
import jade.wrapper.StaleProxyException;
import jadescript.content.JadescriptProposition;
import jadescript.core.Agent;
import jadescript.core.exception.ExceptionThrower;
import jadescript.core.exception.JadescriptException;
import jadescript.java.AgentEnv;
import jadescript.java.JadescriptAgentController;
import jadescript.java.SideEffectsFlag;
import jadescript.lang.Duration;
import jadescript.util.JadescriptList;

@SuppressWarnings("all")
public class Supplier extends Agent {
  private Supplier __theAgent = (Supplier)/*Used as metadata*/null;

  private AgentEnv<Supplier, SideEffectsFlag.AnySideEffectFlag> _agentEnv = null;

  public WorkOntology __ontology__WorkOntology = (WorkOntology) WorkOntology.getInstance();

  public void __registerOntologies(final ContentManager cm) {
    super.__registerOntologies(cm);
    cm.registerOntology(WorkOntology.getInstance());
  }

  public Codec __codec = new jade.content.lang.leap.LEAPCodec();

  protected Duration breakingTime = null;

  public void setBreakingTime(final Duration breakingTime) {
    this.breakingTime = breakingTime;
  }

  public Duration getBreakingTime() {
    return this.breakingTime;
  }

  protected Duration deliveryTime = null;

  public void setDeliveryTime(final Duration deliveryTime) {
    this.deliveryTime = deliveryTime;
  }

  public Duration getDeliveryTime() {
    return this.deliveryTime;
  }

  protected Boolean waitForAssistence = null;

  public void setWaitForAssistence(final Boolean waitForAssistence) {
    this.waitForAssistence = waitForAssistence;
  }

  public Boolean getWaitForAssistence() {
    return this.waitForAssistence;
  }

  protected JadescriptList<Request> queueRequest = null;

  public void setQueueRequest(final JadescriptList<Request> queueRequest) {
    this.queueRequest = queueRequest;
  }

  public JadescriptList<Request> getQueueRequest() {
    return this.queueRequest;
  }

  protected Boolean emptyQueue = null;

  public void setEmptyQueue(final Boolean emptyQueue) {
    this.emptyQueue = emptyQueue;
  }

  public Boolean getEmptyQueue() {
    return this.emptyQueue;
  }

  protected JadescriptList<Price> priceList = null;

  public void setPriceList(final JadescriptList<Price> priceList) {
    this.priceList = priceList;
  }

  public JadescriptList<Price> getPriceList() {
    return this.priceList;
  }

  protected Integer bluePaint = null;

  public void setBluePaint(final Integer bluePaint) {
    this.bluePaint = bluePaint;
  }

  public Integer getBluePaint() {
    return this.bluePaint;
  }

  protected Integer redPaint = null;

  public void setRedPaint(final Integer redPaint) {
    this.redPaint = redPaint;
  }

  public Integer getRedPaint() {
    return this.redPaint;
  }

  protected Integer yellowPaint = null;

  public void setYellowPaint(final Integer yellowPaint) {
    this.yellowPaint = yellowPaint;
  }

  public Integer getYellowPaint() {
    return this.yellowPaint;
  }

  protected String typeOfSupplier = null;

  public void setTypeOfSupplier(final String typeOfSupplier) {
    this.typeOfSupplier = typeOfSupplier;
  }

  public String getTypeOfSupplier() {
    return this.typeOfSupplier;
  }

  protected AID CoSupplier = null;

  public void setCoSupplier(final AID CoSupplier) {
    this.CoSupplier = CoSupplier;
  }

  public AID getCoSupplier() {
    return this.CoSupplier;
  }

  protected AID Supervisor = null;

  public void setSupervisor(final AID Supervisor) {
    this.Supervisor = Supervisor;
  }

  public AID getSupervisor() {
    return this.Supervisor;
  }

  protected Boolean stopWorking = null;

  public void setStopWorking(final Boolean stopWorking) {
    this.stopWorking = stopWorking;
  }

  public Boolean getStopWorking() {
    return this.stopWorking;
  }

  private void __onCreate() {
    jadescript.util.JadescriptList<java.lang.String> args = new jadescript.util.JadescriptList<String>();
    if(this.getArguments() != null) {
    	for ( java.lang.Object o : this.getArguments()) {
    		args.add((String) o);
    	}
    }
    try {
    	/* 
    	 * Compiled from source statement at line 32
    	 * typeOfSupplier of agent = args[0]
    	 */
    	
    	_agentEnv.getAgent().setTypeOfSupplier(args.get(0));
    	
    	/* 
    	 * Compiled from source statement at line 33
    	 * CoSupplier of agent = args[1] as aid
    	 */
    	
    	_agentEnv.getAgent().setCoSupplier(((jade.core.AID) jadescript.util.types.Converter.convert(args.get(1), new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.TEXT), new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.AID))));
    	
    	/* 
    	 * Compiled from source statement at line 34
    	 * Supervisor of agent = args[2] as aid
    	 */
    	
    	_agentEnv.getAgent().setSupervisor(((jade.core.AID) jadescript.util.types.Converter.convert(args.get(2), new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.TEXT), new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.AID))));
    	
    	/* 
    	 * Compiled from source statement at line 36
    	 * deliveryTime of agent = howMuchWaitForDelivery(typeOfSupplier)
    	 */
    	
    	_agentEnv.getAgent().setDeliveryTime(Supplier.this.howMuchWaitForDelivery(_agentEnv.getAgent().toEnv() ,Supplier.this.getTypeOfSupplier()));
    	
    	/* 
    	 * Compiled from source statement from line 37 to line 42
    	 * if typeOfSupplier of agent = "Type1" do
    	 *             log "Agent 'Supplier' created with arguments: "+args+" ... Type1 - Breaks often & Fast delivery time"
    	 * 	        breakingTime = "PT10S" as duration  
    	 *         else do
    	 *             log "Agent 'Supplier' created with arguments: "+args+" ... Type2 - Breaks infrequently & Slow delivery time"
    	 *             breakingTime = "PT20S" as duration
    	 */
    	
    	if(java.util.Objects.equals(_agentEnv.getAgent().getTypeOfSupplier(), "Type1")) {
    		/* 
    		 * Compiled from source statement at line 38
    		 * log "Agent 'Supplier' created with arguments: "+args+" ... Type1 - Breaks often & Fast delivery time"
    		 */
    		
    		jadescript.core.Agent.doLog(jade.util.Logger.INFO, Supplier.this.getClass().getName(), Supplier.this, "on create", java.lang.String.valueOf(java.lang.String.valueOf(java.lang.String.valueOf("Agent 'Supplier' created with arguments: ") + java.lang.String.valueOf(args)) + java.lang.String.valueOf(" ... Type1 - Breaks often & Fast delivery time")));
    		
    		/* 
    		 * Compiled from source statement at line 39
    		 * breakingTime = "PT10S" as duration
    		 */
    		
    		Supplier.this.setBreakingTime(((jadescript.lang.Duration) jadescript.util.types.Converter.convert("PT10S", new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.TEXT), new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.DURATION))));
    	}
    	else {
    		/* 
    		 * Compiled from source statement at line 41
    		 * log "Agent 'Supplier' created with arguments: "+args+" ... Type2 - Breaks infrequently & Slow delivery time"
    		 */
    		
    		jadescript.core.Agent.doLog(jade.util.Logger.INFO, Supplier.this.getClass().getName(), Supplier.this, "on create", java.lang.String.valueOf(java.lang.String.valueOf(java.lang.String.valueOf("Agent 'Supplier' created with arguments: ") + java.lang.String.valueOf(args)) + java.lang.String.valueOf(" ... Type2 - Breaks infrequently & Slow delivery time")));
    		
    		/* 
    		 * Compiled from source statement at line 42
    		 * breakingTime = "PT20S" as duration
    		 */
    		
    		Supplier.this.setBreakingTime(((jadescript.lang.Duration) jadescript.util.types.Converter.convert("PT20S", new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.TEXT), new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.DURATION))));
    	}
    	
    	/* 
    	 * Compiled from source statement at line 44
    	 *   
    	 *         
    	 *         activate GiveNewToyParts
    	 */
    	
    	new GiveNewToyParts(_agentEnv.getAgent().toEnv()).activate(_agentEnv.getAgent());
    	
    	/* 
    	 * Compiled from source statement at line 45
    	 * activate technicalIssues after breakingTime
    	 */
    	
    	new technicalIssues(_agentEnv.getAgent().toEnv()).activate_after(_agentEnv.getAgent(), Supplier.this.getBreakingTime());
    	
    	/* 
    	 * Compiled from source statement at line 46
    	 * activate notifySupplierToSupervisor
    	 */
    	
    	new notifySupplierToSupervisor(_agentEnv.getAgent().toEnv()).activate(_agentEnv.getAgent());
    	
    	/* 
    	 * Compiled from source statement at line 47
    	 * activate StopDelivery
    	 */
    	
    	new StopDelivery(_agentEnv.getAgent().toEnv()).activate(_agentEnv.getAgent());
    }
    catch(jadescript.core.exception.JadescriptException __throwable) {
    	__handleJadescriptException(__throwable);
    }
    catch(java.lang.Throwable __throwable) {
    	__handleJadescriptException(jadescript.core.exception.JadescriptException.wrap(__throwable));
    }
  }

  public Duration howMuchWaitForDelivery(final AgentEnv<? extends Supplier, ? extends SideEffectsFlag.WithSideEffects> _agentEnv, final String typeOfSupplier) {
    {
    	/* 
    	 * Compiled from source statement from line 51 to line 54
    	 * if typeOfSupplier of this = "Type1" do
    	 *             return "PT4S" as duration
    	 *         else do
    	 *             return "PT5S" as duration
    	 */
    	
    	if(java.util.Objects.equals(Supplier.this.getTypeOfSupplier(), "Type1")) {
    		/* 
    		 * Compiled from source statement at line 52
    		 * return "PT4S" as duration
    		 */
    		
    		return ((jadescript.lang.Duration) jadescript.util.types.Converter.convert("PT4S", new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.TEXT), new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.DURATION)));
    	}
    	else {
    		/* 
    		 * Compiled from source statement at line 54
    		 * return "PT5S" as duration
    		 */
    		
    		return ((jadescript.lang.Duration) jadescript.util.types.Converter.convert("PT5S", new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.TEXT), new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.DURATION)));
    	}
    }
  }

  public Integer hasAnyItems(final AgentEnv<? extends Supplier, ? extends SideEffectsFlag.WithSideEffects> _agentEnv, final JadescriptList<Request> availableParts) {
    {
    	/* 
    	 * Compiled from source statement at line 58
    	 * countItem = 0
    	 */
    	
    	java.lang.Integer countItem = 0;
    	
    	/* 
    	 * Compiled from source statement at line 59
    	 * tempInv_ = [] of Request
    	 */
    	
    	jadescript.util.JadescriptList<Request> tempInv_ = new jadescript.util.JadescriptList<Request>();
    	
    	/* 
    	 * Compiled from source statement from line 61 to line 62
    	 * for item in availableParts do
    	 *             countItem = countItem + 1
    	 */
    	
    	for ( Request item : availableParts) {
    		/* 
    		 * Compiled from source statement at line 62
    		 * countItem = countItem + 1
    		 */
    		
    		countItem = countItem + 1;
    	}
    	
    	/* 
    	 * Compiled from source statement at line 64
    	 *             
    	 * 
    	 *         return countItem
    	 */
    	
    	return countItem;
    }
  }

  public Integer costOfToyPart(final AgentEnv<? extends Supplier, ? extends SideEffectsFlag.WithSideEffects> _agentEnv, final ToyParts availableParts) {
    {
    	/* 
    	 * Compiled from source statement at line 68
    	 * cost=0
    	 */
    	
    	java.lang.Integer cost = 0;
    	
    	/* 
    	 * Compiled from source statement from line 69 to line 71
    	 * for piece_ in priceList do
    	 *             if(item of availableParts = item of piece_) do
    	 *                 cost=cost+price of piece_
    	 */
    	
    	for ( Price piece_ : Supplier.this.getPriceList()) {
    		/* 
    		 * Compiled from source statement from line 70 to line 71
    		 * if(item of availableParts = item of piece_) do
    		 *                 cost=cost+price of piece_
    		 */
    		
    		if((java.util.Objects.equals(availableParts.getItem(), piece_.getItem()))) {
    			/* 
    			 * Compiled from source statement at line 71
    			 * cost=cost+price of piece_
    			 */
    			
    			cost = cost + piece_.getPrice();
    		}
    	}
    	
    	/* 
    	 * Compiled from source statement at line 73
    	 *   
    	 *         
    	 *         return cost
    	 */
    	
    	return cost;
    }
  }

  public Boolean areThereColors(final AgentEnv<? extends Supplier, ? extends SideEffectsFlag.WithSideEffects> _agentEnv) {
    {
    	/* 
    	 * Compiled from source statement from line 77 to line 78
    	 * if redPaint > 0 or yellowPaint > 0 or bluePaint > 0 do
    	 *             return true
    	 */
    	
    	if(Supplier.this.getRedPaint() > 0 || Supplier.this.getYellowPaint() > 0 || Supplier.this.getBluePaint() > 0) {
    		/* 
    		 * Compiled from source statement at line 78
    		 * return true
    		 */
    		
    		return true;
    	}
    	
    	/* 
    	 * Compiled from source statement at line 79
    	 * 
    	 *         return false
    	 */
    	
    	return false;
    }
  }

  public Request processRequest(final AgentEnv<? extends Supplier, ? extends SideEffectsFlag.WithSideEffects> _agentEnv, final Request request_) {
    {
    	/* 
    	 * Compiled from source statement at line 83
    	 * temp_ = toyPart of request_
    	 */
    	
    	ToyParts temp_ = request_.getToyPart();
    	
    	/* 
    	 * Compiled from source statement from line 85 to line 119
    	 * if typeOfSupplier = "Type1" do 
    	 *             if yellowPaint > 0 do
    	 *                 color of temp_ = "yellow"
    	 *                 yellowPaint of agent = yellowPaint - 1  
    	 *             else if redPaint > 0 do
    	 *                 color of temp_ = "red"
    	 *                 redPaint of agent = redPaint - 1 
    	 *             else if bluePaint > 0 do
    	 *                 color of temp_ = "blue"
    	 *                 bluePaint of agent = bluePaint - 1 
    	 *                             
    	 *             return Request(sender of request_, temp_)
    	 *             
    	 *         else do
    	 *         
    	 *             if bluePaint = yellowPaint and bluePaint = redPaint do
    	 *                 if color of temp_ = "yellow" do
    	 *                     yellowPaint of agent = yellowPaint - 1
    	 *                 else if color of temp_ = "red" do
    	 *                     redPaint of agent = redPaint - 1
    	 *                 else do 
    	 *                     bluePaint of agent = bluePaint - 1
    	 *                 return Request(sender of request_, temp_)
    	 *         
    	 *             if yellowPaint > bluePaint do
    	 *                 color of temp_ = "yellow"
    	 *                 yellowPaint of agent = yellowPaint - 1  
    	 *             else if redPaint > bluePaint do
    	 *                 color of temp_ = "red"
    	 *                 redPaint of agent = redPaint - 1 
    	 *             else do
    	 *                 color of temp_ = "blue"
    	 *                 bluePaint of agent = bluePaint - 1 
    	 *                             
    	 *             return Request(sender of request_, temp_)
    	 */
    	
    	if(java.util.Objects.equals(Supplier.this.getTypeOfSupplier(), "Type1")) {
    		/* 
    		 * Compiled from source statement from line 86 to line 94
    		 * if yellowPaint > 0 do
    		 *                 color of temp_ = "yellow"
    		 *                 yellowPaint of agent = yellowPaint - 1  
    		 *             else if redPaint > 0 do
    		 *                 color of temp_ = "red"
    		 *                 redPaint of agent = redPaint - 1 
    		 *             else if bluePaint > 0 do
    		 *                 color of temp_ = "blue"
    		 *                 bluePaint of agent = bluePaint - 1
    		 */
    		
    		if(Supplier.this.getYellowPaint() > 0) {
    			/* 
    			 * Compiled from source statement at line 87
    			 * color of temp_ = "yellow"
    			 */
    			
    			temp_.setColor("yellow");
    			
    			/* 
    			 * Compiled from source statement at line 88
    			 * yellowPaint of agent = yellowPaint - 1
    			 */
    			
    			_agentEnv.getAgent().setYellowPaint(Supplier.this.getYellowPaint() - 1);
    		}
    		else if(Supplier.this.getRedPaint() > 0) {
    			/* 
    			 * Compiled from source statement at line 90
    			 * color of temp_ = "red"
    			 */
    			
    			temp_.setColor("red");
    			
    			/* 
    			 * Compiled from source statement at line 91
    			 * redPaint of agent = redPaint - 1
    			 */
    			
    			_agentEnv.getAgent().setRedPaint(Supplier.this.getRedPaint() - 1);
    		}
    		else if(Supplier.this.getBluePaint() > 0) {
    			/* 
    			 * Compiled from source statement at line 93
    			 * color of temp_ = "blue"
    			 */
    			
    			temp_.setColor("blue");
    			
    			/* 
    			 * Compiled from source statement at line 94
    			 * bluePaint of agent = bluePaint - 1
    			 */
    			
    			_agentEnv.getAgent().setBluePaint(Supplier.this.getBluePaint() - 1);
    		}
    		
    		/* 
    		 * Compiled from source statement at line 96
    		 *  
    		 *                             
    		 *             return Request(sender of request_, temp_)
    		 */
    		
    		return WorkOntology.Request(request_.getSender() ,temp_);
    	}
    	else {
    		/* 
    		 * Compiled from source statement from line 100 to line 107
    		 * if bluePaint = yellowPaint and bluePaint = redPaint do
    		 *                 if color of temp_ = "yellow" do
    		 *                     yellowPaint of agent = yellowPaint - 1
    		 *                 else if color of temp_ = "red" do
    		 *                     redPaint of agent = redPaint - 1
    		 *                 else do 
    		 *                     bluePaint of agent = bluePaint - 1
    		 *                 return Request(sender of request_, temp_)
    		 */
    		
    		if(java.util.Objects.equals(Supplier.this.getBluePaint(), Supplier.this.getYellowPaint()) && java.util.Objects.equals(Supplier.this.getBluePaint(), Supplier.this.getRedPaint())) {
    			/* 
    			 * Compiled from source statement from line 101 to line 106
    			 * if color of temp_ = "yellow" do
    			 *                     yellowPaint of agent = yellowPaint - 1
    			 *                 else if color of temp_ = "red" do
    			 *                     redPaint of agent = redPaint - 1
    			 *                 else do 
    			 *                     bluePaint of agent = bluePaint - 1
    			 */
    			
    			if(java.util.Objects.equals(temp_.getColor(), "yellow")) {
    				/* 
    				 * Compiled from source statement at line 102
    				 * yellowPaint of agent = yellowPaint - 1
    				 */
    				
    				_agentEnv.getAgent().setYellowPaint(Supplier.this.getYellowPaint() - 1);
    			}
    			else if(java.util.Objects.equals(temp_.getColor(), "red")) {
    				/* 
    				 * Compiled from source statement at line 104
    				 * redPaint of agent = redPaint - 1
    				 */
    				
    				_agentEnv.getAgent().setRedPaint(Supplier.this.getRedPaint() - 1);
    			}
    			else {
    				/* 
    				 * Compiled from source statement at line 106
    				 * bluePaint of agent = bluePaint - 1
    				 */
    				
    				_agentEnv.getAgent().setBluePaint(Supplier.this.getBluePaint() - 1);
    			}
    			
    			/* 
    			 * Compiled from source statement at line 107
    			 * 
    			 *                 return Request(sender of request_, temp_)
    			 */
    			
    			return WorkOntology.Request(request_.getSender() ,temp_);
    		}
    		
    		/* 
    		 * Compiled from source statement from line 109 to line 117
    		 * 
    		 *         
    		 *             if yellowPaint > bluePaint do
    		 *                 color of temp_ = "yellow"
    		 *                 yellowPaint of agent = yellowPaint - 1  
    		 *             else if redPaint > bluePaint do
    		 *                 color of temp_ = "red"
    		 *                 redPaint of agent = redPaint - 1 
    		 *             else do
    		 *                 color of temp_ = "blue"
    		 *                 bluePaint of agent = bluePaint - 1
    		 */
    		
    		if(Supplier.this.getYellowPaint() > Supplier.this.getBluePaint()) {
    			/* 
    			 * Compiled from source statement at line 110
    			 * color of temp_ = "yellow"
    			 */
    			
    			temp_.setColor("yellow");
    			
    			/* 
    			 * Compiled from source statement at line 111
    			 * yellowPaint of agent = yellowPaint - 1
    			 */
    			
    			_agentEnv.getAgent().setYellowPaint(Supplier.this.getYellowPaint() - 1);
    		}
    		else if(Supplier.this.getRedPaint() > Supplier.this.getBluePaint()) {
    			/* 
    			 * Compiled from source statement at line 113
    			 * color of temp_ = "red"
    			 */
    			
    			temp_.setColor("red");
    			
    			/* 
    			 * Compiled from source statement at line 114
    			 * redPaint of agent = redPaint - 1
    			 */
    			
    			_agentEnv.getAgent().setRedPaint(Supplier.this.getRedPaint() - 1);
    		}
    		else {
    			/* 
    			 * Compiled from source statement at line 116
    			 * color of temp_ = "blue"
    			 */
    			
    			temp_.setColor("blue");
    			
    			/* 
    			 * Compiled from source statement at line 117
    			 * bluePaint of agent = bluePaint - 1
    			 */
    			
    			_agentEnv.getAgent().setBluePaint(Supplier.this.getBluePaint() - 1);
    		}
    		
    		/* 
    		 * Compiled from source statement at line 119
    		 *  
    		 *                             
    		 *             return Request(sender of request_, temp_)
    		 */
    		
    		return WorkOntology.Request(request_.getSender() ,temp_);
    	}
    }
  }

  private ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__DEFAULT_THROWER;

  public void __handleJadescriptException(final JadescriptException __exc) {
    jadescript.core.exception.ExceptionThrower __thrower = jadescript.core.exception.ExceptionThrower.__getExceptionEscalator(Supplier.this);
    boolean __handled = false;
    if(!__handled) {
    	__thrower.__throwJadescriptException(__exc);
    }
  }

  public void __handleBehaviourFailure(final jadescript.core.behaviours.Behaviour<?> __behaviour, final JadescriptProposition __reason) {
    boolean __handled = false;
    if(!__handled) {
    	jadescript.core.Agent.doLog(java.util.logging.Level.INFO, this.getClass().getName(), this, "<behaviour failure dispatcher>", "Behaviour " + __behaviour + " failed with reason: " + __reason);
    }
  }

  private void __initializeProperties() {
    // Initializing properties and event handlers:
    {
    	Supplier.this.breakingTime = ((jadescript.lang.Duration) jadescript.util.types.Converter.convert("PT20S", new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.TEXT), new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.DURATION)));
    	
    	Supplier.this.deliveryTime = new jadescript.lang.Duration();
    	
    	Supplier.this.waitForAssistence = ((java.lang.Boolean) jadescript.util.types.Converter.convert(false, new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.BOOLEAN), new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.BOOLEAN)));
    	
    	Supplier.this.queueRequest = new jadescript.util.JadescriptList<Request>();
    	
    	Supplier.this.emptyQueue = ((java.lang.Boolean) jadescript.util.types.Converter.convert(true, new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.BOOLEAN), new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.BOOLEAN)));
    	
    	Supplier.this.priceList = ((jadescript.util.JadescriptList<Price>) jadescript.util.types.Converter.convert(jadescript.util.JadescriptCollections.createList(java.util.List.of(WorkOntology.Price("blue" ,3), WorkOntology.Price("red" ,4), WorkOntology.Price("yellow" ,5), WorkOntology.Price("head" ,5), WorkOntology.Price("arms" ,10), WorkOntology.Price("legs" ,10))), new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.LIST, new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.CONCEPT)), new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.LIST, new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.CONCEPT))));
    	
    	Supplier.this.bluePaint = ((java.lang.Integer) jadescript.util.types.Converter.convert(10, new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.INTEGER), new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.INTEGER)));
    	
    	Supplier.this.redPaint = ((java.lang.Integer) jadescript.util.types.Converter.convert(10, new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.INTEGER), new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.INTEGER)));
    	
    	Supplier.this.yellowPaint = ((java.lang.Integer) jadescript.util.types.Converter.convert(15, new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.INTEGER), new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.INTEGER)));
    	
    	Supplier.this.typeOfSupplier = "";
    	
    	Supplier.this.CoSupplier = new jade.core.AID();
    	
    	Supplier.this.Supervisor = new jade.core.AID();
    	
    	Supplier.this.stopWorking = ((java.lang.Boolean) jadescript.util.types.Converter.convert(false, new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.BOOLEAN), new jadescript.util.types.JadescriptTypeReference(jadescript.util.types.JadescriptBuiltinTypeAtom.BOOLEAN)));
    }
  }

  private void __initializeAgentEnv() {
    this._agentEnv = jadescript.java.AgentEnv.agentEnv(__theAgent());
  }

  public Supplier __theAgent() {
    return this;
  }

  protected void setup() {
    super.setup();
    __initializeAgentEnv();
    __initializeProperties();
    this.__onCreate();
  }

  protected void __registerCodecs(final ContentManager cm) {
    super.__registerCodecs(cm);
    cm.registerLanguage(__codec);
  }

  public static JadescriptAgentController create(final ContainerController _container, final String _agentName, final JadescriptList<String> args) throws StaleProxyException {
    return jadescript.java.JadescriptAgentController.createRaw(_container, _agentName, Supplier.class, args);
  }
}
