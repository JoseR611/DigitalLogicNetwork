public abstract class Node
{
    protected Gate backwardGate;
    protected byte val;
    protected Gate forwardGate;
    /**
     * Assigns the attributes to their respective values as an InputNode
     * @param inputA A byte that is assigned to the attribute val
     * inputB A Gate object that is assigned to the attribute forwardGate
     * @return None
     */
    public Node(byte inputA, Gate inputB){
        //InputNode
        val = inputA;
        forwardGate = inputB;
        backwardGate = null;
    }
    /**
     * Assigns the attributes to their respective values as a ConnectorNode
     * @param inputA A Gate object that is assigned to the attribute backwardGate
     * inputB A Gate object that is assigned to the attibute forwardGate
     * @return None
     */
    public Node(Gate inputA, Gate inputB){
        //ConnectorNode
        backwardGate = inputA;
        forwardGate = inputB;
    }
    /**
     * Returns the value of the attribute val if backwardGate is null, otherwise return the 
     * value of the previous gate
     * @param None
     * @return A byte representing the value of the Gate object based on its inputs
     */
    public byte getDigitalValue(){
        if(backwardGate == null){
            return this.val;
        }else{
            return this.getBackwardGate().calculateOutput();
        }
    }
    /**
     * Returns the gate that is connected to the front of the Node object
     * @param None
     * @return A Gate object that is assigned to the attribute forwardGate
     */
    public Gate getForwardGate(){
        return this.forwardGate;
    }
    /**
     * Returns the gate that is connected to the back of the Node object
     * @param None
     * @return A Gate object that is assigned to the attribute backwardGate
     */
    public Gate getBackwardGate(){
        return this.backwardGate;
    }
}
