## Info

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

## Running

You are free to create your own Robot, or robot army who can communicate with each other.
To keep it clean, you are free to define any kind of dependency to your code through dependency injection.
For that to be possible, you need to create your own runner and set up your robots prior the battle.

There is an example runner, called ```Runner.java```
Running that after clone should give you an insight about how to play!

Good luck, and have fun!

Remember to keep yourself to the 4 rules of simple design http://c2.com/cgi/wiki?XpSimplicityRules

## Testing

The only dependency you might need to mock, is the ArenaMaster.
You can inject that through the Robot's ```setArenaMaster``` method.

