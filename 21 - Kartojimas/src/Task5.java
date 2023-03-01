

public class Task5 {

	public float arrayAverage(float [] args) {
		//float[] args = {2, 34, 65, 70};
		float sum = 0;
		int count = 0;
		while(args.length > count) {
			sum = sum + args[count];
			count++;	
		}
		float average = sum / count;
		System.out.println(average);
		return average;
	}

}
