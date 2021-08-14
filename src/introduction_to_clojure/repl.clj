(ns introduction-to-clojure.repl
  (:require [rebel-readline.main :as rr]
            [introduction-to-clojure.core]))

(defn -main [& args]
  (in-ns 'introduction-to-clojure.core)
  (apply rr/-main args))
