#!/bin/bash

set -e -x

echo "hello"

mvn --version

mvn package

ls -la target/

mkdir build-output

cp target/*.jar build-output/.

ls -la build-output/

pwd

env

cd /tmp/build
ls -la
cd /tmp/build/put
ls -la
cd /tmp/build/put/build-output
ls -la