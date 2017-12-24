(ns missionary.core)

(defmulti convert
  "This is the multimethod we'll build."
   (fn [unit1 unit2 qty] [unit1 unit2]))

(defmacro make-conversion
  "Write a conversion multimethod by threading through intermediate steps.
  Example call: `(make-conversion in ly [in-ft ft-m m-mi mi-ly])`."
  [unit1 unit2 steps]
  `(defmethod convert [~unit1 ~unit2] [~'_ ~'_ qty-of-1#]
    (-> qty-of-1# ~@steps)))
