(defproject intro-to-clojure "0.1.0-SNAPSHOT"
  :description "Part of PurelyFunctional.tv"
  :url "https://purelyfunctional.tv/"
  :license {:name "CC0 1.0 Universal (CC0 1.0) Public Domain Dedication"
            :url "http://creativecommons.org/publicdomain/zero/1.0/"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [bakery "0.0.4.1"]]
  :repl-options {:init (use 'bakery.core)
                 :skip-default-init true})
