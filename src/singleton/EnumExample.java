package singleton;

public class EnumExample {
    public static void main(String[] args) {
        var singleton = EnumSingleton.INSTANCE;
        singleton.somethning();
    }
}

// This is the preferred way of doing enums in Java, from the Effective Java book samples.
enum EnumSingleton {
    INSTANCE;

    public void somethning() {
        System.out.println("Something");
    }

}