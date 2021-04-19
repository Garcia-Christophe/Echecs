/*    */ package fr.JeuEchec.christophegarcia;
/*    */ 
/*    */ import java.applet.AudioClip;
/*    */ import java.io.File;
/*    */ import java.net.URL;
/*    */ import javax.sound.sampled.AudioSystem;
/*    */ import javax.sound.sampled.Clip;
/*    */ 
/*    */ public class Musique
/*    */   extends Thread
/*    */ {
/*    */   private URL url;
/*    */   private AudioClip sound;
/*    */   
/*    */   public Musique() {
/*    */     try {
/* 17 */       Clip clip = AudioSystem.getClip();
/* 18 */       clip.open(AudioSystem.getAudioInputStream(new File("musiquePrincipale.wav")));
/* 19 */       clip.start();
/*    */     }
/* 21 */     catch (Exception e1) {
/* 22 */       e1.getStackTrace();
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Christophe\Documents\MesProjets\Échec\Echec.jar!\fr\JeuEchec\christophegarcia\Musique.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */