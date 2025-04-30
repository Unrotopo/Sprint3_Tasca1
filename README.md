# Pràctica: Patrons de Disseny en Java

En aquesta pràctica aprendrem a identificar i construir programes emprant **patrons de disseny**. La utilització de patrons és fonamental en la construcció d'un software **extensible** i **reutilitzable**. El llenguatge **Java**, així com molts frameworks, estan construïts seguint patrons de disseny reconeguts.

---

## 🧩 Contingut per Nivells

### 🔹 Nivell 1: Singleton – Comando "Undo"

Es crea una classe `Undo` que simula el funcionament del comando `undo`. Aquesta classe ha de:
- Guardar les últimes comandes introduïdes.
- Permetre afegir i eliminar comandes.
- Llistar les comandes com si fos la comanda `history` de Linux.

> 📌 **Requisit**: la classe ha d’implementar el patró **Singleton**.

**Funcionalitat des de la classe `Main`:**
- Interfície per consola per interactuar amb l’usuari i gestionar les comandes.

---

### 🔸 Nivell 2: Abstract Factory – Agenda internacional

Es desenvolupa un petit **gestor d’adreces i telèfons internacionals**, adaptat als diferents formats segons el país d’origen.

> 📌 **Requisit**: ús del patró **Abstract Factory** per crear objectes d'adreces i telèfons amb format personalitzat segons el país.

**Funcionalitats:**
- Afegir contactes amb adreces i telèfons internacionals.
- Extensible a múltiples països afegint fàbriques específiques.

---

### 🔹 Nivell 3: Command – Control de Vehicles

Es dissenya un sistema per gestionar un pàrquing amb 4 vehicles:

- 🚗 Cotxe
- 🚲 Bicicleta
- ✈️ Avió
- 🚢 Vaixell

Cada vehicle implementa accions com:
- `arrencar()`
- `accelerar()`
- `frenar()`

> 📌 **Requisit**: ús del patró **Command** per encapsular les accions com a objectes.

**Funcionalitat:**
- Crear comandes específiques per cada acció i vehicle.
- Executar una seqüència d'accions i gestionar l’historial.

---

## 🛠️ Requisits

- Java 8 o superior
- IDE recomanat: IntelliJ IDEA, Eclipse o VS Code amb extensió Java


