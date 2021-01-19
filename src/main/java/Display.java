public class Display {
    int displayHeight;
    int displayWidth;
    public void getDisplay(){
        Pixel pixel = new Pixel(10, 10, Color.GREEN);

    }

    private class Pixel{
        private int x;
        private int y;
        private Color color;

        private Pixel(int x, int y, Color color) {
            this.x = x;
            this.y = y;
            this.color = color;
        }
    }
    public enum Color {
        RED, GREEN, BLUE, CYAN, MAGENTA, YELLOW, BLACK, WHITE;

    }
}
