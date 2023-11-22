<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="SI (age&lt;0) ALORS"/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2para="" F2defaut="" F2lignes="" F2etat="inactif"/>
    <repere repcode="-10#10#-10#10#2#2" repetat="inactif"/>
    <param arrondiAuto="vrai" totalBoucles="5000000" epaisseurLigne="2" nbDecimales="8" epaisseurPoint="2" totalAffichages="1000" maxBoucle="500000"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions"/>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="age EST_DU_TYPE NOMBRE" code="1#NOMBRE#age"/>
        <item algoitem="majorite EST_DU_TYPE NOMBRE" code="1#NOMBRE#majorite"/>
        <item algoitem="quitter EST_DU_TYPE NOMBRE" code="1#NOMBRE#quitter"/>
        <item algoitem="choix EST_DU_TYPE NOMBRE" code="1#NOMBRE#choix"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="majorite PREND_LA_VALEUR 18" code="5#majorite#18#pasliste"/>
        <item algoitem="quitter PREND_LA_VALEUR 0" code="5#quitter#0#pasliste"/>
        <item algoitem="AFFICHER &quot;Saisir votre âge (en années): &quot;" code="4#Saisir votre âge (en années): #0"/>
        <item algoitem="LIRE age" code="2#age#pasliste"/>
        <item algoitem="SI (age&lt;0) ALORS" code="6#age&lt;0">
            <item algoitem="DEBUT_SI" code="7#debutsi"/>
            <item algoitem="AFFICHER &quot;vous n'êtes pas encore né !&quot;" code="4#vous n'êtes pas encore né !#1"/>
            <item algoitem="FIN_SI" code="8#finsi"/>
            <item algoitem="SINON" code="9#sinon">
                <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
                <item algoitem="SI (age>=majorite) ALORS" code="6#age>=majorite">
                    <item algoitem="DEBUT_SI" code="7#debutsi"/>
                    <item algoitem="AFFICHER &quot;Vous êtes majeur&quot;" code="4#Vous êtes majeur#1"/>
                    <item algoitem="FIN_SI" code="8#finsi"/>
                    <item algoitem="SINON" code="9#sinon">
                        <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
                        <item algoitem="AFFICHER &quot;Vous êtes mineur&quot;" code="4#Vous êtes mineur#1"/>
                        <item algoitem="FIN_SINON" code="11#finsinon"/>
                    </item>
                </item>
                <item algoitem="FIN_SINON" code="11#finsinon"/>
            </item>
        </item>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>
