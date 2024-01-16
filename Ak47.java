
package armory;

public class Ak47 {
    String name;
    int bullet, reload, Shoot; 
    
    void bullet(){
        System.out.println(name +" Ammo");
        System.out.println("Bullet "+ bullet);
    }
    
    void Shoot(){
        bullet--;
        if(bullet > 10){
           Shoot++;
            System.out.println("Ak47 is Shooting");
        } else {
            System.out.println("Low Ammo, Reload!!!");
        }
        
//        System.out.println(name +"Shooting");
//        System.out.println("Shooting"+ Shoot);
    }
    
    void reload(){
        bullet--;
        if(bullet <= 0){
           System.out.println("Ak47 is Reloading");
        }
             
//        System.out.println(name +" Reloading");
//        System.out.println("Reloading "+ reload);
    }
    
    
    
    
}
