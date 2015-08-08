#!/bin/bash
javac -cp "jars/*" src/step_definitions/*.java src/implementation/*.java

java -cp "jars/*:.:src" cucumber.api.cli.Main \
-p progress --snippets camelcase -g step_definitions features 

# Other Example Tags:
#
# --tags @current - will run only scenarios / features marked with @annotations.
# --dry-run - will parse the features file but will not execute the steps / java.
