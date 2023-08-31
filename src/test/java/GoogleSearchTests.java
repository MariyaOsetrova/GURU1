/*      1. Открыть google.com
        2. Ввести "Selenide" в поле поиска
        3. Проверить, что "selenide.org" появилось в результатах поиска
*/
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GoogleSearchTests {

        @Test // при добавлении ниже появляется play
        void selenideSearchTest () {
            //1. Открыть google.com
        open("https://www.google.com/");
            //2. Ввести "Selenide" в поле поиска
            //("name="q"") посомтрели из devtools
    //    $("[name=q]").setValue("Selenide").pressEnter();
            $("[name=q]").setValue("Selenide").pressEnter();
            $("#search").shouldHave((text("selenide.org")));
    }
    }


