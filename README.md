# Patrones de diseño
## Taller 2
1.- Se desea desarrollar una aplicación que permita la creación de personajes, se deben crear personajes a partir de personajes predefinidos. El personaje puede ser de una de las siguientes razas: Alianza u Horda.
    - De alianza hay dos clases: humano y elfos
    - De horda: Orcos y No muertos.

Cada personaje tiene como atributos: nombre, foto, inteligencia, fuerza, poder mágico, altura y habilidades.
Los personajes predefinidos tienen atributos base que se utilizan para crear nuevos personajes

Una instancia de la clase representa a un personaje u otro, por ejemplo, podemos tener los personajes de la alianza, un Humano por ejemplo, con bajo poder mágico o personajes de la Horda con mucha fuerza. Se debe diseñar una solución basada en un patrón de diseño, que permita al usuario crear nuevos personajes y seleccionar personajes de una colección de personajes existentes.  Diseñar el diagrama de clases que permita añadir un nuevo personaje a la colección y seleccionar un personaje con el que se va a jugar.
2.- Una empresa se organiza en una jerarquía de unidades de negocio. Para este caso, de la empresa nos interesa el presidente, el RUC y la dirección postal, mientras que de cada unidad de negocio nos interesa el gerente, el número de empleados, los beneficios brutos del último trimestre, la inversión en edificios y el número medio de contratos realizados por semana. 
Además, una unidad de negocio puede estar formada por varias unidades de negocio. En este caso empleados, beneficios e inversiones se obtienen como la suma de los datos correspondientes a las unidades de negocio que la componen, mientras que el número medio de contratos es la media de los números medios de éstas unidades de negocio.
3.- La empresa MAPWER, especializada en el desarrollo de aplicaciones de gestión para el mercado bursátil, desea desarrollar un componente para homogeneizar el envío de mensajes de los analistas de mercados a sus clientes más relevantes. En una primera versión, el componente deberá contemplar los siguientes requisitos: 
    - Por defecto, el mensaje se enviará como texto en claro. 
    - A petición del usuario, el contenido del mensaje podrá enviarse comprimido, cifrado o firmado digitalmente. 
    - Se facilitarán dos algoritmos de compresión: Huffman y Lempel-Ziv. Existe la intención de incorporar nuevos algoritmos de compresión específicos en sucesivas versiones.
