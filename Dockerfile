FROM docker.io/library/eclipse-temurin:21-jdk-alpine AS builder

WORKDIR /src/bookubebookdetail
COPY . .
RUN chmod +x ./gradlew
RUN ./gradlew clean bootjar

FROM docker.io/library/eclipse-temurin:21-jre-alpine AS runner

ARG USER_NAME=bookubebookdetail
ARG USER_UID=1000
ARG USER_GID=${USER_UID}

RUN addgroup -g ${USER_GID} ${USER_NAME} \
&& adduser -h /opt/bookubebookdetail -D -u ${USER_UID} -G ${USER_NAME} ${USER_NAME}

USER ${USER_NAME}
WORKDIR /opt/bookubebookdetail
COPY --from=builder --chown=${USER_UID}:${USER_GID} /src/bookubebookdetail/build/libs/*.jar app.jar

EXPOSE 8000

ENTRYPOINT ["java"]
CMD ["-jar", "app.jar"]