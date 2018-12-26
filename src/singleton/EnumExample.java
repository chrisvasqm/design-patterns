package singleton;

public class EnumExample {
    public static void main(String[] args) {
        var singleton = EnumSingleton.INSTANCE;
        singleton.somethning();
    }
}

enum EnumSingleton {
    INSTANCE;

    public void somethning() {
        System.out.println("Something");
    }

}