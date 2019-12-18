import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jaypatelbond
 */

public class Compare_Two_Arrays{
	
	public Array findCommonNumbers(int[] a, int[] b){
		List<Integer> commonNumber = new ArrayList();
		for(int i; i < a.length;i++){
			for(int j;j < b.length;j++){
				if(a[i] == b[j]){
					commonNumber.add(a[i]);
				}
			}
		}
		return commonNumber;
	}
}
