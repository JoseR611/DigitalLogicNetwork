public abstract class Gate{
    protected Node forwardNode;
    protected Node backwardNode1;
    protected Node backwardNode2;
    /**
     * Assigns the attributes to their respective values for all gates except for the NOT gate
     * @param inputA A Node object that is assigned to the attribute forwardNode
     * inputB A Node object that is assigned to the attribute backwardNode1
     * inputC A Node object that is assigned to the attribute backwardNode2
     * @return None
     */
    public Gate(Node inputA, Node inputB, Node inputC){
        forwardNode = inputA;
        backwardNode1 = inputB;
        backwardNode2 = inputC;
    }
    /**
     * Assigns the attributes to their respective values for a NOT gate and assigns backwardNode to
     * null
     * @param inputA A Node object that is assigned to the attribute forwardNode
     * inputB A Node object that is assigned to the attibute backwardNode1
     * @return None
     */
    public Gate(Node inputA, Node inputB){
        forwardNode = inputA;
        backwardNode1 = inputB;
        backwardNode2 = null;
    }
    /**
     * Returns one of the nodes that is connected to the back of the gate
     * @param None
     * @return A Node object that is assigned to backwardNode1
     */
    public Node getbackwardNode1(){
        return this.backwardNode1;
    }
    /**
     * Returns one of the nodes that is connected to the back of the gate
     * @param None
     * @return A Node object that is assigned to backwardNode2
     */
    public Node getbackwardNode2(){
        return this.backwardNode2;
    }
    /**
     * Assigns the Node object that is in front of the gate to the parameter input
     * @param input A Node object that is assigned to the attribute forwardNode
     * @return Void
     */
    public void setforwardNode(Node input){
        this.forwardNode = input;
    }
    /**
     * Assigns a Node object that is in the back of the gate to the parameter input
     * @param input A Node object that is assigned to the attribute backwardNode1
     * @return Void
     */
    public void setbackwardNode1(Node input){
        this.backwardNode1 = input;
    }
    /**
     * Assigns a Node object that is in the back of the gate to the parameter input
     * @param input A Node object that is assigned to the attribute backwardNode2
     * @return Void
     */
    public void setbackwardNode2(Node input){
        this.backwardNode2 = input;
    }
    /**
     * Abstract method to calculate the output of the gate by the ConnectorNodes attached to them
     * @param None
     * @return A byte that is the result of the gate applied to the values given
     */
    public abstract byte calculateOutput();
}
