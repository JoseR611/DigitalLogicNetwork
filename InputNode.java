public class InputNode extends Node
{
    /**
     * Assigns the byte version of inputA and the Gate inputB to the superclass
     * @param inputA A String that is coverted into a byte that is assigned to the constructor
     * of the superclass
     * inputB A Gate object that is assigned to the constructor of the superclass
     */
    public InputNode(String inputA, Gate inputB){
        super((byte)Integer.parseInt(inputA), inputB);
    }
}
