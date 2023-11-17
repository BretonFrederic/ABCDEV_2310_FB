<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="LIRE photocopie"/>
    <extension extnom="inactif"/>
    <fonction fctcode="" fctetat="inactif"/>
    <F2 F2defaut="" F2lignes="" F2para="" F2etat="inactif"/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param arrondiAuto="vrai" totalAffichages="1000" maxBoucle="500000" epaisseurPoint="2" epaisseurLigne="2" totalBoucles="5000000" nbDecimales="8"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions"/>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="photocopie EST_DU_TYPE NOMBRE" code="1#NOMBRE#photocopie"/>
        <item algoitem="i EST_DU_TYPE NOMBRE" code="1#NOMBRE#i"/>
        <item algoitem="facture EST_DU_TYPE NOMBRE" code="1#NOMBRE#facture"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="AFFICHER &quot;Saisir le nombre de photocopie(s) que vous souhaitez : &quot;" code="4#Saisir le nombre de photocopie(s) que vous souhaitez : #0"/>
        <item algoitem="LIRE photocopie" code="2#photocopie#pasliste"/>
        <item algoitem="POUR i ALLANT_DE 0 A photocopie" code="12#i#0#photocopie">
            <item algoitem="DEBUT_POUR" code="13#debutpour"/>
            <item algoitem="SI (i &lt; 10) ALORS" code="6#i &lt; 10">
                <item algoitem="DEBUT_SI" code="7#debutsi"/>
                <item algoitem="facture PREND_LA_VALEUR facture + 0.1" code="5#facture#facture + 0.1#pasliste"/>
                <item algoitem="FIN_SI" code="8#finsi"/>
                <item algoitem="SINON" code="9#sinon">
                    <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
                    <item algoitem="SI (i > 9 ET i &lt; 20) ALORS" code="6#i > 9 ET i &lt; 20">
                        <item algoitem="DEBUT_SI" code="7#debutsi"/>
                        <item algoitem="facture PREND_LA_VALEUR facture + 0.09" code="5#facture#facture + 0.09#pasliste"/>
                        <item algoitem="FIN_SI" code="8#finsi"/>
                        <item algoitem="SINON" code="9#sinon">
                            <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
                            <item algoitem="SI (i > 19) ALORS" code="6#i > 19">
                                <item algoitem="DEBUT_SI" code="7#debutsi"/>
                                <item algoitem="facture PREND_LA_VALEUR facture + 0.08" code="5#facture#facture + 0.08#pasliste"/>
                                <item algoitem="FIN_SI" code="8#finsi"/>
                            </item>
                            <item algoitem="FIN_SINON" code="11#finsinon"/>
                        </item>
                    </item>
                    <item algoitem="FIN_SINON" code="11#finsinon"/>
                </item>
            </item>
            <item algoitem="FIN_POUR" code="14#finpour"/>
        </item>
        <item algoitem="AFFICHER &quot;Le montant de la facture pour &quot;" code="4#Le montant de la facture pour #0"/>
        <item algoitem="AFFICHER photocopie" code="3#photocopie#0#pasliste"/>
        <item algoitem="AFFICHER &quot; photocopie(s) est de : &quot;" code="4# photocopie(s) est de : #0"/>
        <item algoitem="AFFICHER facture" code="3#facture#0#pasliste"/>
        <item algoitem="AFFICHER &quot; Euro(s) &quot;" code="4# Euro(s) #0"/>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>
