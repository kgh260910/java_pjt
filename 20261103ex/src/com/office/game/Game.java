package com.office.game;

public class Game {
	
	private Bear bear;
	private Robot robot;
	private AirPlain airPlain;
	private Dog dog;
	
	public Game(Bear bear, Robot robot, AirPlain airPlain, Dog dog) {
//		super();            // Object 생성자를 호출한다.(생략해도 기능은 작동한다.)
		this.bear = bear;
		this.robot = robot;
		this.airPlain = airPlain;
		this.dog = dog;
	}



	public void move(int x, int y) {
		
		bear.run(x, y);
		robot.run(x, y);
		dog.run(x, y);
		airPlain.run(x, y);
		
	
//		bear.walk(x, y);
//		robot.run(x, y);
//		dog.run(x, y);
//		airPlain.fly(x, y);
		
	}

}
