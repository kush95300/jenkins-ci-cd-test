# BUILD

FROM golang:1.16-buster AS build
WORKDIR /app
COPY . ./
# RUN go mod init http-with-ftp-server
RUN go mod tidy
RUN export CGO_ENABLED=0 && go build

# Deploy

FROM alpine:latest
WORKDIR /app
COPY --from=build /app /app
EXPOSE 80
ENTRYPOINT ["./http-server-with-go"]
