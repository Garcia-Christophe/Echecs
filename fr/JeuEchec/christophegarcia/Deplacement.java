/*    */ package fr.JeuEchec.christophegarcia;
/*    */ 
/*    */ public class Deplacement {
/*    */   private Position depart;
/*    */   private Position arrivee;
/*    */   private double deplacementX;
/*    */   private double deplacementY;
/*    */   
/*    */   public Deplacement(Position depart, Position arrivee) {
/* 10 */     this.depart = depart;
/* 11 */     this.arrivee = arrivee;
/* 12 */     this.deplacementX = (arrivee.getColonne() - depart.getColonne());
/* 13 */     this.deplacementY = (arrivee.getLigne() - depart.getLigne());
/*    */   }
/*    */   
/*    */   public Position getDepart() {
/* 17 */     return this.depart;
/*    */   }
/*    */   
/*    */   public Position getArrivee() {
/* 21 */     return this.arrivee;
/*    */   }
/*    */   
/*    */   public double getDeplacementX() {
/* 25 */     return this.deplacementX;
/*    */   }
/*    */   
/*    */   public double getDeplacementY() {
/* 29 */     return this.deplacementY;
/*    */   }
/*    */   
/*    */   public boolean noDep() {
/* 33 */     return (this.deplacementX == 0.0D && this.deplacementY == 0.0D);
/*    */   }
/*    */ }


/* Location:              C:\Users\Christophe\Documents\MesProjets\Échec\Echec.jar!\fr\JeuEchec\christophegarcia\Deplacement.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */