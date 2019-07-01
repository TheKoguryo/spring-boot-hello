#!/bin/bash

set -e -x

echo "hello"

mvn --version

mvn package

ls -la target/

cd target/*.jar build-output/.

ls -la build-output/