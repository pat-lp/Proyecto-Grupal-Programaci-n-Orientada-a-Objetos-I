## Proyecto Grupal de la materia **Programación Orientada a Objetos I** 

**"Software de Distribuidora Eléctica EdeUNLa"**

Trabajo realizado con:

⭐️ Maria Laura Pallares: https://github.com/jemi14

⭐️ Griselda Benitez Haugg: https://github.com/mlpallares


Se nos solicita llevar adelante el análisis, diseño e implementación de una solución para la facturación de una
distribuidora eléctrica.


Existen dos tipos de clientes: de baja demanda (hogares, oficinas, etc) y de gran demanda (industrias). La
diferencia entre ambos es como se les cobra la energía consumida.


Cada cliente de baja demanda tiene un medidor en su domicilio. El mismo se identifica con un número de serie e
indica la energía consumida desde su instalación hasta el momento, en kilowatts horas (kWh). De manera bimestral, un
inspector pasa por los domicilios de los clientes y efectúa una lectura del medidor, en la que registra la fecha y la hora y
los valores del medidor (cuántos kWh indica), en las categorías que corresponda según la clase de cliente de la que se
trate. Se registra también quién es el inspector que realizó la lectura.


Con esta lectura y la anterior efectuada, se calcula el consumo del período. Es decir, para al primer bimestre del
año 2019 (1/2019) se resta la lectura tomada a fines de diciembre de 2018 a la realizada a fines de febrero de 2019. La
diferencia es el consumo del período.


Para estos clientes se dispone de un tarifario que indica, dependiendo del consumo, los valores de monto fijo a
pagar (es un monto mínimo que se paga siempre, sin importar el consumo) y el cargo variable, que es un monto pagado
por kWh consumido.


En el caso de los clientes de gran demanda, tienen una potencia contratada (en kilowatts, kW), que se define
cuando se solicita el servicio, como así también la tensión con la que se efectúa el suministro (alta, media y baja tensión,
AT, MT, BT). De acuerdo a dicha potencia y a la tensión es la banda tarifaria que les corresponde. Además, en cada
banda tarifaria se distingue el consumo durante horas pico (de gran demanda), horas valle (de baja demanda) y el resto
de las horas. El medidor de los clientes de gran demanda registra los tres valores, lo que implica que el inspector tomará
nota de tres valores en lugar de uno sólo como en el caso de los clientes de baja demanda. El cálculo se realiza de
manera similar, pero considerando las tres categorías de consumo (pico, valle y resto).
Las facturas se emiten de manera mensual. A fin de calcularlas, se toma el consumo del bimestre y se divide por
dos (para simplificar el problema). En el caso de los clientes de baja demanda, ese es el valor que se emplea para
determinar la banda tarifaria.


El área de la concesión de la distribuidora se encuentra dividida en zonas. Cada inspector tiene varias zonas
asignadas, y cada cliente pertenece a una zona determinada.
En relación al proyecto, se deberá diseñar una solución que cumpla con los siguientes objetivos mínimos:
1. Alta, baja y modificación de clientes
2. Alta, baja y modificación de zonas
3. Alta, baja y modificación de medidores.
4. Alta, baja y modificación de lecturas.
5. Calcular precios según consumo o potencia contratada según corresponda.
6. Generar facturas.
7. Emitir reporte de consumos por cliente entre fechas.
8. Emitir reporte de facturas emitidas entre fechas.
9. Emitir reporte de energía total entregada entre fechas.
10. Emitir reporte de los diez clientes con mayor consumo.
11. Emitir reporte de los clientes con mayor consumo en horario pico (sólo los de gran demanda).
12. Emitir estadísticas de facturación mensuales .
13. Emitir consumo total por banda tarifaria, para baja y alta demanda y entre fechas.
