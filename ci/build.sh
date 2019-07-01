#!/bin/bash

set -e -x

echo "hello"

mvn --version

mvn package

ls -la target/