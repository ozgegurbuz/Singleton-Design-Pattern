package singletonpattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ÖZGE
 */
public abstract class ayarlar {
    private String mailKutusuKonum;
    private String baslikKonum;
    private String mailIcerikKonum;
    private int mailKutusuBoyut;
    private int baslikBoyut;
    private int mailIcerikBoyut;
    public Nesne nesne;
    //abstract void NesneOlustur(Nesne nesne );
    
  
    public String getMailKutusuKonum() {
        return mailKutusuKonum;
    }
    
    public void setMailKutusuKonum(String mailKutusuKonum) {
        this.mailKutusuKonum = mailKutusuKonum;
    }
    
    public String getBaslikKonum() {
        return baslikKonum;
    }

    public void setBaslikKonum(String baslikKonum) {
        this.baslikKonum = baslikKonum;
    }

    public String getMailIcerikKonum() {
        return mailIcerikKonum;
    }

    public void setMailIcerikKonum(String mailIcerikKonum) {
        this.mailIcerikKonum = mailIcerikKonum;
    }

    public int getMailKutusuBoyut() {
        return mailKutusuBoyut;
    }

    public void setMailKutusuBoyut(int mailKutusuBoyut) {
        this.mailKutusuBoyut = mailKutusuBoyut;
    }

    public int getBaslikBoyut() {
        return baslikBoyut;
    }

    public void setBaslikBoyut(int baslikBoyut) {
        this.baslikBoyut = baslikBoyut;
    }

    public int getMailIcerikBoyut() {
        return mailIcerikBoyut;
    }
   
    public void setMailIcerikBoyut(int mailIcerikBoyut) {
        this.mailIcerikBoyut = mailIcerikBoyut;
    }
}
