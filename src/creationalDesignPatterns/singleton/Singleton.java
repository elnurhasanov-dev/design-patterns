package creationalDesignPatterns.singleton;

public class Singleton {
    private static Singleton instance;
    private Data data;

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    private Singleton(Data data) {
        this.setData(data);
    }

    public static Singleton getInstance(Data data) {
        if (instance == null) {
            instance = new Singleton(data);
        }
        return instance;
    }
}
