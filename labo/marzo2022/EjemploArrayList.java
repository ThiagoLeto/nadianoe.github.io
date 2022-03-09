import java.util.ArrayList;

public class Main {
  
	public static void main(String[] args) {
		
		/ ** variables primitivas **/
		int a = 1;		
		float c = 1.54f;

		/** Clases envolventes **/
		Integer b = 1;
		Float d = 1.54f;


		/** ArrayList **/

		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(1);
		nums.add(5);

		int a = nums.get(0);
		nums.remove(0);

		ArrayList<Persona> personas = new ArrayList<>();

		Persona p1 = new Persona();

		ArrayList<ArrayList<Integer>> matriz = new ArrayList<>();
    
	    /**
	    documentación:
	    https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html
	    **/

	}
}
