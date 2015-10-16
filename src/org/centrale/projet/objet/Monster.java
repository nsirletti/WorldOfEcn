package org.centrale.projet.objet;

import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
abstract public class Monster extends Creature {
    //Attributs : tous hérités de Creature

    
    //Constructeurs
    /**
     * 
     * @param ptVie
     * @param pourcentageAtt
     * @param pourcentagePar
     * @param degAtt
     * @param pos
     */
    public Monster(int ptVie, int pourcentageAtt, int pourcentagePar, int degAtt, Point2D pos) {
        super(ptVie, pourcentageAtt, pourcentagePar, degAtt, pos);
    }
    /**
     * 
     */
    public Monster() {
        super();
    }
    /**
     * 
     * @param m
     */
    public Monster(Monster m){
        super(m);
    }

    
}
