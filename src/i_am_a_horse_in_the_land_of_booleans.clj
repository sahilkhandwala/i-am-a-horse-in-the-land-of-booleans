(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x] (if x true false))

(defn abs [x] (if (< x 0) (* x -1) x))

(defn divides? [divisor n] (if (== (mod n divisor) 0) true false ))

(defn fizzbuzz [n] (cond
       (divides? 15 n) "gotcha!"
       (divides? 3 n)  "fizz"
       (divides? 5 n) "buzz"
       :else         ""))


(defn teen? [age] (<= 13 age 19))

(defn not-teen? [age]
  ":(")

(defn generic-doublificate [x]  (cond
                                (number? x) (* x 2)
                                (empty? x) nil
                                (or (list? x) (vector? x)) (* (count x) 2)
                                :else true))

(defn leap-year? [year]
  (or (and (== (mod year 4) 0) (and (==(mod year 100) 0) (==(mod year 400) 0)))
  (and (== (mod year 4) 0) (not (== (mod year 100) 0)))))

; '_______'
