#!/bin/bash
set -e -x

wget http://mirror.apache-kr.org/maven/maven-3/3.5.2/binaries/apache-maven-3.5.2-bin.tar.gz

tar -xvzf apache-maven-3.5.2-bin.tar.gz

mvn -version