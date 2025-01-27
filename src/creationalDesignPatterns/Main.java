package creationalDesignPatterns;

public class Main {
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        Box<String> stringBox = new Box<>();

        integerBox.set(10);
        stringBox.set("Hello");

        Integer integer = integerBox.get();
        String string = stringBox.get();

        System.out.println(integer);
        System.out.println(string);
    }

    public static class Box<T> {
        private T t;

        public void set(T t) {
            this.t = t;
        }

        public T get() {
            return t;
        }
    }
}

