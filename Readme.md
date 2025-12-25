# Pattern Decorator - Java Example

## 🌟 Description
Ce projet est un exemple pratique du **Pattern Décorateur** (Decorator Pattern) en Java.  
Il montre comment **ajouter dynamiquement des fonctionnalités** à un objet existant, sans modifier sa classe, en suivant les bonnes pratiques de conception orientée objet.

Le projet est structuré avec Maven et utilise des classes simples pour illustrer l’ajout d’options sur un objet de base (comme un café avec différents ingrédients).

---

## 📦 Fonctionnalités
- Implémentation du **Pattern Décorateur** en Java
- Possibilité d’**ajouter dynamiquement des décorateurs** à un objet
- Exemples concrets :
    - Café simple
    - Ajouter du lait
    - Ajouter du noisette
- Affichage du **coût total** et de la **description complète**

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
 └── main/
      └── java/
           └── com/example/
                 ├── Coffee.java            # Component
                 ├── SimpleCoffee.java      # ConcreteComponent
                 ├── CoffeeDecorator.java   # Decorator
                 ├── MilkDecorator.java     # ConcreteDecorator
                 ├── SugarDecorator.java    # ConcreteDecorator
                 └── Main.java              # Classe principale