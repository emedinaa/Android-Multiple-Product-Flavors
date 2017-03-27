# Android-Multiple-Product-Flavors
Android Multiple Product Flavors

# Gradle Ext Properties

Definimos las versiones de las dependencias de nuestra App , para esto vamos al build.gradle del Proyecto.

```
  ext{
      //sdk and tools
      minSdkVersion = 14
      targetSdkVersion = 23
      compileSdkVersion = 23
      buildToolsVersion = '23.0.3'

      //dependencies versions
      supportLibraryVersion = '23.4.0'
      junit  = '4.12'

      //external libraries
      //RETROFIT 2
      retrofit2= '2.1.0'
      //GSON
      gson = '2.1.0'
      //INTERCEPTOR
      interceptor= '3.3.1'
      //GLIDE
      glide='3.7.0'
  }
```
# Dependencias 

- Retrofit 2 [http://square.github.io/retrofit/](http://square.github.io/retrofit/)

- Gson [https://github.com/google/gson](https://github.com/google/gson)

- Glide [https://github.com/bumptech/glide](https://github.com/bumptech/glide)

# Build Variants

<img src="./screenshots/Captura%20de%20pantalla%20de%202017-03-26%2021-28-03.png" height="480">

# Publicación

<img src="./screenshots/Captura%20de%20pantalla%20de%202017-03-26%2021-33-32.png" height="480">

# Ejemplo : PeruvianMusic App

Entorno Dev

<img src="./screenshots/dev_device-2017-03-26-213026.png" height="480"><img src="./screenshots/dev_device-2017-03-26-213050.png" height="480">

Entorno Release

<img src="./screenshots/device-2017-03-26-212613.png" height="480"><img src="./screenshots/device-2017-03-26-212704.png" height="480">
<img src="./screenshots/device-2017-03-26-212724.png" height="480">
