
[(Japanese version here)](http://unhurried.hatenablog.com/entry/heroku_jaxrs)

# heroku-jaxrs

REST API sample Java application to deploy to Heroku.

## Points

* Jersey, which is a reference implementation of JAX-RS (Java EE) is used to implement REST APIs.

* Run the application with Web Runner described in Heroku documents.   
https://devcenter.heroku.com/articles/java-webapp-runner

* Jersey recommends to use MOXy as a JAXB (serialization and deserialization of JSON) library. However this project uses Jackson because MOXy doesn't support the deserialization to inner classes or HashMap.   
https://jersey.java.net/documentation/latest/media.html#json.moxy   
http://stackoverflow.com/questions/29322605/how-to-return-a-json-object-from-a-hashmap-with-moxy-and-jersey

* The configulation of Resource classes or ObjectMapper are done in ResourceConfig class.   
（/src/main/java/com/example/ResourceConfig.java)

* ResouceConfig class can be passed to Jersey by writing init-param（javax.ws.rs.Application）in a web.xml.

## Run the application locally

* Install JDK
* Install Apache Maven
* Build the application

```text
maven clean package
```

* Start Web Runner

```text
java -jar target/dependency/webapp-runner.jar target/*.war
```
