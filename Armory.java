
package armory;

public class Armory {
    public static void main(String[] args) {
        Ak47 Gun = new Ak47();
        
        Gun.name    = "Ak47";
        Gun.bullet  = 30;
        Gun.Shoot   = 1;
        Gun.reload  = 30;
        
        Gun.bullet();
        Gun.Shoot();
        Gun.reload();
        
        
    }
    
}
