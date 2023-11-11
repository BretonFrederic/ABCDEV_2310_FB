<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="AFFICHER &quot; n'est pas un nombre premier.&quot;"/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2lignes="" F2para="" F2defaut="" F2etat="inactif"/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param maxBoucle="500000" epaisseurLigne="2" arrondiAuto="vrai" totalAffichages="1000" nbDecimales="8" totalBoucles="5000000" epaisseurPoint="2"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#NOMBRE#nombre1" algoitem="nombre1 EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#diviseur" algoitem="diviseur EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#resultat" algoitem="resultat EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#nombreDeDiviseurs" algoitem="nombreDeDiviseurs EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="4#Saisir un nombre entier : #0" algoitem="AFFICHER &quot;Saisir un nombre entier : &quot;"/>
        <item code="2#nombre1#pasliste" algoitem="LIRE nombre1"/>
        <item code="4#Le nombre #0" algoitem="AFFICHER &quot;Le nombre &quot;"/>
        <item code="3#nombre1#0#pasliste" algoitem="AFFICHER nombre1"/>
        <item code="12#diviseur#2#nombre1-1" algoitem="POUR diviseur ALLANT_DE 2 A nombre1-1">
            <item code="13#debutpour" algoitem="DEBUT_POUR"/>
            <item code="5#resultat#nombre1%diviseur#pasliste" algoitem="resultat PREND_LA_VALEUR nombre1%diviseur"/>
            <item code="6#resultat==0" algoitem="SI (resultat==0) ALORS">
                <item code="7#debutsi" algoitem="DEBUT_SI"/>
                <item code="5#nombreDeDiviseurs#nombreDeDiviseurs + 1#pasliste" algoitem="nombreDeDiviseurs PREND_LA_VALEUR nombreDeDiviseurs + 1"/>
                <item code="8#finsi" algoitem="FIN_SI"/>
            </item>
            <item code="14#finpour" algoitem="FIN_POUR"/>
        </item>
        <item code="6#nombreDeDiviseurs==0" algoitem="SI (nombreDeDiviseurs==0) ALORS">
            <item code="7#debutsi" algoitem="DEBUT_SI"/>
            <item code="4# est un nombre premier.#0" algoitem="AFFICHER &quot; est un nombre premier.&quot;"/>
            <item code="8#finsi" algoitem="FIN_SI"/>
            <item code="9#sinon" algoitem="SINON">
                <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                <item code="4# n'est pas un nombre premier.#0" algoitem="AFFICHER &quot; n'est pas un nombre premier.&quot;"/>
                <item code="11#finsinon" algoitem="FIN_SINON"/>
            </item>
        </item>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
