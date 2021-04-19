/*    */ package fr.JeuEchec.christophegarcia;
/*    */ 
/*    */ public abstract class Piece {
/*    */   private String nom;
/*    */   protected String couleur;
/*    */   
/*    */   public Piece(String nom, String couleur) {
/*  8 */     setNom(nom);
/*  9 */     setCouleur(couleur);
/*    */   }
/*    */   
/*    */   public String getNom() {
/* 13 */     return this.nom;
/*    */   }
/*    */   
/*    */   public String getCouleur() {
/* 17 */     return this.couleur;
/*    */   }
/*    */   
/*    */   public void setNom(String nom) {
/* 21 */     if (nom == "tour" || nom == "cavalier" || nom == "fou" || nom == "reine" || nom == "roi" || nom == "pion") {
/* 22 */       this.nom = nom;
/*    */     }
/*    */   }
/*    */   
/*    */   public void setCouleur(String couleur) {
/* 27 */     if (couleur == "blanc" || couleur == "noir")
/* 28 */       this.couleur = couleur; 
/*    */   }
/*    */   
/*    */   public abstract boolean estValide(Deplacement paramDeplacement);
/*    */ }


/* Location:              C:\Users\Christophe\Documents\MesProjets\Échec\Echec.jar!\fr\JeuEchec\christophegarcia\Piece.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */