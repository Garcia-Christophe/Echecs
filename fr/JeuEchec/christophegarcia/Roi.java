/*    */ package fr.JeuEchec.christophegarcia;
/*    */ 
/*    */ public class Roi
/*    */   extends Piece {
/*    */   public Roi(String couleur) {
/*  6 */     super("roi", couleur);
/*    */   }
/*    */   
/*    */   public boolean estValide(Deplacement deplacement) {
/* 10 */     if (Math.abs(deplacement.getDeplacementX()) <= 1.0D && Math.abs(deplacement.getDeplacementY()) <= 1.0D)
/* 11 */       return true; 
/* 12 */     if (this.couleur.equals("blanc")) {
/* 13 */       if (!Fenetre.petitRoqueBlancInterdit && 
/* 14 */         deplacement.getDepart().getColonne() == 4 && deplacement.getDepart().getLigne() == 7 && 
/* 15 */         deplacement.getDeplacementX() == 2.0D && deplacement.getDeplacementY() == 0.0D && 
/* 16 */         !Fenetre.echiquier.getCase(5, 7).estOccupee() && !Fenetre.echiquier.getCase(6, 7).estOccupee() && 
/* 17 */         !Fenetre.echec("blanc", 4, 7) && !Fenetre.echec("blanc", 5, 7) && !Fenetre.echec("blanc", 6, 7)) {
/* 18 */         Fenetre.petitRoqueBlancInterdit = true;
/* 19 */         Fenetre.grandRoqueBlancInterdit = true;
/* 20 */         return true;
/* 21 */       }  if (!Fenetre.grandRoqueBlancInterdit && 
/* 22 */         deplacement.getDepart().getColonne() == 4 && deplacement.getDepart().getLigne() == 7 && 
/* 23 */         deplacement.getDeplacementX() == -2.0D && deplacement.getDeplacementY() == 0.0D && 
/* 24 */         !Fenetre.echiquier.getCase(1, 7).estOccupee() && !Fenetre.echiquier.getCase(2, 7).estOccupee() && !Fenetre.echiquier.getCase(3, 7).estOccupee() && 
/* 25 */         !Fenetre.echec("blanc", 4, 7) && !Fenetre.echec("blanc", 3, 7) && !Fenetre.echec("blanc", 2, 7)) {
/* 26 */         Fenetre.petitRoqueBlancInterdit = true;
/* 27 */         Fenetre.grandRoqueBlancInterdit = true;
/* 28 */         return true;
/*    */       } 
/*    */     } else {
/* 31 */       if (!Fenetre.petitRoqueNoirInterdit && 
/* 32 */         deplacement.getDepart().getColonne() == 4 && deplacement.getDepart().getLigne() == 0 && 
/* 33 */         deplacement.getDeplacementX() == 2.0D && deplacement.getDeplacementY() == 0.0D && 
/* 34 */         !Fenetre.echiquier.getCase(5, 0).estOccupee() && !Fenetre.echiquier.getCase(6, 0).estOccupee() && 
/* 35 */         !Fenetre.echec("noir", 4, 0) && !Fenetre.echec("noir", 5, 0) && !Fenetre.echec("noir", 6, 0)) {
/* 36 */         Fenetre.petitRoqueNoirInterdit = true;
/* 37 */         Fenetre.grandRoqueNoirInterdit = true;
/* 38 */         return true;
/* 39 */       }  if (!Fenetre.grandRoqueNoirInterdit && 
/* 40 */         deplacement.getDepart().getColonne() == 4 && deplacement.getDepart().getLigne() == 0 && 
/* 41 */         deplacement.getDeplacementX() == -2.0D && deplacement.getDeplacementY() == 0.0D && 
/* 42 */         !Fenetre.echiquier.getCase(1, 0).estOccupee() && !Fenetre.echiquier.getCase(2, 0).estOccupee() && !Fenetre.echiquier.getCase(3, 0).estOccupee() && 
/* 43 */         !Fenetre.echec("noir", 4, 0) && !Fenetre.echec("noir", 3, 0) && !Fenetre.echec("noir", 2, 0)) {
/* 44 */         Fenetre.petitRoqueNoirInterdit = true;
/* 45 */         Fenetre.grandRoqueNoirInterdit = true;
/* 46 */         return true;
/*    */       } 
/*    */     } 
/* 49 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\Christophe\Documents\MesProjets\Échec\Echec.jar!\fr\JeuEchec\christophegarcia\Roi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */