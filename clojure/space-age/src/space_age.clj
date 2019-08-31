(ns space-age)

(def earth-age-seconds 31557600)
(def mercury-age-seconds 0.2408467)
(def venus-age-seconds 0.61519726)
(def mars-age-seconds 1.8808158)
(def jupiter-age-seconds 11.862615)
(def saturn-age-seconds 29.447498)
(def uranus-age-seconds 84.016846)
(def neptune-age-seconds 164.79132)


(defn on-earth [seconds]
  (/ seconds earth-age-seconds))

(defn on-mercury [seconds]
  (based-on-earth seconds mercury-age-seconds))

(defn on-venus [seconds]
  (based-on-earth seconds venus-age-seconds))

(defn on-mars [seconds]
  (based-on-earth seconds mars-age-seconds))

(defn on-jupiter [seconds]
  (based-on-earth seconds jupiter-age-seconds))

(defn on-saturn [seconds]
  (based-on-earth seconds saturn-age-seconds))

(defn on-neptune [seconds]
  (based-on-earth seconds neptune-age-seconds))

(defn on-uranus [seconds]
  (based-on-earth seconds uranus-age-seconds))

(defn- based-on-earth [seconds planet-seconds]
  (/ seconds (* earth-age-seconds planet-seconds)))
