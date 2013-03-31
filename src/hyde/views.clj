(ns hyde.views
  (:require [hiccup [def :refer [defhtml]] [core :as core] [page :as page]]
            [hyde.settings :as settings]))

(defhtml index []
  [:head
   [:meta {:http-equiv "content-type" :content "text/html; charset=utf-8"}]
   [:meta {:name "author" :content (:name settings/author)}]
   [:title (:title settings/site)]]
   (page/include-css "/css/style.css")
   (page/include-js "/js/myjavascript.js")
  [:body
   [:h1 (:name settings/author)]])
