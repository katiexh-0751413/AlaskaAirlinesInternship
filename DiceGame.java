import java.util.*;

public class DiceGame {
	private Map<Integer, int[]> points;
	private int totalPoints;
	private int[] values;
	private int[] counts;
	
	public DiceGame() {
		points = new HashMap<>();
		points.put(1, new int[] {100, 1000});
		points.put(2, new int[] {0, 200});
		points.put(3, new int[] {0, 300});
		points.put(4, new int[] {0, 400});
		points.put(5, new int[] {50, 500});
		points.put(6, new int[] {0, 600});
		
		totalPoints = 0;
		values = new int[5];
		counts = new int[6];
	}
	
	public int getTotalPoints() {
		return totalPoints;
	}
	
	public int[] getValues() {
		return values;
	}
	
	public void rollFive() {
		Random random = new Random();
		
		for (int i = 0; i < values.length; i++) {
			int roll = random.nextInt(6) + 1;
			values[i] = roll;
			counts[roll - 1]++;
		}
	}
	
	public void sumPoints() {
		for (int i = 0; i < counts.length; i++) {
			totalPoints += (counts[i] / 3) * points.get(i + 1)[1];
			totalPoints += (counts[i] % 3) * points.get(i + 1)[0];
		}
	}
}
