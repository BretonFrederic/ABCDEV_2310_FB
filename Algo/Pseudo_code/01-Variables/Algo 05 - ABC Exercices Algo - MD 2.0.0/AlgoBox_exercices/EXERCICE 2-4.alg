<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="SI (anneeMod4>0) ALORS"/>
    <extension extnom="inactif"/>
    <fonction fctcode="" fctetat="inactif"/>
    <F2 F2lignes="" F2etat="inactif" F2defaut="" F2para=""/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param arrondiAuto="vrai" epaisseurLigne="2" totalAffichages="1000" epaisseurPoint="2" maxBoucle="500000" totalBoucles="5000000" nbDecimales="8"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#NOMBRE#annee" algoitem="annee EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#anneeMod100" algoitem="anneeMod100 EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#anneeMod400" algoitem="anneeMod400 EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#anneeMod4" algoitem="anneeMod4 EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="4#Saisir une année : #0" algoitem="AFFICHER &quot;Saisir une année : &quot;"/>
        <item code="2#annee#pasliste" algoitem="LIRE annee"/>
        <item code="5#anneeMod4#annee%4#pasliste" algoitem="anneeMod4 PREND_LA_VALEUR annee%4"/>
        <item code="5#anneeMod100#annee%100#pasliste" algoitem="anneeMod100 PREND_LA_VALEUR annee%100"/>
        <item code="5#anneeMod400#annee%400#pasliste" algoitem="anneeMod400 PREND_LA_VALEUR annee%400"/>
        <item code="6#anneeMod4>0" algoitem="SI (anneeMod4>0) ALORS">
            <item code="7#debutsi" algoitem="DEBUT_SI"/>
            <item code="4#L'année n'est pas bissextile#0" algoitem="AFFICHER &quot;L'année n'est pas bissextile&quot;"/>
            <item code="8#finsi" algoitem="FIN_SI"/>
        </item>
        <item code="6#anneeMod4==0" algoitem="SI (anneeMod4==0) ALORS">
            <item code="7#debutsi" algoitem="DEBUT_SI"/>
            <item code="6#anneeMod100==0 ET anneeMod400>0" algoitem="SI (anneeMod100==0 ET anneeMod400>0) ALORS">
                <item code="7#debutsi" algoitem="DEBUT_SI"/>
                <item code="4#L'année n'est pas bissextile#0" algoitem="AFFICHER &quot;L'année n'est pas bissextile&quot;"/>
                <item code="8#finsi" algoitem="FIN_SI"/>
                <item code="9#sinon" algoitem="SINON">
                    <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                    <item code="4#L'année est bissextile#0" algoitem="AFFICHER &quot;L'année est bissextile&quot;"/>
                    <item code="11#finsinon" algoitem="FIN_SINON"/>
                </item>
            </item>
            <item code="8#finsi" algoitem="FIN_SI"/>
        </item>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
