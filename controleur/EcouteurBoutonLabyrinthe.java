package jeudelavie1d.controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import jeudelavie1d.modele.Carte.TypeMap;
import jeudelavie1d.modele.Modele;
import jeudelavie1d.modele.Modele.TypeSelection;

public class EcouteurBoutonLabyrinthe implements ActionListener {
	
	protected Modele m;
	protected int positionX;
	protected int positionY;

	public EcouteurBoutonLabyrinthe(Modele m, int x) {
		this.m = m;
		this.positionX = x;
		//this.positionY = y;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(m.getTypeSelection() == TypeSelection.MORT){
			m.getGrille().getMap(positionX).setTypeMap(TypeMap.MORT);
			m.getGrille().getMap2d(positionY, positionX).setTypeMap(TypeMap.MORT);
			//m.miseAJour();
		}else if(m.getTypeSelection() == TypeSelection.VIVANT){
			m.getGrille().getMap(positionX).setTypeMap(TypeMap.VIVANT);
			m.getGrille().getMap2d(positionY, positionX).setTypeMap(TypeMap.VIVANT);
		}
		m.miseAJour();
		//System.out.println(m.getLabyrinthe().getMap(positionX, positionY).toString()+"\n");
		//System.out.println(m.getLabyrinthe().nbVoisin(positionX, positionY));
		//System.out.println(m.getLabyrinthe().getMap(positionX, positionY).valeur());
		//m.affichageLabyrinthe();
	}

}
