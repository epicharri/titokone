/** This class produces objects describing what has changed due to the last
    command having been run. */
public class Debugger extends Translatable{ 
    // define methods like 'ALU happened, parameters x, y, z' and
    // a 'command cycle complete', which returns the delta object for 
    // the gui. Contains eg. the commentary. Processor can then return it 
    // back to ControlBridge.
    /** Constructor for Debugger. 
     */
    public static final short NOOPERATION = 0;
    public static final short BASIC_OPERATION = 1;
    public static final short ALU_OPERATION = 2;
    public static final short JUMP_OPERATION = 3;
    public static final short OTHER_OPERATION = 4;
    
    public Debugger(){}

    /** This method tells debugger that a new cycle has been started. It
     initiates parameter values and stores old PC and IR. */
    public void cycleStart(int lineNumber, String lineContents, int oldPC, 
			   int newPC, int oldSP, int newSP, int FP){ }

/*-------- Memoryfetch types ---------*/
// joitain viel� puutuu
    public void memoryFetchType(int i){ }

	/** This method tells debugger that a value was loaded to a given 
	    register.
	*/
    public void immediate(int register, int value){ }

	/** This method tells debugger that direct memoryfetch was made. */
    public void direct(int register, int where, int value){ }
    
    public void directRegister(int toregister, int fromregister, int where,
                                int value){ }

    public void indirectRegister(int toregister, int fromregister, int  ...){ }
    
    /** This method tells debugger that an indexed direct memoryfetch was 
	used. */
    public void indexedDirect(int toregister, int index, int where, 
			      int value){ }

    /** This method tells debugger that an indexed direct from register 
        memoryfetch was used. */
    public void indexedDirectRegister(int toregister, int index, 
                                        int fromregister, int where, 
				      int value){ }
 	
    /** This method tells debugger that an indirect memoryfetch was used. */
    public void indirect(int toregister, int first, int second, int value){ }
   
    /** This method tells debugger that an indexed indirect memoryfetch was 
     used. */
    public void indexedIndirect(int toregister, int index, int first, 
                                int second, int value){ }

	

    /* ---- Running --- */  
    public void noOperation(){ }

    /** Store/Load */
    public void store(int Ri, int address, int address){}
    
    public void load(int Ri, int Rj, int value){}

    public void in(int device, int value){ }

    public void out(int device, int value){ }

    /* ALU */

    public void alu(String symbol, int result){}


		      
    public void compare(int SR, int Ri, int Rj){ }
 
    public void jump(int where){ }

    public void conditionalJump(int SRIndex, int where, boolean conditionTrue)
    {}
 
    /* Other */

    public void call(int newSP, int newFP){}

    public void exit(int newSP, int newFP){}

    public void push(int newSP, int value){}
   
    public void pop(int newSP, int value){}

    public void pushr(int newSP, int[] values){}

    public void popr(int newSP, int[] values){}

    public void svc(int serviceid){}
  

    /** This method tells debugger that a command cycle was completed and
        it should return a debuginfo package.
	@returns DebugInfo
	*/


    public RunInfo cycleComplete(){ }


}
