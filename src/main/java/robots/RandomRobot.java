package robots;

import hu.meza.robowars.Robot;
import hu.meza.robowars.ScanResult;

import java.util.Random;

public class RandomRobot extends Robot {
	private static int cloneNumber = 1;
	private final Random rnd = new Random();
	private final String clan;
	private String name;
	private String baseName;

	public RandomRobot(String name, String clan, String baseName) {
		this.name = name;
		this.clan = clan;
		this.baseName = baseName;
	}

	@Override
	public Robot produceClone() {
		return new RandomRobot(String.format("%s clone #%d", baseName(), cloneNumber++), clanName(),
							 baseName());
	}

	@Override
	public void execute() throws InterruptedException {

		/**
		 * Commands:
		 *
		 *
		 * move();         250
		 * turnLeft();     500
		 * turnRight();    500
		 * scan();         800 * distance of first obstacle
		 * tag();          1500
		 * deployClone();  2500
		 * die();          0
		 */

		int r = rnd.nextInt(100);

		if (r < 1) {
			deployClone();
		} else if (r < 20) {
			turnLeft();
		} else if (r < 40) {
			turnRight();
		} else if (r < 70) {
			ScanResult result = scan();
			if ("ROBOT".equals(result.type()) && result.distance() == 0) {
				tag();
			} else if ("ROBOT".equals(result.type())) {
				for (int i = 0; i < result.distance(); i++) {
					move();
				}
				tag();
			}
		} else {
			move();
		}

	}

	@Override
	public String name() {
		return name;
	}

	@Override
	public String clanName() {
		return clan;
	}

	private String baseName() {
		return baseName;
	}
}
