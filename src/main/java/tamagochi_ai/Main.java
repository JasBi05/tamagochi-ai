package tamagochi_ai;

public class Main {
    public static void main(String[] args) {
        Canvas canvas = new Canvas();
        Chat chat = new Chat();
        canvas.createCanvas();
        chat.createChat(canvas);

    }
}