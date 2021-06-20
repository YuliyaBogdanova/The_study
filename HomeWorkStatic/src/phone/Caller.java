package phone;

public class Caller {
    protected static String name;

    public Caller(String callerName) {
        this.name = callerName;
    }

    public static void showCaller() {
        System.out.println("Incoming call from  " + name);
    }

    }
