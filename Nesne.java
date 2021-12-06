package singletonpattern;
import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author ÖZGE
 */
public class Nesne extends ayarlar{
    protected static Nesne nesne;
    private Nesne(){}
    static Lock kilit = new ReentrantLock();
    public static Nesne NesneOlustur(){
        if(nesne==null){
            kilit.lock();
            try {
                {
                    if(nesne==null){
                        nesne=new Nesne();
                        System.out.println("Nesne oluşturuldu");
                    }
                }   } finally {
                kilit.unlock();
            }
        }
        return nesne;
    }
    
    public void  Gorunum1 (){      
        setMailKutusuKonum("sol");
        setBaslikKonum("sag_ust");
        setMailIcerikKonum("sag_alt");
        setMailKutusuBoyut(300);       
        setBaslikBoyut(600);
        setMailIcerikBoyut(900);     
          
        System.out.println("GÖRÜNÜM 1");
        System.out.println("Mail kutusu:" +getMailKutusuKonum()+" ,"+getMailKutusuBoyut());
        System.out.println("Mail İçerik:" +getMailIcerikKonum()+" ,"+getMailIcerikBoyut());
        System.out.println("Başlıklar:" +getBaslikKonum()+" ,"+getBaslikBoyut());    
}
    
    public void  Gorunum2 (){  
        setMailKutusuKonum("sol_ust");
        setBaslikKonum("orta");
        setMailIcerikKonum("alt");
        setMailKutusuBoyut(200);
        setBaslikBoyut(300);
        setMailIcerikBoyut(600);
        
        System.out.println("GÖRÜNÜM 2");
        System.out.println("Mail kutusu:" +getMailKutusuKonum()+" ,"+getMailKutusuBoyut());
        System.out.println("Mail İçerik:" +getMailIcerikKonum()+" ,"+getMailIcerikBoyut());
        System.out.println("Başlıklar:" +getBaslikKonum()+" ,"+getBaslikBoyut());
    }   
    
    public void randomGorunum(){
        Random rand = new Random();
        int num = rand.nextInt(2);   
        //System.out.println(num);
        switch(num){
            case 0: this.nesne.Gorunum1(); break;
            case 1: this.nesne.Gorunum2(); break;
            default : System.out.println("Geçerli değer yok");
        }
    }
    
    
}
