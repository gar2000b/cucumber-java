#!/bin/bash
javac -cp "jars/*" src/step_definitions/CheckoutSteps.java
java -cp "jars/*:.:src" cucumber.api.cli.Main -p pretty --snippets camelcase -g step_definitions features
