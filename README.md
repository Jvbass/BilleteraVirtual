<a name="readme-top"></a>
<div align="center">
  <br>
    <h2><strong>VirtualWallet - Java</strong> </br>  </h2>
    <span>Proyecto Bootcamp English Always.</span><br>
    <span>Juan Pino Contreras.</span>
</div>

## 📃 Acerca del proyecto
****

Este proyecto es una aplicación de consola que simula una billetera virtual. El objetivo de este proyecto es aplicar los conceptos básicos de la programación orientada a objetos en Java.
#### La aplicación permite a los usuarios:

- Crear una billetera
  - Crear usuario y contraseña
  - Agregar saldo para abrir cuenta
  - Numero de cuenta automatico
- Recargar saldo
- Realizar retiros
- Consultar saldo
- Consultar movimientos
- Convertir saldo a euro y dolar
- Salir de la aplicación

** El proyecto incluye tambien test unitarios para las clases principales.

## 📚 Diagrama de clases
****

## ‍🧑‍🔬Principios de la POO aplicados 
****
**SOLID**
En el proyecto se intenta seguir los principios SOLID de la programación orientada a objetos:

#### S - Principio de responsabilidad única (SRP)
  - Cada clase tiene una única responsabilidad. Por ejemplo, la clase Usuario se encarga de la gestión de la información del usuario, la clase Cuenta se encarga de la gestión de la cuenta del usuario y la clase Transacciones se encarga de la gestión de la lista de transacciones.
#### O - Principio abierto/cerrado (OCP)
  - Las clases están abiertas para la extensión pero cerradas para la modificación. Por ejemplo, la interfaz ICuenta define un contrato que se debe implementar y que puede ser extendido por cualquier clase que implemente la interfaz.
#### L - Principio de sustitución de Liskov (LSP)
  - La clase Conversor puede convertir cualquier objeto o divisa que implemente la interfaz IMoneda, sin importar la implementación específica de esa interfaz. Esto significa que cualquier objeto que implemente IMoneda puede ser sustituido en el lugar donde se espera una IMoneda, sin afectar la correcta ejecución del programa.
#### I - Principio de segregación de la interfaz  (ISP)
  - En este proyecto, cada clase implementa solo las interfaces que necesita. Por ejemplo, la clase Usuario implementa la interfaz IUsuario, la clase Cuenta implementa la interfaz ICuenta y la clase Transacciones implementa la interfaz ITransacciones. Cada clase tiene solo los métodos que necesita y no tiene que implementar métodos que no necesita.
#### D - Principio de inversión de dependencia (DIP)
 - La clase Conversor no depende de las implementaciones concretas de las monedas (como Dolar, Euro, PesoCl), sino que depende de la abstracción IMoneda. Esto significa que Conversor puede trabajar con cualquier moneda, siempre y cuando esa moneda implemente la interfaz IMoneda. Esto hace que el código sea más flexible y fácil de mantener, ya que cualquier cambio en las implementaciones concretas de las monedas no afectará a la clase Conversor.


## 🔍Test unitarios
****
Las pruebas unitarias son un tipo de prueba que verifica la funcionalidad de partes individuales de un programa, generalmente a nivel de método o clase.
#### El proyecto incluye test unitarios para las clases Conversor y Cuenta.
- __Prueba de camino feliz__ :  Comprueban que el sistema funciona correctamente cuando se le proporcionan entradas válidas. En este caso, la prueba *convertirMonedasValidasConversionCorrecta* es un ejemplo de una prueba de camino feliz.
- __Pruebas de manejo de errores__ : Verifican que el sistema maneja correctamente las situaciones de error. Por ejemplo el test *convertirMonedaOrigenInvalidaArrojaExcepcion* verifica que el sistema arroja una excepción cuando se intenta convertir una moneda que no es válida.
- __Pruebas de límites__ : Aseguran que el sistema maneja correctamente los casos límite. La prueba *retirarMontoIgualSaldo* de la clase *CuentaTest* es un ejemplo de una prueba de límites, ya que verifica el comportamiento del sistema cuando se intenta retirar un monto igual al saldo disponible en la cuenta.


## 🛠️ Requisitos
****
- Java Development Kit (JDK) 8 o superior
- Maven 3.6.3 o superior
- - Dependencias Maven
  - JUnit 5
  - Mockito 3.9.0
- IDE (IntelliJ IDEA, Eclipse, NetBeans, etc)

## ⚙️Ejecutar la aplicación
****
1. Si deseas ejecutar y modificar el código fuente, puedes clonar el repositorio del proyecto en tu sistema local y abrirlo en tu IDE favorito.
    
    ```bash
    git clone
    ```
2.  Abre el proyecto con tu IDE.

3. Asegúrate de que todas las dependencias estén correctamente instaladas.
    ```bash
    mvn install
    ```  
4. Ejecuta la aplicación desde la clase principal `Main.java`.
5. Sigue las instrucciones en la consola para interactuar con la aplicación.



***
### 🚀️Para ejecutar la aplicación desde el archivo .jar
1.  Descarga o clona el archivo __VirtualWallet.jar__ que se encuentra en el directorio:*
```
out/artifacts/VirtualWallet_jar/
```
2. En tu sistema local, navega hasta el directorio donde se encuentra el archivo .jar:
```
cd out/artifacts/VirtualWallet_jar
```

3. Luego abre la consola y ejecuta el siguiente comando:
```bash
java -jar VirtualWallet.jar
```

## Contribuir
****
Si deseas contribuir a este proyecto, sigue los siguientes pasos:
1. Realiza un [Fork](https://github.com/Jvbass/BilleteraVirtual/fork) del proyecto.
 2. Clona el repositorio en tu máquina local:

```bash
git clone git@github.com:tu_username/BilleteraVirtual.git
```
3. Añade el repositorio original como remoto
```bash
git remote add upstream <URL del repositorio original>
```
4. Crea tu Rama de Funcionalidad

```bash
git switch -c feature/nueva-caracteristica
```
5. Realiza tus cambios y haz un commit:

```bash
git add .
git commit -m 'descripción de los cambios'
```
6. Sube tus cambios a tu repositorio:

```bash 
git push origin funcionalidad/nombre-funcionalidad
```
7. Abre una [_pull request_](https://github.com/Jvbass/BilleteraVirtual/pulls).
****

#### _Gracias por tu interés en este proyecto. Si tienes algun comentario o duda sobre este o cualquier otro proyecto no dudes en contactarme._
###### ¡Espero tus _PR_!👋

<p align="right">(<a href="#readme-top">volver arriba</a>)</p>


