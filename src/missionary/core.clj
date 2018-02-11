(ns missionary.core
  (:gen-class)
  (:require [loom.graph :as gr]
            [loom.alg :as alg]
            [clojure.math.combinatorics :as combo]))

(defn conversion-graph
  "Takes a dictionary of conversions and functions like 
  {[:in :ft] in-ft [:ft :yd] ft-yd} and builds the conversion graph"
  [conversions]
  (-> conversions keys gr/digraph))

(defn strip-dupes 
  "Remove pairs from list that are the same node."
  [pairs]
  (->> pairs
       (filter #(not= (first %) (second %)))
       (map vec)))

; (defn combine-conversions
;   "Takes a collection of functions to pipe together"
;   [convs]
;   (fn [x]
;     (->)))

(defn pair-with-path
  [graph pair]
  [pair]
  (->> (alg/shortest-path graph (first pair) (second pair))
       (partition 2 1)
       (map vec)))

(defn pair-with-paths
  [graph pairs]
  (:foo))

(defn conversion-grid 
  "foobar"
  [nodes]
  (let [grid (combo/cartesian-product nodes nodes)]
    (-> grid (filter #(= %1 %2)))))
  

(defmulti convert
  "This is the multimethod we'll build onto."
   (fn [unit1 unit2 qty] [unit1 unit2]))

(defmacro make-conversion
  "Write a conversion multimethod by threading through intermediate steps.
  Example call: `(make-conversion in ly [in-ft ft-m m-mi mi-ly])`."
  [unit1 unit2 steps]
  `(defmethod convert [~unit1 ~unit2] [~'_ ~'_ qty-of-1#]
    (-> qty-of-1# ~@steps)))
