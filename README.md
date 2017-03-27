# Android-Multiple-Product-Flavors
Android Multiple Product Flavors

# Gradle Ext Properties

Definimos las versiones de las dependencias de nuestra App , para esto vamos al build.gradle del Proyecto.

```DSL
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

- Retrofit 2
- Gson 
- Glide 

# Ejemplo : PeruvianMusic App

Entorno Dev

<img src="./screenshots/dev_device-2017-03-26-213026.png" height="480">
<img src="./screenshots/dev_device-2017-03-26-213050.png" height="480">

Entorno Release

<img src="./screenshots/device-2017-03-26-212613.png" height="480">
<img src="./screenshots/device-2017-03-26-212704.png" height="480">

<img src="./screenshots/device-2017-03-26-212724.png" height="480">
