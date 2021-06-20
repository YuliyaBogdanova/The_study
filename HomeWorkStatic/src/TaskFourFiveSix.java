// Дана строка, посчитать в ней отдельно количество запятых, пробелов и точек. Вывести на экран их количество.
//Подсчитать количество слов в тексте
//Вывести текст, составленный из последних букв всех слов.

public class TaskFourFiveSix {

    public static void main(String[] args) {
        String str = "A robber was robbing a house when he heard a voice. " +
                "'Jesus is watching you!'  'who's there?', The robber said But no sound was heard. " +
                "So he kept going and he heard it two more times when he spotted a parrot. 'What's your name', " +
                "the robber asked. 'Cocodora', said the parrot. 'Now, what kind of idiot would name a bird Cocodora', " +
                " said the robber. 'The same idiot who named the rotweiler Jesus', said the parrot.    ";
        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;
        char k;
        for (int i = 0; i < str.length(); i++) {
            k = str.charAt(i);
            if (k == ' ')
                counter1++;
            if (k == ',')
                counter2++;
            if (k == '.')
                counter3++;
        }
        System.out.println("Number of ' ' per line is: " + counter1);
        System.out.println("Number of ',' per line is: " + counter2);
        System.out.println("Number of '.' per line is: " + counter3);

// Task 5. Don't use the next current because for task 4-6 i get same text

        int counter4 = 0;
        String j = "\\s+";
        String[] word = str.split(j);
        for (int i = 0; i < word.length; i++) {
            counter4++;
        }
            System.out.println(counter4);

//Task 6

        StringBuilder mySentence = new StringBuilder();
        str = str.replaceAll("\\.", " ");
        str = str.replaceAll("\\,", " ");
               String j1 = "\\s+";
        String[] word1 = str.split(j1);
        for (int i = 0; i< word.length; i++) {
            String words = word1 [i];
            mySentence.append(words.charAt(words.length() - 1));
        }
        System.out.println(mySentence);
        }
        }
