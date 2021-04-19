/*      */ package fr.JeuEchec.christophegarcia;
/*      */ 
/*      */ import java.awt.Color;
/*      */ import java.awt.Cursor;
/*      */ import java.awt.Dimension;
/*      */ import java.awt.Font;
/*      */ import java.awt.GridLayout;
/*      */ import java.awt.LayoutManager;
/*      */ import java.awt.Rectangle;
/*      */ import java.awt.event.ActionEvent;
/*      */ import java.awt.event.ActionListener;
/*      */ import java.awt.event.MouseAdapter;
/*      */ import java.awt.event.MouseEvent;
/*      */ import java.io.ByteArrayOutputStream;
/*      */ import java.io.InputStream;
/*      */ import java.util.ArrayList;
/*      */ import java.util.Iterator;
/*      */ import java.util.Timer;
/*      */ import java.util.TimerTask;
/*      */ import javax.sound.sampled.Clip;
/*      */ import javax.swing.BorderFactory;
/*      */ import javax.swing.BoxLayout;
/*      */ import javax.swing.Icon;
/*      */ import javax.swing.ImageIcon;
/*      */ import javax.swing.JButton;
/*      */ import javax.swing.JFrame;
/*      */ import javax.swing.JLabel;
/*      */ import javax.swing.JPanel;
/*      */ import javax.swing.JTextField;
/*      */ import javax.swing.border.Border;
/*      */ import javax.swing.border.TitledBorder;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class Fenetre
/*      */   extends JFrame
/*      */ {
/*  125 */   static Echiquier echiquier = new Echiquier();
/*  126 */   static JLabel[][] tabLabels = new JLabel[8][8];
/*      */   
/*  128 */   static JPanel panelControles = new JPanel();
/*  129 */   private JPanel panelEchiquier = new JPanel();
/*  130 */   GridLayout gridLayout1 = new GridLayout();
/*      */   
/*  132 */   private JButton boutonValiderNomJoueurs = new BoutonRond("Fenetre.getRessourceAsBytes(\"valider.png\")");
/*  133 */   static JButton boutonLancer = new BoutonRond("Fenetre.getRessourceAsBytes(\"play.png\")");
/*  134 */   static JButton boutonPause = new BoutonRond("Fenetre.getRessourceAsBytes(\"pause.png\")");
/*  135 */   static JButton boutonRestart = new BoutonRond("Fenetre.getRessourceAsBytes(\"restart.png\")");
/*  136 */   private JPanel imageTourBlanc = new JPanel();
/*  137 */   private JPanel vertTourBlanc = new JPanel();
/*  138 */   static JLabel couleurTourBlanc = new JLabel();
/*  139 */   static JTextField champTemps = new JTextField();
/*  140 */   private JPanel vertTourNoir = new JPanel();
/*  141 */   JLabel couleurTourNoir = new JLabel();
/*  142 */   private JPanel imageTourNoir = new JPanel();
/*  143 */   private JButton boutonAbandonner = new BoutonRond("Fenetre.getRessourceAsBytes(\"abandonner.png\")");
/*  144 */   private JButton boutonChangerNom = new BoutonRond("Fenetre.getRessourceAsBytes(\"editNom.png\")");
/*  145 */   private JButton boutonOptions = new BoutonRond("Fenetre.getRessourceAsBytes(\"parametresO.png\")");
/*      */   
/*      */   static boolean surLeBouton = false;
/*  148 */   private JPanel panelGauche = new JPanel();
/*  149 */   private JPanel panelMortGauche = new JPanel();
/*  150 */   private JPanel panelNomJGauche = new JPanel();
/*  151 */   static JLabel nomJoueurGauche = new JLabel();
/*  152 */   private JPanel panelDroite = new JPanel();
/*  153 */   private JPanel panelMortDroite = new JPanel();
/*  154 */   private JPanel panelNomJDroite = new JPanel();
/*  155 */   static JLabel nomJoueurDroite = new JLabel();
/*      */ 
/*      */   
/*  158 */   private Font policeNbPiecesMortes = new Font("Arial", 1, 50);
/*  159 */   private Color colorNbPiecesMortes = Color.white;
/*  160 */   private static JPanel pionMortGauche = new JPanel(); private JLabel pionMortGaucheLabel = new JLabel();
/*  161 */   private static JPanel pionMortDroite = new JPanel(); private JLabel pionMortDroiteLabel = new JLabel();
/*  162 */   private static JPanel tourMortGauche = new JPanel(); private JLabel tourMortGaucheLabel = new JLabel();
/*  163 */   private static JPanel tourMortDroite = new JPanel(); private JLabel tourMortDroiteLabel = new JLabel();
/*  164 */   private static JPanel cavalierMortGauche = new JPanel(); private JLabel cavalierMortGaucheLabel = new JLabel();
/*  165 */   private static JPanel cavalierMortDroite = new JPanel(); private JLabel cavalierMortDroiteLabel = new JLabel();
/*  166 */   private static JPanel fouMortGauche = new JPanel(); private JLabel fouMortGaucheLabel = new JLabel();
/*  167 */   private static JPanel fouMortDroite = new JPanel(); private JLabel fouMortDroiteLabel = new JLabel();
/*  168 */   private static JPanel reineMortGauche = new JPanel(); private JLabel reineMortGaucheLabel = new JLabel();
/*  169 */   private static JPanel reineMortDroite = new JPanel(); private JLabel reineMortDroiteLabel = new JLabel();
/*      */   
/*      */   static String nomJoueur1;
/*      */   static String nomJoueur2;
/*  173 */   private Font nomJoueursFont = new Font("Arial", 1, 50);
/*      */   
/*      */   static int heures;
/*      */   
/*      */   static int minutes;
/*      */   static int secondes;
/*  179 */   private int tempsSecondes = 0; static boolean preparationPiecesMortesFaite = false; static String titreAffichage;
/*      */   static boolean affichageCoupSpecial = false;
/*      */   private boolean affichage1SEC = false;
/*      */   private boolean affichage2SEC = false;
/*      */   static boolean lancerEnable = true;
/*      */   static boolean pauseEnable = false;
/*      */   static boolean restartEnable = false;
/*  186 */   static String couleurControle = "blanc";
/*  187 */   private static ArrayList<Position> casesValides = new ArrayList<>();
/*      */   
/*      */   static boolean joueurGaucheAGagne = false;
/*      */   
/*      */   static boolean priseEnPassantPossible = false;
/*      */   
/*      */   private int posXPiecePEP;
/*      */   private int posYPiecePEP;
/*      */   static boolean petitRoqueBlancInterdit = false;
/*      */   static boolean grandRoqueBlancInterdit = false;
/*      */   static boolean petitRoqueNoirInterdit = false;
/*      */   static boolean grandRoqueNoirInterdit = false;
/*      */   static boolean promotionPossible = false;
/*  200 */   static Thread thread = new Thread();
/*      */   static boolean aChoisiReine;
/*      */   static boolean aChoisiTour;
/*      */   static boolean aChoisiFou;
/*      */   static boolean aChoisiCavalier;
/*  205 */   static Piece piecePromotion = null;
/*  206 */   static ImageIcon piecePromotionIcon = null;
/*      */   
/*      */   static boolean fin = false;
/*  209 */   int nbPionMortGauche = 0, nbTourMortGauche = 0, nbCavalierMortGauche = 0, nbFouMortGauche = 0, nbReineMortGauche = 0;
/*  210 */   int nbPionMortDroite = 0; int nbTourMortDroite = 0; int nbCavalierMortDroite = 0; int nbFouMortDroite = 0; int nbReineMortDroite = 0;
/*      */ 
/*      */   
/*  213 */   static String couleurPrincipale = "orange";
/*      */   
/*  215 */   static JLabel pionMortGaucheImage = new JLabel(new ImageIcon(getRessourceAsBytes("pionMort" + couleurPrincipale + ".png")));
/*  216 */   static JLabel pionMortDroiteImage = new JLabel(new ImageIcon(getRessourceAsBytes("pionMort" + couleurPrincipale + ".png")));
/*  217 */   static JLabel tourMortGaucheImage = new JLabel(new ImageIcon(getRessourceAsBytes("tourMort" + couleurPrincipale + ".png")));
/*  218 */   static JLabel tourMortDroiteImage = new JLabel(new ImageIcon(getRessourceAsBytes("tourMort" + couleurPrincipale + ".png")));
/*  219 */   static JLabel cavalierMortGaucheImage = new JLabel(new ImageIcon(getRessourceAsBytes("cavalierMort" + couleurPrincipale + ".png")));
/*  220 */   static JLabel cavalierMortDroiteImage = new JLabel(new ImageIcon(getRessourceAsBytes("cavalierMort" + couleurPrincipale + ".png")));
/*  221 */   static JLabel fouMortGaucheImage = new JLabel(new ImageIcon(getRessourceAsBytes("fouMort" + couleurPrincipale + ".png")));
/*  222 */   static JLabel fouMortDroiteImage = new JLabel(new ImageIcon(getRessourceAsBytes("fouMort" + couleurPrincipale + ".png")));
/*  223 */   static JLabel reineMortGaucheImage = new JLabel(new ImageIcon(getRessourceAsBytes("reineMort" + couleurPrincipale + ".png")));
/*  224 */   static JLabel reineMortDroiteImage = new JLabel(new ImageIcon(getRessourceAsBytes("reineMort" + couleurPrincipale + ".png")));
/*      */ 
/*      */   
/*  227 */   private JPanel panelPrincipal = new JPanel();
/*  228 */   private JPanel panelTitre = new JPanel();
/*  229 */   private JPanel reinePanel = new JPanel();
/*  230 */   private JPanel tourPanel = new JPanel();
/*  231 */   private JPanel fouPanel = new JPanel();
/*  232 */   private JPanel cavalierPanel = new JPanel();
/*      */   
/*  234 */   private JLabel labelTitre = new JLabel("PROMOTION");
/*  235 */   private Font policeTitre = new Font("Arial", 1, 50);
/*  236 */   private Color colorBackground = new Color(100, 100, 100);
/*      */   
/*  238 */   static JLabel reineBouton = new JLabel();
/*  239 */   static JLabel tourBouton = new JLabel();
/*  240 */   static JLabel fouBouton = new JLabel();
/*  241 */   static JLabel cavalierBouton = new JLabel();
/*  242 */   static JButton boutonValider = new BoutonRond("Fenetre.getRessourceAsBytes(\"valider.png\")");
/*      */ 
/*      */ 
/*      */   
/*      */   private Clip clip;
/*      */ 
/*      */ 
/*      */   
/*      */   public static void main(String[] args) {}
/*      */ 
/*      */ 
/*      */   
/*      */   public static byte[] getRessourceAsBytes(String directory) {
/*  255 */     byte[] bytes = new byte[0];
/*  256 */     ByteArrayOutputStream reader = null;
/*      */     try {
/*  258 */       InputStream input = Fenetre.class.getResourceAsStream("/" + directory);
/*  259 */       reader = new ByteArrayOutputStream();
/*      */       
/*  261 */       byte[] data = new byte[16384]; int read;
/*  262 */       for (; (read = input.read(data, 0, data.length)) != -1; reader.write(data, 0, read));
/*  263 */       reader.flush();
/*  264 */       bytes = reader.toByteArray();
/*  265 */     } catch (Exception exception) {
/*  266 */       exception.printStackTrace();
/*      */     } 
/*      */     try {
/*  269 */       reader.close();
/*  270 */     } catch (Exception exception) {
/*  271 */       exception.printStackTrace();
/*      */     } 
/*  273 */     return bytes;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Fenetre(String nomJoueur1, String nomJoueur2) {
/*  280 */     Fenetre.nomJoueur1 = nomJoueur1;
/*  281 */     Fenetre.nomJoueur2 = nomJoueur2;
/*      */     try {
/*  283 */       jbInit();
/*  284 */     } catch (Exception e) {
/*  285 */       e.printStackTrace();
/*      */     } 
/*  287 */     echiquier.preparation();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void jbInit() throws Exception {
/*  308 */     setIconImage((new ImageIcon(getRessourceAsBytes("icon.png"))).getImage());
/*      */ 
/*      */     
/*  311 */     setTitle("Jeu d'Échec");
/*      */     
/*  313 */     setBounds(0, 0, 1536, 824);
/*      */     
/*  315 */     setUndecorated(true);
/*  316 */     setDefaultCloseOperation(3);
/*  317 */     setLocationRelativeTo(null);
/*  318 */     setResizable(false);
/*  319 */     getContentPane().setLayout((LayoutManager)null);
/*      */ 
/*      */     
/*  322 */     panelControles.setBounds(new Rectangle(0, 0, 1536, 64));
/*  323 */     panelControles.setBorder(BorderFactory.createEtchedBorder(0));
/*  324 */     panelControles.setLayout((LayoutManager)null);
/*  325 */     panelControles.add(boutonLancer, (Object)null);
/*  326 */     panelControles.add(boutonPause, (Object)null);
/*  327 */     panelControles.add(boutonRestart, (Object)null);
/*  328 */     panelControles.add(this.imageTourBlanc, (Object)null);
/*  329 */     panelControles.add(this.vertTourBlanc, (Object)null);
/*  330 */     panelControles.add(champTemps, (Object)null);
/*  331 */     panelControles.add(this.vertTourNoir, (Object)null);
/*  332 */     panelControles.add(this.imageTourNoir, (Object)null);
/*  333 */     panelControles.add(this.boutonAbandonner, (Object)null);
/*  334 */     panelControles.add(this.boutonChangerNom, (Object)null);
/*  335 */     panelControles.add(this.boutonOptions, (Object)null);
/*  336 */     panelControles.setBackground(Color.darkGray);
/*  337 */     panelControles.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.white));
/*      */     
/*  339 */     boutonLancer.setBounds(66, 7, 50, 50);
/*  340 */     boutonLancer.setBorderPainted(false);
/*  341 */     boutonLancer.setFocusPainted(false);
/*      */     
/*  343 */     boutonPause.setBounds(166, 7, 50, 50);
/*  344 */     boutonPause.setBorderPainted(false);
/*  345 */     boutonPause.setFocusPainted(false);
/*      */     
/*  347 */     boutonRestart.setBounds(266, 7, 50, 50);
/*  348 */     boutonRestart.setBorderPainted(false);
/*  349 */     boutonRestart.setFocusPainted(false);
/*      */     
/*  351 */     this.imageTourBlanc.setBounds(383, 3, 58, 58);
/*  352 */     this.imageTourBlanc.setBackground(Color.darkGray);
/*  353 */     this.imageTourBlanc.add(new JLabel(new ImageIcon(getRessourceAsBytes("blanc.png"))));
/*      */     
/*  355 */     this.vertTourBlanc.setBounds(441, 17, 30, 30);
/*  356 */     this.vertTourBlanc.setBackground(Color.darkGray);
/*  357 */     couleurTourBlanc.setIcon(new ImageIcon(getRessourceAsBytes("rondGris.png")));
/*  358 */     this.vertTourBlanc.add(couleurTourBlanc);
/*      */     
/*  360 */     champTemps.setBounds(471, 0, 585, 60);
/*  361 */     champTemps.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.darkGray));
/*  362 */     champTemps.setBackground(Color.darkGray);
/*  363 */     champTemps.setHorizontalAlignment(0);
/*  364 */     champTemps.setFont(this.nomJoueursFont);
/*  365 */     champTemps.setForeground(Color.white);
/*  366 */     champTemps.setEditable(false);
/*      */     
/*  368 */     this.vertTourNoir.setBounds(1055, 17, 30, 30);
/*  369 */     this.vertTourNoir.setBackground(Color.darkGray);
/*  370 */     this.couleurTourNoir.setIcon(new ImageIcon(getRessourceAsBytes("rondGris.png")));
/*  371 */     this.vertTourNoir.add(this.couleurTourNoir);
/*      */     
/*  373 */     this.imageTourNoir.setBounds(1093, 3, 58, 58);
/*  374 */     this.imageTourNoir.setBackground(Color.darkGray);
/*  375 */     this.imageTourNoir.add(new JLabel(new ImageIcon(getRessourceAsBytes("noir.png"))));
/*      */     
/*  377 */     this.boutonAbandonner.setBounds(1210, 7, 50, 50);
/*  378 */     this.boutonAbandonner.setBorderPainted(false);
/*  379 */     this.boutonAbandonner.setFocusPainted(false);
/*      */     
/*  381 */     this.boutonChangerNom.setBounds(1310, 7, 50, 50);
/*  382 */     this.boutonChangerNom.setBorderPainted(false);
/*  383 */     this.boutonChangerNom.setFocusPainted(false);
/*      */     
/*  385 */     this.boutonOptions.setBounds(1410, 7, 50, 50);
/*  386 */     this.boutonOptions.setBorderPainted(false);
/*  387 */     this.boutonOptions.setFocusPainted(false);
/*      */ 
/*      */     
/*  390 */     this.panelEchiquier.setBounds(new Rectangle(383, 64, 760, 760));
/*  391 */     this.panelEchiquier.setBorder(BorderFactory.createEtchedBorder(0));
/*  392 */     this.gridLayout1.setColumns(8);
/*  393 */     this.gridLayout1.setRows(8);
/*  394 */     this.panelEchiquier.setLayout(this.gridLayout1);
/*      */ 
/*      */     
/*  397 */     JPanel panelVideGauche = new JPanel();
/*  398 */     panelVideGauche.setPreferredSize(new Dimension(383, 25));
/*  399 */     panelVideGauche.setBackground(Color.darkGray);
/*  400 */     JPanel panelVideDroite = new JPanel();
/*  401 */     panelVideDroite.setPreferredSize(new Dimension(383, 25));
/*  402 */     panelVideDroite.setBackground(Color.darkGray);
/*      */ 
/*      */     
/*  405 */     this.panelGauche.setBounds(0, 64, 383, 760);
/*  406 */     this.panelGauche.setLayout(new BoxLayout(this.panelGauche, 1));
/*  407 */     this.panelGauche.setBackground(Color.darkGray);
/*  408 */     this.panelGauche.add(this.panelNomJGauche);
/*  409 */     this.panelGauche.add(this.panelMortGauche);
/*  410 */     this.panelGauche.add(panelVideGauche);
/*      */     
/*  412 */     this.panelNomJGauche.setSize(383, 85);
/*  413 */     this.panelNomJGauche.setBackground(Color.darkGray);
/*  414 */     this.panelNomJGauche.add(nomJoueurGauche);
/*  415 */     nomJoueurGauche.setText(nomJoueur1);
/*  416 */     nomJoueurGauche.setFont(this.nomJoueursFont);
/*  417 */     nomJoueurGauche.setForeground(Color.white);
/*  418 */     this.panelMortGauche.setLayout(new GridLayout(5, 2, 65, 7));
/*  419 */     this.panelMortGauche.setBackground(Color.darkGray);
/*      */ 
/*      */     
/*  422 */     this.panelDroite.setBounds(1143, 64, 383, 760);
/*  423 */     this.panelDroite.setLayout(new BoxLayout(this.panelDroite, 1));
/*  424 */     this.panelDroite.setBackground(Color.darkGray);
/*  425 */     this.panelDroite.add(this.panelNomJDroite);
/*  426 */     this.panelDroite.add(this.panelMortDroite);
/*  427 */     this.panelDroite.add(panelVideDroite);
/*      */     
/*  429 */     this.panelNomJDroite.setSize(383, 85);
/*  430 */     this.panelNomJDroite.setBackground(Color.darkGray);
/*  431 */     this.panelNomJDroite.add(nomJoueurDroite);
/*  432 */     nomJoueurDroite.setText(nomJoueur2);
/*  433 */     nomJoueurDroite.setFont(this.nomJoueursFont);
/*  434 */     nomJoueurDroite.setForeground(Color.white);
/*  435 */     this.panelMortDroite.setLayout(new GridLayout(5, 2, 65, 7));
/*  436 */     this.panelMortDroite.setBackground(Color.darkGray);
/*      */ 
/*      */     
/*  439 */     getContentPane().add(panelControles, (Object)null);
/*  440 */     getContentPane().add(this.panelEchiquier, (Object)null);
/*  441 */     getContentPane().add(this.panelGauche, (Object)null);
/*  442 */     getContentPane().add(this.panelDroite, (Object)null);
/*      */ 
/*      */     
/*  445 */     EvenementsSouris gestEvent = new EvenementsSouris(null);
/*  446 */     this.boutonValiderNomJoueurs.addMouseListener(gestEvent);
/*  447 */     boutonLancer.addMouseListener(gestEvent);
/*  448 */     boutonLancer.addActionListener(new ActionListener() {
/*      */           public void actionPerformed(ActionEvent e) {
/*  450 */             if (!Fenetre.preparationPiecesMortesFaite) {
/*      */               
/*  452 */               Fenetre.echiquier.getCase(0, 0).setPiece(new Tour("noir"));
/*  453 */               Fenetre.echiquier.getCase(1, 0).setPiece(new Cavalier("noir"));
/*  454 */               Fenetre.echiquier.getCase(2, 0).setPiece(new Fou("noir"));
/*  455 */               Fenetre.echiquier.getCase(3, 0).setPiece(new Reine("noir"));
/*  456 */               Fenetre.echiquier.getCase(4, 0).setPiece(new Roi("noir"));
/*  457 */               Fenetre.echiquier.getCase(5, 0).setPiece(new Fou("noir"));
/*  458 */               Fenetre.echiquier.getCase(6, 0).setPiece(new Cavalier("noir"));
/*  459 */               Fenetre.echiquier.getCase(7, 0).setPiece(new Tour("noir")); int i;
/*  460 */               for (i = 0; i < 8; ) { Fenetre.echiquier.getCase(i, 1).setPiece(new Pion("noir")); i++; }
/*  461 */                Fenetre.echiquier.getCase(0, 7).setPiece(new Tour("blanc"));
/*  462 */               Fenetre.echiquier.getCase(1, 7).setPiece(new Cavalier("blanc"));
/*  463 */               Fenetre.echiquier.getCase(2, 7).setPiece(new Fou("blanc"));
/*  464 */               Fenetre.echiquier.getCase(3, 7).setPiece(new Reine("blanc"));
/*  465 */               Fenetre.echiquier.getCase(4, 7).setPiece(new Roi("blanc"));
/*  466 */               Fenetre.echiquier.getCase(5, 7).setPiece(new Fou("blanc"));
/*  467 */               Fenetre.echiquier.getCase(6, 7).setPiece(new Cavalier("blanc"));
/*  468 */               Fenetre.echiquier.getCase(7, 7).setPiece(new Tour("blanc"));
/*  469 */               for (i = 0; i < 8; ) { Fenetre.echiquier.getCase(i, 6).setPiece(new Pion("blanc")); i++; }
/*      */             
/*      */             } 
/*  472 */             Fenetre.this.piecesCapturees();
/*      */             
/*  474 */             Fenetre.boutonLancer.setEnabled(false);
/*  475 */             Fenetre.lancerEnable = false;
/*  476 */             Fenetre.boutonPause.setEnabled(true);
/*  477 */             Fenetre.pauseEnable = true;
/*  478 */             Fenetre.boutonRestart.setEnabled(true);
/*  479 */             Fenetre.restartEnable = true;
/*      */             
/*  481 */             Timer chrono = new Timer();
/*  482 */             chrono.schedule(new TimerTask()
/*      */                 {
/*      */                   public void run()
/*      */                   {
/*  486 */                     if (Fenetre.pauseEnable)
/*  487 */                     { int heures = (Fenetre.null.access$0(Fenetre.null.this)).tempsSecondes / 3600;
/*  488 */                       int minutes = (Fenetre.null.access$0(Fenetre.null.this)).tempsSecondes % 3600 / 60;
/*  489 */                       int secondes = (Fenetre.null.access$0(Fenetre.null.this)).tempsSecondes % 60;
/*      */                       
/*  491 */                       (Fenetre.null.access$0(Fenetre.null.this)).tempsSecondes = (Fenetre.null.access$0(Fenetre.null.this)).tempsSecondes + 1;
/*      */                       
/*  493 */                       if (!Fenetre.affichageCoupSpecial) {
/*  494 */                         Fenetre.champTemps.setForeground(Color.white);
/*  495 */                         Fenetre.champTemps.setText(String.valueOf((heures < 10) ? "0" : "") + heures + " : " + (
/*  496 */                             (minutes < 10) ? "0" : "") + minutes + " : " + (
/*  497 */                             (secondes < 10) ? "0" : "") + secondes);
/*  498 */                         Fenetre.heures = heures;
/*  499 */                         Fenetre.minutes = minutes;
/*  500 */                         Fenetre.secondes = secondes;
/*      */                       } else {
/*  502 */                         if (Fenetre.titreAffichage.equals("ECHEC")) {
/*  503 */                           Fenetre.champTemps.setText(Fenetre.titreAffichage);
/*  504 */                           Fenetre.champTemps.setForeground(Color.red);
/*  505 */                         } else if (Fenetre.titreAffichage.equals("PROMOTION")) {
/*  506 */                           Fenetre.champTemps.setText(Fenetre.titreAffichage);
/*  507 */                           Fenetre.champTemps.setForeground(new Color(82, 216, 253));
/*  508 */                         } else if (Fenetre.titreAffichage.equals("PETIT ROQUE") || Fenetre.titreAffichage.equals("GRAND ROQUE")) {
/*  509 */                           Fenetre.champTemps.setText(Fenetre.titreAffichage);
/*  510 */                           Fenetre.champTemps.setForeground(new Color(255, 212, 0));
/*  511 */                         } else if (Fenetre.titreAffichage.equals("PRISE EN PASSANT")) {
/*  512 */                           Fenetre.champTemps.setText(Fenetre.titreAffichage);
/*  513 */                           Fenetre.champTemps.setForeground(new Color(255, 201, 23));
/*      */                         } else {
/*  515 */                           Fenetre.heures = heures;
/*  516 */                           Fenetre.minutes = minutes;
/*  517 */                           Fenetre.secondes = secondes;
/*  518 */                           cancel();
/*      */                         } 
/*      */                         
/*  521 */                         if ((Fenetre.null.access$0(Fenetre.null.this)).affichage1SEC)
/*  522 */                         { if ((Fenetre.null.access$0(Fenetre.null.this)).affichage2SEC)
/*  523 */                           { Fenetre.affichageCoupSpecial = false;
/*  524 */                             (Fenetre.null.access$0(Fenetre.null.this)).affichage1SEC = false;
/*  525 */                             (Fenetre.null.access$0(Fenetre.null.this)).affichage2SEC = false; }
/*  526 */                           else { (Fenetre.null.access$0(Fenetre.null.this)).affichage2SEC = true; }  }
/*  527 */                         else { (Fenetre.null.access$0(Fenetre.null.this)).affichage1SEC = true; }
/*      */                       
/*      */                       }  }
/*  530 */                     else { cancel(); }
/*      */                   
/*      */                   }
/*  533 */                 }0L, 1000L);
/*      */           }
/*      */         });
/*  536 */     boutonPause.addMouseListener(gestEvent);
/*  537 */     boutonPause.addActionListener(new ActionListener() {
/*      */           public void actionPerformed(ActionEvent e) {
/*  539 */             Fenetre.boutonLancer.setEnabled(true);
/*  540 */             Fenetre.lancerEnable = true;
/*  541 */             Fenetre.boutonPause.setEnabled(false);
/*  542 */             Fenetre.pauseEnable = false;
/*  543 */             Fenetre.boutonRestart.setEnabled(true);
/*  544 */             Fenetre.restartEnable = true;
/*      */           }
/*      */         });
/*  547 */     boutonRestart.setEnabled(false);
/*  548 */     restartEnable = false;
/*  549 */     boutonRestart.addMouseListener(gestEvent);
/*  550 */     boutonRestart.addActionListener(new ActionListener() {
/*      */           public void actionPerformed(ActionEvent e) {
/*  552 */             for (int ligne = 0; ligne < 8; ligne++) {
/*  553 */               for (int colonne = 0; colonne < 8; colonne++) {
/*  554 */                 Fenetre.tabLabels[colonne][ligne].setIcon((Icon)null);
/*  555 */                 Fenetre.echiquier.getCase(colonne, ligne).setPiece(null);
/*      */               } 
/*  557 */             }  Fenetre.echiquier.preparation();
/*  558 */             Fenetre.this.piecesCapturees();
/*      */             
/*  560 */             Fenetre.heures = 0;
/*  561 */             Fenetre.minutes = 0;
/*  562 */             Fenetre.secondes = 0;
/*  563 */             Fenetre.this.tempsSecondes = 0;
/*      */             
/*  565 */             Fenetre.this.nbPionMortGauche = 0;
/*  566 */             Fenetre.this.nbTourMortGauche = 0;
/*  567 */             Fenetre.this.nbCavalierMortGauche = 0;
/*  568 */             Fenetre.this.nbFouMortGauche = 0;
/*  569 */             Fenetre.this.nbReineMortGauche = 0;
/*  570 */             Fenetre.this.nbPionMortDroite = 0;
/*  571 */             Fenetre.this.nbTourMortDroite = 0;
/*  572 */             Fenetre.this.nbCavalierMortDroite = 0;
/*  573 */             Fenetre.this.nbFouMortDroite = 0;
/*  574 */             Fenetre.this.nbReineMortDroite = 0;
/*      */             
/*  576 */             Fenetre.champTemps.setText((String)null);
/*  577 */             Fenetre.boutonLancer.setEnabled(true);
/*  578 */             Fenetre.lancerEnable = true;
/*  579 */             Fenetre.boutonPause.setEnabled(false);
/*  580 */             Fenetre.pauseEnable = false;
/*  581 */             Fenetre.boutonRestart.setEnabled(false);
/*  582 */             Fenetre.restartEnable = false;
/*      */           }
/*      */         });
/*      */ 
/*      */     
/*  587 */     this.boutonAbandonner.addMouseListener(gestEvent);
/*  588 */     this.boutonAbandonner.addActionListener(new ActionListener() {
/*      */           public void actionPerformed(ActionEvent e) {
/*  590 */             Fenetre.boutonLancer.setEnabled(true);
/*  591 */             Fenetre.lancerEnable = true;
/*  592 */             Fenetre.boutonPause.setEnabled(false);
/*  593 */             Fenetre.pauseEnable = false;
/*  594 */             Fenetre.boutonRestart.setEnabled(true);
/*  595 */             Fenetre.restartEnable = true;
/*      */           }
/*      */         });
/*      */ 
/*      */     
/*  600 */     this.boutonChangerNom.addMouseListener(gestEvent);
/*  601 */     this.boutonChangerNom.addActionListener(new ActionListener() {
/*      */           public void actionPerformed(ActionEvent e) {
/*  603 */             Fenetre.boutonLancer.setEnabled(true);
/*  604 */             Fenetre.lancerEnable = true;
/*  605 */             Fenetre.boutonPause.setEnabled(false);
/*  606 */             Fenetre.pauseEnable = false;
/*  607 */             Fenetre.boutonRestart.setEnabled(true);
/*  608 */             Fenetre.restartEnable = true;
/*      */           }
/*      */         });
/*      */ 
/*      */     
/*  613 */     this.boutonOptions.addMouseListener(gestEvent);
/*  614 */     this.boutonOptions.addActionListener(new ActionListener() {
/*      */           public void actionPerformed(ActionEvent e) {
/*  616 */             Fenetre.boutonLancer.setEnabled(true);
/*  617 */             Fenetre.lancerEnable = true;
/*  618 */             Fenetre.boutonPause.setEnabled(false);
/*  619 */             Fenetre.pauseEnable = false;
/*  620 */             Fenetre.boutonRestart.setEnabled(true);
/*  621 */             Fenetre.restartEnable = true;
/*      */           }
/*      */         });
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  628 */     int a = 1;
/*  629 */     for (byte ligne = 0; ligne < 8; ligne = (byte)(ligne + 1)) {
/*  630 */       a = (a == 1) ? 0 : 1;
/*  631 */       for (byte colonne = 0; colonne < 8; colonne = (byte)(colonne + 1)) {
/*  632 */         tabLabels[colonne][ligne] = new JLabel();
/*  633 */         tabLabels[colonne][ligne].setOpaque(true);
/*  634 */         this.panelEchiquier.add(tabLabels[colonne][ligne]);
/*  635 */         tabLabels[colonne][ligne].setHorizontalAlignment(0);
/*  636 */         tabLabels[colonne][ligne].addMouseListener(gestEvent);
/*  637 */         if ((colonne + 1) % 2 == a) {
/*      */           
/*  639 */           tabLabels[colonne][ligne].setBackground(new Color(209, 139, 70));
/*      */         } else {
/*      */           
/*  642 */           tabLabels[colonne][ligne].setBackground(new Color(253, 206, 158));
/*      */         } 
/*      */       } 
/*      */     } 
/*      */     
/*  647 */     aChoisiReine = false;
/*  648 */     aChoisiTour = false;
/*  649 */     aChoisiFou = false;
/*  650 */     aChoisiCavalier = false;
/*      */     
/*  652 */     setVisible(true);
/*      */   }
/*      */   
/*      */   public static void setCouleurEchiquier() {
/*  656 */     int a = 1;
/*  657 */     for (byte ligne = 0; ligne < 8; ligne = (byte)(ligne + 1)) {
/*  658 */       a = (a == 1) ? 0 : 1;
/*  659 */       for (byte colonne = 0; colonne < 8; colonne = (byte)(colonne + 1)) {
/*  660 */         if ((colonne + 1) % 2 == a) {
/*      */           
/*  662 */           if (couleurPrincipale == "orange") tabLabels[colonne][ligne].setBackground(new Color(209, 139, 70)); 
/*  663 */           if (couleurPrincipale == "vert") tabLabels[colonne][ligne].setBackground(new Color(118, 150, 86)); 
/*  664 */           if (couleurPrincipale == "marron") tabLabels[colonne][ligne].setBackground(new Color(118, 53, 40)); 
/*  665 */           if (couleurPrincipale == "bleu") tabLabels[colonne][ligne].setBackground(new Color(50, 100, 100)); 
/*  666 */           if (couleurPrincipale == "violet") tabLabels[colonne][ligne].setBackground(new Color(58, 11, 113)); 
/*  667 */           if (couleurPrincipale == "gris") tabLabels[colonne][ligne].setBackground(new Color(160, 160, 160)); 
/*  668 */           if (couleurPrincipale == "turquoise") tabLabels[colonne][ligne].setBackground(new Color(160, 172, 230)); 
/*  669 */           if (couleurPrincipale == "rouge") tabLabels[colonne][ligne].setBackground(new Color(191, 67, 67));
/*      */         
/*      */         } else {
/*  672 */           if (couleurPrincipale == "orange") tabLabels[colonne][ligne].setBackground(new Color(253, 206, 158)); 
/*  673 */           if (couleurPrincipale == "vert") tabLabels[colonne][ligne].setBackground(new Color(238, 238, 210)); 
/*  674 */           if (couleurPrincipale == "marron") tabLabels[colonne][ligne].setBackground(new Color(233, 195, 117)); 
/*  675 */           if (couleurPrincipale == "bleu") tabLabels[colonne][ligne].setBackground(new Color(100, 200, 200)); 
/*  676 */           if (couleurPrincipale == "violet") tabLabels[colonne][ligne].setBackground(new Color(219, 26, 135)); 
/*  677 */           if (couleurPrincipale == "gris") tabLabels[colonne][ligne].setBackground(new Color(215, 215, 215)); 
/*  678 */           if (couleurPrincipale == "turquoise") tabLabels[colonne][ligne].setBackground(new Color(116, 235, 213)); 
/*  679 */           if (couleurPrincipale == "rouge") tabLabels[colonne][ligne].setBackground(new Color(255, 178, 178));
/*      */         
/*      */         } 
/*      */       } 
/*      */     } 
/*  684 */     pionMortGaucheImage.setIcon(new ImageIcon(getRessourceAsBytes("pionMort" + couleurPrincipale + ".png")));
/*  685 */     pionMortDroiteImage.setIcon(new ImageIcon(getRessourceAsBytes("pionMort" + couleurPrincipale + ".png")));
/*  686 */     tourMortGaucheImage.setIcon(new ImageIcon(getRessourceAsBytes("tourMort" + couleurPrincipale + ".png")));
/*  687 */     tourMortDroiteImage.setIcon(new ImageIcon(getRessourceAsBytes("tourMort" + couleurPrincipale + ".png")));
/*  688 */     cavalierMortGaucheImage.setIcon(new ImageIcon(getRessourceAsBytes("cavalierMort" + couleurPrincipale + ".png")));
/*  689 */     cavalierMortDroiteImage.setIcon(new ImageIcon(getRessourceAsBytes("cavalierMort" + couleurPrincipale + ".png")));
/*  690 */     fouMortGaucheImage.setIcon(new ImageIcon(getRessourceAsBytes("fouMort" + couleurPrincipale + ".png")));
/*  691 */     fouMortDroiteImage.setIcon(new ImageIcon(getRessourceAsBytes("fouMort" + couleurPrincipale + ".png")));
/*  692 */     reineMortGaucheImage.setIcon(new ImageIcon(getRessourceAsBytes("reineMort" + couleurPrincipale + ".png")));
/*  693 */     reineMortDroiteImage.setIcon(new ImageIcon(getRessourceAsBytes("reineMort" + couleurPrincipale + ".png")));
/*      */   }
/*      */ 
/*      */   
/*      */   public void piecesCapturees() {
/*  698 */     if (!preparationPiecesMortesFaite) {
/*      */       
/*  700 */       couleurTourBlanc.setIcon(new ImageIcon(getRessourceAsBytes("rondVert.png")));
/*      */ 
/*      */       
/*  703 */       this.pionMortGaucheLabel.setFont(this.policeNbPiecesMortes);
/*  704 */       this.pionMortGaucheLabel.setForeground(this.colorNbPiecesMortes);
/*  705 */       this.pionMortGaucheLabel.setHorizontalAlignment(2);
/*  706 */       pionMortGauche.setBackground(Color.darkGray);
/*  707 */       pionMortGauche.add(pionMortGaucheImage);
/*  708 */       this.panelMortGauche.add(pionMortGauche);
/*  709 */       this.panelMortGauche.add(this.pionMortGaucheLabel);
/*      */       
/*  711 */       this.pionMortDroiteLabel.setFont(this.policeNbPiecesMortes);
/*  712 */       this.pionMortDroiteLabel.setForeground(this.colorNbPiecesMortes);
/*  713 */       this.pionMortDroiteLabel.setHorizontalAlignment(4);
/*  714 */       pionMortDroite.setBackground(Color.darkGray);
/*  715 */       pionMortDroite.add(pionMortDroiteImage);
/*  716 */       this.panelMortDroite.add(this.pionMortDroiteLabel);
/*  717 */       this.panelMortDroite.add(pionMortDroite);
/*      */ 
/*      */       
/*  720 */       this.tourMortGaucheLabel.setFont(this.policeNbPiecesMortes);
/*  721 */       this.tourMortGaucheLabel.setForeground(this.colorNbPiecesMortes);
/*  722 */       this.tourMortGaucheLabel.setHorizontalAlignment(2);
/*  723 */       tourMortGauche.setBackground(Color.darkGray);
/*  724 */       tourMortGauche.add(tourMortGaucheImage);
/*  725 */       this.panelMortGauche.add(tourMortGauche);
/*  726 */       this.panelMortGauche.add(this.tourMortGaucheLabel);
/*      */       
/*  728 */       this.tourMortDroiteLabel.setFont(this.policeNbPiecesMortes);
/*  729 */       this.tourMortDroiteLabel.setForeground(this.colorNbPiecesMortes);
/*  730 */       this.tourMortDroiteLabel.setHorizontalAlignment(4);
/*  731 */       tourMortDroite.setBackground(Color.darkGray);
/*  732 */       tourMortDroite.add(tourMortDroiteImage);
/*  733 */       this.panelMortDroite.add(this.tourMortDroiteLabel);
/*  734 */       this.panelMortDroite.add(tourMortDroite);
/*      */ 
/*      */       
/*  737 */       this.cavalierMortGaucheLabel.setFont(this.policeNbPiecesMortes);
/*  738 */       this.cavalierMortGaucheLabel.setForeground(this.colorNbPiecesMortes);
/*  739 */       this.cavalierMortGaucheLabel.setHorizontalAlignment(2);
/*  740 */       cavalierMortGauche.setBackground(Color.darkGray);
/*  741 */       cavalierMortGauche.add(cavalierMortGaucheImage);
/*  742 */       this.panelMortGauche.add(cavalierMortGauche);
/*  743 */       this.panelMortGauche.add(this.cavalierMortGaucheLabel);
/*      */       
/*  745 */       this.cavalierMortDroiteLabel.setFont(this.policeNbPiecesMortes);
/*  746 */       this.cavalierMortDroiteLabel.setForeground(this.colorNbPiecesMortes);
/*  747 */       this.cavalierMortDroiteLabel.setHorizontalAlignment(4);
/*  748 */       cavalierMortDroite.setBackground(Color.darkGray);
/*  749 */       cavalierMortDroite.add(cavalierMortDroiteImage);
/*  750 */       this.panelMortDroite.add(this.cavalierMortDroiteLabel);
/*  751 */       this.panelMortDroite.add(cavalierMortDroite);
/*      */ 
/*      */       
/*  754 */       this.fouMortGaucheLabel.setFont(this.policeNbPiecesMortes);
/*  755 */       this.fouMortGaucheLabel.setForeground(this.colorNbPiecesMortes);
/*  756 */       this.fouMortGaucheLabel.setHorizontalAlignment(2);
/*  757 */       fouMortGauche.setBackground(Color.darkGray);
/*  758 */       fouMortGauche.add(fouMortGaucheImage);
/*  759 */       this.panelMortGauche.add(fouMortGauche);
/*  760 */       this.panelMortGauche.add(this.fouMortGaucheLabel);
/*      */       
/*  762 */       this.fouMortDroiteLabel.setFont(this.policeNbPiecesMortes);
/*  763 */       this.fouMortDroiteLabel.setForeground(this.colorNbPiecesMortes);
/*  764 */       this.fouMortDroiteLabel.setHorizontalAlignment(4);
/*  765 */       fouMortDroite.setBackground(Color.darkGray);
/*  766 */       fouMortDroite.add(fouMortDroiteImage);
/*  767 */       this.panelMortDroite.add(this.fouMortDroiteLabel);
/*  768 */       this.panelMortDroite.add(fouMortDroite);
/*      */ 
/*      */       
/*  771 */       this.reineMortGaucheLabel.setFont(this.policeNbPiecesMortes);
/*  772 */       this.reineMortGaucheLabel.setForeground(this.colorNbPiecesMortes);
/*  773 */       this.reineMortGaucheLabel.setHorizontalAlignment(2);
/*  774 */       reineMortGauche.setBackground(Color.darkGray);
/*  775 */       reineMortGauche.add(reineMortGaucheImage);
/*  776 */       this.panelMortGauche.add(reineMortGauche);
/*  777 */       this.panelMortGauche.add(this.reineMortGaucheLabel);
/*      */       
/*  779 */       this.reineMortDroiteLabel.setFont(this.policeNbPiecesMortes);
/*  780 */       this.reineMortDroiteLabel.setForeground(this.colorNbPiecesMortes);
/*  781 */       this.reineMortDroiteLabel.setHorizontalAlignment(4);
/*  782 */       reineMortDroite.setBackground(Color.darkGray);
/*  783 */       reineMortDroite.add(reineMortDroiteImage);
/*  784 */       this.panelMortDroite.add(this.reineMortDroiteLabel);
/*  785 */       this.panelMortDroite.add(reineMortDroite);
/*      */     } 
/*      */     
/*  788 */     preparationPiecesMortesFaite = true;
/*      */ 
/*      */     
/*  791 */     this.pionMortGaucheLabel.setText(this.nbPionMortGauche);
/*  792 */     this.pionMortDroiteLabel.setText(this.nbPionMortDroite);
/*      */     
/*  794 */     this.tourMortGaucheLabel.setText(this.nbTourMortGauche);
/*  795 */     this.tourMortDroiteLabel.setText(this.nbTourMortDroite);
/*      */     
/*  797 */     this.cavalierMortGaucheLabel.setText(this.nbCavalierMortGauche);
/*  798 */     this.cavalierMortDroiteLabel.setText(this.nbCavalierMortDroite);
/*      */     
/*  800 */     this.fouMortGaucheLabel.setText(this.nbFouMortGauche);
/*  801 */     this.fouMortDroiteLabel.setText(this.nbFouMortDroite);
/*      */     
/*  803 */     this.reineMortGaucheLabel.setText(this.nbReineMortGauche);
/*  804 */     this.reineMortDroiteLabel.setText(this.nbReineMortDroite);
/*      */   }
/*      */   
/*      */   public static boolean echec(String couleurRoi, int colonneR, int ligneR) {
/*  808 */     boolean finDeLEchiquier = false;
/*  809 */     String couleurAdverse = couleurRoi.equals("blanc") ? "noir" : "blanc";
/*  810 */     int colonne = 0;
/*  811 */     int ligne = 0;
/*      */     
/*  813 */     while (!finDeLEchiquier) {
/*      */       
/*  815 */       if (echiquier.getCase(colonne, ligne).estOccupee(couleurAdverse)) {
/*  816 */         Piece piece = echiquier.getCase(colonne, ligne).getPiece();
/*  817 */         Position positionPiece = new Position(colonne, ligne);
/*      */ 
/*      */         
/*  820 */         if (piece instanceof Cavalier) {
/*      */           
/*  822 */           Deplacement deplacement = null;
/*  823 */           for (int i = 0; i < 8; i++) {
/*  824 */             for (int j = 0; j < 8; j++) {
/*  825 */               deplacement = new Deplacement(positionPiece, new Position(i, j));
/*  826 */               if (piece.estValide(deplacement)) {
/*  827 */                 casesValides.add(new Position(i, j));
/*      */               }
/*      */             } 
/*      */           } 
/*      */           
/*  832 */           Iterator<Position> it = casesValides.iterator();
/*  833 */           Position position = null;
/*  834 */           while (it.hasNext()) {
/*  835 */             position = it.next();
/*  836 */             if (position.getColonne() == colonneR && position.getLigne() == ligneR) {
/*  837 */               it.remove();
/*  838 */               return true;
/*      */             }
/*      */           
/*      */           }
/*      */         
/*  843 */         } else if (piece instanceof Pion) {
/*      */           
/*  845 */           if (piece.getCouleur().equals("blanc")) {
/*      */             
/*  847 */             if (ligne - 1 >= 0) {
/*  848 */               if (colonne - 1 >= 0)
/*      */               {
/*  850 */                 if (echiquier.getCase(colonne - 1, ligne - 1).estOccupee(couleurRoi) && 
/*  851 */                   echiquier.getCase(colonne - 1, ligne - 1).getPiece() instanceof Roi) {
/*  852 */                   return true;
/*      */                 }
/*      */               }
/*  855 */               if (colonne + 1 <= 7)
/*      */               {
/*  857 */                 if (echiquier.getCase(colonne + 1, ligne - 1).estOccupee(couleurRoi) && 
/*  858 */                   echiquier.getCase(colonne + 1, ligne - 1).getPiece() instanceof Roi) {
/*  859 */                   return true;
/*      */                 
/*      */                 }
/*      */               
/*      */               }
/*      */             }
/*      */           
/*      */           }
/*  867 */           else if (ligne + 1 <= 7) {
/*  868 */             if (colonne - 1 >= 0)
/*      */             {
/*  870 */               if (echiquier.getCase(colonne - 1, ligne + 1).estOccupee(couleurRoi) && 
/*  871 */                 echiquier.getCase(colonne - 1, ligne + 1).getPiece() instanceof Roi) {
/*  872 */                 return true;
/*      */               }
/*      */             }
/*  875 */             if (colonne + 1 <= 7)
/*      */             {
/*  877 */               if (echiquier.getCase(colonne + 1, ligne + 1).estOccupee(couleurRoi) && 
/*  878 */                 echiquier.getCase(colonne + 1, ligne + 1).getPiece() instanceof Roi) {
/*  879 */                 return true;
/*      */               
/*      */               }
/*      */             }
/*      */           }
/*      */         
/*      */         }
/*  886 */         else if (piece instanceof Fou || piece instanceof Tour || piece instanceof Reine) {
/*  887 */           Deplacement deplacement = null;
/*  888 */           deplacement = new Deplacement(positionPiece, new Position(colonneR, ligneR));
/*      */           
/*  890 */           if (piece.estValide(deplacement) && echiquier.cheminPossible(piece, deplacement)) {
/*  891 */             return true;
/*      */           }
/*      */         } 
/*      */       } 
/*      */       
/*  896 */       if (colonne == 7 && ligne == 7) {
/*  897 */         finDeLEchiquier = true;
/*      */       
/*      */       }
/*  900 */       else if (ligne == 7) {
/*  901 */         ligne = 0;
/*  902 */         colonne++;
/*      */       }
/*      */       else {
/*      */         
/*  906 */         ligne++;
/*      */       } 
/*  908 */       casesValides.clear();
/*      */     } 
/*  910 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   private class EvenementsSouris
/*      */     extends MouseAdapter
/*      */   {
/*  917 */     Piece laPiece = null;
/*  918 */     Piece laPieceCapturee = null;
/*      */     ImageIcon lIcone;
/*      */     ImageIcon lIconeCapturee;
/*  921 */     Position laPosition = null;
/*      */     
/*      */     byte colonneClic;
/*      */     
/*      */     byte ligneClic;
/*      */     byte colonneAncienClicBlanc;
/*      */     byte ligneAncienClicBlanc;
/*      */     byte colonneAncienClicRouge;
/*      */     byte ligneAncienClicRouge;
/*      */     
/*      */     public void mouseClicked(MouseEvent event) {
/*  932 */       if (event.getSource() instanceof JLabel) {
/*  933 */         if (!Fenetre.lancerEnable) {
/*      */           
/*  935 */           boolean caseTrouvee = false;
/*  936 */           byte i = 0, j = 0;
/*  937 */           while (!caseTrouvee && i < 8) {
/*  938 */             if (event.getSource() == Fenetre.tabLabels[i][j]) {
/*  939 */               this.colonneClic = i;
/*  940 */               this.ligneClic = j;
/*  941 */               caseTrouvee = true; continue;
/*      */             } 
/*  943 */             j = (byte)(j + 1);
/*  944 */             if (j >= 8) {
/*  945 */               j = 0;
/*  946 */               i = (byte)(i + 1);
/*      */             } 
/*      */           } 
/*      */ 
/*      */ 
/*      */           
/*  952 */           if (Fenetre.echiquier.getCase(this.colonneClic, this.ligneClic).estOccupee() || this.laPiece != null) {
/*  953 */             Fenetre.tabLabels[this.colonneRoi][this.ligneRoi].setBorder((Border)null);
/*      */             
/*  955 */             if (this.laPiece == null) {
/*      */               
/*  957 */               if (Fenetre.echiquier.getCase(this.colonneClic, this.ligneClic).getPiece().getCouleur().equals(Fenetre.couleurControle)) {
/*  958 */                 this.laPiece = Fenetre.echiquier.getCase(this.colonneClic, this.ligneClic).getPiece();
/*  959 */                 this.lIcone = (ImageIcon)Fenetre.tabLabels[this.colonneClic][this.ligneClic].getIcon();
/*      */                 
/*  961 */                 this.laPosition = new Position(this.colonneClic, this.ligneClic);
/*  962 */                 this.colonneAncienClicBlanc = this.colonneClic;
/*  963 */                 this.ligneAncienClicBlanc = this.ligneClic;
/*      */                 
/*  965 */                 Fenetre.tabLabels[this.colonneClic][this.ligneClic].setBorder(BorderFactory.createLineBorder(Color.white, 5));
/*  966 */                 Fenetre.tabLabels[this.colonneAncienClicRouge][this.ligneAncienClicRouge].setBorder((Border)null);
/*  967 */                 Fenetre.this.setCursor(Cursor.getPredefinedCursor(1));
/*      */               
/*      */               }
/*      */             
/*      */             }
/*      */             else {
/*      */               
/*  974 */               final Deplacement deplacement = new Deplacement(this.laPosition, new Position(this.colonneClic, this.ligneClic));
/*      */ 
/*      */               
/*  977 */               if (deplacement.noDep()) {
/*  978 */                 this.laPiece = null;
/*  979 */                 this.lIcone = null;
/*  980 */                 this.laPosition = null;
/*  981 */                 Fenetre.tabLabels[this.colonneClic][this.ligneClic].setBorder((Border)null);
/*  982 */                 Fenetre.this.setCursor(Cursor.getDefaultCursor());
/*      */ 
/*      */ 
/*      */               
/*      */               }
/*  987 */               else if (this.laPiece.estValide(deplacement) && Fenetre.echiquier.cheminPossible(this.laPiece, deplacement)) {
/*      */                 int c;
/*  989 */                 for (c = 0; c < 8; c++) {
/*  990 */                   for (int l = 0; l < 8; l++) {
/*  991 */                     if (Fenetre.echiquier.getCase(c, l).getPiece() instanceof Roi && Fenetre.echiquier.getCase(c, l).estOccupee(
/*  992 */                         Fenetre.couleurControle)) {
/*  993 */                       this.colonneRoi = c;
/*  994 */                       this.ligneRoi = l;
/*      */                     } 
/*      */                   } 
/*      */                 } 
/*      */                 
/*  999 */                 if (!Fenetre.echec(Fenetre.couleurControle, this.colonneRoi, this.ligneRoi) && ((
/* 1000 */                   Fenetre.couleurControle.equals("blanc") && deplacement.getArrivee().getLigne() == 0) || (
/* 1001 */                   Fenetre.couleurControle.equals("noir") && deplacement.getArrivee().getLigne() == 7)) && 
/* 1002 */                   this.laPiece instanceof Pion) {
/* 1003 */                   this.laPosition = new Position(this.colonneClic, this.ligneClic);
/*      */ 
/*      */ 
/*      */                   
/* 1007 */                   Fenetre.reineBouton.setIcon(new ImageIcon(Fenetre.getRessourceAsBytes("reine-" + Fenetre.couleurControle + ".png")));
/* 1008 */                   Fenetre.tourBouton.setIcon(new ImageIcon(Fenetre.getRessourceAsBytes("tour-" + Fenetre.couleurControle + ".png")));
/* 1009 */                   Fenetre.fouBouton.setIcon(new ImageIcon(Fenetre.getRessourceAsBytes("fou-" + Fenetre.couleurControle + ".png")));
/* 1010 */                   Fenetre.cavalierBouton.setIcon(new ImageIcon(Fenetre.getRessourceAsBytes("cavalier-" + Fenetre.couleurControle + ".png")));
/* 1011 */                   if (Fenetre.echiquier.getCase(deplacement.getArrivee().getColonne(), deplacement.getArrivee().getLigne()).getPiece() != null)
/*      */                   {
/* 1013 */                     this.laPieceCapturee = Fenetre.echiquier.getCase(deplacement.getArrivee().getColonne(), deplacement.getArrivee().getLigne()).getPiece();
/*      */                   }
/* 1015 */                   final JFrame promotion = new JFrame();
/*      */                   
/* 1017 */                   promotion.setIconImage((new ImageIcon(Fenetre.getRessourceAsBytes("icon.png"))).getImage());
/*      */                   
/* 1019 */                   promotion.setSize(610, 300);
/* 1020 */                   promotion.setTitle("Promotion");
/* 1021 */                   promotion.setUndecorated(true);
/* 1022 */                   promotion.setDefaultCloseOperation(2);
/* 1023 */                   promotion.setLocationRelativeTo(null);
/* 1024 */                   promotion.setResizable(false);
/* 1025 */                   promotion.setContentPane(Fenetre.this.panelPrincipal);
/*      */                   
/* 1027 */                   EvenementsSouris gestEvent = new EvenementsSouris();
/* 1028 */                   Fenetre.boutonValider.addMouseListener(gestEvent);
/* 1029 */                   Fenetre.boutonValider.addActionListener(new ActionListener() {
/*      */                         public void actionPerformed(ActionEvent e) {
/* 1031 */                           if (Fenetre.aChoisiReine || Fenetre.aChoisiTour || Fenetre.aChoisiFou || Fenetre.aChoisiCavalier) {
/* 1032 */                             if (Fenetre.aChoisiReine) {
/* 1033 */                               Fenetre.EvenementsSouris.this.laPiece = new Reine(Fenetre.couleurControle.equals("blanc") ? "noir" : "blanc");
/* 1034 */                               Fenetre.EvenementsSouris.this.lIcone = new ImageIcon(Fenetre.getRessourceAsBytes("reine-" + (Fenetre.couleurControle.equals("blanc") ? "noir" : "blanc") + ".png"));
/* 1035 */                             } else if (Fenetre.aChoisiTour) {
/* 1036 */                               Fenetre.EvenementsSouris.this.laPiece = new Tour(Fenetre.couleurControle.equals("blanc") ? "noir" : "blanc");
/* 1037 */                               Fenetre.EvenementsSouris.this.lIcone = new ImageIcon(Fenetre.getRessourceAsBytes("tour-" + (Fenetre.couleurControle.equals("blanc") ? "noir" : "blanc") + ".png"));
/* 1038 */                             } else if (Fenetre.aChoisiFou) {
/* 1039 */                               Fenetre.EvenementsSouris.this.laPiece = new Fou(Fenetre.couleurControle.equals("blanc") ? "noir" : "blanc");
/* 1040 */                               Fenetre.EvenementsSouris.this.lIcone = new ImageIcon(Fenetre.getRessourceAsBytes("fou-" + (Fenetre.couleurControle.equals("blanc") ? "noir" : "blanc") + ".png"));
/* 1041 */                             } else if (Fenetre.aChoisiCavalier) {
/* 1042 */                               Fenetre.EvenementsSouris.this.laPiece = new Cavalier(Fenetre.couleurControle.equals("blanc") ? "noir" : "blanc");
/* 1043 */                               Fenetre.EvenementsSouris.this.lIcone = new ImageIcon(Fenetre.getRessourceAsBytes("cavalier-" + (Fenetre.couleurControle.equals("blanc") ? "noir" : "blanc") + ".png"));
/*      */                             } 
/*      */                             
/* 1046 */                             Fenetre.echiquier.getCase(deplacement.getDepart().getColonne(), deplacement.getDepart().getLigne()).setPiece(null);
/* 1047 */                             Fenetre.tabLabels[Fenetre.EvenementsSouris.this.colonneAncienClicBlanc][Fenetre.EvenementsSouris.this.ligneAncienClicBlanc].setIcon((Icon)null);
/* 1048 */                             Fenetre.tabLabels[Fenetre.EvenementsSouris.this.colonneAncienClicBlanc][Fenetre.EvenementsSouris.this.ligneAncienClicBlanc].setBorder((Border)null);
/* 1049 */                             Fenetre.tabLabels[Fenetre.EvenementsSouris.this.colonneRoi][Fenetre.EvenementsSouris.this.ligneRoi].setBorder((Border)null);
/*      */ 
/*      */ 
/*      */                             
/* 1053 */                             Fenetre.tabLabels[Fenetre.EvenementsSouris.this.colonneClic][Fenetre.EvenementsSouris.this.ligneClic].setIcon(Fenetre.EvenementsSouris.this.lIcone);
/* 1054 */                             Fenetre.echiquier.getCase(Fenetre.EvenementsSouris.this.colonneClic, Fenetre.EvenementsSouris.this.ligneClic).setPiece(Fenetre.EvenementsSouris.this.laPiece);
/*      */                             
/* 1056 */                             Fenetre.affichageCoupSpecial = true;
/* 1057 */                             Fenetre.titreAffichage = "PROMOTION";
/*      */                             
/* 1059 */                             Fenetre.EvenementsSouris.this.laPiece = null;
/* 1060 */                             Fenetre.EvenementsSouris.this.lIcone = null;
/* 1061 */                             Fenetre.EvenementsSouris.this.laPosition = null;
/* 1062 */                             Fenetre.reineBouton.setIcon((Icon)null);
/* 1063 */                             Fenetre.tourBouton.setIcon((Icon)null);
/* 1064 */                             Fenetre.fouBouton.setIcon((Icon)null);
/* 1065 */                             Fenetre.cavalierBouton.setIcon((Icon)null);
/* 1066 */                             Fenetre.aChoisiReine = false;
/* 1067 */                             Fenetre.aChoisiTour = false;
/* 1068 */                             Fenetre.aChoisiFou = false;
/* 1069 */                             Fenetre.aChoisiCavalier = false;
/* 1070 */                             Fenetre.tabLabels[Fenetre.EvenementsSouris.this.colonneClic][Fenetre.EvenementsSouris.this.ligneClic].setBorder((Border)null);
/* 1071 */                             Fenetre.EvenementsSouris.access$1(Fenetre.EvenementsSouris.this).setCursor(Cursor.getDefaultCursor());
/*      */                             
/* 1073 */                             promotion.dispose();
/*      */                           } 
/*      */                         }
/*      */                       });
/* 1077 */                   Fenetre.this.reinePanel.addMouseListener(gestEvent);
/* 1078 */                   Fenetre.this.tourPanel.addMouseListener(gestEvent);
/* 1079 */                   Fenetre.this.fouPanel.addMouseListener(gestEvent);
/* 1080 */                   Fenetre.this.cavalierPanel.addMouseListener(gestEvent);
/*      */                   
/* 1082 */                   Fenetre.this.panelPrincipal.setBackground(Fenetre.this.colorBackground);
/* 1083 */                   Fenetre.this.panelPrincipal.setLayout((LayoutManager)null);
/* 1084 */                   Fenetre.this.panelPrincipal.add(Fenetre.this.panelTitre, (Object)null);
/* 1085 */                   Fenetre.this.panelPrincipal.add(Fenetre.this.reinePanel, (Object)null);
/* 1086 */                   Fenetre.this.panelPrincipal.add(Fenetre.this.tourPanel, (Object)null);
/* 1087 */                   Fenetre.this.panelPrincipal.add(Fenetre.this.fouPanel, (Object)null);
/* 1088 */                   Fenetre.this.panelPrincipal.add(Fenetre.this.cavalierPanel, (Object)null);
/* 1089 */                   Fenetre.this.panelPrincipal.add(Fenetre.boutonValider, (Object)null);
/*      */                   
/* 1091 */                   Fenetre.this.panelTitre.setBackground(Fenetre.this.colorBackground);
/* 1092 */                   Fenetre.this.panelTitre.setBounds(0, 0, 610, 70);
/* 1093 */                   Fenetre.this.panelTitre.add(Fenetre.this.labelTitre);
/* 1094 */                   Fenetre.this.labelTitre.setForeground(Color.white);
/* 1095 */                   Fenetre.this.labelTitre.setFont(Fenetre.this.policeTitre);
/*      */                   
/* 1097 */                   Fenetre.this.reinePanel.setBounds(5, 70, 150, 150);
/* 1098 */                   Fenetre.this.reinePanel.setLayout((LayoutManager)null);
/* 1099 */                   Fenetre.this.reinePanel.setBackground(Fenetre.this.colorBackground);
/* 1100 */                   Fenetre.this.reinePanel.add(Fenetre.reineBouton);
/* 1101 */                   Fenetre.reineBouton.setHorizontalAlignment(0);
/* 1102 */                   Fenetre.reineBouton.setBounds(0, 0, 150, 150);
/*      */                   
/* 1104 */                   Fenetre.this.tourPanel.setBounds(155, 70, 150, 150);
/* 1105 */                   Fenetre.this.tourPanel.setLayout((LayoutManager)null);
/* 1106 */                   Fenetre.this.tourPanel.setBackground(Fenetre.this.colorBackground);
/* 1107 */                   Fenetre.this.tourPanel.add(Fenetre.tourBouton);
/* 1108 */                   Fenetre.tourBouton.setHorizontalAlignment(0);
/* 1109 */                   Fenetre.tourBouton.setBounds(0, 0, 150, 150);
/*      */                   
/* 1111 */                   Fenetre.this.fouPanel.setBounds(305, 70, 150, 150);
/* 1112 */                   Fenetre.this.fouPanel.setLayout((LayoutManager)null);
/* 1113 */                   Fenetre.this.fouPanel.setBackground(Fenetre.this.colorBackground);
/* 1114 */                   Fenetre.this.fouPanel.add(Fenetre.fouBouton);
/* 1115 */                   Fenetre.fouBouton.setHorizontalAlignment(0);
/* 1116 */                   Fenetre.fouBouton.setBounds(0, 0, 150, 150);
/*      */                   
/* 1118 */                   Fenetre.this.cavalierPanel.setBounds(455, 70, 150, 150);
/* 1119 */                   Fenetre.this.cavalierPanel.setLayout((LayoutManager)null);
/* 1120 */                   Fenetre.this.cavalierPanel.setBackground(Fenetre.this.colorBackground);
/* 1121 */                   Fenetre.this.cavalierPanel.add(Fenetre.cavalierBouton);
/* 1122 */                   Fenetre.cavalierBouton.setHorizontalAlignment(0);
/* 1123 */                   Fenetre.cavalierBouton.setBounds(0, 0, 150, 150);
/*      */                   
/* 1125 */                   Fenetre.boutonValider.setBounds(215, 230, 180, 60);
/* 1126 */                   Fenetre.boutonValider.setBorderPainted(false);
/* 1127 */                   Fenetre.boutonValider.setFocusPainted(false);
/* 1128 */                   promotion.setVisible(true);
/*      */ 
/*      */ 
/*      */ 
/*      */                 
/*      */                 }
/* 1134 */                 else if (this.laPiece instanceof Roi && Math.abs(deplacement.getDeplacementX()) > 1.0D) {
/* 1135 */                   if (Fenetre.couleurControle.equals("blanc")) {
/*      */                     
/* 1137 */                     if (deplacement.getDeplacementX() == 2.0D) {
/*      */ 
/*      */                       
/* 1140 */                       this.lIconeCapturee = (ImageIcon)Fenetre.tabLabels[7][7].getIcon();
/* 1141 */                       this.laPieceCapturee = Fenetre.echiquier.getCase(7, 7).getPiece();
/*      */                       
/* 1143 */                       Fenetre.echiquier.getCase(this.laPosition.getColonne(), this.laPosition.getLigne()).setPiece(null);
/* 1144 */                       Fenetre.tabLabels[this.colonneAncienClicBlanc][this.ligneAncienClicBlanc].setIcon((Icon)null);
/* 1145 */                       Fenetre.tabLabels[this.colonneAncienClicBlanc][this.ligneAncienClicBlanc].setBorder((Border)null);
/* 1146 */                       Fenetre.tabLabels[this.colonneRoi][this.ligneRoi].setBorder((Border)null);
/*      */                       
/* 1148 */                       Fenetre.echiquier.getCase(7, 7).setPiece(null);
/* 1149 */                       Fenetre.tabLabels[7][7].setIcon((Icon)null);
/*      */                       
/* 1151 */                       Fenetre.tabLabels[this.colonneClic][this.ligneClic].setIcon(this.lIcone);
/* 1152 */                       Fenetre.echiquier.getCase(this.colonneClic, this.ligneClic).setPiece(this.laPiece);
/*      */                       
/* 1154 */                       Fenetre.tabLabels[5][7].setIcon(this.lIconeCapturee);
/* 1155 */                       Fenetre.echiquier.getCase(5, 7).setPiece(this.laPieceCapturee);
/* 1156 */                       Fenetre.this.setCursor(Cursor.getDefaultCursor());
/*      */                       
/* 1158 */                       Fenetre.affichageCoupSpecial = true;
/* 1159 */                       Fenetre.titreAffichage = "PETIT ROQUE";
/*      */                     
/*      */                     }
/* 1162 */                     else if (deplacement.getDeplacementX() == -2.0D) {
/*      */ 
/*      */                       
/* 1165 */                       this.lIconeCapturee = (ImageIcon)Fenetre.tabLabels[0][7].getIcon();
/* 1166 */                       this.laPieceCapturee = Fenetre.echiquier.getCase(0, 7).getPiece();
/*      */                       
/* 1168 */                       Fenetre.echiquier.getCase(this.laPosition.getColonne(), this.laPosition.getLigne()).setPiece(null);
/* 1169 */                       Fenetre.tabLabels[this.colonneAncienClicBlanc][this.ligneAncienClicBlanc].setIcon((Icon)null);
/* 1170 */                       Fenetre.tabLabels[this.colonneAncienClicBlanc][this.ligneAncienClicBlanc].setBorder((Border)null);
/* 1171 */                       Fenetre.tabLabels[this.colonneRoi][this.ligneRoi].setBorder((Border)null);
/*      */                       
/* 1173 */                       Fenetre.echiquier.getCase(0, 7).setPiece(null);
/* 1174 */                       Fenetre.tabLabels[0][7].setIcon((Icon)null);
/*      */                       
/* 1176 */                       Fenetre.tabLabels[this.colonneClic][this.ligneClic].setIcon(this.lIcone);
/* 1177 */                       Fenetre.echiquier.getCase(this.colonneClic, this.ligneClic).setPiece(this.laPiece);
/*      */                       
/* 1179 */                       Fenetre.tabLabels[3][7].setIcon(this.lIconeCapturee);
/* 1180 */                       Fenetre.echiquier.getCase(3, 7).setPiece(this.laPieceCapturee);
/* 1181 */                       Fenetre.this.setCursor(Cursor.getDefaultCursor());
/*      */                       
/* 1183 */                       Fenetre.affichageCoupSpecial = true;
/* 1184 */                       Fenetre.titreAffichage = "GRAND ROQUE";
/*      */                     } 
/*      */ 
/*      */                     
/* 1188 */                     if (Fenetre.echec(Fenetre.couleurControle, this.colonneRoi, this.ligneRoi)) {
/* 1189 */                       this.aEuEchec = true;
/*      */                       
/* 1191 */                       Fenetre.tabLabels[this.colonneRoi][this.ligneRoi].setBorder(BorderFactory.createLineBorder(Color.yellow, 5));
/*      */                       
/* 1193 */                       Fenetre.echiquier.getCase(this.laPosition.getColonne(), this.laPosition.getLigne()).setPiece(this.laPiece);
/* 1194 */                       Fenetre.tabLabels[this.colonneAncienClicBlanc][this.ligneAncienClicBlanc].setIcon(this.lIcone);
/*      */ 
/*      */                       
/* 1197 */                       if (Fenetre.titreAffichage.equals("PETIT ROQUE")) {
/* 1198 */                         Fenetre.echiquier.getCase(7, 7).setPiece(this.laPieceCapturee);
/* 1199 */                         Fenetre.tabLabels[7][7].setIcon(this.lIconeCapturee);
/*      */                       } else {
/* 1201 */                         Fenetre.echiquier.getCase(0, 7).setPiece(this.laPieceCapturee);
/* 1202 */                         Fenetre.tabLabels[0][7].setIcon(this.lIconeCapturee);
/*      */                       } 
/*      */                     } else {
/* 1205 */                       this.aEuEchec = false;
/*      */                     } 
/*      */                     
/* 1208 */                     this.laPieceCapturee = null;
/* 1209 */                     this.lIconeCapturee = null;
/*      */                   } else {
/*      */                     
/* 1212 */                     if (deplacement.getDeplacementX() == 2.0D) {
/*      */ 
/*      */                       
/* 1215 */                       this.lIconeCapturee = (ImageIcon)Fenetre.tabLabels[7][0].getIcon();
/* 1216 */                       this.laPieceCapturee = Fenetre.echiquier.getCase(7, 0).getPiece();
/*      */                       
/* 1218 */                       Fenetre.echiquier.getCase(this.laPosition.getColonne(), this.laPosition.getLigne()).setPiece(null);
/* 1219 */                       Fenetre.tabLabels[this.colonneAncienClicBlanc][this.ligneAncienClicBlanc].setIcon((Icon)null);
/* 1220 */                       Fenetre.tabLabels[this.colonneAncienClicBlanc][this.ligneAncienClicBlanc].setBorder((Border)null);
/* 1221 */                       Fenetre.tabLabels[this.colonneRoi][this.ligneRoi].setBorder((Border)null);
/*      */                       
/* 1223 */                       Fenetre.echiquier.getCase(7, 0).setPiece(null);
/* 1224 */                       Fenetre.tabLabels[7][0].setIcon((Icon)null);
/*      */                       
/* 1226 */                       Fenetre.tabLabels[this.colonneClic][this.ligneClic].setIcon(this.lIcone);
/* 1227 */                       Fenetre.echiquier.getCase(this.colonneClic, this.ligneClic).setPiece(this.laPiece);
/*      */                       
/* 1229 */                       Fenetre.tabLabels[5][0].setIcon(this.lIconeCapturee);
/* 1230 */                       Fenetre.echiquier.getCase(5, 0).setPiece(this.laPieceCapturee);
/* 1231 */                       Fenetre.this.setCursor(Cursor.getDefaultCursor());
/*      */                       
/* 1233 */                       Fenetre.affichageCoupSpecial = true;
/* 1234 */                       Fenetre.titreAffichage = "PETIT ROQUE";
/*      */                     
/*      */                     }
/* 1237 */                     else if (deplacement.getDeplacementX() == -2.0D) {
/*      */ 
/*      */                       
/* 1240 */                       this.lIconeCapturee = (ImageIcon)Fenetre.tabLabels[0][0].getIcon();
/* 1241 */                       this.laPieceCapturee = Fenetre.echiquier.getCase(0, 0).getPiece();
/*      */                       
/* 1243 */                       Fenetre.echiquier.getCase(this.laPosition.getColonne(), this.laPosition.getLigne()).setPiece(null);
/* 1244 */                       Fenetre.tabLabels[this.colonneAncienClicBlanc][this.ligneAncienClicBlanc].setIcon((Icon)null);
/* 1245 */                       Fenetre.tabLabels[this.colonneAncienClicBlanc][this.ligneAncienClicBlanc].setBorder((Border)null);
/* 1246 */                       Fenetre.tabLabels[this.colonneRoi][this.ligneRoi].setBorder((Border)null);
/*      */                       
/* 1248 */                       Fenetre.echiquier.getCase(0, 0).setPiece(null);
/* 1249 */                       Fenetre.tabLabels[0][0].setIcon((Icon)null);
/*      */                       
/* 1251 */                       Fenetre.tabLabels[this.colonneClic][this.ligneClic].setIcon(this.lIcone);
/* 1252 */                       Fenetre.echiquier.getCase(this.colonneClic, this.ligneClic).setPiece(this.laPiece);
/*      */                       
/* 1254 */                       Fenetre.tabLabels[3][0].setIcon(this.lIconeCapturee);
/* 1255 */                       Fenetre.echiquier.getCase(3, 0).setPiece(this.laPieceCapturee);
/* 1256 */                       Fenetre.this.setCursor(Cursor.getDefaultCursor());
/*      */                       
/* 1258 */                       Fenetre.affichageCoupSpecial = true;
/* 1259 */                       Fenetre.titreAffichage = "GRAND ROQUE";
/*      */                     } 
/*      */                     
/* 1262 */                     if (Fenetre.echec(Fenetre.couleurControle, this.colonneRoi, this.ligneRoi)) {
/* 1263 */                       this.aEuEchec = true;
/*      */                       
/* 1265 */                       Fenetre.tabLabels[this.colonneRoi][this.ligneRoi].setBorder(BorderFactory.createLineBorder(Color.yellow, 5));
/*      */                       
/* 1267 */                       Fenetre.echiquier.getCase(this.laPosition.getColonne(), this.laPosition.getLigne()).setPiece(this.laPiece);
/* 1268 */                       Fenetre.tabLabels[this.colonneAncienClicBlanc][this.ligneAncienClicBlanc].setIcon(this.lIcone);
/*      */ 
/*      */                       
/* 1271 */                       if (Fenetre.titreAffichage.equals("PETIT ROQUE")) {
/* 1272 */                         Fenetre.echiquier.getCase(7, 0).setPiece(this.laPieceCapturee);
/* 1273 */                         Fenetre.tabLabels[7][0].setIcon(this.lIconeCapturee);
/*      */                       } else {
/* 1275 */                         Fenetre.echiquier.getCase(0, 0).setPiece(this.laPieceCapturee);
/* 1276 */                         Fenetre.tabLabels[0][0].setIcon(this.lIconeCapturee);
/*      */                       } 
/*      */                     } else {
/* 1279 */                       this.aEuEchec = false;
/*      */                     } 
/*      */                     
/* 1282 */                     this.laPieceCapturee = null;
/* 1283 */                     this.lIconeCapturee = null;
/*      */                   }
/*      */                 
/*      */                 } else {
/*      */                   
/* 1288 */                   this.aEffectueLaPEP = false;
/* 1289 */                   if (this.laPiece instanceof Pion)
/*      */                   {
/* 1291 */                     if (deplacement.getDeplacementY() == -2.0D || deplacement.getDeplacementY() == 2.0D) {
/* 1292 */                       Fenetre.priseEnPassantPossible = true;
/* 1293 */                       Fenetre.this.posXPiecePEP = deplacement.getArrivee().getColonne();
/* 1294 */                       Fenetre.this.posYPiecePEP = deplacement.getArrivee().getLigne();
/*      */                     
/*      */                     }
/* 1297 */                     else if (Fenetre.priseEnPassantPossible && this.laPiece instanceof Pion) {
/* 1298 */                       Fenetre.priseEnPassantPossible = false;
/*      */ 
/*      */                       
/* 1301 */                       if (deplacement.getDepart().getLigne() == Fenetre.this.posYPiecePEP && (
/* 1302 */                         deplacement.getDepart().getColonne() == Fenetre.this.posXPiecePEP - 1 || 
/* 1303 */                         deplacement.getDepart().getColonne() == Fenetre.this.posXPiecePEP + 1) && ((
/* 1304 */                         Fenetre.couleurControle.equals("blanc") && deplacement.getArrivee().getColonne() == Fenetre.this.posXPiecePEP) || (
/* 1305 */                         Fenetre.couleurControle.equals("noir") && deplacement.getArrivee().getColonne() == Fenetre.this.posXPiecePEP))) {
/*      */                         
/* 1307 */                         this.lIconeCapturee = (ImageIcon)Fenetre.tabLabels[Fenetre.this.posXPiecePEP][Fenetre.this.posYPiecePEP].getIcon();
/* 1308 */                         this.laPieceCapturee = Fenetre.echiquier.getCase(Fenetre.this.posXPiecePEP, Fenetre.this.posYPiecePEP).getPiece();
/*      */                         
/* 1310 */                         Fenetre.echiquier.getCase(this.laPosition.getColonne(), this.laPosition.getLigne()).setPiece(null);
/* 1311 */                         Fenetre.tabLabels[this.colonneAncienClicBlanc][this.ligneAncienClicBlanc].setIcon((Icon)null);
/* 1312 */                         Fenetre.tabLabels[this.colonneAncienClicBlanc][this.ligneAncienClicBlanc].setBorder((Border)null);
/* 1313 */                         Fenetre.tabLabels[this.colonneRoi][this.ligneRoi].setBorder((Border)null);
/*      */                         
/* 1315 */                         Fenetre.echiquier.getCase(Fenetre.this.posXPiecePEP, Fenetre.this.posYPiecePEP).setPiece(null);
/* 1316 */                         Fenetre.tabLabels[Fenetre.this.posXPiecePEP][Fenetre.this.posYPiecePEP].setIcon((Icon)null);
/*      */                         
/* 1318 */                         Fenetre.tabLabels[this.colonneClic][this.ligneClic].setIcon(this.lIcone);
/* 1319 */                         Fenetre.echiquier.getCase(this.colonneClic, this.ligneClic).setPiece(this.laPiece);
/* 1320 */                         Fenetre.this.setCursor(Cursor.getDefaultCursor());
/*      */                         
/* 1322 */                         Fenetre.affichageCoupSpecial = true;
/* 1323 */                         Fenetre.titreAffichage = "PRISE EN PASSANT";
/*      */ 
/*      */                         
/* 1326 */                         for (c = 0; c < 8; c++) {
/* 1327 */                           for (int l = 0; l < 8; l++) {
/* 1328 */                             if (Fenetre.echiquier.getCase(c, l).getPiece() instanceof Roi && Fenetre.echiquier.getCase(c, l).estOccupee(
/* 1329 */                                 Fenetre.couleurControle)) {
/* 1330 */                               this.colonneRoi = c;
/* 1331 */                               this.ligneRoi = l;
/*      */                             } 
/*      */                           } 
/*      */                         } 
/*      */                         
/* 1336 */                         if (Fenetre.echec(Fenetre.couleurControle, this.colonneRoi, this.ligneRoi)) {
/* 1337 */                           this.aEuEchec = true;
/*      */                           
/* 1339 */                           Fenetre.tabLabels[this.colonneRoi][this.ligneRoi].setBorder(BorderFactory.createLineBorder(Color.yellow, 5));
/*      */                           
/* 1341 */                           Fenetre.echiquier.getCase(this.laPosition.getColonne(), this.laPosition.getLigne()).setPiece(this.laPiece);
/* 1342 */                           Fenetre.tabLabels[this.colonneAncienClicBlanc][this.ligneAncienClicBlanc].setIcon(this.lIcone);
/* 1343 */                           Fenetre.echiquier.getCase(Fenetre.this.posXPiecePEP, Fenetre.this.posYPiecePEP).setPiece(this.laPieceCapturee);
/* 1344 */                           Fenetre.tabLabels[Fenetre.this.posXPiecePEP][Fenetre.this.posYPiecePEP].setIcon(this.lIconeCapturee);
/*      */                         } else {
/* 1346 */                           this.aEuEchec = false;
/*      */                         } 
/* 1348 */                         this.aEffectueLaPEP = true;
/*      */                       } 
/*      */                     } else {
/* 1351 */                       Fenetre.priseEnPassantPossible = false;
/* 1352 */                       Fenetre.this.posXPiecePEP = -1;
/* 1353 */                       Fenetre.this.posYPiecePEP = -1;
/*      */                     } 
/*      */                   }
/*      */ 
/*      */ 
/*      */                   
/* 1359 */                   if (!this.aEffectueLaPEP) {
/* 1360 */                     if (Fenetre.echiquier.getCase(this.colonneClic, this.ligneClic).estOccupee()) {
/* 1361 */                       this.laPieceCapturee = Fenetre.echiquier.getCase(this.colonneClic, this.ligneClic).getPiece();
/* 1362 */                       this.lIconeCapturee = (ImageIcon)Fenetre.tabLabels[this.colonneClic][this.ligneClic].getIcon();
/*      */                     } 
/* 1364 */                     Fenetre.echiquier.getCase(this.laPosition.getColonne(), this.laPosition.getLigne()).setPiece(null);
/* 1365 */                     Fenetre.tabLabels[this.colonneAncienClicBlanc][this.ligneAncienClicBlanc].setIcon((Icon)null);
/* 1366 */                     Fenetre.tabLabels[this.colonneAncienClicBlanc][this.ligneAncienClicBlanc].setBorder((Border)null);
/* 1367 */                     Fenetre.tabLabels[this.colonneRoi][this.ligneRoi].setBorder((Border)null);
/*      */                     
/* 1369 */                     Fenetre.tabLabels[this.colonneClic][this.ligneClic].setIcon(this.lIcone);
/* 1370 */                     Fenetre.echiquier.getCase(this.colonneClic, this.ligneClic).setPiece(this.laPiece);
/*      */                     
/* 1372 */                     Fenetre.this.setCursor(Cursor.getDefaultCursor());
/*      */                   } 
/*      */ 
/*      */                   
/* 1376 */                   for (c = 0; c < 8; c++) {
/* 1377 */                     for (int l = 0; l < 8; l++) {
/* 1378 */                       if (Fenetre.echiquier.getCase(c, l).getPiece() instanceof Roi && Fenetre.echiquier.getCase(c, l).estOccupee(
/* 1379 */                           Fenetre.couleurControle)) {
/* 1380 */                         this.colonneRoi = c;
/* 1381 */                         this.ligneRoi = l;
/*      */                       } 
/*      */                     } 
/*      */                   } 
/*      */ 
/*      */                   
/* 1387 */                   if (!this.aEffectueLaPEP && Fenetre.echec(Fenetre.couleurControle, this.colonneRoi, this.ligneRoi)) {
/* 1388 */                     this.aEuEchec = true;
/*      */                     
/* 1390 */                     Fenetre.tabLabels[this.colonneRoi][this.ligneRoi].setBorder(BorderFactory.createLineBorder(Color.yellow, 5));
/*      */                     
/* 1392 */                     Fenetre.echiquier.getCase(this.laPosition.getColonne(), this.laPosition.getLigne()).setPiece(this.laPiece);
/* 1393 */                     Fenetre.tabLabels[this.colonneAncienClicBlanc][this.ligneAncienClicBlanc].setIcon(this.lIcone);
/*      */ 
/*      */                     
/* 1396 */                     if (this.laPieceCapturee != null) {
/* 1397 */                       Fenetre.echiquier.getCase(this.colonneClic, this.ligneClic).setPiece(this.laPieceCapturee);
/* 1398 */                       Fenetre.tabLabels[this.colonneClic][this.ligneClic].setIcon(this.lIconeCapturee);
/*      */                     } else {
/* 1400 */                       Fenetre.echiquier.getCase(this.colonneClic, this.ligneClic).setPiece(null);
/* 1401 */                       Fenetre.tabLabels[this.colonneClic][this.ligneClic].setIcon((Icon)null);
/*      */                     } 
/*      */                   } else {
/* 1404 */                     this.aEuEchec = false;
/*      */                   } 
/*      */                 } 
/*      */ 
/*      */                 
/* 1409 */                 if (!this.aEuEchec) {
/*      */                   
/* 1411 */                   if (this.laPieceCapturee != null) {
/* 1412 */                     if (Fenetre.couleurControle.equals("blanc"))
/* 1413 */                     { if (this.laPieceCapturee instanceof Pion) { Fenetre.this.nbPionMortGauche++; }
/* 1414 */                       else if (this.laPieceCapturee instanceof Tour) { Fenetre.this.nbTourMortGauche++; }
/* 1415 */                       else if (this.laPieceCapturee instanceof Cavalier) { Fenetre.this.nbCavalierMortGauche++; }
/* 1416 */                       else if (this.laPieceCapturee instanceof Fou) { Fenetre.this.nbFouMortGauche++; }
/* 1417 */                       else if (this.laPieceCapturee instanceof Reine) { Fenetre.this.nbReineMortGauche++; }
/*      */                        }
/* 1419 */                     else if (this.laPieceCapturee instanceof Pion) { Fenetre.this.nbPionMortDroite++; }
/* 1420 */                     else if (this.laPieceCapturee instanceof Tour) { Fenetre.this.nbTourMortDroite++; }
/* 1421 */                     else if (this.laPieceCapturee instanceof Cavalier) { Fenetre.this.nbCavalierMortDroite++; }
/* 1422 */                     else if (this.laPieceCapturee instanceof Fou) { Fenetre.this.nbFouMortDroite++; }
/* 1423 */                     else if (this.laPieceCapturee instanceof Reine) { Fenetre.this.nbReineMortDroite++; }
/*      */                     
/* 1425 */                     Fenetre.this.piecesCapturees();
/*      */                   } 
/*      */                   
/* 1428 */                   String couleurAdverse = Fenetre.couleurControle.equals("blanc") ? "noir" : "blanc";
/*      */                   
/* 1430 */                   for (int k = 0; k < 8; k++) {
/* 1431 */                     for (int l = 0; l < 8; l++) {
/* 1432 */                       if (Fenetre.echiquier.getCase(k, l).getPiece() instanceof Roi && Fenetre.echiquier.getCase(k, l).estOccupee(
/* 1433 */                           couleurAdverse)) {
/* 1434 */                         this.colonneRoiAdverse = k;
/* 1435 */                         this.ligneRoiAdverse = l;
/*      */                       } 
/*      */                     } 
/*      */                   } 
/*      */ 
/*      */                   
/* 1441 */                   if (Fenetre.echec(couleurAdverse, this.colonneRoiAdverse, this.ligneRoiAdverse)) {
/* 1442 */                     Fenetre.affichageCoupSpecial = true;
/* 1443 */                     Fenetre.titreAffichage = "ECHEC";
/*      */                   } 
/*      */ 
/*      */ 
/*      */ 
/*      */                   
/* 1449 */                   if (this.laPiece instanceof Roi) {
/* 1450 */                     if (Fenetre.couleurControle.equals("blanc")) {
/* 1451 */                       Fenetre.petitRoqueBlancInterdit = true;
/* 1452 */                       Fenetre.grandRoqueBlancInterdit = true;
/*      */                     } else {
/* 1454 */                       Fenetre.petitRoqueNoirInterdit = true;
/* 1455 */                       Fenetre.grandRoqueNoirInterdit = true;
/*      */                     } 
/* 1457 */                   } else if (this.laPiece instanceof Tour) {
/* 1458 */                     if (this.colonneAncienClicBlanc == 0 && this.ligneAncienClicBlanc == 7) Fenetre.grandRoqueBlancInterdit = true; 
/* 1459 */                     if (this.colonneAncienClicBlanc == 7 && this.ligneAncienClicBlanc == 7) Fenetre.petitRoqueBlancInterdit = true; 
/* 1460 */                     if (this.colonneAncienClicBlanc == 0 && this.ligneAncienClicBlanc == 0) Fenetre.grandRoqueNoirInterdit = true; 
/* 1461 */                     if (this.colonneAncienClicBlanc == 7 && this.ligneAncienClicBlanc == 0) Fenetre.petitRoqueNoirInterdit = true;
/*      */                   
/*      */                   } 
/*      */                   
/* 1465 */                   Fenetre.couleurControle = couleurAdverse;
/* 1466 */                   if (Fenetre.couleurControle.equals("blanc")) {
/* 1467 */                     Fenetre.couleurTourBlanc.setIcon(new ImageIcon(Fenetre.getRessourceAsBytes("rondVert.png")));
/* 1468 */                     Fenetre.this.couleurTourNoir.setIcon(new ImageIcon(Fenetre.getRessourceAsBytes("rondGris.png")));
/*      */                   } else {
/*      */                     
/* 1471 */                     Fenetre.couleurTourBlanc.setIcon(new ImageIcon(Fenetre.getRessourceAsBytes("rondGris.png")));
/* 1472 */                     Fenetre.this.couleurTourNoir.setIcon(new ImageIcon(Fenetre.getRessourceAsBytes("rondVert.png")));
/*      */                   } 
/*      */                 } 
/* 1475 */                 this.aEuEchec = false;
/*      */ 
/*      */ 
/*      */                 
/* 1479 */                 this.laPiece = null;
/* 1480 */                 this.laPieceCapturee = null;
/* 1481 */                 this.lIcone = null;
/* 1482 */                 this.lIconeCapturee = null;
/* 1483 */                 this.laPosition = null;
/*      */               }
/*      */               else {
/*      */                 
/* 1487 */                 this.laPiece = null;
/* 1488 */                 this.lIcone = null;
/* 1489 */                 this.laPosition = null;
/* 1490 */                 Fenetre.this.setCursor(Cursor.getDefaultCursor());
/*      */                 
/* 1492 */                 Fenetre.tabLabels[this.colonneClic][this.ligneClic].setBorder(new TitledBorder(BorderFactory.createLineBorder(Color.red, 5), 
/* 1493 */                       "Impossible", 4, 2, null, Color.red));
/* 1494 */                 Fenetre.tabLabels[this.colonneAncienClicBlanc][this.ligneAncienClicBlanc].setBorder((Border)null);
/* 1495 */                 this.colonneAncienClicRouge = this.colonneClic;
/* 1496 */                 this.ligneAncienClicRouge = this.ligneClic;
/*      */               } 
/*      */             } 
/*      */           } 
/*      */         } 
/* 1501 */       } else if (event.getSource() == Fenetre.this.reinePanel) {
/* 1502 */         Fenetre.this.reinePanel.setBackground(Color.green);
/* 1503 */         Fenetre.this.tourPanel.setBackground(Fenetre.this.colorBackground);
/* 1504 */         Fenetre.this.fouPanel.setBackground(Fenetre.this.colorBackground);
/* 1505 */         Fenetre.this.cavalierPanel.setBackground(Fenetre.this.colorBackground);
/*      */         
/* 1507 */         Fenetre.aChoisiReine = true;
/* 1508 */         Fenetre.aChoisiTour = false;
/* 1509 */         Fenetre.aChoisiFou = false;
/* 1510 */         Fenetre.aChoisiCavalier = false;
/* 1511 */       } else if (event.getSource() == Fenetre.this.tourPanel) {
/* 1512 */         Fenetre.this.reinePanel.setBackground(Fenetre.this.colorBackground);
/* 1513 */         Fenetre.this.tourPanel.setBackground(Color.green);
/* 1514 */         Fenetre.this.fouPanel.setBackground(Fenetre.this.colorBackground);
/* 1515 */         Fenetre.this.cavalierPanel.setBackground(Fenetre.this.colorBackground);
/*      */         
/* 1517 */         Fenetre.aChoisiReine = false;
/* 1518 */         Fenetre.aChoisiTour = true;
/* 1519 */         Fenetre.aChoisiFou = false;
/* 1520 */         Fenetre.aChoisiCavalier = false;
/* 1521 */       } else if (event.getSource() == Fenetre.this.fouPanel) {
/* 1522 */         Fenetre.this.reinePanel.setBackground(Fenetre.this.colorBackground);
/* 1523 */         Fenetre.this.tourPanel.setBackground(Fenetre.this.colorBackground);
/* 1524 */         Fenetre.this.fouPanel.setBackground(Color.green);
/* 1525 */         Fenetre.this.cavalierPanel.setBackground(Fenetre.this.colorBackground);
/*      */         
/* 1527 */         Fenetre.aChoisiReine = false;
/* 1528 */         Fenetre.aChoisiTour = false;
/* 1529 */         Fenetre.aChoisiFou = true;
/* 1530 */         Fenetre.aChoisiCavalier = false;
/* 1531 */       } else if (event.getSource() == Fenetre.this.cavalierPanel) {
/* 1532 */         Fenetre.this.reinePanel.setBackground(Fenetre.this.colorBackground);
/* 1533 */         Fenetre.this.tourPanel.setBackground(Fenetre.this.colorBackground);
/* 1534 */         Fenetre.this.fouPanel.setBackground(Fenetre.this.colorBackground);
/* 1535 */         Fenetre.this.cavalierPanel.setBackground(Color.green);
/*      */         
/* 1537 */         Fenetre.aChoisiReine = false;
/* 1538 */         Fenetre.aChoisiTour = false;
/* 1539 */         Fenetre.aChoisiFou = false;
/* 1540 */         Fenetre.aChoisiCavalier = true;
/*      */       } 
/*      */     }
/*      */     int colonneRoi; int ligneRoi; int colonneRoiAdverse; int ligneRoiAdverse; boolean aEuEchec = false; boolean aEffectueLaPEP = false;
/*      */     
/*      */     public void mouseEntered(MouseEvent event) {
/* 1546 */       if (!(event.getSource() instanceof JLabel))
/*      */       {
/* 1548 */         if (event.getSource() == Fenetre.this.boutonValiderNomJoueurs) {
/* 1549 */           Fenetre.this.setCursor(Cursor.getPredefinedCursor(12));
/* 1550 */           Fenetre.surLeBouton = true;
/* 1551 */           System.out.println(Fenetre.surLeBouton);
/* 1552 */           int a = 260, b = 320, c = 180, d = 60;
/* 1553 */           for (int i = 1; i < 6; i++) {
/* 1554 */             a--; b--; c += 2; d += 2;
/* 1555 */             Fenetre.this.boutonValiderNomJoueurs.setBounds(a, b, c, d);
/*      */           } 
/* 1557 */         } else if (event.getSource() == Fenetre.boutonLancer) {
/* 1558 */           if (Fenetre.lancerEnable) {
/* 1559 */             Fenetre.this.setCursor(Cursor.getPredefinedCursor(12));
/* 1560 */             Fenetre.surLeBouton = true;
/* 1561 */             int a = 66, b = 7, c = 50, d = 50;
/* 1562 */             for (int i = 1; i < 4; i++) {
/* 1563 */               a--; b--; c += 2; d += 2;
/* 1564 */               Fenetre.boutonLancer.setBounds(a, b, c, d);
/*      */             } 
/*      */           } else {
/* 1567 */             Fenetre.this.setCursor(Cursor.getDefaultCursor());
/*      */           } 
/* 1569 */         } else if (event.getSource() == Fenetre.boutonPause) {
/* 1570 */           if (Fenetre.pauseEnable) {
/* 1571 */             Fenetre.this.setCursor(Cursor.getPredefinedCursor(12));
/* 1572 */             Fenetre.surLeBouton = true;
/* 1573 */             int a = 166, b = 7, c = 50, d = 50;
/* 1574 */             for (int i = 1; i < 4; i++) {
/* 1575 */               a--; b--; c += 2; d += 2;
/* 1576 */               Fenetre.boutonPause.setBounds(a, b, c, d);
/*      */             } 
/*      */           } else {
/* 1579 */             Fenetre.this.setCursor(Cursor.getDefaultCursor());
/*      */           } 
/* 1581 */         } else if (event.getSource() == Fenetre.boutonRestart) {
/* 1582 */           if (Fenetre.restartEnable) {
/* 1583 */             Fenetre.this.setCursor(Cursor.getPredefinedCursor(12));
/* 1584 */             Fenetre.surLeBouton = true;
/* 1585 */             int a = 266, b = 7, c = 50, d = 50;
/* 1586 */             for (int i = 1; i < 4; i++) {
/* 1587 */               a--; b--; c += 2; d += 2;
/* 1588 */               Fenetre.boutonRestart.setBounds(a, b, c, d);
/*      */             } 
/*      */           } 
/* 1591 */         } else if (event.getSource() == Fenetre.this.boutonAbandonner) {
/* 1592 */           Fenetre.this.setCursor(Cursor.getPredefinedCursor(12));
/* 1593 */           Fenetre.surLeBouton = true;
/* 1594 */           int a = 1210, b = 7, c = 50, d = 50;
/* 1595 */           for (int i = 1; i < 4; i++) {
/* 1596 */             a--; b--; c += 2; d += 2;
/* 1597 */             Fenetre.this.boutonAbandonner.setBounds(a, b, c, d);
/*      */           } 
/* 1599 */         } else if (event.getSource() == Fenetre.this.boutonChangerNom) {
/* 1600 */           Fenetre.this.setCursor(Cursor.getPredefinedCursor(12));
/* 1601 */           Fenetre.surLeBouton = true;
/*      */           
/* 1603 */           int a = 1310, b = 7, c = 50, d = 50;
/* 1604 */           for (int i = 1; i < 4; i++) {
/* 1605 */             a--; b--; c += 2; d += 2;
/* 1606 */             Fenetre.this.boutonChangerNom.setBounds(a, b, c, d);
/*      */           } 
/* 1608 */         } else if (event.getSource() == Fenetre.this.boutonOptions) {
/* 1609 */           Fenetre.this.setCursor(Cursor.getPredefinedCursor(12));
/* 1610 */           Fenetre.surLeBouton = true;
/*      */           
/* 1612 */           int a = 1410, b = 7, c = 50, d = 50;
/* 1613 */           for (int i = 1; i < 4; i++) {
/* 1614 */             a--; b--; c += 2; d += 2;
/* 1615 */             Fenetre.this.boutonOptions.setBounds(a, b, c, d);
/*      */           } 
/* 1617 */         } else if (event.getSource() == Fenetre.boutonValider) {
/* 1618 */           Fenetre.surLeBouton = true;
/* 1619 */           int a = 215, b = 230, c = 180, d = 60;
/* 1620 */           for (int i = 1; i < 6; i++) {
/* 1621 */             a--; b--; c += 2; d += 2;
/* 1622 */             Fenetre.boutonValider.setBounds(a, b, c, d);
/*      */           } 
/*      */         } 
/*      */       }
/*      */     }
/*      */     
/*      */     public void mouseExited(MouseEvent event) {
/* 1629 */       if (!(event.getSource() instanceof JLabel))
/*      */       {
/* 1631 */         if (event.getSource() == Fenetre.this.boutonValiderNomJoueurs) {
/* 1632 */           Fenetre.this.setCursor(Cursor.getDefaultCursor());
/* 1633 */           Fenetre.surLeBouton = false;
/* 1634 */           int a = 255, b = 315, c = 190, d = 70;
/* 1635 */           for (int i = 1; i < 6; i++) {
/* 1636 */             a++; b++; c -= 2; d -= 2;
/* 1637 */             Fenetre.this.boutonValiderNomJoueurs.setBounds(a, b, c, d);
/*      */           } 
/* 1639 */         } else if (event.getSource() == Fenetre.boutonLancer) {
/* 1640 */           if (Fenetre.lancerEnable) {
/* 1641 */             Fenetre.this.setCursor(Cursor.getDefaultCursor());
/* 1642 */             Fenetre.surLeBouton = false;
/* 1643 */             int a = 63, b = 4, c = 56, d = 56;
/* 1644 */             for (int i = 1; i < 4; i++) {
/* 1645 */               a++; b++; c -= 2; d -= 2;
/* 1646 */               Fenetre.boutonLancer.setBounds(a, b, c, d);
/*      */             } 
/*      */           } else {
/* 1649 */             Fenetre.this.setCursor(Cursor.getDefaultCursor());
/*      */           } 
/* 1651 */         } else if (event.getSource() == Fenetre.boutonPause) {
/* 1652 */           if (Fenetre.pauseEnable) {
/* 1653 */             Fenetre.this.setCursor(Cursor.getDefaultCursor());
/* 1654 */             Fenetre.surLeBouton = false;
/* 1655 */             int a = 163, b = 4, c = 56, d = 56;
/* 1656 */             for (int i = 1; i < 4; i++) {
/* 1657 */               a++; b++; c -= 2; d -= 2;
/* 1658 */               Fenetre.boutonPause.setBounds(a, b, c, d);
/*      */             } 
/*      */           } else {
/* 1661 */             Fenetre.this.setCursor(Cursor.getDefaultCursor());
/*      */           } 
/* 1663 */         } else if (event.getSource() == Fenetre.boutonRestart) {
/* 1664 */           if (Fenetre.restartEnable) {
/* 1665 */             Fenetre.this.setCursor(Cursor.getDefaultCursor());
/* 1666 */             Fenetre.surLeBouton = false;
/* 1667 */             int a = 263, b = 4, c = 56, d = 56;
/* 1668 */             for (int i = 1; i < 4; i++) {
/* 1669 */               a++; b++; c -= 2; d -= 2;
/* 1670 */               Fenetre.boutonRestart.setBounds(a, b, c, d);
/*      */             } 
/*      */           } 
/* 1673 */         } else if (event.getSource() == Fenetre.this.boutonAbandonner) {
/* 1674 */           Fenetre.this.setCursor(Cursor.getDefaultCursor());
/* 1675 */           Fenetre.surLeBouton = false;
/* 1676 */           int a = 1207, b = 4, c = 56, d = 56;
/* 1677 */           for (int i = 1; i < 4; i++) {
/* 1678 */             a++; b++; c -= 2; d -= 2;
/* 1679 */             Fenetre.this.boutonAbandonner.setBounds(a, b, c, d);
/*      */           } 
/* 1681 */         } else if (event.getSource() == Fenetre.this.boutonChangerNom) {
/* 1682 */           Fenetre.this.setCursor(Cursor.getDefaultCursor());
/* 1683 */           Fenetre.surLeBouton = false;
/* 1684 */           int a = 1307, b = 4, c = 56, d = 56;
/* 1685 */           for (int i = 1; i < 4; i++) {
/* 1686 */             a++; b++; c -= 2; d -= 2;
/* 1687 */             Fenetre.this.boutonChangerNom.setBounds(a, b, c, d);
/*      */           } 
/* 1689 */         } else if (event.getSource() == Fenetre.this.boutonOptions) {
/* 1690 */           Fenetre.this.setCursor(Cursor.getDefaultCursor());
/* 1691 */           Fenetre.surLeBouton = false;
/* 1692 */           int a = 1407, b = 4, c = 56, d = 56;
/* 1693 */           for (int i = 1; i < 4; i++) {
/* 1694 */             a++; b++; c -= 2; d -= 2;
/* 1695 */             Fenetre.this.boutonOptions.setBounds(a, b, c, d);
/*      */           } 
/* 1697 */         } else if (event.getSource() == Fenetre.boutonValider) {
/* 1698 */           Fenetre.surLeBouton = false;
/* 1699 */           int a = 210, b = 225, c = 190, d = 70;
/* 1700 */           for (int i = 1; i < 6; i++) {
/* 1701 */             a++; b++; c -= 2; d -= 2;
/* 1702 */             Fenetre.boutonValider.setBounds(a, b, c, d);
/*      */           } 
/*      */         } 
/*      */       }
/*      */     }
/*      */     
/*      */     public void mousePressed(MouseEvent event) {
/* 1709 */       if (!(event.getSource() instanceof JLabel))
/*      */       {
/* 1711 */         if (event.getSource() == Fenetre.this.boutonValiderNomJoueurs) {
/* 1712 */           Fenetre.this.setCursor(Cursor.getPredefinedCursor(12));
/* 1713 */           Fenetre.surLeBouton = false;
/* 1714 */           int a = 255, b = 315, c = 190, d = 70;
/* 1715 */           for (int i = 1; i < 6; i++) {
/* 1716 */             a++; b++; c -= 2; d -= 2;
/* 1717 */             Fenetre.this.boutonValiderNomJoueurs.setBounds(a, b, c, d);
/*      */           } 
/* 1719 */         } else if (event.getSource() == Fenetre.boutonLancer) {
/* 1720 */           if (Fenetre.lancerEnable) {
/* 1721 */             Fenetre.this.setCursor(Cursor.getPredefinedCursor(12));
/* 1722 */             Fenetre.surLeBouton = false;
/* 1723 */             int a = 63, b = 4, c = 56, d = 56;
/* 1724 */             for (int i = 1; i < 4; i++) {
/* 1725 */               a++; b++; c -= 2; d -= 2;
/* 1726 */               Fenetre.boutonLancer.setBounds(a, b, c, d);
/*      */             } 
/*      */           } else {
/* 1729 */             Fenetre.this.setCursor(Cursor.getDefaultCursor());
/*      */           } 
/* 1731 */         } else if (event.getSource() == Fenetre.boutonPause) {
/* 1732 */           if (Fenetre.pauseEnable) {
/* 1733 */             Fenetre.this.setCursor(Cursor.getPredefinedCursor(12));
/* 1734 */             Fenetre.surLeBouton = false;
/* 1735 */             int a = 163, b = 4, c = 56, d = 56;
/* 1736 */             for (int i = 1; i < 4; i++) {
/* 1737 */               a++; b++; c -= 2; d -= 2;
/* 1738 */               Fenetre.boutonPause.setBounds(a, b, c, d);
/*      */             } 
/*      */           } else {
/* 1741 */             Fenetre.this.setCursor(Cursor.getDefaultCursor());
/*      */           } 
/* 1743 */         } else if (event.getSource() == Fenetre.boutonRestart) {
/* 1744 */           if (Fenetre.restartEnable) {
/* 1745 */             Fenetre.this.setCursor(Cursor.getPredefinedCursor(12));
/* 1746 */             Fenetre.surLeBouton = false;
/* 1747 */             int a = 263, b = 4, c = 56, d = 56;
/* 1748 */             for (int i = 1; i < 4; i++) {
/* 1749 */               a++; b++; c -= 2; d -= 2;
/* 1750 */               Fenetre.boutonRestart.setBounds(a, b, c, d);
/*      */             } 
/*      */           } 
/* 1753 */         } else if (event.getSource() == Fenetre.this.boutonAbandonner) {
/* 1754 */           Fenetre.this.setCursor(Cursor.getPredefinedCursor(12));
/* 1755 */           Fenetre.surLeBouton = false;
/* 1756 */           int a = 1207, b = 4, c = 56, d = 56;
/* 1757 */           for (int i = 1; i < 4; i++) {
/* 1758 */             a++; b++; c -= 2; d -= 2;
/* 1759 */             Fenetre.this.boutonAbandonner.setBounds(a, b, c, d);
/*      */           } 
/* 1761 */         } else if (event.getSource() == Fenetre.this.boutonChangerNom) {
/* 1762 */           Fenetre.this.setCursor(Cursor.getPredefinedCursor(12));
/* 1763 */           Fenetre.surLeBouton = false;
/* 1764 */           int a = 1307, b = 4, c = 56, d = 56;
/* 1765 */           for (int i = 1; i < 4; i++) {
/* 1766 */             a++; b++; c -= 2; d -= 2;
/* 1767 */             Fenetre.this.boutonChangerNom.setBounds(a, b, c, d);
/*      */           } 
/* 1769 */         } else if (event.getSource() == Fenetre.this.boutonOptions) {
/* 1770 */           Fenetre.this.setCursor(Cursor.getPredefinedCursor(12));
/* 1771 */           Fenetre.surLeBouton = false;
/* 1772 */           int a = 1407, b = 4, c = 56, d = 56;
/* 1773 */           for (int i = 1; i < 4; i++) {
/* 1774 */             a++; b++; c -= 2; d -= 2;
/* 1775 */             Fenetre.this.boutonOptions.setBounds(a, b, c, d);
/*      */           } 
/* 1777 */         } else if (event.getSource() == Fenetre.boutonValider) {
/* 1778 */           Fenetre.surLeBouton = false;
/* 1779 */           int a = 210, b = 225, c = 190, d = 70;
/* 1780 */           for (int i = 1; i < 6; i++) {
/* 1781 */             a++; b++; c -= 2; d -= 2;
/* 1782 */             Fenetre.boutonValider.setBounds(a, b, c, d);
/*      */           } 
/*      */         } 
/*      */       }
/*      */     }
/*      */     
/*      */     public void mouseReleased(MouseEvent event) {
/* 1789 */       if (!(event.getSource() instanceof JLabel))
/*      */       {
/* 1791 */         if (event.getSource() == Fenetre.this.boutonValiderNomJoueurs) {
/* 1792 */           if (event.getX() > 0 && event.getX() < Fenetre.this.boutonValiderNomJoueurs.getWidth() && event.getY() > 0 && 
/* 1793 */             event.getY() < Fenetre.this.boutonValiderNomJoueurs.getHeight()) {
/* 1794 */             Fenetre.this.setCursor(Cursor.getPredefinedCursor(12));
/* 1795 */             Fenetre.surLeBouton = true;
/*      */             
/* 1797 */             int a = 260, b = 320, c = 180, d = 60;
/* 1798 */             for (int i = 1; i < 6; i++) {
/* 1799 */               a--; b--; c += 2; d += 2;
/* 1800 */               Fenetre.this.boutonValiderNomJoueurs.setBounds(a, b, c, d);
/*      */             } 
/*      */           } 
/* 1803 */         } else if (event.getSource() == Fenetre.boutonLancer) {
/* 1804 */           if (Fenetre.lancerEnable) {
/* 1805 */             if (event.getX() > 0 && event.getX() < Fenetre.boutonLancer.getWidth() && event.getY() > 0 && event.getY() < Fenetre.boutonLancer.getHeight()) {
/* 1806 */               Fenetre.this.setCursor(Cursor.getPredefinedCursor(12));
/* 1807 */               Fenetre.surLeBouton = true;
/*      */               
/* 1809 */               int a = 66, b = 7, c = 50, d = 50;
/* 1810 */               for (int i = 1; i < 4; i++) {
/* 1811 */                 a--; b--; c += 2; d += 2;
/* 1812 */                 Fenetre.boutonLancer.setBounds(a, b, c, d);
/*      */               } 
/*      */             } 
/*      */           } else {
/* 1816 */             Fenetre.this.setCursor(Cursor.getDefaultCursor());
/*      */           } 
/* 1818 */         } else if (event.getSource() == Fenetre.boutonPause) {
/* 1819 */           if (Fenetre.pauseEnable) {
/* 1820 */             if (event.getX() > 0 && event.getX() < Fenetre.boutonPause.getWidth() && event.getY() > 0 && event.getY() < Fenetre.boutonPause.getHeight()) {
/* 1821 */               Fenetre.this.setCursor(Cursor.getPredefinedCursor(12));
/* 1822 */               Fenetre.surLeBouton = true;
/*      */               
/* 1824 */               int a = 166, b = 7, c = 50, d = 50;
/* 1825 */               for (int i = 1; i < 4; i++) {
/* 1826 */                 a--; b--; c += 2; d += 2;
/* 1827 */                 Fenetre.boutonPause.setBounds(a, b, c, d);
/*      */               } 
/*      */             } 
/*      */           } else {
/* 1831 */             Fenetre.this.setCursor(Cursor.getDefaultCursor());
/*      */           } 
/* 1833 */         } else if (event.getSource() == Fenetre.boutonRestart) {
/* 1834 */           if (Fenetre.restartEnable && 
/* 1835 */             event.getX() > 0 && event.getX() < Fenetre.boutonRestart.getWidth() && event.getY() > 0 && event.getY() < Fenetre.boutonRestart.getHeight()) {
/* 1836 */             Fenetre.this.setCursor(Cursor.getPredefinedCursor(12));
/* 1837 */             Fenetre.surLeBouton = true;
/*      */             
/* 1839 */             int a = 266, b = 7, c = 50, d = 50;
/* 1840 */             for (int i = 1; i < 4; i++) {
/* 1841 */               a--; b--; c += 2; d += 2;
/* 1842 */               Fenetre.boutonRestart.setBounds(a, b, c, d);
/*      */             }
/*      */           
/*      */           } 
/* 1846 */         } else if (event.getSource() == Fenetre.this.boutonAbandonner) {
/* 1847 */           if (event.getX() > 0 && event.getX() < Fenetre.this.boutonAbandonner.getWidth() && event.getY() > 0 && event.getY() < Fenetre.this.boutonAbandonner.getHeight()) {
/* 1848 */             Fenetre.this.setCursor(Cursor.getPredefinedCursor(12));
/* 1849 */             Fenetre.surLeBouton = true;
/*      */             
/* 1851 */             int a = 1210, b = 7, c = 50, d = 50;
/* 1852 */             for (int i = 1; i < 4; i++) {
/* 1853 */               a--; b--; c += 2; d += 2;
/* 1854 */               Fenetre.this.boutonAbandonner.setBounds(a, b, c, d);
/*      */             } 
/*      */           } 
/* 1857 */         } else if (event.getSource() == Fenetre.this.boutonChangerNom) {
/* 1858 */           if (event.getX() > 0 && event.getX() < Fenetre.this.boutonChangerNom.getWidth() && event.getY() > 0 && event.getY() < Fenetre.this.boutonChangerNom.getHeight()) {
/* 1859 */             Fenetre.this.setCursor(Cursor.getPredefinedCursor(12));
/* 1860 */             Fenetre.surLeBouton = true;
/*      */             
/* 1862 */             int a = 1310, b = 7, c = 50, d = 50;
/* 1863 */             for (int i = 1; i < 4; i++) {
/* 1864 */               a--; b--; c += 2; d += 2;
/* 1865 */               Fenetre.this.boutonChangerNom.setBounds(a, b, c, d);
/*      */             } 
/*      */           } 
/* 1868 */         } else if (event.getSource() == Fenetre.this.boutonOptions) {
/* 1869 */           if (event.getX() > 0 && event.getX() < Fenetre.this.boutonOptions.getWidth() && event.getY() > 0 && event.getY() < Fenetre.this.boutonOptions.getHeight()) {
/* 1870 */             Fenetre.this.setCursor(Cursor.getPredefinedCursor(12));
/* 1871 */             Fenetre.surLeBouton = true;
/*      */             
/* 1873 */             int a = 1410, b = 7, c = 50, d = 50;
/* 1874 */             for (int i = 1; i < 4; i++) {
/* 1875 */               a--; b--; c += 2; d += 2;
/* 1876 */               Fenetre.this.boutonOptions.setBounds(a, b, c, d);
/*      */             } 
/*      */           } 
/* 1879 */         } else if (event.getSource() == Fenetre.boutonValider && 
/* 1880 */           event.getX() > 0 && event.getX() < Fenetre.boutonValider.getWidth() && event.getY() > 0 && event.getY() < Fenetre.boutonValider.getHeight()) {
/* 1881 */           Fenetre.surLeBouton = true;
/* 1882 */           int a = 215, b = 230, c = 180, d = 60;
/* 1883 */           for (int i = 1; i < 6; i++) {
/* 1884 */             a--; b--; c += 2; d += 2;
/* 1885 */             Fenetre.boutonValider.setBounds(a, b, c, d);
/*      */           } 
/*      */         } 
/*      */       }
/*      */     }
/*      */     
/*      */     private EvenementsSouris() {}
/*      */   }
/*      */ }


/* Location:              C:\Users\Christophe\Documents\MesProjets\Échec\Echec.jar!\fr\JeuEchec\christophegarcia\Fenetre.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */