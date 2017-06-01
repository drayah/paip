(ns chapter1.exercises
  (:require [clojure.string :as str]))

(def post-nominals
  ["md" "phd" "mba" "jr" "sr" "bsc" "msc" "ac"])

(defn last-name
  "Return name without post-nominal title"
  [name]
  (let [lowercase (str/lower-case name)
        names (str/split lowercase #" ")]
    (->> names
      (filter #(not (some #{%} post-nominals)))
      (str/join " "))))

(defn power
  "Given numbers x and y return x^y"
  [x y]
  (Math/pow x y))

(defn dot-product
  "Return the dot product of two sequences of numbers"
  [xs ys]
  (let [products (map #(* %1 %2) xs ys)]
    (reduce #(+ %1 %2) products)))