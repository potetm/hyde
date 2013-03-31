(ns hyde.handler
  (:use compojure.core)
  (:require [compojure.handler :as handler]
            [compojure.route :as route]
            [ring.util.response :as resp]
            [hyde.views :as views]))

(defroutes app-routes
  (GET "/" [] (views/index))
  (GET "/posts/:filename" [filename]
       (resp/resource-response (str filename ".html") {:root "_posts"}))
  (route/not-found "Not Found"))

(def app
  (handler/site app-routes))
