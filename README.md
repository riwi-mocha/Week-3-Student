# Week-3-Student.
Descripción: El sistema debe simular un repositorio en memoria para gestionar estudiantes, como preparación para trabajar con JDBC. Los estudiantes diseñarán una clase base abstracta, la extenderán con una entidad de estudiante, definirán una interfaz de repositorio y la implementarán usando colecciones como HashMap y ArrayList. El repositorio debe permitir crear, recuperar, eliminar y listar estudiantes, imitando las operaciones básicas de una capa de base de datos.

Criterios de aceptación:

Escenario: Crear y extender una clase abstracta
Dada una clase abstracta que representa una persona genérica
Cuando la extiendo con una clase de estudiante
Entonces la clase estudiante contiene atributos adicionales y sobrescribe su método abstracto.

Escenario: Definir una interfaz de repositorio
Dada una interfaz que especifica operaciones CRUD
Cuando implemento la interfaz
Entonces define métodos para guardar, buscar por ID, eliminar y listar todos los estudiantes.

Escenario: Implementar el reposapitorio con HashM
Dada una implementación de repositorio con HashMap
Cuando guardo varios estudiantes
Entonces se almacenan con sus IDs como claves y se pueden recuperar correctamente.

Escenario: Devolver resultados como una lista
Dados los estudiantes almacenados en el repositorio
Cuando llamo al método para listar todos
Entonces obtengo un ArrayList con todos los estudiantes.

Escenario: Imitar operaciones de base de datos
Dado el repositorio en memoria
Cuando inserto, consulto y elimino estudiantes
Entonces el comportamiento corresponde a las operaciones INSERT, SELECT y DELETE en una base de datos real.
Estudiante M.S.
Imagina que estás creando un pequeño sistema de gestión de estudiantes. Por ahora, no hay base de datos, por lo que toda la información se almacenará en memoria.

La empresa quiere una estructura que se parezca lo más posible a cómo se gestionarán los datos con una base de datos real mediante JDBC. Por eso:

Cada estudiante debe heredar de un tipo de persona genérico.
El sistema debe exponer una interfaz que defina las operaciones básicas para gestionar la información.
Los datos deben organizarse para poder almacenarlos, recuperarlos y listarlos eficientemente (utilizando colecciones como listas y mapas).
El repositorio debe permitir añadir nuevos estudiantes, encontrarlos por su ID, eliminarlos y listarlos.
Al final, deberás poder:

Crear varios estudiantes en memoria.
Almacenarlos en el repositorio.
Consultarlos por ID o verlos todos. Simule operaciones sencillas que, posteriormente, con JDBC, corresponderán a las consultas de inserción, selección, eliminación y selección de todos los registros.

Estudiante M.S.
Imagine que está desarrollando un pequeño sistema de gestión de estudiantes. Actualmente, no hay una base de datos conectada, por lo que toda la información se almacenará en memoria.

La empresa desea una estructura que se asemeje lo más posible a la gestión de datos con una base de datos real mediante JDBC. Por ello:

Cada estudiante debe heredar de un tipo de persona más genérico.
El sistema debe exponer una interfaz que defina las operaciones básicas para gestionar la información.
Los datos deben organizarse para poder almacenarlos, recuperarlos y listarlos de forma eficiente (utilice colecciones como listas y mapas).
El repositorio debe permitir añadir nuevos estudiantes, encontrarlos por su ID, eliminarlos y listarlos todos.
Al final, deberá poder:

Crear varios estudiantes en memoria.
Almacenarlos en el repositorio.
Consultarlos por ID o verlos todos.
Simular operaciones sencillas que, posteriormente, con JDBC, corresponderán a las consultas de inserción, selección, eliminación y selección de todos los registros.