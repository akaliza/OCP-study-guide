import java.util.*;

public class MultiGenericParam<T, S> {
    private T firstParam;
    private S secondParam;
   
    public MultiGenericParam(T firstParam, S secondParam) {
        this.firstParam = firstParam;
        this.secondParam = secondParam;
    }
    
    public T getFirstParam() {
        return firstParam;
    }
    
    public void setFirstParam(T firstParam) {
        this.firstParam = firstParam;
    }
    
    public S getSecondParam() {
        return secondParam;
    }
    
    public void setSecondParam(S secondParam) {
        this.secondParam = secondParam;
    }
}