public class ConnectorNode extends Node
{
    /**
     * Assigns inputA and inputB to the superclass Node
     * @param inputA A Gate object to be used in the constructor of the superclass
     * inputB A Gate object to be used in the constructor of the superclass
     * @return None
     */
    public ConnectorNode(Gate inputA, Gate inputB){
        super(inputA, inputB);
    }
}
