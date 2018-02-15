public class NOTGate extends Gate
{
    /**
     * Assigns the parameters to the superclass
     * @param inputA A Node object that is assigned to the constructor of the superclass
     * inputB A Node object that is assigned to the constructor of the superclass
     * @return None
     */
    public NOTGate(Node inputA, Node inputB){
        super(inputA, inputB);
    }
    /**
     * Returns a byte based on the input given and applying the NOT operator to it
     * @param None
     * @return A byte that is the result of a NOT operator and a value
     */
    public byte calculateOutput(){
        int a = backwardNode1.getDigitalValue();
        byte output;
        if(a == 1){
            output = (byte)0;
        }else{
            output = (byte)1;
        }
        System.out.println("!a = " + output);
        return output;
    }
}
