(defproject hyde "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [ring/ring-core "1.1.8"]
                 [ring/ring-jetty-adapter "1.1.8"]
                 [compojure "1.1.5"]
                 [hiccup "1.0.3"]
                 [markdown-clj "0.9.19"]]
  :plugins [[lein-ring "0.8.2"]]
  :ring {:handler hyde.handler/app
         :init hyde.core/init}
  :profiles
  {:dev {:dependencies [[ring-mock "0.1.3"]]}})
