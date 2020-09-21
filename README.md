# solid-example
# Pasos para la ejecución. 

1. Realizar ejecución del siguiente comando java -jar solid-example-rest-0.0.1-SNAPSHOT.jar
2. Importar Solid-Example-Test.postman_collection.json en Postman y ejecutar las peticiones guardadas.

# Principios trabajados 

1. Principio de Sustitución de Liskov
	- Clase PersistenciaMamifero, metodo guardarMamifero. 
	  Al recibir la implementación de la Clase Mamifero cualquier subtipo (Murcielago, Ballena) puede utilizar este metodo para guardarse.
2. Principio de Responsabilidad Única
	- Clase PersistenciaMamifero. La clase esta construida de tal forma que su responsabilidad sea unicamente guardar y actualizar mamiferos,
		independientemente el tipo.
3. Principio de Segregación de la Interfaz
	- Clases IMamiferoNadador, IMamiferos, IMamiferoVolador
		Las interfaces estan construidas de manera segreada para que 
		cada clase implementa las interfaces necesarias para funcionar