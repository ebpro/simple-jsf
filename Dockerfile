FROM eclipse-temurin:17-jdk AS build
WORKDIR /app
COPY . /app/
RUN --mount=type=cache,id=mvncache,target=/root/.m2/repository,rw \
	mvn $MAVEN_CLI_OPTS verify

FROM payara/micro:6.2023.11-jdk17
COPY target/*war ${DEPLOY_DIR}