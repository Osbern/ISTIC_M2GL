  _____       _ _ _        _          
 / ____|     | (_) |      (_)         
| (___   ___ | |_| |_ __ _ _ _ __ ___
 \___ \ / _ \| | | __/ _` | | '__/ _ \
 ____) | (_) | | | || (_| | | | |  __/
|_____/ \___/|_|_|\__\__,_|_|_|  \___|
 __________________________________________
|                                          |
|  Thibaud Destouches  - Marceau Lacroix   |
|__________________________________________|

#### Bref mode d’emploi ####

1) Lancez l’application. (java -jar Solitaire.jar  ou double clic sur le fichier Solitaire.jar)

2) Jouez au Solitaire.

## Ce qui marche ##

- L’ensemble de l’application.

## Ce qui marche presque ##

- Le “clic” simple sur le sabot qui, si la souris de l’utilisateur est sensible, est facilement compris par l’application comme un début de Drag and Drop.

## Ce qui ne marche pas ##

- On ne peut pas redimensionner la fenêtre

## It’s not a bug, it’s a feature ##

- Lors du déplacement d’un pile de carte, l’espacement entre les cartes qui la compose est augmenté, afin de permettre à l’utilisateur de voir quelles cartes il déplace.

- Le fond de l'application n’est pas une simple couleur !

- Si la partie est gagné, et que toutes les cartes se retrouvent dans les TasDeCartesColorees, un MessageBox apparaît alertant que le joueur a gagné, puis lors du clique sur le bouton OK, l’application se ferme.

## Implémentation ##
N’ayant pas accès aux sources de l’API Solitaire, et devant implémenter uniquement la partie Interface Homme-Machine, nous avons appliqué le patron de conception PAC-Amodeus.
Nous avons donc fait hériter nos classes de contrôles de celles de l’API (par exemple CTasDeCartes (pour le Contrôleur) hérite de TasDeCartes), ce qui nous a permis de rajouter de nouvelles fonctionnalités tout en gardant les anciennes par délégation.

## Tests ##

	Les tests de chacun des éléments de l'application est disponible dans chacune des classes "Pcomposant" sous forme d'un main.

## Choix ##

Pour le Drag and Drop nous avons choisis de ne pouvoir déplacer que des TasDeCartes (si il n’y a q’une seule carte à déplacer, c’est un Tas d’une seule carte), ainsi la classe PTasDeCartes implémente l’interface Transferable, ce qui lui permet d’être déplacer. Ensuite la possibilité de Dragger n’a été implémenté que sur les composants pouvant “donner” des cartes (Sabot, Colonne et TasDeCartesColorees), et la fonction Drop que sur les composants pouvant “recevoir des cartes” (Colonne et TasDeCartesColorees).

## Améliorations futures ##

- Ajout d’un bouton “rejouer”

- Ajout de la fonction “annuler”

- Fenêtre redimensionnable

- Retour visuel lors de l’ajout d’un as sur une pile colorée vide

- Message de retour sémantique pour guider le joueur (lorsqu’il fait plusieurs erreurs à la suite par exemple)

## Conclusion ##
A posteriori, nous nous rendons compte que certains des choix que nous avons fait lors de l’implémentation de notre interface graphique pour le solitaire n’étaient pas forcément les meilleurs. Certains points du drag and drop par exemple nous ont par la suite imposé de travailler en coordonnées absolues. la disposition des différents éléments du jeu (colonnes, piles et sabot) nous a aussi posé pas mal de problèmes, nous conduisant finalement à travailler dans une fenêtre non redimensionnable. D’un autre côté cette fenêtre fixée nous aura permis d’améliorer facilement et de façon significative le rendu pour l’utilisateur grâce à l’image de fond sur laquelle nous avons ajouté des aides pour l’utilisateur (carte de roi sur les colonnes vides, indicateur de sabot vide, couleur des tas colorés).