import hu.meza.robowars.Arena;
import hu.meza.robowars.ArenaMaster;
import hu.meza.robowars.DefaultArena;
import hu.meza.robowars.IdGenerator;
import hu.meza.robowars.MovementCosts;
import hu.meza.robowars.Robot;
import robots.RandomRobot;

public class Runner {

	private static final int SIZE = 64;
	private static final int MOVE = 250;
	private static final int TURN = 500;
	private static final int SCAN = 300;
	private static final int TAG = 1500;
	private static final int CLONE = 2500;

	public static void main(String[] args) {


		MovementCosts costs = new MovementCosts(MOVE, TURN, SCAN, TAG, CLONE);

		Arena arena = new DefaultArena(SIZE, costs);
		ArenaMaster master = new ArenaMaster(arena, new IdGenerator(), costs);

		Robot robot1 = new RandomRobot("Jack", "WARRIORS", "Jack");
		Robot robot2 = new RandomRobot("Jill", "PRINCESSES", "Jill");


		master.addRobot(robot1);
		master.addRobot(robot2);


		master.startGame();

	}
}
