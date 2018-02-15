public class ANDGate extends Gate
{
    /**
     * Assigns the parameters to the superclass
     * @param inputA A Node object that is assigned to the constructor of the superclass
     * inputB A Node object that is assigned to the constructor of the superclass
     * inputC A Node object that is assigned to the constructor of the superclass
     * @return None
     */
    public ANDGate(Node inputA, Node inputB, Node inputC){
        super(inputA, inputB, inputC);
    }
    /**
     * Returns a byte based on the inputs given and applying the AND operator to them
     * @param None
     * @return A byte that is the result of an AND operator and two values
     */
    public byte calculateOutput(){
        int a = getbackwardNode1().getDigitalValue();
        int b = getbackwardNode2().getDigitalValue();
        byte output = (byte)(a & b);
        System.out.println("a & b = " + output);
        return output;
    }
}