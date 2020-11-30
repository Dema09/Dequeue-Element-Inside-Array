import java.util.ArrayList;
import java.util.List;

public class QueueList {

    private List<String> queueList;

    public List<String> getQueueList() {
        return queueList;
    }

    public void setQueueList(List<String> queueList) {
        this.queueList = queueList;
    }

    public List<String> initArray(int numberOfArray){
        char alphabet = 'a';
        int asciiValueForAlphabet = (int) alphabet;
        int counterForAlphabet = 0;


        List<String> queueListString = new ArrayList<>();

        char number = '1';
        int asciiValueForNumber = (int) number;

        for(int i = 0; i<numberOfArray; i++){
                if (numberOfArray % 2 == 0) {
                    if(counterForAlphabet % numberOfArray != numberOfArray / 2) {

                        char asciiToCharForAlphabet = (char) asciiValueForAlphabet;
                        queueListString.add(Character.toString(asciiToCharForAlphabet));

                        asciiValueForAlphabet++;
                        counterForAlphabet++;
                    }else{

                            char asciiToCharForNumber =  (char) asciiValueForNumber;
                            queueListString.add(Character.toString(asciiToCharForNumber));
                            asciiValueForNumber++;
                    }
                }else{
                        if (asciiValueForNumber > 47 && asciiValueForNumber < 58){
                            char asciiToCharForNumber = (char) asciiValueForNumber;
                            queueListString.add(Character.toString(asciiToCharForNumber));
                            asciiValueForNumber++;
                        }
                        else{
                            break;
                        }
                    }
                }
        return queueListString;
    }

    public List<String> dequeueList() {
        List<String> newListString = new ArrayList<>();

        for (int i = 0; i < queueList.size(); i++) {
            String temp = "";
            String nextIndexString = "";
            temp = queueList.get(0);

            if(i != queueList.size() - 1) {
                nextIndexString = queueList.get(i + 1);
                newListString.add(queueList.indexOf(queueList.get(i)), nextIndexString);
            }

            if (nextIndexString.equals("") || nextIndexString == null) {
                newListString.add(queueList.indexOf(queueList.get(i)), temp);
            }
        }
        setQueueList(newListString);
        return newListString;
    }
}
