# zuul-proxy

Demonstrating that with a Eureka server running then the additional 3 microservices (running as eureka clients) will be added to the registry.
The Zuul proxy microservice will then act as a gateway and map the appropriate endpoints to the correct microservice, as defined in the properties file.
The Zuul proxy runs on the default port of 8080, while the two dummy services run on random ports, and eureka runs on its default port of 8761.

## To run

The below is assuming a windows machine.

To ensure all dependencies are included and tests pass:

`gradlew clean build`

Then, in a terminal per command:

`gradlew :eureka:run`

`gradlew :service-one:run`

`gradlew :service-two:run`

`gradlew :zuul:run`


It takes a minute or two for everything to register properly before the mappings take effect.

## Endpoints

The endpoints for verification that the Zuul proxy is working:

http://localhost:8080/

http://localhost:8080/characters/

http://localhost:8080/colours/
