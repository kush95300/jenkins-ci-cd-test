package main

import (
	//"fmt"
	"net/http"
)

func main() {
	http.HandleFunc("/", func(w http.ResponseWriter, r *http.Request) {
		w.Write([]byte("<h1>Hello World from GO HTTP Server </h1>\n\n <b>Deploying Server version v1 on gke</b>\n"))
	})
	http.ListenAndServe(":80", nil)
}
