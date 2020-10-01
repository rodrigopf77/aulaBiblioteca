package principal;

public class ClassTesteDebug {
    
    public void debugMetodo(){
        int total = 0;
        int x;
        
        for(x = 0; x <= 3; x++){
            total = total + x + 1;
        }
        
        System.out.println("Total: " + total);
        System.out.println("X: " + x);
    }

    
}
