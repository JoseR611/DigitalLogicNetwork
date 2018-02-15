import java.util.HashMap;
public class LogicNetwork
{
    private In inFile;
    private ConnectorNode out;
    private HashMap<String, Gate> gates;
    private HashMap<String, Node> nodes;
    /**
     * Prints out the result of the input nodes and the gates
     * @param arg A string array containing command line arguments.
     * @return Void
     */
    public static void main(String[] args){
        LogicNetwork ln = new LogicNetwork();
        ln.makeConnections();
        byte output = ln.calculateOutput();
        System.out.println("Output of circuit is: " + output);
    }
    /**
     * Creates hashmaps of gates and nodes and creates the connections between nodes and gates based
     * off the text file being read.
     * @param None
     * @return Void
     */
    public void makeConnections(){
        inFile = new In("circuit.txt");
        gates = new HashMap<>();
        nodes = new HashMap<>();
        while(inFile.hasNextLine()){
            String[] read = inFile.readLine().split(" ");
            if(read.length == 2 && read[0].charAt(0) == 'g'){
                if(read[1].equals("AND")){
                    gates.put(read[0], new ANDGate(null, null, null));
                }
                if(read[1].equals("OR")){
                    gates.put(read[0], new ORGate(null, null, null));
                }
                if(read[1].equals("NOT")){
                    gates.put(read[0], new NOTGate(null, null));
                }
            }
            if(read.length == 3){
                if(read[0].charAt(0) == 'i'){
                    nodes.put(read[0], new InputNode(read[1], gates.get(read[2])));
                    if(gates.get(read[2]).getbackwardNode1() == null){
                        gates.get(read[2]).setbackwardNode1(nodes.get(read[0]));
                    }else{
                        gates.get(read[2]).setbackwardNode2(nodes.get(read[0]));
                    }
                }
                if(read[0].charAt(0) == 'n'){
                    nodes.put(read[0], new ConnectorNode(gates.get(read[1]), gates.get(read[2])));
                    gates.get(read[1]).setforwardNode(nodes.get(read[0]));
                    if(!read[2].equals("out")){
                        if(gates.get(read[2]).getbackwardNode1() == null){
                            gates.get(read[2]).setbackwardNode1(nodes.get(read[0]));
                        }else{
                            gates.get(read[2]).setbackwardNode2(nodes.get(read[0]));
                        }
                    }else{
                        out = (ConnectorNode)nodes.get(read[0]);
                    }
                }
            }
        }
        System.out.println("Gates: " + gates.keySet());
        System.out.println("Nodes: " + nodes.keySet());
    } 
    /**
     * Returns the value of the node Out
     * @param None
     * @return A byte that represents the value of the Out node
     */
    public byte calculateOutput(){
         return out.getDigitalValue();
    }
}
