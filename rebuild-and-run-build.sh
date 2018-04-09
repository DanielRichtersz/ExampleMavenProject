#!/bin/bash
git pull
docker rm build-name
docker restart build-name
docker rmi build-name

docker build -t build-image -f Dockerfile-build .
docker run --name build-name build-image
docker cp build-name:\\JenkinsTestApplication\\target\\JenkinsTestApplication.jar target\\