(ns hamming)

(defn distance [dna1 dna2]
  (if (= (count dna1) (count dna2))
    (->>
      (map not= dna1 dna2)
      (filter true?)
      (count))
    nil)
)
