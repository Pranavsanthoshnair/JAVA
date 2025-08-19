package Matrix;
import java.util.Vector;
public class Vectordemo {
	public static void main(String[]args) {
		Vector <String>  mammals = new Vector<>();
		Vector <Integer> rollnos = new Vector<>();
		rollnos.add(1);
		rollnos.add(2);
		rollnos.add(6);
		rollnos.add(7);
		System.out.println("Roll nos:"+rollnos);
		rollnos.remove(0);
		System.out.println("Roll nos:"+rollnos);
		
	}


}
