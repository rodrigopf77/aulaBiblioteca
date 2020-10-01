package principal;

public class ClassTesteDebug {
    
    public void debugMetodo(){
        System.out.println("Cheguei no metodo DEBUG");
        int total = 0;
        int x;
        
        for(x = 0; x <= 3; x++){
            total = total + x + 1;
        }
        
        System.out.println("Sai do for");
        
        System.out.println("Total: " + total);
        System.out.println("X: " + x);
    }

    
}
