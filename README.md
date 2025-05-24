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

## Analista   :bust_in_silhouette:
Como Analista del proyecto, mi tarea fue comprender las necesidades del cliente, transformarlas en requerimientos funcionales claros y asegurar que el equipo técnico tenga una visión precisa del sistema a desarrollar. Este rol fue clave en la fase inicial de planificación y seguimiento de la coherencia entre lo solicitado y lo implementado.

### 📌 Actividades realizadas:

1. **Entrevista y levantamiento de requerimientos**  
   - Me reuní con el cliente para entender sus expectativas y necesidades.  
   - Identifiqué los módulos clave que debía tener el sistema, como: gestión de reservas, disponibilidad de habitaciones, registro de clientes y control de inventario.  
   - Documenté los requerimientos funcionales mínimos esperados.

2. **Especificación de requerimientos**  
   - Redacté un documento con los requerimientos funcionales claros, como:  
     - Crear una nueva reserva con fecha de inicio y fin.  
     - Consultar disponibilidad de habitaciones según fecha.  
     - Registrar artículos del inventario y realizar compras.  
   - Detallé cómo debía comportarse el sistema ante diferentes escenarios.

3. **Comunicación con el arquitecto de software**  
   - Colaboré con el arquitecto para traducir los requerimientos en un modelo técnico concreto.  
   - Validé el diseño UML y verifiqué que las clases propuestas reflejen fielmente las funcionalidades esperadas.

4. **Acompañamiento del desarrollo**  
   - Estuve presente durante la fase de implementación para aclarar dudas funcionales.  
   - Realicé revisiones de avance para asegurar que las funcionalidades clave estuvieran siendo consideradas correctamente.

### 📄 Documento funcional generado:
- Módulos identificados: `Hotel`, `Habitación`, `Reserva`, `Cliente`, `Artículo`, `Factura`, `Empleado`, `Administrador`.
- Funcionalidades mínimas:  
  - Creación de reservas.  
  - Consulta de disponibilidad.  
  - Gestión de artículos.  
  - Registro de clientes.  
- Reglas identificadas:  
  - No debe permitirse solapamiento de reservas.  
  - Las habitaciones deben cambiar de estado según su ocupación.  
  - El stock debe actualizarse automáticamente tras una compra.

Mi trabajo permitió al equipo desarrollar un sistema coherente con las expectativas del cliente. La claridad en los requerimientos facilitó un diseño técnico sólido y una implementación efectiva. Gracias a esta planificación, se redujeron errores durante el desarrollo y se logró cumplir con los objetivos del proyecto en tiempo y forma.


## Arquitecto de Software :bust_in_silhouette:

### Funciones realizadas:

1. **Diseño de la Arquitectura del Sistema**
   - Se definió una estructura técnica escalable y modular.
   - Se propuso una separación clara entre clases y responsabilidades.

2. **Diseño del Diagrama de Clases UML**
   - Se construyó el modelo UML con atributos y métodos representativos de cada clase.

3. **Aplicación de Principios POO**
   - Encapsulamiento: atributos privados, métodos públicos.
   - Modularidad: diseño pensado para facilitar el mantenimiento y ampliaciones.

4. **Coordinación Técnica**
   - Colaboración directa con el analista para interpretar los requerimientos funcionales.
   - Asistencia al desarrollador para asegurar una implementación fiel al diseño.
   - Apoyo al tester para entender la estructura del sistema y validar correctamente.

## 📋 Rol: Gerente del Proyecto  :bust_in_silhouette:
Como Gerente del Proyecto, fui el responsable de la **planificación, organización y supervisión** del trabajo de todo el equipo. Mi rol garantizó que cada fase del proyecto se cumpliera dentro del tiempo asignado, con entregables claros y una comunicación fluida entre los miembros.

### 📌 Actividades realizadas:

1. **Planificación y asignación de tareas**  
   - Organicé reuniones iniciales para establecer objetivos, tiempos y responsabilidades.  
   - Coordiné la distribución de roles (analista, arquitecto, desarrollador, tester, cliente) de acuerdo a las fortalezas de cada miembro.  
   - Elaboré un cronograma de trabajo con fechas límite para cada fase: análisis, diseño, desarrollo, pruebas y documentación.

2. **Seguimiento del progreso**  
   - Hice seguimiento constante a cada integrante para asegurar que cumplieran sus tareas.  
   - Revisé entregables intermedios como el documento de requerimientos, el diseño UML y las primeras pruebas funcionales.  
   - Detecté posibles retrasos y reorganicé tareas cuando fue necesario para evitar cuellos de botella.

3. **Comunicación y resolución de conflictos**  
   - Promoví una comunicación abierta y colaborativa entre todos los roles.  
   - Resolví malentendidos o problemas técnicos rápidamente para mantener el flujo de trabajo.  
   - Coordiné entregas finales y revisiones antes de la subida al repositorio compartido (GitHub).

4. **Control de calidad y entregas**  
   - Verifiqué que el proyecto cumpliera con los criterios de la consigna: roles definidos, funciones implementadas, código funcional y evidencia de pruebas.  
   - Redacté y revisé el documento final del proyecto junto al equipo.  
   - Subí todos los elementos al repositorio: código, documentación y capturas del sistema funcionando.

### 🗓️ Cronograma de tareas dirigido:

| Fase                   | Tarea                                      | Fecha       |
|------------------------|--------------------------------------------|-------------|
| Análisis               | Levantamiento de requerimientos            | 20 de mayo  |
| Diseño                 | Diagrama de clases UML                     | 21 de mayo  |
| Desarrollo             | Implementación de clases base              | 22-23 mayo  |
| Pruebas                | Crear reserva y verificar disponibilidad   | 24 de mayo  |
| Documentación y entrega| Capturas, revisión y subida a GitHub       | 24-25 mayo  |

### En conclusion:
Bajo mi gestión, el equipo logró completar el sistema de reservas hoteleras de forma organizada y puntual. Cada fase del proyecto fue monitoreada, y el trabajo colaborativo se mantuvo gracias a una dirección clara, reuniones efectivas y control del cronograma. El resultado fue un sistema funcional, con pruebas exitosas y documentación completa, entregado en tiempo y forma.


