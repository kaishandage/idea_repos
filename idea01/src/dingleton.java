public class dingleton {
    private static dingleton ourInstance = new dingleton();

    public static dingleton getInstance() {
        return ourInstance;
    }

    private dingleton() {



    }
}
