
public class Checkerboard extends Turtle {

	public void paintRow(int offset) {
		if (offset % 2 == 0) {
			for (int j = 0; j < 4; j++) {
				fillBox(20, 20);
				move(0, 40);
			}
			move(180, 140);
			move(90, 20);
			move(90, 0);
		} else {
			for (int j = 0; j < 4; j++) {
				fillBox(20, 20);
				move(0, 40);
			}
			move(180, 180);
			move(90, 20);
			move(90, 0);
		}
	}
	
	public static void main(String[] args) {
		
		Checkerboard mousepad = new Checkerboard();
		
		//positioning for first checkerboard
		mousepad.paint(135, Math.sqrt(9800));
		mousepad.move(-135, 0);
		
		mousepad.switchTo(Turtle.BLACK);
		
		for (int i = 0; i < 8; i++) {
			mousepad.paintRow(i);
		}
		
		//positioning for second checkerboard
		mousepad.move(90, 160);
		mousepad.move(-90, 20);
		
		mousepad.switchTo(Turtle.RED);
		
		for (int i = 1; i < 9; i++) {
			mousepad.paintRow(i);
		}
	}
}
