# Instrucciones del código

Para llevar a cabo la traducción de las cadenas de ADN, se implementó un algoritmo que utiliza una tabla hash 
para almacenar el código genético. Esta estructura de datos permite acceder de manera eficiente a los codones y 
sus correspondientes aminoácidos. El algoritmo recorre la cadena de ADN de tres en tres nucleótidos, buscando cada 
codón en la tabla hash y concatenando los aminoácidos resultantes hasta encontrar un codón de stop. El código fue 
desarrollado en Java.

## Dogma central de la bilogía
El dogma central de la biología molecular postula que la información genética se transmite en una dirección definida,
desde el ADN al ARN y luego a la proteína. Esta secuencia es esencial para la expresión génica y, en general, no puede 
ser invertida. Sin embargo, existen excepciones, como los retrovirus, que poseen la enzima transcriptasa inversa que 
les permite convertir el ARN en ADN, desafiando así el dogma central.

### Metas en el proyecto
Aún falta en este momento agregar las reversas e igualmente encontrar los complementos a cada cadena de ADN.
