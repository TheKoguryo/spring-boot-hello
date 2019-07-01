#!/bin/bash

set -e -x

echo "hello"

mvn --version

mvn package

ls -la target/

mkdir -p /tmp/build/put/build-output

cp target/*.jar /tmp/build/build-output/.

ls -la /tmp/build/build-output/
