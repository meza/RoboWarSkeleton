import hu.meza.robowars.Arena;
import hu.meza.robowars.ArenaMaster;
import hu.meza.robowars.DefaultArena;
import hu.meza.robowars.IdGenerator;
import hu.meza.robowars.Robot;
import robots.RandomRobot;

public class Runner {

	public static final int SIZE = 64;

	public static void main(String[] args) {

		Arena arena = new DefaultArena(SIZE);
		ArenaMaster master = new ArenaMaster(arena, new IdGenerator());

		Robot robot1 = new RandomRobot("Jack", "WARRIORS", "Jack");
		Robot robot2 = new RandomRobot("Jill", "PRINCESSES", "Jill");


		master.addRobot(robot1);
		master.addRobot(robot2);


		master.startGame();


	}
}
