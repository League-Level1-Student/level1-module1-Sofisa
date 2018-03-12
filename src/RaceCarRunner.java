import com.sun.org.apache.xerces.internal.util.DatatypeMessageFormatter;

public class RaceCarRunner {
	public static void main(String[] args) {
		/* Do the following things without changing the RaceCar class */
		
		// 1. Create a RaceCar and place it in 5th position
		RaceCar vroom = new RaceCar("Nissan", 5);
		// 3. Get the RaceCar to print its position in the race.
		System.out.println(vroom.getPositionInRace());
		
		// 4. Crash the RaceCar
		vroom.crash();
		// 5. If the car is damaged. Bring it in for a pit stop.
		if(vroom.needsPitStop) {
			vroom.pit();
		}
		// 6. Help the car move into first place.
		for (int i = 0; i <= 6; i++) {
			
		vroom.overtake();
		}
	}
}
