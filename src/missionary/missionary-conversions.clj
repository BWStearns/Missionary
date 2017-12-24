(ns missionary.concrete-conversions)

(defn in-ft 
  "convert inches to feet"
  [inches]
  (/ inches 12))

(defn ft-in
  "converte feet to inches"
  [feet]
  (* feet 12))

(defn ft-yd 
  "convert feet to yards"
  [inches]
  (/ inches 3))

(defn yd-ft 
  "convert feet to yards"
  [feet]
  (/ feet 3))

(defn ft-mi
  "convert feet to miles"
  [feet]
  (/ feet 5280))

(defn mi-ft
  "convert miles to feet"
  [miles]
  (* miles 5280))
