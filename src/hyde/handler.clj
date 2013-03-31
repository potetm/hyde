(ns hyde.handler
  (:use compojure.core)
  (:require [compojure.handler :as handler]
            [compojure.route :as route]
            [hyde.views :as views]))

(defroutes app-routes
  (GET "/" [] (views/index))
  (route/not-found "Not Found"))

(def app
  (handler/site app-routes))
