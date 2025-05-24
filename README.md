## Desarrollo de una Aplicacion para la Gestion  de Reservas de un Hotel

<p>
Integrantes: 
</p>

- Dereck Perez 
- Vinicio Ruiz 
- Oliver Quila 
- Andres Sigcha 

#### Descripcion de la aplicacion 
Diseñar e implementar tres clases: **Hotel**, **Habitación** y **Reserva**, aplicando los principales pilares de la **Programación Orientada a Objetos (POO)**
- El objetivo es construir un sistema básico que permita representar un hotel con sus habitaciones y las reservas realizadas por los clientes.

## Asignacion de Roles
|  Miembro | Rol   | Responsabilidades   |
| ------------ | ------------ | ------------ |
| Andres Sigcha   |   **Cliente**   | Define el resultado final del sistema, proporciona los requerimientos funcionales y valida si el producto cumple con sus expectativas.   |
| Vinicio Ruiz |   **Analista**   | Define el resultado final del sistema, proporciona los requerimientos funcionales y valida si el producto cumple con sus expectativas.   |
| Nombre  |   **Arquitecto de Software**   | Diseña la estructura técnica del sistema, define las clases UML, relaciones, escalabilidad y modularidad.  |
| Nombre  |   **Desarrollador**   | Implementa las clases y funcionalidades usando buenas prácticas de POO, garantizando código limpio y funcional.  |
| Nombre   |   **Tester**   | Realiza pruebas funcionales, detecta errores, propone mejoras y valida cumplimiento de requerimientos.   |
| Vinicio Ruiz   |   **Gerente de Proyecto**   | Planifica, organiza, coordina entregables y soluciona problemas del equipo.  |

## Cliente :bust_in_silhouette:
Solicita el desarrollo de un sistema básico de gestión para un hotel. El objetivo principal del proyecto es contar con una solución informática que permita representar y manejar la información relacionada con hoteles, sus habitaciones y las reservas realizadas por los huéspedes.

#### Requerimientos
1. Clase Hotel :office: 
  - Debe representar a un hotel que contiene un conjunto de habitaciones.
  - Deberá permitir agregar habitaciones al hotel.
  - Mostrar información general del hotel y sus habitaciones.
2. Clase Habitacion :door:
  - Representará una habitación dentro de un hotel.
  - Deberá contener atributos como número, tipo de habitación y precio. 
  - Debera permitir verificar si está disponible o reservada.
3. Clase Reserva :clipboard:
  - Debe permitir registrar una reserva vinculada a una habitación y a un cliente.
  - Deberá incluir fechas de entrada y salida, así como los datos del huésped.
  - Debera validar que la habitación esté disponible para las fechas solicitadas.

## Arquitecto de Software  :bust_in_silhouette:
**Miembro:** Vinicio Ruiz

### ✨ Responsabilidades principales:
Como Arquitecto de Software, mi función fue diseñar la **estructura técnica del sistema**, asegurando una base sólida que permitiera la implementación eficiente del código por parte del equipo. Este diseño consideró los principios de la **Programación Orientada a Objetos (POO)** y facilitó la escalabilidad y mantenimiento del sistema.

### 📌 Actividades realizadas:

1. **Diseño de la arquitectura general del sistema**  
   - Analicé los requerimientos proporcionados por el analista y el cliente.  
   - Identifiqué las clases clave del sistema: `Hotel`, `Habitación`, `Reserva`, `Cliente`, `Artículo`, `Factura`, `Empleado` y `Administrador`.

2. **Creación del diagrama UML de clases**  
   - Definí las relaciones entre clases (asociaciones, agregaciones y composiciones).
   - Establecí atributos y métodos esenciales para cada clase.
   - Representé la jerarquía del sistema, como la relación de herencia entre `Empleado` y `Administrador`.

3. **Modularidad y escalabilidad**  
   - Propuse una estructura modular para facilitar la ampliación futura (por ejemplo, módulos separados para reservas, facturación e inventario).
   - Me aseguré de que cada clase tuviera **una única responsabilidad**, alineado con el principio SOLID de SRP.

4. **Colaboración técnica**  
   - Asesoré al desarrollador para asegurar una correcta traducción del diseño al código.
   - Verifiqué la coherencia entre el diseño UML y la implementación final del sistema.
   - Acompañé al equipo durante las fases de prueba y sugerí ajustes de diseño según las observaciones del tester.

### 🧩 Diseño UML del Sistema

- **Clases principales:**  
  - `Hotel`: clase central que gestiona habitaciones, clientes, reservas y artículos.  
  - `Habitación`: posee número, tipo y estado (disponible u ocupada).  
  - `Reserva`: maneja fechas, cliente y habitación reservada.  
  - `Cliente`: usuario del sistema con múltiples reservas y facturas.  
  - `Artículo`: productos con stock, precio e identificación.  
  - `Factura`: detalla compras realizadas y calcula el monto total.  
  - `Empleado`: contiene datos personales y rol.  
  - `Administrador`: hereda de `Empleado` y tiene permisos ampliados.

### 📐 Resultado:
El diseño técnico permitió una implementación clara y eficiente del sistema. El equipo pudo trabajar de forma coordinada y mantener la integridad del proyecto, gracias a una base estructural bien definida. Este diseño también garantiza que el sistema pueda evolucionar en versiones futuras, añadiendo nuevas funcionalidades sin comprometer su estabilidad.

