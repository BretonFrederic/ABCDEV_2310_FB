<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description courant="quitter PREND_LA_VALEUR 0" texte=""/>
    <extension extnom="inactif"/>
    <fonction fctcode="" fctetat="inactif"/>
    <F2 F2lignes="" F2defaut="" F2etat="inactif" F2para=""/>
    <repere repcode="-10#10#-10#10#2#2" repetat="inactif"/>
    <param epaisseurLigne="2" maxBoucle="500000" arrondiAuto="vrai" totalAffichages="1000" nbDecimales="8" epaisseurPoint="2" totalBoucles="5000000"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions"/>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="nombreA EST_DU_TYPE NOMBRE" code="1#NOMBRE#nombreA"/>
        <item algoitem="majorite EST_DU_TYPE NOMBRE" code="1#NOMBRE#majorite"/>
        <item algoitem="choix EST_DU_TYPE CHAINE" code="1#CHAINE#choix"/>
        <item algoitem="quitter EST_DU_TYPE NOMBRE" code="1#NOMBRE#quitter"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="majorite PREND_LA_VALEUR 18" code="5#majorite#18#pasliste"/>
        <item algoitem="quitter PREND_LA_VALEUR 0" code="5#quitter#0#pasliste"/>
        <item algoitem="TANT_QUE (quitter==0) FAIRE" code="15#quitter==0">
            <item algoitem="DEBUT_TANT_QUE" code="16#debuttantque"/>
            <item algoitem="AFFICHER &quot;Saisir votre âge (en années): &quot;" code="4#Saisir votre âge (en années): #0"/>
            <item algoitem="LIRE nombreA" code="2#nombreA#pasliste"/>
            <item algoitem="SI (nombreA&lt;0) ALORS" code="6#nombreA&lt;0">
                <item algoitem="DEBUT_SI" code="7#debutsi"/>
                <item algoitem="AFFICHER &quot;Vous n'êtes pas encore né&quot;" code="4#Vous n'êtes pas encore né#1"/>
                <item algoitem="FIN_SI" code="8#finsi"/>
            </item>
            <item algoitem="SI (nombreA>=majorite) ALORS" code="6#nombreA>=majorite">
                <item algoitem="DEBUT_SI" code="7#debutsi"/>
                <item algoitem="AFFICHER &quot;Vous êtes majeur&quot;" code="4#Vous êtes majeur#1"/>
                <item algoitem="FIN_SI" code="8#finsi"/>
            </item>
            <item algoitem="SI (nombreA>0 ET nombreA&lt;majorite) ALORS" code="6#nombreA>0 ET nombreA&lt;majorite">
                <item algoitem="DEBUT_SI" code="7#debutsi"/>
                <item algoitem="AFFICHER &quot;Vous êtes mineur&quot;" code="4#Vous êtes mineur#1"/>
                <item algoitem="FIN_SI" code="8#finsi"/>
            </item>
            <item algoitem="AFFICHER &quot;Saisir q pour quitter&quot;" code="4#Saisir q pour quitter#0"/>
            <item algoitem="LIRE choix" code="2#choix#pasliste"/>
            <item algoitem="SI (choix=q) ALORS" code="6#choix=q">
                <item algoitem="DEBUT_SI" code="7#debutsi"/>
                <item algoitem="quitter PREND_LA_VALEUR 1" code="5#quitter#1#pasliste"/>
                <item algoitem="FIN_SI" code="8#finsi"/>
                <item algoitem="SINON" code="9#sinon">
                    <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
                    <item algoitem="quitter PREND_LA_VALEUR 0" code="5#quitter#0#pasliste"/>
                    <item algoitem="FIN_SINON" code="11#finsinon"/>
                </item>
            </item>
            <item algoitem="FIN_TANT_QUE" code="17#fintantque"/>
        </item>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>
