package game;

import java.util.ArrayList;
import java.util.List;

public class WordGame extends AbstractGame {
    @Override
    List<String> generateCharList() {
        List<String> charList = new ArrayList<String>();
        for (char i = 'a'; i <= 'z'; ++i) {
            charList.add(String.valueOf(i));
        }
        return charList;
    }
}
