import org.jointheleague.graphical.robot.Robot;

public class MyName {
	public static void main(String[] args) {
		Robot r = new Robot();
		r.moveTo(250, 250);
		r.setSpeed(10);
		r.hide();
		r.sparkle();
		r.penDown();
		r.turn(45);
		r.move(200);
		r.turn(45);
		r.move(300);
		r.turn(45);
		r.move(200);
		r.turn(45);
		r.move(500);
		r.turn(45);
		r.move(200);
		r.turn(45);
		r.move(300);
		r.turn(45);
		r.move(200);
		r.turn(45);
		r.move(500);
		r.penUp();
		r.moveTo(1000, 350);
		r.penDown();
		r.turn(90);
		r.move(600);
		r.turn(144);
		r.move(600);
		r.turn(144);
		r.move(600);
		r.turn(144);
		r.move(600);
		r.turn(144);
		r.move(600);
		r.turn(144);
		
	}
}
