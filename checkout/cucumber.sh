#!/bin/bash
javac -cp "jars/*" src/step_definitions/*.java src/implementation/*.java

java -cp "jars/*:.:src" cucumber.api.cli.Main \
-p progress --snippets camelcase -g step_definitions features --tags @current
