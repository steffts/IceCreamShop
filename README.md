# 🍦 IceCreamShop — Борба с жегата

Проект на Java, демонстриращ използването на три основни шаблона за дизайн: **Singleton**, **Factory** и **Decorator**, представени чрез историята на младо семейство, което отваря магазин за сладолед. ☀️

## 🎯 Цел на проекта
Симулиране на магазин за сладолед, който предлага:
- 3 вида сладолед: **ванилов**, **шоколадов**, **ягодов**
- Добавки: **шоколадова глазура**, **шоколадови пръчици**

Клиентите си избират сладолед и добавки по желание — и всичко това е изградено с обектно-ориентирано програмиране и шаблони за дизайн.

---

## 🧠 Използвани шаблони

| Шаблон | Описание |
|--------|----------|
| **Singleton** | Магазинът за сладолед съществува само като един обект в цялата програма |
| **Factory** | Създава инстанции на различни видове сладолед |
| **Decorator** | Позволява добавяне на различни добавки към сладоледа динамично, без да се променя оригиналния клас |

---

## 📦 Структура на проекта

IceCreamShop/

├── shop/

│ └── IceCreamShop.java # Singleton

├── factory/

│ ├── IceCream.java # Абстрактен клас

│ ├── VanillaIceCream.java # Конкретни сладоледи

│ ├── ChocolateIceCream.java

│ ├── StrawberryIceCream.java

│ └── IceCreamFactory.java # Factory

├── decorator/

│ ├── IceCreamDecorator.java # Decorator

│ ├── ChocolateGlaze.java # Конкретна добавка

│ └── ChocolateSprinkles.java

├── Main.java # Демонстрация

└── pom.xml # Maven файл



---

## 🚀 Стартиране

### С IntelliJ IDEA или Eclipse:
1. Клонирай проекта:
   ```bash
   git clone https://github.com/your-username/IceCreamShop.git
2. Импортирай като Maven проект

3. Стартирай Main.java

mvn compile

mvn exec:java -Dexec.mainClass=Main
