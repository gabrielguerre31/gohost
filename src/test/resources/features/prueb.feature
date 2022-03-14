# Autor: Gabriel Guerrero
#language: es

@pruebasDeRecorrido

  Característica: Validar el funcionamiento del modulo radicacion de honorarios
    Yo como medico, Necesito poder radicar los diferentes documentos asociados a mis honorarios, para obtener respuesta sobre estos

    @radicacionObligados
    Esquema del escenario:Comprobar que al radicar los honorarios con un medico obligado no lo permita el modulo y genere el mensaje de excepcion
      Dado que el usuario ingresa al modulo radicar factura
        | tipoDoc | user      | password |
        | <tipoDoc> | <user>      | <password> |

      Cuando ingresa los datos necesarios de la radicacion
      |email|nFactura|tipoDocumento|destino|subTotal|iva|valoIpoConsu|total|
      |<email>|<nFactura>|<tipoDocumento>|<destino> |<subTotal>|<iva>|<valoIpoConsu>|<total>|

      Entonces el valida que la transaccion no es valida

      Ejemplos:
        | tipoDoc | user      | password | email|nFactura|tipoDocumento|destino|subTotal|iva|valoIpoConsu|total|
        | 2    | 860003216 | Ab123456 |prueba@gmail.com|1212|Cuenta de Cobro| Honorarios |0    |0     |0           |0    |




