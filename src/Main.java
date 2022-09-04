import eventHandler.EventHandler;
import gui.GUI;
import imageProcessor.ImageProcessor;


public class Main {

    /**
     * Initializes each of the primary components of the program, then associates them with one another.
     * @param args The commandline arguments passed to the program.
     */
    public static void main(String[] args) {
        EventHandler handler = new EventHandler();
        GUI gui = new GUI();
        ImageProcessor imageProcessor = new ImageProcessor(handler, gui);
        handler.setGUI(gui);
        gui.setHandler(handler);
        gui.setImageProcessor(imageProcessor);
        gui.populate();
        loadFileOnStartup(args, handler);
    }

    /**
     * Loads the contents of a TIMELINE file passed to the program through the commandline.
     * @param args The commandline arguments passed to the program.
     * @param handler The program's EventHandler.
     */
    private static void loadFileOnStartup(String[] args, EventHandler handler) {
        if (args.length > 0) {
            String filename = args[0];
            handler.loadFileOnStartup(filename);
        }
    }
}
