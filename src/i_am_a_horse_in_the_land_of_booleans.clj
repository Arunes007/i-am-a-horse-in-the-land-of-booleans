(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean 
  "gives true or false based on value"
   [x]
   (if x
      true
      false
    ))

(defn abs
  "returns magnitude of a number"
   [x]
   (if (< x 0)
     (- x (* x 2))
     x
     )
  )

(defn divides? 
  "checks if no is divisible"
  [divisor n]
  (if (= 0 (mod  n divisor))
         true
         false
    )
  )

(defn fizzbuzz
"divisibility check of 3 and 5 and 15"
    [n]
    (cond
          (divides? 15 n) "gotcha!"
          (divides? 5 n) "buzz"
          (divides? 3 n) "fizz"
          :else ""
    )
  )

(defn teen?
  "returns true if age is greater than 12 and less than 20"
     [age]
     (if (<= 13 age 19)
            true
            false
      )
  )

(defn not-teen? [age]
  (or (not (teen? age)) false)
  )

(defn generic-doublificate
 "return double for no"
    [n]
    (cond
          (number? n) (* n 2)
          (empty? n) nil
          (list? n) (* (count n) 2)
          (vector? n) (* (count n) 2)
          :else true
          )
  )

(defn leap-year?
  "checks whether a year is leap year or not"
  [year]
  (cond
    ( not ( divides? 4 year ) ) false
    ( divides? 400 year ) true
    ( divides? 100 year ) false
    :else true
  )
)

; '_______'
