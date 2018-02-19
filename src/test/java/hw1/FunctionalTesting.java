package hw1;

import net.yandex.speller.services.spellservice.*;
import org.testng.annotations.Test;

import java.util.List;

public class FunctionalTesting {

    @Test
    public void checkServiceFunctionality() {
        String message = "Идет коза рагаятая за малымы ребятами";
        SpellService service = new SpellService();
        SpellServiceSoap port = service.getSpellServiceSoap();
        CheckTextRequest request = new CheckTextRequest();
        request.setLang("ru");
        request.setOptions(0);
        request.setFormat("plain");
        request.setText(message);
        CheckTextResponse response = port.checkText(request);
        List<SpellError> errorList = response.getSpellResult().getError();

        System.out.println("MESSAGE: \n" + message + "\n");
        System.out.println("SPELL_ERRORS: ");
        if (errorList.size() > 0) {
            errorList.forEach(
                    spellError -> {
                        System.out.print(spellError.getWord() + " ---> ");
                        spellError.getS().forEach(e -> System.out.println("recommended change to: " + e));
                    });
        } else {
            System.out.print("NONE\n");
        }
    }
}
