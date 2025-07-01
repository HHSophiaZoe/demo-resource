# Stage build
FROM maven:3.9.6-eclipse-temurin-21 AS builder
WORKDIR /build

# Sao chép toàn bộ mã nguồn dự án vào container
COPY . .

# Chạy lệnh build để tạo file JAR
RUN cd hit-core-lib && \
    mvn clean install && \
    cd .. && \
    mvn clean install -pl movie-service -DskipTests

# Stage run
FROM alpine:3.19 AS runner

ENV TZ="Asia/Ho_Chi_Minh"
ENV JAR_FILE="app.jar"
ENV JAVA_OPTS="-Xms256m -Xmx512m"
ENV JAVA_ARGS=""

# Thiết lập thư mục làm việc
WORKDIR /app

# Cài đặt OpenJDK 21 JRE và ffmpeg
RUN apk update && \
    apk add --no-cache curl openjdk21-jre ffmpeg && \
    rm -rf /var/cache/apk/*

# Sao chép file JAR từ bước build
COPY --from=builder /build/movie-service/target/*.jar $JAR_FILE

ENTRYPOINT ["sh", "-c", "exec java $JAVA_OPTS -jar $JAVA_ARGS $JAR_FILE"]