package com.office.game;

public class Game {
	
	private Bear bear;
	private Robot robot;
	private AirPlain airPlain;
	private Dog dog;
	private ICharacter[] iCharacters;
	
	public Game(Bear bear, Robot robot, AirPlain airPlain, Dog dog) {
//		super();            // Object 생성자를 호출한다.(생략해도 기능은 작동한다.)
		this.bear = bear;
		this.robot = robot;
		this.airPlain = airPlain;
		this.dog = dog;
		
		iCharacters = new ICharacter[] {
				this.bear,
				this.robot,
				this.airPlain,
				this.dog
		};
	}



	public void move(int x, int y) {
		
		
		for (int i = 0; i < iCharacters.length; i++) {
			iCharacters[i].run(x, y);
		}
		
//		bear.run(x, y);
//		robot.run(x, y);
//		dog.run(x, y);
//		airPlain.run(x, y);
		
	
//		bear.walk(x, y);
//		robot.run(x, y);
//		dog.run(x, y);
//		airPlain.fly(x, y);
		
	}

}
