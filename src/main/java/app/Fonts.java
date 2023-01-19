package app;

import io.github.humbleui.skija.Font;
import io.github.humbleui.skija.FontMgr;
import io.github.humbleui.skija.FontStyle;
import misc.Misc;

/**
 * Класс шрифтов
 */
public class Fonts {
    /**
     * 12 шрифт слишком маленький, поэтому приходится определить его немного по-другому
     */
    public static final Font FONT12 = new Font(FontMgr.getDefault().matchFamilyStyleCharacter(null, FontStyle.NORMAL, null, "↑".codePointAt(0)), 12);

    /**
     * 18 шрифт слишком маленький, поэтому приходится определить его немного по-другому
     */
    public static final Font FONT18 = new Font(FontMgr.getDefault().matchFamilyStyle(null, FontStyle.NORMAL), 18);
    /**
     * 24 шрифт слишком маленький, поэтому приходится определить его немного по-другому
     */
    public static final Font FONT24 = new Font(FontMgr.getDefault().matchFamilyStyle(null, FontStyle.NORMAL), 24);

    /**
     * Цвет текста заголовка
     */
    public static final int LABEL_TEXT_COLOR = Misc.getColor(64, 255, 255, 255);
    /**
     * цвет подложки панелей
     */
    public static final int PANEL_BACKGROUND_COLOR = Misc.getColor(32, 0, 0, 0);

    /**
     * Запрещённый конструктор
     */
    private Fonts() {
        throw new AssertionError("Этот конструктор нельзя вызывать");
    }
}