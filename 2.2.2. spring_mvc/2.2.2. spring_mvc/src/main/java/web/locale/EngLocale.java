package web.locale;

import java.util.ListResourceBundle;

public class EngLocale extends ListResourceBundle {
    private static final Object[][] lang_en =
            {
                    {"cars","CARS"}
            };
    @Override
    protected Object[][] getContents() {
        return lang_en;
    }
}
