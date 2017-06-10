# grumpy

This is a Java 8 Dropwizard application I created to test out a few different things in Dropwizard.

Currently, the application has one endpoint (/gp) that returns a random 5XX HTTP status code 
and a random fun grumpy cat quote.

How to start the grumpy application
---

1. Run `mvn clean install` to build your application
1. Start application with `java -jar target/grumpy-1.0.0-SNAPSHOT.jar server config/config.yml`
1. To check that your application is running enter url `http://localhost:8080`

Health Check
---

To see your applications health enter url `http://localhost:8081/healthcheck`

References
---
Banner generated via this site: http://patorjk.com/software/taag
