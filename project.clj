(defproject introduction-to-clojure "0.1.0-SNAPSHOT"
  :description "Part of PurelyFunctional.tv"
  :url "https://purelyfunctional.tv/"
  :license {:name "CC0 1.0 Universal (CC0 1.0) Public Domain Dedication"
            :url "http://creativecommons.org/publicdomain/zero/1.0/"}
  :plugins [[nightlight/lein-nightlight "2.3.2"]]
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [lispcast/bakery "1.0.0"]]
  :repl-options {:init (do
                         (use 'bakery.core)
                         (use 'introduction-to-clojure.core))
                 :skip-default-init true}
  

  :main introduction-to-clojure.core)
