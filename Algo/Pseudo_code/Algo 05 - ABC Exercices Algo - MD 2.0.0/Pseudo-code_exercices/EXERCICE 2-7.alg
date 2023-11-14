<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description courant="quitterBooleen PREND_LA_VALEUR 1" texte=""/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2defaut="" F2etat="inactif" F2para="" F2lignes=""/>
    <repere repcode="-10#10#-10#10#2#2" repetat="inactif"/>
    <param maxBoucle="500000" epaisseurLigne="2" arrondiAuto="vrai" nbDecimales="8" totalAffichages="1000" epaisseurPoint="2" totalBoucles="5000000"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions"/>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="kilometres EST_DU_TYPE NOMBRE" code="1#NOMBRE#kilometres"/>
        <item algoitem="valeurSaisie EST_DU_TYPE CHAINE" code="1#CHAINE#valeurSaisie"/>
        <item algoitem="position EST_DU_TYPE NOMBRE" code="1#NOMBRE#position"/>
        <item algoitem="resultatMiles EST_DU_TYPE NOMBRE" code="1#NOMBRE#resultatMiles"/>
        <item algoitem="quitterBooleen EST_DU_TYPE NOMBRE" code="1#NOMBRE#quitterBooleen"/>
        <item algoitem="KMS_TO_MILES EST_DU_TYPE NOMBRE" code="1#NOMBRE#KMS_TO_MILES"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="KMS_TO_MILES PREND_LA_VALEUR 1.609" code="5#KMS_TO_MILES#1.609#pasliste"/>
        <item algoitem="quitterBooleen PREND_LA_VALEUR 0" code="5#quitterBooleen#0#pasliste"/>
        <item algoitem="TANT_QUE (kilometres&lt;0.01 OU kilometres>1000000 ET quitterBooleen==0) FAIRE" code="15#kilometres&lt;0.01 OU kilometres>1000000 ET quitterBooleen==0">
            <item algoitem="DEBUT_TANT_QUE" code="16#debuttantque"/>
            <item algoitem="SI (valeurSaisie==q) ALORS" code="6#valeurSaisie==q">
                <item algoitem="DEBUT_SI" code="7#debutsi"/>
                <item algoitem="quitterBooleen PREND_LA_VALEUR 1" code="5#quitterBooleen#1#pasliste"/>
                <item algoitem="FIN_SI" code="8#finsi"/>
                <item algoitem="SINON" code="9#sinon">
                    <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
                    <item algoitem="" code=""/>
                    <item algoitem="FIN_SINON" code="11#finsinon"/>
                </item>
            </item>
            <item algoitem="FIN_TANT_QUE" code="17#fintantque"/>
        </item>
        <item algoitem="" code="103#commentaire"/>
        <item algoitem="" code="103#commentaire"/>
        <item algoitem="" code="103#commentaire"/>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>
