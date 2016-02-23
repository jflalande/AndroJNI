package andro.jf.jni;

public class NativeCodeInterface {
    
    public static native int calcul1(int x, int y);
    
    public static int add(int x, int y)
    {
        int somme;
        somme = calcul1(x,y);
        return somme;
    }
    
    static {
        System.loadLibrary("testmodule");
    }
}
