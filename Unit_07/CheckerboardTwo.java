
public class CheckerboardTwo {

	public static void main(String[] args) {
		
		Turtle box = new Turtle();
		
		box.paint(135, Math.sqrt(9800));
		box.move(-135, 0);
		
		for (int i = 0; i < 8; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < 8; j++) {
					if (j % 2 == 0) {
						box.switchTo(Turtle.BLACK);
						box.fillBox(20, 20);
						box.move(0, 20);
					} else {
						box.switchTo(Turtle.MAGENTA);
						box.fillBox(20, 20);
						box.move(0, 20);
					}
				}
			} else {
				for (int j = 1; j < 9; j++) {
					if (j % 2 == 0) {
						box.switchTo(Turtle.BLACK);
						box.fillBox(20, 20);
						box.move(0, 20);
					} else {
						box.switchTo(Turtle.MAGENTA);
						box.fillBox(20, 20);
						box.move(0, 20);
					}
				}
			}
			box.move(180, 160);
			box.move(90, 20);
			box.move(90, 0);
		}
	}
}
