#!/bin/bash

set -e -x

echo "hello"

mvn --version

mvn package

ls -la target/

cd /tmp/build
mkdir put
mkdir build-output

cp target/*.jar /tmp/build/build-output/.

ls -la /tmp/build/build-output/
