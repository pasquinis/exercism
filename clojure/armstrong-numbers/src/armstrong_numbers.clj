(ns armstrong-numbers)

(defn armstrong? [number]
  (= (double number)
     (->> (str number)
          (map str)
          (map read-string)
          (map (fn [a] (Math/pow a (count (str number)))))
          (reduce + 0))))
