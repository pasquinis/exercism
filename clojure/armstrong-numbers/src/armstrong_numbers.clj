(ns armstrong-numbers)

(defn armstrong? [number]
  (let [string-number (str number)
        string-number-length (count string-number)]
    (= (double number)
       (->> string-number
            (map str)
            (map read-string)
            (map (fn [a] (Math/pow a string-number-length)))
            (reduce + 0)))))
