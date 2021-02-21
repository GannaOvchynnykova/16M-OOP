public class Worker {
    String name;
    int age;
    int workerID;
    static int count = 0;

    public Worker() {

    }

    public Worker(int workerID) {
        this.workerID = workerID;
    }

    public Worker(String name) {
        this.name = name;
        workerID = count;
        count++;
    }

    static class TestWorker {
        public static void main(String[] args) {
            Worker worker1 = new Worker();
            System.out.println(worker1.workerID);

            Worker worker2 = new Worker(1);
            System.out.println(worker2.workerID);

            Worker worker3 = new Worker(666);
            System.out.println(worker3.workerID);

            Worker worker4 = new Worker("Sergi");
            System.out.println(worker4.workerID);

            Worker worker5 = new Worker("Dima");
            System.out.println(worker5.workerID);
        }
    }
}
