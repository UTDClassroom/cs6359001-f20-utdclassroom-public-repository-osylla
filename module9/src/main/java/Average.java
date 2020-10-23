
public class Average {

	public int average(int k, int[] list) {

		int average = 0;
		int n = Math.min(k, list.length);
		if (n > 0) {
			for (int i = 0; i < n; i++) {
				average += list[i];
			}
			average = average / n;
		}
		return average;
	}
}
