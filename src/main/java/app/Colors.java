package app;

import misc.Misc;

/**
 * Класс цветов
 */
public class Colors {
    /**
     * цвет фона
     */
    public static final int APP_BACKGROUND_COLOR = Misc.getColor(255, 38, 70, 83);

    /**
     * Цвет текста
     */
    public static final int MULTILINE_TEXT_COLOR = Misc.getColor(64, 255, 255, 255);

    /**
     * Цвет подложки поля ввода
     */
    public static final int FIELD_BACKGROUND_COLOR = Misc.getColor(255, 255, 255, 255);
    /**
     * Цвет текста
     */
    public static final int FIELD_TEXT_COLOR = Misc.getColor(255, 0, 0, 0);

    /**
     * Цвет кнопки
     */
    public static final int BUTTON_COLOR = Misc.getColor(80, 0, 0, 0);

    /**
     * Цвет сетки
     */
    public static final int TASK_GRID_COLOR = Misc.getColor(64, 255, 255, 255);

    /**
     * Цвет пересечения
     */
    public static final int CROSSED_COLOR = Misc.getColor(200, 0, 255, 255);
    /**
     * Цвет разности
     */
    public static final int SUBTRACTED_COLOR = Misc.getColor(200, 255, 255, 0);

    /**
     * Цвет подложки
     */
    public static final int STATS_BACKGROUND_COLOR = Misc.getColor(64, 51, 200, 51);
    /**
     * Цвет подложки
     */
    public static final int STATS_COLOR = Misc.getColor(255, 51, 200, 51);
    /**
     * Цвет текста
     */
    public static final int STATS_TEXT_COLOR = Misc.getColor(255, 255, 255, 255);

    /**
     * Запрещённый конструктор
     *
     */
    private Colors() {
        throw new AssertionError("Вызов этого конструктора запрещён");
    }
}