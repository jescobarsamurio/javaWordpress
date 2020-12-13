package batwordpress;

public class BatWordpress {
    
    static Runtime r= Runtime.getRuntime();
    static String bat="cmd /c wordpress.bat";

    public static void main() throws Exception {
        r.exec(bat);
        Thread.sleep(120000);
    }
    
}