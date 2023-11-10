<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description courant="AFFICHER anneeMod400" texte=""/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2lignes="" F2para="" F2etat="inactif" F2defaut=""/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param totalAffichages="1000" arrondiAuto="vrai" maxBoucle="500000" epaisseurLigne="2" epaisseurPoint="2" totalBoucles="5000000" nbDecimales="8"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions"/>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="annee EST_DU_TYPE NOMBRE" code="1#NOMBRE#annee"/>
        <item algoitem="Bissextile EST_DU_TYPE NOMBRE" code="1#NOMBRE#Bissextile"/>
        <item algoitem="anneeMod100 EST_DU_TYPE NOMBRE" code="1#NOMBRE#anneeMod100"/>
        <item algoitem="anneeMod400 EST_DU_TYPE NOMBRE" code="1#NOMBRE#anneeMod400"/>
        <item algoitem="anneeMod4 EST_DU_TYPE NOMBRE" code="1#NOMBRE#anneeMod4"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="AFFICHER &quot;Saisir une année : &quot;" code="4#Saisir une année : #0"/>
        <item algoitem="LIRE annee" code="2#annee#pasliste"/>
        <item algoitem="anneeMod4 PREND_LA_VALEUR annee%4" code="5#anneeMod4#annee%4#pasliste"/>
        <item algoitem="AFFICHER anneeMod4" code="3#anneeMod4#0#pasliste"/>
        <item algoitem="anneeMod100 PREND_LA_VALEUR annee%100" code="5#anneeMod100#annee%100#pasliste"/>
        <item algoitem="AFFICHER anneeMod100" code="3#anneeMod100#0#pasliste"/>
        <item algoitem="anneeMod400 PREND_LA_VALEUR annee%400" code="5#anneeMod400#annee%400#pasliste"/>
        <item algoitem="AFFICHER anneeMod400" code="3#anneeMod400#0#pasliste"/>
        <item algoitem="TANT_QUE (anneeMod4>1) FAIRE" code="15#anneeMod4>1">
            <item algoitem="DEBUT_TANT_QUE" code="16#debuttantque"/>
            <item algoitem="anneeMod4 PREND_LA_VALEUR anneeMod4/2" code="5#anneeMod4#anneeMod4/2#pasliste"/>
            <item algoitem="FIN_TANT_QUE" code="17#fintantque"/>
        </item>
        <item algoitem="" code="103#commentaire"/>
        <item algoitem="TANT_QUE (anneeMod100>1) FAIRE" code="15#anneeMod100>1">
            <item algoitem="DEBUT_TANT_QUE" code="16#debuttantque"/>
            <item algoitem="anneeMod100 PREND_LA_VALEUR anneeMod100/2" code="5#anneeMod100#anneeMod100/2#pasliste"/>
            <item algoitem="FIN_TANT_QUE" code="17#fintantque"/>
        </item>
        <item algoitem="AFFICHER anneeMod100" code="3#anneeMod100#1#pasliste"/>
        <item algoitem="TANT_QUE (anneeMod400>1) FAIRE" code="15#anneeMod400>1">
            <item algoitem="DEBUT_TANT_QUE" code="16#debuttantque"/>
            <item algoitem="anneeMod400 PREND_LA_VALEUR anneeMod400/2" code="5#anneeMod400#anneeMod400/2#pasliste"/>
            <item algoitem="FIN_TANT_QUE" code="17#fintantque"/>
        </item>
        <item algoitem="AFFICHER anneeMod400" code="3#anneeMod400#1#pasliste"/>
        <item algoitem="SI (anneeMod4>0) ALORS" code="6#anneeMod4>0">
            <item algoitem="DEBUT_SI" code="7#debutsi"/>
            <item algoitem="Bissextile PREND_LA_VALEUR 0" code="5#Bissextile#0#pasliste"/>
            <item algoitem="FIN_SI" code="8#finsi"/>
            <item algoitem="SINON" code="9#sinon">
                <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
                <item algoitem="SI (anneeMod4==0) ALORS" code="6#anneeMod4==0">
                    <item algoitem="DEBUT_SI" code="7#debutsi"/>
                    <item algoitem="SI (anneeMod100==0 ET anneeMod400>0) ALORS" code="6#anneeMod100==0 ET anneeMod400>0">
                        <item algoitem="DEBUT_SI" code="7#debutsi"/>
                        <item algoitem="Bissextile PREND_LA_VALEUR 0" code="5#Bissextile#0#pasliste"/>
                        <item algoitem="FIN_SI" code="8#finsi"/>
                    </item>
                    <item algoitem="FIN_SI" code="8#finsi"/>
                    <item algoitem="SINON" code="9#sinon">
                        <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
                        <item algoitem="Bissextile PREND_LA_VALEUR 1" code="5#Bissextile#1#pasliste"/>
                        <item algoitem="FIN_SINON" code="11#finsinon"/>
                    </item>
                </item>
                <item algoitem="FIN_SINON" code="11#finsinon"/>
            </item>
        </item>
        <item algoitem="SI (Bissextile==1) ALORS" code="6#Bissextile==1">
            <item algoitem="DEBUT_SI" code="7#debutsi"/>
            <item algoitem="AFFICHER &quot;L'année est bissextile&quot;" code="4#L'année est bissextile#0"/>
            <item algoitem="FIN_SI" code="8#finsi"/>
            <item algoitem="SINON" code="9#sinon">
                <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
                <item algoitem="SI (Bissextile==0) ALORS" code="6#Bissextile==0">
                    <item algoitem="DEBUT_SI" code="7#debutsi"/>
                    <item algoitem="AFFICHER &quot;L'année n'est pas bissextile&quot;" code="4#L'année n'est pas bissextile#0"/>
                    <item algoitem="FIN_SI" code="8#finsi"/>
                </item>
                <item algoitem="FIN_SINON" code="11#finsinon"/>
            </item>
        </item>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>
