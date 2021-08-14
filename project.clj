(defproject introduction-to-clojure "0.1.0-SNAPSHOT"
  :description "Part of PurelyFunctional.tv"
  :url "https://purelyfunctional.tv/"
  :license {:name "CC0 1.0 Universal (CC0 1.0) Public Domain Dedication"
            :url "http://creativecommons.org/publicdomain/zero/1.0/"}
  :plugins [[nightlight/lein-nightlight "2.4.1"]
            [org.clojure/core.unify "0.5.7"]]
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [lispcast/bakery "1.0.0"]
                 [com.bhauman/rebel-readline "0.1.4"]]
  :aliases {"repl" ["trampoline" "run" "-m" "introduction-to-clojure.repl"]}

  :main introduction-to-clojure.core)
