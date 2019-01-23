import bridges.connect.Bridges;
import bridges.base.Array;
import bridges.base.Element;
import bridges.base.ElementVisualizer;

public class Setup {
	public static void main(String[] args) throws Exception {

	    /* Initialize a Bridges connection with your credentials */
	    /* TODO: plug your own BRIDGES credentials */
	    Bridges bridges = new Bridges(0, "ggurdin", "1179098021639");

	    /* Set an assignment title */
	    bridges.setTitle("Array Example Gabby Gurdin");

	    /* Set up the array dimensions, allocate an Array of Elements */
	    /* TODO: Make an array of size 10 */
	    int arraySize = 10;
	    Array<Integer> arr = new Array<Integer> (arraySize);
	    
	    /* Populate the array with integers */
	    /* TODO: Make the array store square numbers*/
	    
	    for (int i = 0; i < arr.getSize(); i++) {
	    	arr.getElement(i).setLabel(String.valueOf(i * i));
	    	ElementVisualizer vis = new ElementVisualizer();
	    	arr.getElement(i).setVisualizer(vis);
	    	vis.setColor("purple");
	    }
	    
	    /* Tell BRIDGES which data structure to visualize */
	    bridges.setDataStructure(arr);

	    /* Visualize the Array */
	    bridges.visualize();
	}
}