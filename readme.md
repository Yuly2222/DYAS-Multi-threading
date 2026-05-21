# Taller de Multi-threading en Java

> **Equipo:**
> - Brayan Presiga Sepulveda - 0000301424
> - Juan David Sanchez Roldan - 0000340321
> - Yuly Dayana Rodríguez Salcedo - 0000305314
---

# Descripción

Este proyecto corresponde a un taller práctico sobre **multi-threading en Java**, desarrollado con Maven.  

El objetivo principal es comprender cómo funcionan los hilos en Java y cómo pueden utilizarse para ejecutar múltiples tareas de manera concurrente.

Durante el taller se implementaron diferentes estrategias de concurrencia utilizando:

- `Thread`
- `Runnable`
- `synchronized`
- `ExecutorService`
- `Callable`

Además, se desarrolló un ejemplo propio llamado **ProcesadorPedidos**, el cual simula el procesamiento concurrente de pedidos.

---

# Objetivos

- Comprender el funcionamiento de los hilos en Java.
- Aprender a crear y gestionar múltiples hilos.
- Implementar sincronización entre hilos.
- Utilizar pools de hilos con `ExecutorService`.
- Manejar tareas con retorno usando `Callable` y `Future`.
- Aplicar los conceptos en un caso práctico.

---

# Tecnologías Utilizadas

- Java 8+
- Maven
- Visual Studio Code

---

# Estructura del Proyecto

```plaintext
multi-threading/
│
├── pom.xml
│
└── src/
    └── main/
        └── java/
            └── com/
                └── example/
                    ├── App.java
                    ├── ThreadExample.java
                    ├── RunnableExample.java
                    ├── SynchronizedExample.java
                    ├── ExecutorServiceExample.java
                    ├── CallableExample.java
                    └── ProcesadorPedidos.java
```

---

# Configuración del Proyecto

## Crear el proyecto Maven

```bash
mvn archetype:generate -DgroupId=com.example -DartifactId=multi-threading -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```

---

# Compilación del Proyecto

Para compilar el proyecto:

```bash
mvn clean compile
```

---

# Ejecución de los Ejemplos

## 1. Ejemplo con Thread

```bash
mvn exec:java -Dexec.mainClass="com.example.ThreadExample"
```

### Explicación

Este ejemplo muestra la creación básica de un hilo utilizando la clase `Thread`.

---

## 2. Ejemplo con Runnable

```bash
mvn exec:java -Dexec.mainClass="com.example.RunnableExample"
```

### Explicación

Se implementa una tarea mediante la interfaz `Runnable` y luego se ejecuta en un hilo.

---

## 3. Ejemplo de Sincronización

```bash
mvn exec:java -Dexec.mainClass="com.example.SynchronizedExample"
```

### Explicación

Demuestra el uso de `synchronized` para evitar problemas de concurrencia al modificar variables compartidas.

---

## 4. Ejemplo con ExecutorService

```bash
mvn exec:java -Dexec.mainClass="com.example.ExecutorServiceExample"
```

### Explicación

Se utiliza un pool de hilos para gestionar múltiples tareas concurrentes de manera más eficiente.

---

## 5. Ejemplo con Callable y Future

```bash
mvn exec:java -Dexec.mainClass="com.example.CallableExample"
```

### Explicación

Permite ejecutar tareas que retornan resultados utilizando `Callable` y recuperar dichos resultados mediante `Future`.

---

# Ejemplo Propio: Procesador de Pedidos

## Ejecución

```bash
mvn exec:java -Dexec.mainClass="com.example.ProcesadorPedidos"
```

---

## Descripción

Este ejemplo simula el procesamiento concurrente de pedidos en una empresa.

Cada pedido es procesado por un hilo diferente utilizando un `ExecutorService`, permitiendo que varias tareas se ejecuten simultáneamente.

---

## Funcionamiento

- Se crea una lista de pedidos.
- Se define un pool de 3 hilos.
- Cada pedido se envía al pool mediante `submit()`.
- Los pedidos se procesan en paralelo.
- Cada hilo muestra qué pedido está ejecutando.

---

## Conceptos Aplicados

- Multi-threading
- Concurrencia
- Pool de hilos
- ExecutorService
- Manejo de tareas concurrentes

---

# Resultados Esperados

Al ejecutar los ejemplos, se observará:

- Ejecución concurrente de tareas.
- Diferentes hilos trabajando simultáneamente.
- Sincronización correcta de recursos compartidos.
- Procesamiento paralelo de pedidos.

---

# Problemas Encontrados

Durante el desarrollo se presentaron algunos problemas comunes:

## Error de paquetes

```plaintext
The declared package does not match the expected package
```

### Solución

Organizar correctamente las carpetas:

```plaintext
src/main/java/com/example/
```

---

## Error ClassNotFoundException

```plaintext
java.lang.ClassNotFoundException
```

### Solución

- Verificar la ubicación del archivo `.java`
- Confirmar el `package com.example;`
- Compilar nuevamente con:

```bash
mvn clean compile
```

---

# Conclusiones

- El multi-threading permite mejorar el rendimiento de las aplicaciones.
- Java ofrece múltiples herramientas para gestionar concurrencia.
- `ExecutorService` facilita la administración de hilos.
- La sincronización es importante para evitar inconsistencias en datos compartidos.
- Los ejemplos prácticos ayudan a comprender mejor el comportamiento concurrente.

