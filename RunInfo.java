package fi.hu.cs.titokone;


/** This class tells GUIBrain what the processor has done. RunDebugger 
creates objects from this class and passes them to onwards.*/

//KESKEN varsinkin javadocin osalta

public class RunInfo extends DebugInfo{

   
       
    public static final short NOOPERATION = 0;
    public static final short DATA_TRANSFER_OPERATION = 1;
    public static final short ALU_OPERATION = 2;
    public static final short JUMP_OPERATION = 3;
    public static final short STACK_OPERATION = 4;
    public static final short SUB_OPERATION = 5;
    public static final short EXTERNAL_OPERATION = 6;
    public static final short SVC_OPERATION = 7;
 
    public static final short IMMEDIATE = 0;
    public static final short DIRECT = 1;
    public static final short DIRECT_REGISTER = 2;
    public static final short INDIRECT_REGISTER = 3;
    public static final short INDEXED_DIRECT = 4;
    public static final short INDEXED_INDIRECT= 5;
    public static final short INDEXED_DIRECT_REGISTER = 6; 
    public static final short INDEXED_INDERECT_REGISTER = 7;
   
    private boolean registerChanged;
    private boolean memoryChanged;
    private boolean selfChangingCode;


   /** This field contains the operation type. */
    private int operationType;
    /**This field contains line number.*/
    private int lineNumber;
    /** This field contains contents of the line, */
    private String lineContents;
    /** This field contains the command in binary format. */
    private int binary;
   
   
    private String changedCodeAreaData;
    
    private int memoryFetchType;
    private int numberOfMemoryfetches;

    private int oldPC;
    private int newPC;
    private int oldSP;
    private int oldFP;
    private int newSP;
    private int newFP;
    private int opcode;
    /** This field contains first operand of the command. */
    private int Rj; 
    /** This field contains index register. */
    private int Ri;
    private int ADDR;
    private int valueAtADDR;

    private boolean compareOp;
    private int aluResult;
    private int SRbit;
    private boolean compareResult;
    
    private boolean externalOperation;
    private int device;
    private int value;

       
    private int[][] changedRegisters;
    private int[][] changedMemory;
    
    
    
    public RunInfo(int lineNumber, String lineContents, int oldPC, int newPC
		   int oldSP, int newSP, int oldFP, int newFP){}
    
    public void setBinary(int binary){}

    public void setIndexRegister(int register){}
   
    public void setFirstOperand(int register, int value){}

    public void setNumberOfFetches(int fetches){}

    public void setADDR(int fetchType, int ADDR){}
    public void setValueAtADDR(int value){}

    public void setChangedCodeAreaData(int line, int binary, String symbolic){}
    
    public void setALUResult(int result){}
    
    public void setCompareOperation(int whichSRBit, boolean newValue){}
    
    public void setIN(int device, int value){}
    
    public void setOUT(int device, int value){}
    

    /** This method tells GUIBrain what kind of operation happened.
        @returns int value which represents operation type.*/
    public int whatOperationHappened(){}
    
    /** This method returns both old and new PC, SP and FP. */
    public int[] returnPointers(){}
    
    /** This methot tells GUIBrain how many memoryfetches were made. */
    public int returnMemoryfetches(){}

    /** This method tells what kind of memoryfetch was made.*/
    public int returnFetchType(){}
    
    /** */
    Public int returnLineNumber(){}
    
    /** */
    public String returnLineContents(){}
    
    /** */
    public int returnBinary(){}
    
    /** This method tells GUIBrain which registers changed and what is new
	value.*/
    public int[] whatRegisterChanged(){}
    
    /** This method tells GUIBrain which line in data area changed and what is
	new value.*/
    public int[] whatMemoryLineChanged(){}
    
    /** This method tells GUIBrain what was result of an OUT command (device 
	and value).*/
    public int[] whatOUT(){}
    
    /** This method tells GUIBrain what was result of an IN command (device and
     *value.*/
    public int[] whatIN(){}

    public int returnFirstOperand(){}
    public int returnIndexRegister(){}
    public int returnADDR(){}
    public int returnValueAtADDR(){}

    public int returnALUResult(){}

    public boolean returnCompareOP(){}
    public int[] returnCompareResult(){}

   
       
    
    
   
} 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

