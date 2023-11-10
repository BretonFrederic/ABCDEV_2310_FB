<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="AFFICHER anneeMod400"/>
    <extension extnom="inactif"/>
    <fonction fctcode="" fctetat="inactif"/>
    <F2 F2para="" F2etat="inactif" F2defaut="" F2lignes=""/>
    <repere repcode="-10#10#-10#10#2#2" repetat="inactif"/>
    <param arrondiAuto="vrai" epaisseurLigne="2" epaisseurPoint="2" maxBoucle="500000" nbDecimales="8" totalAffichages="1000" totalBoucles="5000000"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#NOMBRE#annee" algoitem="annee EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#Bissextile" algoitem="Bissextile EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#anneeMod100" algoitem="anneeMod100 EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#anneeMod400" algoitem="anneeMod400 EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#anneeMod4" algoitem="anneeMod4 EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="4#Saisir une année : #0" algoitem="AFFICHER &quot;Saisir une année : &quot;"/>
        <item code="2#annee#pasliste" algoitem="LIRE annee"/>
        <item code="5#anneeMod4#annee%4#pasliste" algoitem="anneeMod4 PREND_LA_VALEUR annee%4"/>
        <item code="3#anneeMod4#1#pasliste" algoitem="AFFICHER anneeMod4"/>
        <item code="5#anneeMod100#annee%100#pasliste" algoitem="anneeMod100 PREND_LA_VALEUR annee%100"/>
        <item code="3#anneeMod100#1#pasliste" algoitem="AFFICHER anneeMod100"/>
        <item code="5#anneeMod400#annee%400#pasliste" algoitem="anneeMod400 PREND_LA_VALEUR annee%400"/>
        <item code="3#anneeMod400#1#pasliste" algoitem="AFFICHER anneeMod400"/>
        <item code="15#anneeMod4>1" algoitem="TANT_QUE (anneeMod4>1) FAIRE">
            <item code="16#debuttantque" algoitem="DEBUT_TANT_QUE"/>
            <item code="5#anneeMod4#anneeMod4/2#pasliste" algoitem="anneeMod4 PREND_LA_VALEUR anneeMod4/2"/>
            <item code="17#fintantque" algoitem="FIN_TANT_QUE"/>
        </item>
        <item code="3#anneeMod4#1#pasliste" algoitem="AFFICHER anneeMod4"/>
        <item code="15#anneeMod100>1" algoitem="TANT_QUE (anneeMod100>1) FAIRE">
            <item code="16#debuttantque" algoitem="DEBUT_TANT_QUE"/>
            <item code="5#anneeMod100#anneeMod100/2#pasliste" algoitem="anneeMod100 PREND_LA_VALEUR anneeMod100/2"/>
            <item code="17#fintantque" algoitem="FIN_TANT_QUE"/>
        </item>
        <item code="3#anneeMod100#1#pasliste" algoitem="AFFICHER anneeMod100"/>
        <item code="15#anneeMod400>1" algoitem="TANT_QUE (anneeMod400>1) FAIRE">
            <item code="16#debuttantque" algoitem="DEBUT_TANT_QUE"/>
            <item code="5#anneeMod400#anneeMod400/2#pasliste" algoitem="anneeMod400 PREND_LA_VALEUR anneeMod400/2"/>
            <item code="17#fintantque" algoitem="FIN_TANT_QUE"/>
        </item>
        <item code="3#anneeMod400#1#pasliste" algoitem="AFFICHER anneeMod400"/>
        <item code="6#anneeMod4>0" algoitem="SI (anneeMod4>0) ALORS">
            <item code="7#debutsi" algoitem="DEBUT_SI"/>
            <item code="5#Bissextile#0#pasliste" algoitem="Bissextile PREND_LA_VALEUR 0"/>
            <item code="8#finsi" algoitem="FIN_SI"/>
            <item code="9#sinon" algoitem="SINON">
                <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                <item code="6#anneeMod4==0" algoitem="SI (anneeMod4==0) ALORS">
                    <item code="7#debutsi" algoitem="DEBUT_SI"/>
                    <item code="6#anneeMod100==0 ET anneeMod400>0" algoitem="SI (anneeMod100==0 ET anneeMod400>0) ALORS">
                        <item code="7#debutsi" algoitem="DEBUT_SI"/>
                        <item code="5#Bissextile#0#pasliste" algoitem="Bissextile PREND_LA_VALEUR 0"/>
                        <item code="8#finsi" algoitem="FIN_SI"/>
                    </item>
                    <item code="8#finsi" algoitem="FIN_SI"/>
                    <item code="9#sinon" algoitem="SINON">
                        <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                        <item code="5#Bissextile#1#pasliste" algoitem="Bissextile PREND_LA_VALEUR 1"/>
                        <item code="11#finsinon" algoitem="FIN_SINON"/>
                    </item>
                </item>
                <item code="11#finsinon" algoitem="FIN_SINON"/>
            </item>
        </item>
        <item code="6#Bissextile==1" algoitem="SI (Bissextile==1) ALORS">
            <item code="7#debutsi" algoitem="DEBUT_SI"/>
            <item code="4#L'année est bissextile#0" algoitem="AFFICHER &quot;L'année est bissextile&quot;"/>
            <item code="8#finsi" algoitem="FIN_SI"/>
            <item code="9#sinon" algoitem="SINON">
                <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                <item code="6#Bissextile==0" algoitem="SI (Bissextile==0) ALORS">
                    <item code="7#debutsi" algoitem="DEBUT_SI"/>
                    <item code="4#L'année n'est pas bissextile#0" algoitem="AFFICHER &quot;L'année n'est pas bissextile&quot;"/>
                    <item code="8#finsi" algoitem="FIN_SI"/>
                </item>
                <item code="11#finsinon" algoitem="FIN_SINON"/>
            </item>
        </item>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
