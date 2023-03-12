package game;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println("1-цифры");
        System.out.println("2-буквы EN");
        System.out.println("3-буквы RU");
        Scanner in=new Scanner(System.in);
        System.out.println("Выберите игру");
        int num=in.nextInt();
        Game game = null;
        switch (num){
            case 1:game=new NumberGame();
                break;
            case 2:game=new WordGame();
                break;
            case 3:game=new WordRussianGame();
                break;
            default:
                System.out.println("такой игры еще не существует");
        }
        num = 0;
        while (num<=0){
            System.out.println("Введите размер загадываемого 'слова'");
            num= in.nextInt();
        }

        int i = 0;
        while (i<=0){
            System.out.println("Введите кол-во попыток на отгадывание");
            i = in.nextInt();
        }

        game.start(num,i);
        while(game.getGameStatus().equals(GameStatus.START)){
            System.out.println("ваш ход");
            String answer=in.next();
            Answer answerGame=game.inputAnswer(answer);
            System.out.println(String.format("Найдено %d коров и %d быков",answerGame.getCows(),answerGame.getBulls()));
        }
        System.out.println(game.getGameStatus());
    }
}
