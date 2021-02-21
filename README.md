# Spring Cloud Stream Consumer Example

## Features
Using Spring Cloud Stream and the RabbitMQ Binder. It's possible define a Consumer<?> function that can listen events from Rabbit. 
In `application.yml` must be set some properties:
- binding name
    - binding group
    - binding queue
- function used for binding the app to Rabbit