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

(defn simple? [ingredient]
  (= ingredient :butter))

(defn add-scooped [ingredient]
  (if (scooped? ingredient)
    (do
      (grab :cup)
      (scoop ingredient)
      (add-to-bowl)
      (release))
    (do
      (println "This function only works on scooped ingredients. You asked me to scoop" ingredient)
      :error)))

(defn add-squeezed [ingredient]
  (if (squeezed? ingredient)
    (do
      (grab ingredient)
      (squeeze)
      (add-to-bowl))
    (do
      (println "This function only works on squeezed ingredients. You asked me to squeeze" ingredient)
      :error)))

(defn add-simple [ingredient]
  (if (simple? ingredient)
    (do
      (grab ingredient)
      (add-to-bowl))
    (do
      (println "This function only works on simple ingredients. You asked me to add" ingredient)
      :error)))

(defn add [ingredient]
  (cond
    (squeezed? ingredient)
    (add-squeezed ingredient)
    (scooped? ingredient)
    (add-scooped ingredient)
    (simple? ingredient)
    (add-simple ingredient)
    :else
    (do
      (println "I do not know the ingredient" ingredient)
      :error)))

(defn add-eggs [n]
  (dotimes [e n]
    (add-egg))
  :ok)

(defn add-flour-cups [n]
  (dotimes [e n]
    (add-flour))
  :ok)

(defn add-milk-cups [n]
  (dotimes [e n]
    (add-milk))
  :ok)

(defn add-sugar-cups [n]
  (dotimes [e n]
    (add-sugar))
  :ok)

(defn add-butters [n]
  (dotimes [e n]
    (add-butter))
  :ok)

(defn bake-cake []
  (add-eggs 2)
  (add-flour-cups 2)
  (add-milk-cups 1)
  (add-sugar-cups 1)
  (mix)
  (pour-into-pan)
  (bake-pan 25)
  (cool-pan))
