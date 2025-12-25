# Pattern Decorator - Java Example

## 🌟 Description
Ce projet est un exemple pratique du **Pattern Décorateur** (Decorator Pattern) en Java.  
Il montre comment **ajouter dynamiquement des fonctionnalités** à un objet existant, sans modifier sa classe, en suivant les bonnes pratiques de conception orientée objet.

Le projet est structuré avec Maven et utilise des classes simples pour illustrer l’ajout d’options sur un objet de base (comme un café avec différents ingrédients).

---

## 📦 Fonctionnalités
- Implémentation du **Pattern Décorateur** en Java
- Possibilité d’**ajouter dynamiquement des décorateurs** à un objet
- Implémentation du **Pattern Décorateur** pour des boissons
- Ajout dynamique de **toppings / ingrédients**
- Calcul du **prix total** et affichage de la **description complète**
- Structure extensible : facile d’ajouter de nouvelles boissons ou décorateurs
---

## 💻 Technologies utilisées
- Java 11+
- Maven
- IDE recommandé : IntelliJ IDEA, Eclipse ou VS Code

---

## 🚀 Installation et exécution

1. **Cloner le dépôt**
```bash
git clone https://github.com/hjatyq/Pattern_Decorator.git
cd Pattern_Decorator


🧠 Structure du projet
src/
 ├── deco/
 │    ├── Chantilly.java
 │    ├── Chocolat.java
 │    ├── DecorateurBoisson.java
 │    ├── Lait.java
 │    ├── Noisette.java
 │    └── Vanille.java
 ├── produits/
 │    ├── Boisson.java
 │    ├── Deca.java
 │    ├── Espresso.java
 │    └── Sumatra.java
 └── Application.java