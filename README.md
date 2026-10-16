# Maquina Registradora

Sistema de caja registradora para registrar productos y calcular totales de venta.

## Detalle

| | |
|---|---|
| Tipo | Consola (MVC) |
| Archivos Java | 5 |
| Version de Java | 25 |
| Patron | Arquitectura MVC |

## Funcionalidades

- Registro de productos
- Calculo de totales
- Maquina registradora con su logica de venta
- Menu de consola

## Estructura del proyecto

```
tiendaAEA/
|-- pom.xml       configuracion de Maven, importable desde cualquier IDE
|-- src/          codigo fuente
`-- README.md
```

## Como ejecutarlo

### Con Maven

```bash
mvn clean compile
mvn exec:java
```

### Con javac directamente

```bash
# Linux / macOS
javac -d bin $(find src -name "*.java")

# Windows (PowerShell)
javac -d bin (Get-ChildItem -Recurse -Filter *.java src).FullName
```

```bash
java -cp bin co.edu.unbosque.controller.AplMain
```

### Desde un IDE

Cualquier IDE con soporte de Java (Eclipse, IntelliJ IDEA, VS Code o NetBeans)
puede importar el proyecto directamente como **proyecto Maven**. Basta con abrir
o importar la carpeta: el IDE detecta el `pom.xml`, resuelve las dependencias y
compila sin configuracion adicional.

## Autor

Desarrollado por [Sergio Parra](https://github.com/P2X4A) como parte de su
formacion en Java.

## Licencia

Ver el archivo [LICENSE](LICENSE).