(ns hyde.core
  (:require [markdown.core :as md]))

(defn init []
  (md/md-to-html 
    (clojure.java.io/input-stream (clojure.java.io/as-file "resources/posts/my-first-post.md"))
    (clojure.java.io/output-stream (clojure.java.io/as-file "resources/_posts/my-first-post.html"))))
