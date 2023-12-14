<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description courant="AFFICHER &quot; &lt; &quot;" texte=""/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2defaut="" F2para="" F2etat="inactif" F2lignes=""/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param arrondiAuto="vrai" totalAffichages="1000" maxBoucle="500000" epaisseurLigne="2" epaisseurPoint="2" nbDecimales="8" totalBoucles="5000000"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions"/>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="nombreA EST_DU_TYPE NOMBRE" code="1#NOMBRE#nombreA"/>
        <item algoitem="nombreB EST_DU_TYPE NOMBRE" code="1#NOMBRE#nombreB"/>
        <item algoitem="nombreValide EST_DU_TYPE NOMBRE" code="1#NOMBRE#nombreValide"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="nombreValide PREND_LA_VALEUR 0" code="5#nombreValide#0#pasliste"/>
        <item algoitem="TANT_QUE (nombreValide==0) FAIRE" code="15#nombreValide==0">
            <item algoitem="DEBUT_TANT_QUE" code="16#debuttantque"/>
            <item algoitem="AFFICHER &quot;Saisir un premier nombre entier : &quot;" code="4#Saisir un premier nombre entier : #0"/>
            <item algoitem="LIRE nombreA" code="2#nombreA#pasliste"/>
            <item algoitem="AFFICHER &quot;Saisir un deuxième nombre entier : &quot;" code="4#Saisir un deuxième nombre entier : #0"/>
            <item algoitem="LIRE nombreB" code="2#nombreB#pasliste"/>
            <item algoitem="SI (nombreA==nombreB) ALORS" code="6#nombreA==nombreB">
                <item algoitem="DEBUT_SI" code="7#debutsi"/>
                <item algoitem="AFFICHER &quot;Vous devez saisir deux nombres entier différents&quot;" code="4#Vous devez saisir deux nombres entier différents#1"/>
                <item algoitem="FIN_SI" code="8#finsi"/>
                <item algoitem="SINON" code="9#sinon">
                    <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
                    <item algoitem="nombreValide PREND_LA_VALEUR 1" code="5#nombreValide#1#pasliste"/>
                    <item algoitem="FIN_SINON" code="11#finsinon"/>
                </item>
            </item>
            <item algoitem="FIN_TANT_QUE" code="17#fintantque"/>
        </item>
        <item algoitem="SI (nombreA&lt;nombreB) ALORS" code="6#nombreA&lt;nombreB">
            <item algoitem="DEBUT_SI" code="7#debutsi"/>
            <item algoitem="AFFICHER &quot;L'ordre croissant des deux nombres entiers est : &quot;" code="4#L'ordre croissant des deux nombres entiers est : #0"/>
            <item algoitem="AFFICHER nombreA" code="3#nombreA#0#pasliste"/>
            <item algoitem="AFFICHER &quot; &lt; &quot;" code="4# &lt; #0"/>
            <item algoitem="AFFICHER nombreB" code="3#nombreB#0#pasliste"/>
            <item algoitem="FIN_SI" code="8#finsi"/>
            <item algoitem="SINON" code="9#sinon">
                <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
                <item algoitem="AFFICHER &quot;L'ordre croissant des deux nombres entiers est : &quot;" code="4#L'ordre croissant des deux nombres entiers est : #0"/>
                <item algoitem="AFFICHER nombreB" code="3#nombreB#0#pasliste"/>
                <item algoitem="AFFICHER &quot; &lt; &quot;" code="4# &lt; #0"/>
                <item algoitem="AFFICHER nombreA" code="3#nombreA#0#pasliste"/>
                <item algoitem="FIN_SINON" code="11#finsinon"/>
            </item>
        </item>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>
