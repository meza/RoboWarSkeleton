Your robot needs to extend the ```Robot``` class

The Robot has several methods you can perform.
Each action takes up a given amount of time.

The robots operate on their own time, they are not restricted to turns.

The goal of the game is to find and kill all opponents by tagging them.

Tagging can happen when the enemy is on an adjacent position.

## Commands

### move();

Moves to the direction the robot is facing

Time to carry out: 250ms

### turnLeft();

Time to carry out: 500ms
### turnRight();

Time to carry out: 500ms
### scan();

Scans in the direction the robot is facing

Time to carry out: 800ms * distance of first obstacle
### tag();

Time to carry out: 1500ms
### deployClone();

Time to carry out: 2500ms
### die();

Time to carry out: 0ms
