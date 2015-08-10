#!/bin/bash
javac -cp "jars/*" src/test/java/step_definitions/CheckoutSteps.java src/main/java/implementation/*.java

java -cp "jars/*:.:src/test/java:src/test/resources:src/main/java" cucumber.api.cli.Main \
-p progress --snippets camelcase -g step_definitions src/test/resources/step_definitions 

# Other Example Tags:
#
# --tags @current - will run only scenarios / features marked with @annotations.
# --dry-run - will parse the features file but will not execute the steps / java.
