package web.locale;

import java.util.ListResourceBundle;

public class RuLocale extends ListResourceBundle {
    private static final Object[][] lang_ru =
            {
                    {"cars","МАШИНЫ"}
            };
    @Override
    protected Object[][] getContents() {
        return lang_ru;
    }
}

