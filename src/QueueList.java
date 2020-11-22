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
