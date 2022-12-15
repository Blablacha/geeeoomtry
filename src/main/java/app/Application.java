package app;

import io.github.humbleui.jwm.*;

import java.io.File;
import java.util.function.Consumer;
/**
 * Класс окна приложения
 */
public class Application implements Consumer<Event> {
    /**
     * окно приложения
     */
    private final Window window;
    /**
     * Конструктор окна приложения
     */
    public Application() {

        window = App.makeWindow();
        window.setEventListener(this);
        // задаём размер окна
        window.setWindowSize(900, 900);
// задаём его положение
        window.setWindowPosition(100, 100);
        window.setTitle("Java 2D");
        // задаём иконку
        switch (Platform.CURRENT) {
            case WINDOWS -> window.setIcon(new File("src/main/resources/windows.ico"));
            case MACOS -> window.setIcon(new File("src/main/resources/macos.icns"));
        }
        window.setVisible(true);
    }

    /**
     * обработчик событий
     *
     * @param e событие
     */
    @Override
    public void accept(Event e) {
        if (e instanceof EventWindowClose) {
            App.terminate();
        }else if (e instanceof EventWindowCloseRequest) {
            window.close();
        }
    }
}
