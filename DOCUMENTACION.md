# Ejercicio4

Documentacion
Mejora #[9]
Ubicación: Clase Pedido.java
Descripción del cambio:
Cambios clave:
Se reemplazó calcularTotal() por actualizarTotal() usando Stream (más limpio y escalable).
Se eliminó el System.out.println("lista vacía") que estaba dentro de obtenerPrimerProducto().

Justificación:
Se validó que producto != null antes de agregar.
Se devolvió una copia defensiva de la lista en getProductos() para evitar modificación externa.

Mejora #[10]
Ubicación: Todo el proyecto
Descripción del cambio:
Comentarios en el Codigo

Justificación:
Se agregaron comentarios en todas las clases del proyecto indicando las funciones principales y su funcionamiento dentro de este






Mejora #[5]
Ubicación: Clase Producto.Java
Descripción del cambio:
Se implementó una validación dentro del método reducirStock de la clase Producto para asegurar que nunca se permita reducir más stock del disponible.

Justificación:
La lógica revisa si la cantidad solicitada para venta es menor o igual al stock actual, y solo en ese caso se descuenta del inventario. De esta manera, se evita que el stock pueda tomar valores negativos, manteniendo la coherencia de los datos y evitando errores lógicos en el flujo de ventas.

Mejora #[6]
Ubicación: Clase Producto.Java
Descripción del cambio:
Para garantizar la integridad de los datos al momento de registrar productos y realizar ventas, se implementaron validaciones que aseguran que tanto el precio como el stock de un producto sean valores positivos al momento de su creación.

Justificación:
Además, en las interacciones con el usuario (por ejemplo, al agregar productos a un pedido), se añadió la verificación de que las cantidades ingresadas sean mayores a cero, impidiendo operaciones con valores no válidos que podrían afectar el flujo lógico del negocio.







Mejora #[4]
Ubicación: Clase Main.java
Descripción del cambio: Se agregó una funcion que manda a llamar a las funciones de mostrar inventario, pedidos e ingresos, tambien se modificó el switch para acceder a ese resumen
Se creo una función que manda a llamar la función de inventario y pedidos

Justificación:
