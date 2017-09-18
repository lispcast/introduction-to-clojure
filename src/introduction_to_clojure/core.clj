(ns introduction-to-clojure.core
  (:require [bakery.core :refer :all]))

(defn add-egg []
  (grab :egg)
  (squeeze)
  (add-to-bowl))

(defn add-flour []
  (grab :cup)
  (scoop :flour)
  (add-to-bowl)
  (release))

(defn add-milk []
  (grab :cup)
  (scoop :milk)
  (add-to-bowl)
  (release))

(defn add-sugar []
  (grab :cup)
  (scoop :sugar)
  (add-to-bowl)
  (release))

(defn add-butter []
  (grab :butter)
  (add-to-bowl))

(defn add [ingredient]
  (cond
    (= ingredient :egg)
    (add-egg)
    (= ingredient :milk)
    (add-milk)
    (= ingredient :flour)
    (add-flour)
    (= ingredient :sugar)
    (add-sugar)
    (= ingredient :butter)
    (add-butter)
    :else
    (println "Unknown ingredient:" ingredient)))

(defn bake-cake []
  (add :egg)
  (add :egg)
  (add :flour)
  (add :flour)
  (add :milk)
  (add :sugar)
  (mix)
  (pour-into-pan)
  (bake-pan 25)
  (cool-pan))

(defn scooped? [ingredient]
  (cond
    (= ingredient :milk)
    true
    (= ingredient :flour)
    true
    (= ingredient :sugar)
    true
    :else
    false))

(defn squeezed? [ingredient]
  (= ingredient :egg))
