import java.util.ArrayList;

/**
 * 
 * @author samuelroam
 *
 */
public class Matematica {
	
	private ArrayList<Integer> sumar = new ArrayList<Integer>();
	
	/**
	 * Devuelve la suma de a y b e inserta el resultado en un array de sumas
	 * @param a es uno de los numeros de la suma
	 * @param b es otro de los numeros de la suma
	 * @return devuelve el resultado de la suma
	 */
	public int suma(int a, int b){
		int sumas = a+b;
		sumar.add(sumas);
		return sumas;
	}
	
	/**
	 * Devuelve true si a es mayor que b
	 * @param a es uno de los numeros
	 * @param b es otro de los numeros
	 * @return si a es mayor que b devuelve true, en caso contrario devuelve false
	 */
	public boolean mayor (int a, int b){
		if (a>b){
			return true;
		}else{
			return false;
		}
	}
	/**
	 * Devuelve el array de sumas
	 * @return devuelve los resultados de las sumas
	 */
	public ArrayList<Integer> sumar(){
		return sumar;
	}

}


	


