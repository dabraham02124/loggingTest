# LoggingTest

This app exists to demonstrate unexpected behavior in DropWizard 2.0.23.  Specifically, when the logging is external, _and_ we replace the bootstrap object's ObjectMapper, logging reverts to internal.

If you `git checkout fef2d0b` then `mvn clean package && java -jar target/loggingTest-1.0.0.jar server config.yml` logging will behave as expected per the logback.xml.  It should be easy to see, every line has a "XXXXXXXXXXXXXXX".

Then `git checkout bcc4039` and again `mvn clean package && java -jar target/loggingTest-1.0.0.jar server config.yml` logging will _start out_ based on the logback.xml, but sometime after we `bootstrap.setObjectMapper(new ObjectMapper(new YAMLFactory()));` it will revert to the internal logging format.

To see how minimal the difference is, please `git diff fef2d0b bcc4039`


How to start the LoggingTest application
---

1. Run `mvn clean install` to build your application
1. Start application with `java -jar target/loggingTest-1.0.0.jar server config.yml`
1. To check that your application is running enter url `http://localhost:8080`

Health Check
---

To see your applications health enter url `http://localhost:8081/healthcheck`
