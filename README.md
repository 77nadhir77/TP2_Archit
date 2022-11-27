# TP2_Archit
###
    author: NACEF Nadhir
    IDE: visual studio code
    groupe: 1
    section: M1 ISII 
### 



1-/ diagrame de dependence:

![diagrammeDeDependence]{images/diagramme-de-dependence.jpeg}

4/- l'objectif de cette amélioration est pour que les classes qui dépend sur d'autre classes par example la classe A qui dépend d'une classe B (A a unr instance de B où la classe A a une méthode qui contient un paramètre de la class B), n'ont pas arrèté de fonctionner en cas de changement dans la classe B, donc Les modules de haut niveau ne doivent pas dépendre des modules de bas niveau, (les classes abstraites et les interface).



15/-Le problème qui se trouve lors de l’initialisation de nombre de livre mensuel autorisé ou à l’ajout du bonus est que si on veut ajouter d’autre type de package donc on doit toujours changer dans le code de ces deux fonctionnalités. Donc le principe O (SOLID) n’est pas respecté.