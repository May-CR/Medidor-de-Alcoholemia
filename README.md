# Medidor-de-Alcoholemia

# Descripción General: 
Simulador de un medidor de alcoholemia básico
El programa consta de tres clases:

- Main: Contiene el punto de entrada del programa.
- Persona: Representa a un conductor con nombre, edad y grado de alcohol.
- MedidorDeAlcoholemia: Evalúa si una persona supera el límite permitido de alcohol y emite el resultado correspondiente.

## Principios de Clean Code Aplicados

### Clase Persona
Uso de nombres descriptivos
nombre, edad, y gradoDeAlcohol son nombres claros que comunican exactamente qué representa cada atributo.

Métodos como getGradoDeAlcohol() o setEdad() usan camelCase.

**Encapsulamiento**

Los atributos están declarados como private, lo que sigue el principio de ocultamiento de información. Además, se accede a ellos únicamente a través de métodos getter y setter

--- 
### Clase MedidorDeAlcoholemia
**Responsabilidad única**

La clase tiene una sola responsabilidad clara: verificar si un conductor supera el límite permitido de alcohol.

**Métodos cortos y bien definidos**

Cada método realiza una tarea específica,  promueviendo la modularidad y la facilidad de pruebas o cambios futuros.

**Constantes descriptivas**

LIMITE_ALCOHOL describe adecuadamente su propósito. 

**Evita código duplicado**

El valor de alcoholemia se guarda una vez en valorAMedir y se reutiliza en los métodos que lo necesitan.

---
### Clase Main
La clase Main solo contiene el punto de entrada del programa, lo cual es adecuado y limpio.

La creación de objetos Persona y MedidorDeAlcoholemia se realiza con nombres claros.

