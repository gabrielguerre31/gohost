#Autor: Gabriel Guerrero
#language: es

@pruebasDeRecorrido
Característica: Validar el funcionamiento del modulo radicacion de honorarios
  Yo como medico
  Necesito poder radicar los diferentes documentos asociados a mis honorarios
  para obtener respuesta sobre estos

  @radicacionObligados
  Esquema del escenario:Comprobar que al radicar los honorarios con un medico obligado no lo permita el modulo y genere el mensaje de excepcion
    Dado que el usuario ingresa al modulo radicar factura
      | tipoDoc | user      | password |
      | <tipoDoc> | <user>      | <password> |
    Cuando ingresa los datos necesarios de la radicacion honorarios
      |email|nFactura|tipoDocumento|destino| ejercicio | periodo |
      |<email>|<nFactura>|<tipoDocumento>|<destino> | <ejercicio> | <periodo> |
    Entonces el valida que la transaccion no es valida
      |mensajeObligado|
      |<mensajeObligado>|
    Ejemplos:
      | tipoDoc | user      | password | email|nFactura|tipoDocumento|destino|ejercicio | periodo | mensajeObligado|
      | 1    | 40928755 | Ab1234567 |gabriel.guerrero@gohost.co|1212|Cuenta de Cobro| Honorarios | 2021 |'Junio'| Su canal de radicación es por medio del buzón de facturación electrónica de compensar factura.electronica@compensar.com|

  @radicacionHonorarioRadicadoPreviamente
  Esquema del escenario:Comprobar que al radicar un honorario radicado previamnete no lo permita y genere el mensaje de excepcion
    Dado que el usuario ingresa al modulo radicar factura
      | tipoDoc | user      | password |
      | <tipoDoc> | <user>      | <password> |
    Cuando ingresa los datos necesarios de la radicacion honorarios
      |email|nFactura|tipoDocumento|destino| ejercicio | periodo |
      |<email>|<nFactura>|<tipoDocumento>|<destino> | <ejercicio> | <periodo> |
    Entonces el valida que la transaccion ya fue radicada
      |mensajeRadicado|
      |<mensajeRadicado>|
    Ejemplos:
      | tipoDoc | user      | password | email|nFactura|tipoDocumento|destino|ejercicio | periodo | mensajeRadicado|
      | 1    | 49771781 | Ab123456 |gabriel.guerrero@gohost.co|1212|Cuenta de Cobro| Honorarios | 2021 |'Junio'| Honorario médico tramitado previamente|


  @radicacionHonorarioNoDisponible
  Esquema del escenario:Comprobar que al radicar un honorario que no esta disponible en el periodo no lo permita y genere el mensaje de excepcion
    Dado que el usuario ingresa al modulo radicar factura
      | tipoDoc | user      | password |
      | <tipoDoc> | <user>      | <password> |
    Cuando ingresa los datos necesarios de la radicacion honorarios
      |email|nFactura|tipoDocumento|destino| ejercicio | periodo |
      |<email>|<nFactura>|<tipoDocumento>|<destino> | <ejercicio> | <periodo> |
    Entonces el valida que la transaccion no esta disponible
      |mensajeNoDisponible|
      |<mensajeNoDisponible>|
    Ejemplos:
      | tipoDoc | user      | password | email|nFactura|tipoDocumento|destino|ejercicio | periodo | mensajeNoDisponible|
      | 1    | 49771781 | Ab123456 |gabriel.guerrero@gohost.co|1212|Cuenta de Cobro| Honorarios | 2021 |'Julio'| No hay disponibles honorarios médicos para facturar.|

  @radicacionNoObligados
  Esquema del escenario:Comprobar que al radicar los honorarios con un medico no obligado lo permita y quede radicado
    Dado que el usuario ingresa al modulo radicar factura
      | tipoDoc | user      | password |
      | <tipoDoc> | <user>      | <password> |

    Cuando ingresa los datos necesarios de la radicacion exitosa
      |email|nFactura|tipoDocumento|destino|ejercicio | periodo | formaPago| observaciones | nombreArchivo|tipoArchivo|tipoArchivoDos|
      |<email>|<nFactura>|<tipoDocumento>|<destino> | <ejercicio> | <periodo> |<formaPago>|<observaciones>|<nombreArchivo>|<tipoArchivo>|<tipoArchivoDos>|

    Entonces el valida que la transaccion fue finalizada correctamente
      |mensajeAprobado|
      |<mensajeAprobado>|

    Ejemplos:
      | tipoDoc | user      | password | email|nFactura|tipoDocumento|destino|ejercicio | periodo |formaPago| observaciones|nombreArchivo|tipoArchivo|tipoArchivoDos| mensajeAprobado|
      | 1    | 80424541| Ab1234567 |gabriel.guerrero@gohost.co|1212|Cuenta de Cobro| Honorarios | 2021 |'Junio'| EFECTIVO| pago en efectivo|prueba|Cuenta de cobro |Aportes| Solicitud enviada|





