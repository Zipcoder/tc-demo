package rocks.zipcodewilmington.week11.tools;

import java.util.Locale;
import java.util.stream.Stream;

/**
 * Created by leon on 6/8/17.
 */
public class LocaleFactory {

    public static Locale createLocale() {
        return new Locale.Builder().build();
    }

    public static Stream<Locale> createLocaleStream(int streamCount) {
        return Stream.generate(LocaleFactory::createLocale).limit(streamCount);
    }
}
