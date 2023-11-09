<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="AFFICHER nombre3"/>
    <extension extnom="inactif"/>
    <fonction fctcode="" fctetat="inactif"/>
    <F2 F2lignes="" F2etat="inactif" F2defaut="" F2para=""/>
    <repere repcode="-10#10#-10#10#2#2" repetat="inactif"/>
    <param arrondiAuto="vrai" totalAffichages="1000" epaisseurLigne="2" totalBoucles="5000000" nbDecimales="8" maxBoucle="500000" epaisseurPoint="2"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#NOMBRE#nombreA" algoitem="nombreA EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#nombreB" algoitem="nombreB EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#nombreC" algoitem="nombreC EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#nombre1" algoitem="nombre1 EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#nombre2" algoitem="nombre2 EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#nombre3" algoitem="nombre3 EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="4#Saisir un premier nombre entier : #0" algoitem="AFFICHER &quot;Saisir un premier nombre entier : &quot;"/>
        <item code="2#nombreA#pasliste" algoitem="LIRE nombreA"/>
        <item code="4#Saisir un deuxième nombre entier : #0" algoitem="AFFICHER &quot;Saisir un deuxième nombre entier : &quot;"/>
        <item code="2#nombreB#pasliste" algoitem="LIRE nombreB"/>
        <item code="4#Saisir un troisième nombre entier : #0" algoitem="AFFICHER &quot;Saisir un troisième nombre entier : &quot;"/>
        <item code="2#nombreC#pasliste" algoitem="LIRE nombreC"/>
        <item code="6#nombreA&lt;nombreB" algoitem="SI (nombreA&lt;nombreB) ALORS">
            <item code="7#debutsi" algoitem="DEBUT_SI"/>
            <item code="5#nombre1#nombreA#pasliste" algoitem="nombre1 PREND_LA_VALEUR nombreA"/>
            <item code="5#nombre2#nombreB#pasliste" algoitem="nombre2 PREND_LA_VALEUR nombreB"/>
            <item code="8#finsi" algoitem="FIN_SI"/>
            <item code="9#sinon" algoitem="SINON">
                <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                <item code="5#nombre1#nombreB#pasliste" algoitem="nombre1 PREND_LA_VALEUR nombreB"/>
                <item code="5#nombre2#nombreA#pasliste" algoitem="nombre2 PREND_LA_VALEUR nombreA"/>
                <item code="11#finsinon" algoitem="FIN_SINON"/>
            </item>
        </item>
        <item code="6#nombreC>nombre2" algoitem="SI (nombreC>nombre2) ALORS">
            <item code="7#debutsi" algoitem="DEBUT_SI"/>
            <item code="5#nombre3#nombreC#pasliste" algoitem="nombre3 PREND_LA_VALEUR nombreC"/>
            <item code="8#finsi" algoitem="FIN_SI"/>
        </item>
        <item code="6#nombreC&lt;nombre1" algoitem="SI (nombreC&lt;nombre1) ALORS">
            <item code="7#debutsi" algoitem="DEBUT_SI"/>
            <item code="5#nombre3#nombre2#pasliste" algoitem="nombre3 PREND_LA_VALEUR nombre2"/>
            <item code="5#nombre2#nombre1#pasliste" algoitem="nombre2 PREND_LA_VALEUR nombre1"/>
            <item code="5#nombre1#nombreC#pasliste" algoitem="nombre1 PREND_LA_VALEUR nombreC"/>
            <item code="8#finsi" algoitem="FIN_SI"/>
        </item>
        <item code="6#nombreC>nombre1 ET nombreC&lt;nombre2" algoitem="SI (nombreC>nombre1 ET nombreC&lt;nombre2) ALORS">
            <item code="7#debutsi" algoitem="DEBUT_SI"/>
            <item code="5#nombre3#nombre2#pasliste" algoitem="nombre3 PREND_LA_VALEUR nombre2"/>
            <item code="5#nombre2#nombreC#pasliste" algoitem="nombre2 PREND_LA_VALEUR nombreC"/>
            <item code="8#finsi" algoitem="FIN_SI"/>
        </item>
        <item code="4#L'ordre croissant des trois nombres réel double précision est : #0" algoitem="AFFICHER &quot;L'ordre croissant des trois nombres réel double précision est : &quot;"/>
        <item code="3#nombre1#0#pasliste" algoitem="AFFICHER nombre1"/>
        <item code="4#, #0" algoitem="AFFICHER &quot;, &quot;"/>
        <item code="3#nombre2#0#pasliste" algoitem="AFFICHER nombre2"/>
        <item code="4#, #0" algoitem="AFFICHER &quot;, &quot;"/>
        <item code="3#nombre3#0#pasliste" algoitem="AFFICHER nombre3"/>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
