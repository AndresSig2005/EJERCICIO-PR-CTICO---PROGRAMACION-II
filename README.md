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
Como Analista del proyecto, mi tarea fue comprender las necesidades del cliente, transformarlas en requerimientos funcionales claros y asegurar de que el equipo técnico tenga una visión precisa del sistema para que lo pueda desarrollar sin inconvenientes. 

###  Actividades realizadas:

1. **Entrevista y levantamiento de requerimientos**  
   - Me reuní con el cliente para entender sus expectativas y necesidades, para hacer una aplicacion de acuerdo a sus gustos.
   - Identifiqué los módulos clave que debía tener el sistema, como: gestión de reservas, disponibilidad de habitaciones, registro de clientes y control de inventario.  
   - Documenté los requerimientos funcionales  esperados.

2. **Especificación de requerimientos**  
   - Redacté un documento en base a los requerimientos que queria el cliente , como:  
     - Crear una nueva reserva con fecha de inicio y fin.  
     - Consultar disponibilidad de habitaciones según fecha.  
     - Registrar artículos del inventario y realizar compras.  
   - Detallé cómo debía comportarse el sistema ante diferentes escenarios.

3. **Comunicación con el arquitecto de software**  
   - Colaboré con el arquitecto para tener un modelo en concreto para tener ideas mas claras.  
   - Validé el diseño UML y verifiqué que las clases propuestas reflejen fielmente las funcionalidades esperadas.

4. **Acompañamiento del desarrollo**  
   - Estuve presente durante la fase de implementación para aclarar dudas funcionales.  
   - Realicé revisiones de avance para asegurar que las funcionalidades clave estuvieran siendo consideradas correctamente.

###  Documento funcional generado:
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

Mi trabajo permitió al equipo desarrollar un sistema coherente con las expectativas del cliente. Donde, la claridad en los requerimientos facilitó un diseño técnico  y una implementación efectiva. Gracias a esta planificación, se redujeron errores durante el desarrollo y se logró cumplir con los objetivos del proyecto en tiempo y forma, para asi poder avanzar al siguiente paso.


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

  ##  Desarrollador bust_in_silhouette:

Fui  el encargado de transformar el diseño técnico del sistema en código funcional, aplicando principios de la Programación Orientada a Objetos (POO) y asegurando la correcta implementación de las clases y funcionalidades definidas por el equipo, y por el cliente, tratando de hacer un código facil e interactivo.
###  Actividades realizadas:

1. **Implementación de clases base**  
   - Desarrolle las clases principales del sistema: `Hotel`, `Habitación`, `Reserva`, `Cliente`, `Artículo`, `Factura`, `Empleado` y `Administrador`.  
   - Aplicque principios de encapsulamiento, herencia y polimorfismo para garantizar una arquitectura limpia y mantenible.

2. **Integración de funcionalidades**  
   - Programe métodos clave como la creación de reservas, consulta de disponibilidad y manejo de inventario.  
   - Asegure que las clases trabajaran en conjunto de forma coherente, permitiendo el flujo correcto de datos en el sistema.

3. **Buenas prácticas de desarrollo**  
   - Utilize nombres descriptivos, estructuras ordenadas y comentarios útiles dentro del código.  
   - Evite la duplicación innecesaria de código y estructuró los archivos de forma modular.

4. **Pruebas iniciales y depuración**  
   - Realize pruebas manuales para detectar errores de lógica y corregir comportamientos inesperados.  
   - Trabaje en conjunto con el tester para corregir fallos detectados y mejorar la estabilidad general del sistema.

5. **Uso de herramientas de control de versiones**  
   - Subi el código al repositorio compartido (GitHub/GitLab), manteniendo el control de versiones.  
   - Asegure que el código subido estuviera funcional y documentado.

###  Clases desarrolladas:

- `Hotel`: Administra habitaciones, reservas, clientes y artículos.  
- `Habitación`: Contiene número, tipo y estado.  
- `Reserva`: Registra fechas, habitación y cliente.  
- `Cliente`: Almacena datos del usuario y sus reservas.  
- `Artículo`: Gestiona productos del inventario.  
- `Factura`: Genera el total de compras y relaciona artículos con el cliente.  
- `Empleado`: Contiene datos personales y cargo.  
- `Administrador`: Hereda de `Empleado`, con funciones extendidas de gestión.

Mi trabajo, permitió contar con un sistema funcional y alineado a los requerimientos establecidos. La correcta implementación del código facilitó las pruebas y validaciones del equipo, resultando en un producto final estable, escalable y listo para ser presentado como solución al problema planteado.


##  Gerente del Proyecto  :bust_in_silhouette:
Como Gerente del Proyecto, fui el responsable de la planificación, organización y supervisión del trabajo de todo el equipo. Mi rol garantizó que cada fase del proyecto se cumpliera dentro del tiempo asignado, con entregables claros y una comunicación fluida entre los miembros. Y tambien destacando la labor de mis empleados y la correcta comunicacion que existio con todo el equipo de trabajo.

###  Funciones realizadas:

1. **Planificación y asignación de tareas**  
   - Organicé reuniones iniciales para establecer objetivos, tiempos y responsabilidades.  
   - Coordiné la distribución de roles (analista, arquitecto, desarrollador, tester, cliente) de acuerdo a las destreszs de cada miembro.  
   - Elaboré un cronograma de trabajo con fechas límite para cada fase: análisis, diseño, desarrollo, pruebas y documentacion.

2. **Seguimiento del progreso**  
   - Hice seguimiento constante a cada integrante para asegurar que cumplieran sus tareas, y que no se obviaran errores. 
   - Revisé entregables intermedios como el documento de requerimientos, el diseño UML y las primeras pruebas funcionales.  

3. **Comunicación y resolución de conflictos**  
   - Promoví una comunicación abierta y colaborativa entre todos los roles.  
   - Resolví malentendidos o problemas técnicos rápidamente para mantener el ritmo de trabajo y evitar retrasos o problemas futuros.  
   - Coordiné entregas finales y revisiones antes de la subida al repositorio.

4. **Control de calidad y entregas**  
   - Verifiqué que el proyecto cumpliera con los criterios de la consigna: roles definidos, funciones implementadas, código funcional y evidencia de pruebas.  
   - Redacté y revisé el documento final del proyecto, con el aporte del equipo de trabajo.  
   
###  Cronograma de tareas dirigido:

| Fase                   | Tarea                                      | Fecha       |
|------------------------|--------------------------------------------|-------------|
| Análisis               | Levantamiento de requerimientos            | 20 de mayo  |
| Diseño                 | Diagrama de clases UML                     | 21 de mayo  |
| Desarrollo             | Implementación de clases base              | 22-23 mayo  |
| Pruebas                | Crear reserva y verificar disponibilidad   | 24 de mayo  |
| Documentación y entrega| Capturas, revisión y subida a GitHub       | 24-25 mayo  |

### En conclusion:
Bajo mi gestión, el equipo logró completar el sistema de reservas hoteleras de forma organizada y puntual. Cada fase del proyecto fue monitoreada, y el trabajo colaborativo se mantuvo gracias a una dirección clara,estableciendo reuniones  y controles del cronograma. El resultado fue un sistema funcional, coon pruebas que pasaron por diferentes casos y lograron ser exitosas y finalmente entregamos la documentacion completa, entregando en tiempo establecido y para que el cliente observe nuestra forma de trabajo para que nos contrate en futuros proyectos.


