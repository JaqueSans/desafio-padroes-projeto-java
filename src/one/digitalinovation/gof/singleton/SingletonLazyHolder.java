package one.digitalinovation.gof.singleton;
/**
 * Singleton "preguiçoso"
 * @author Jaqueline
 */
public class SingletonLazyHolder {
    private static class InstanceHolder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();

    }

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getIntancia() {
        return InstanceHolder.instancia;
    }

}
