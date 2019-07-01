#!/bin/bash

set -e -x

cd project-src
mvn --version
mvn package

ls -la target/

cd ..

cp project-src/target/*.jar build-output/