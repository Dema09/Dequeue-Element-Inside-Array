import java.util.Scanner;

public class main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {
        QueueList queueList = new QueueList();

        System.out.print("Input the size of array: ");
        int n = sc.nextInt();
        sc.nextLine();

        queueList.setQueueList(queueList.initArray(n));
        System.out.println(queueList.initArray(n));

        while(true) {
            queueList.dequeueList();

            for(int i=0; i< queueList.getQueueList().size(); i++){
                Thread.sleep(2000);
                System.out.print(queueList.getQueueList().get(i) + " ");

                if(i == queueList.getQueueList().size() - 1){
                    System.out.println();
                }
            }
        }

}
}
