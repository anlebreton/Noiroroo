package complement;
import java.util.Random;

public class De {
	private int type;
	private int number;
	private int result;
	
	public De(String de) {
		// TODO Auto-generated constructor stub
		String[]stringArray = new String[2];
		result =0;

		stringArray = de.split("D");
		type = Integer.parseInt(stringArray[1]);
		number = Integer.parseInt(stringArray[0]);
		
		Random rand = new Random();
		
		for (int i = 0; i < number; i++) {
			result += rand.nextInt(type) + 1;
 		}
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return number + "D" + type + " = " + result ;
	}
	
	public int getNumber() {
		return number;
	}
	
	public int getResult() {
		return result;
	}
	
	public int getType() {
		return type;
	}
	
	
}
