<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="SI (nombreDeDiviseurs==0) ALORS"/>
    <extension extnom="inactif"/>
    <fonction fctcode="" fctetat="inactif"/>
    <F2 F2lignes="" F2para="" F2defaut="" F2etat="inactif"/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param arrondiAuto="vrai" maxBoucle="500000" totalBoucles="5000000" totalAffichages="1000" epaisseurPoint="2" epaisseurLigne="2" nbDecimales="8"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions"/>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="nombre1 EST_DU_TYPE NOMBRE" code="1#NOMBRE#nombre1"/>
        <item algoitem="diviseur EST_DU_TYPE NOMBRE" code="1#NOMBRE#diviseur"/>
        <item algoitem="resultat EST_DU_TYPE NOMBRE" code="1#NOMBRE#resultat"/>
        <item algoitem="nombreDeDiviseurs EST_DU_TYPE NOMBRE" code="1#NOMBRE#nombreDeDiviseurs"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="AFFICHER &quot;Saisir un nombre entier : &quot;" code="4#Saisir un nombre entier : #0"/>
        <item algoitem="LIRE nombre1" code="2#nombre1#pasliste"/>
        <item algoitem="AFFICHER &quot;Les diviseurs du nombre &quot;" code="4#Les diviseurs du nombre #0"/>
        <item algoitem="AFFICHER nombre1" code="3#nombre1#0#pasliste"/>
        <item algoitem="AFFICHER &quot; sont : &quot;" code="4# sont : #1"/>
        <item algoitem="POUR diviseur ALLANT_DE 2 A nombre1-1" code="12#diviseur#2#nombre1-1">
            <item algoitem="DEBUT_POUR" code="13#debutpour"/>
            <item algoitem="resultat PREND_LA_VALEUR nombre1%diviseur" code="5#resultat#nombre1%diviseur#pasliste"/>
            <item algoitem="SI (resultat==0) ALORS" code="6#resultat==0">
                <item algoitem="DEBUT_SI" code="7#debutsi"/>
                <item algoitem="AFFICHER diviseur" code="3#diviseur#1#pasliste"/>
                <item algoitem="nombreDeDiviseurs PREND_LA_VALEUR nombreDeDiviseurs + 1" code="5#nombreDeDiviseurs#nombreDeDiviseurs + 1#pasliste"/>
                <item algoitem="FIN_SI" code="8#finsi"/>
            </item>
            <item algoitem="FIN_POUR" code="14#finpour"/>
        </item>
        <item algoitem="SI (nombreDeDiviseurs==0) ALORS" code="6#nombreDeDiviseurs==0">
            <item algoitem="DEBUT_SI" code="7#debutsi"/>
            <item algoitem="AFFICHER &quot; ce nombre n'a pas d'autres diviseurs que 1 est lui-même.&quot;" code="4# ce nombre n'a pas d'autres diviseurs que 1 est lui-même.#0"/>
            <item algoitem="FIN_SI" code="8#finsi"/>
        </item>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>
