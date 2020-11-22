import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        List<String> inputList = new ArrayList<>();
        QueueList queueList = new QueueList();

        System.out.print("Input the size of array: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("input the element: ");
            String inputtedString = sc.nextLine();
            inputList.add(inputtedString);
        }

        if (n % 2 == 0) {
            for (String inputString : inputList) {
                if (!checkRegexAlphaNumeric(inputString)) {
                    System.out.print("Your Input Must be an Alpha Numeric!");
                    return;
                }
            }
        } else {
            for (int k = 0; k < inputList.size(); k++) {
                if (!(inputList.get(k).charAt(k) > '0' && inputList.get(k).charAt(k) < '9')) {
                    System.out.print("Your Input Must be a Numeric!");
                    return;
                }
            }
        }
        queueList.setQueueList(inputList);
        queueList.dequeueList();

        for(String dequeuedString : queueList.getQueueList()){
            System.out.println(dequeuedString);
        }
}

    private static boolean checkRegexAlphaNumeric(String inputtedString) {
        if(inputtedString.matches(ProgramEnum.REGEX_ALPHANUMERIC.getRegex())){
            return true;
        }
        else{
            return false;
        }
    }
}
