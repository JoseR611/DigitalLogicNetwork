public class ORGate extends Gate
{
    /**
     * Assigns the parameters to the superclass
     * @param inputA A Node object that is assigned to the constructor of the superclass
     * inputB A Node object that is assigned to the constructor of the superclass
     * inputC A Node object that is assigned to the constructor of the superclass
     * @return None
     */
    public ORGate(Node inputA, Node inputB, Node inputC){
        super(inputA, inputB, inputC);
    }
    /**
     * Returns a byte based on the inputs given and applying the OR operator to them
     * @param None
     * @return A byte that is the result of an OR operator and two values
     */
    public byte calculateOutput(){
        int a = this.backwardNode1.getDigitalValue();
        int b = this.backwardNode2.getDigitalValue();
        byte output = (byte)(a | b);
        System.out.println("a | b = " + output);
        return output;
    }
}
